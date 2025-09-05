/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15;

import com.jnr15.wsjuntaex.ws.BasicHttpBinding_IEquinosStub;
import com.jnr15.wsjuntaex.ws.EntradaEquidos;
import com.jnr15.wsjuntaex.ws.Equido;
import com.jnr15.wsjuntaex.ws.Equinos;
import com.jnr15.wsjuntaex.ws.EquinosLocator;
import com.jnr15.wsjuntaex.ws.Errores;
import com.jnr15.wsjuntaex.ws.FirmadorWSJuntaExt;
import com.jnr15.wsjuntaex.ws.IEquinos;
import com.jnr15.wsjuntaex.ws.RespuestaEntradaEquidos;
import com.jnr15.wsjuntaex.ws.Solicitudes;
import dao.JDBCDAOComAutSolicitud;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.io.StringWriter;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Base64;
import javax.swing.JTable;
import modelo.ComAutSolicitud;
import modelo.DatosEquidosComAut;
import modelo.RespuestaComAutSolicitud;

/**
 *
 * @author jesus
 */
public class ControladorWSJuntaExt {
    
    private static ControladorWSJuntaExt controlador;
    private final ControladorBase controladorBase;
    private final IEquinos stubWebJuntaExt;
    private String peticion;
    private static final boolean FORMATO_XML = Boolean.TRUE;
    
    private ControladorWSJuntaExt() throws Exception {
        controladorBase = ControladorBase.obtenerControlador();
        //ajustSizeHandshakeMessage();
        Equinos fServicio = new EquinosLocator();
        stubWebJuntaExt = new BasicHttpBinding_IEquinosStub(new URL(fServicio.getBasicHttpBinding_IEquinosAddress()),fServicio);
    }
    
    public static ControladorWSJuntaExt obtenerControlador() throws Exception {
        if(controlador==null)
            controlador = new ControladorWSJuntaExt();
        return controlador;
    }
    
    public IEquinos obtenerStub(){
        return stubWebJuntaExt;
    }
    
    public void altaEquidos(ComAutSolicitud solicitud) throws Exception {
        try {
            if (solicitud == null) {
                throw new Exception("LA INSTANCIA DE SolicitudComAut NO PUEDE SER NULA");
            }
            DatosEquidosComAut datosEquido = this.controladorBase.datosEquidosPorUeln(solicitud.getUeln());
            RespuestaComAutSolicitud respuestaASolicitud = new RespuestaComAutSolicitud();
            respuestaASolicitud.setId(solicitud.getId());
            respuestaASolicitud.setFecha(Date.valueOf(LocalDate.now()));
            respuestaASolicitud.setSolicitudCodigoUELN(solicitud.getUeln());
            if(datosEquido!=null){
                RespuestaEntradaEquidos respuesta = controlador.obtenerStub().altaEquidos(prepararEquidoAlta(datosEquido));
                respuestaASolicitud.setSolicitudIdSolicitud(respuesta.getIdSolicitud());
                if (respuesta.getListaError() != null && respuesta.getListaError().length > 0) {
                    String descError = "";
                    Errores[] errores = respuesta.getListaError();
                    for (int i = 0; i < errores.length; i++) {
                        descError+=errores[i].getIdError()+" - "+errores[i].getDescError() + "\n";
                    }
                    respuestaASolicitud.setSolicitudDescripcionError(descError);
                }
                JDBCDAOComAutSolicitud.obtenerDao().insertar(respuestaASolicitud);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void cambioTitularEquidos(ComAutSolicitud solicitud) throws Exception {
        try {
            if (solicitud == null) {
                throw new Exception("LA INSTANCIA DE SolicitudComAut NO PUEDE SER NULA");
            }
            DatosEquidosComAut datosEquido = this.controladorBase.datosEquidosPorUeln(solicitud.getUeln());
            RespuestaComAutSolicitud respuestaASolicitud = new RespuestaComAutSolicitud();
            respuestaASolicitud.setId(solicitud.getId());
            respuestaASolicitud.setFecha(Date.valueOf(LocalDate.now()));
            respuestaASolicitud.setSolicitudCodigoUELN(solicitud.getUeln());
            if(datosEquido!=null){
                RespuestaEntradaEquidos respuesta = controlador.obtenerStub().cambioTitularidadEquido(prepararEquidoCambioTitular(datosEquido));
                respuestaASolicitud.setSolicitudIdSolicitud(respuesta.getIdSolicitud());
                if (respuesta.getListaError() != null && respuesta.getListaError().length > 0) {
                    String descError = "";
                    Errores[] errores = respuesta.getListaError();
                    for (int i = 0; i < errores.length; i++) {
                        descError+=errores[i].getIdError()+" - "+errores[i].getDescError() + "\n";
                    }
                    respuestaASolicitud.setSolicitudDescripcionError(descError);
                }
                JDBCDAOComAutSolicitud.obtenerDao().insertar(respuestaASolicitud);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    private EntradaEquidos prepararEquidoAlta(DatosEquidosComAut datosEquino) throws Exception {
        Equido equido = new Equido();
        equido.setUeln(datosEquino.getCodigoUELN());
        equido.setAptoConsumo(controladorBase.addCerosDelante(datosEquino.getCodigoAptitud(), 2));
        equido.setCapa(controladorBase.addCerosDelante(datosEquino.getCodigoCapa(), 2));
        equido.setCastrado(datosEquino.getCastrado());
        equido.setDniTitular(datosEquino.getNIFTitular());
        equido.setEspecie(datosEquino.getCodigoEspecie());
        equido.setExpIdentificacion(datosEquino.getExplotacionNacimiento());
        equido.setExpMuerte(datosEquino.getExplotacionMuerte()==null?"":datosEquino.getExplotacionMuerte());
        equido.setExpNacimiento(datosEquino.getExplotacionNacimiento());
        equido.setFecIdentificacion(formatoFechaWSJA(datosEquino.getFechaNacimiento()));
        equido.setFecInicioSuspension("");
        equido.setFecInicioTitularidad(formatoFechaWSJA(datosEquino.getFechaInicioTitular()));
        equido.setFecMuerte(datosEquino.getFechaMuerte()==null?"":formatoFechaWSJA(datosEquino.getFechaMuerte()));
        equido.setFecNacimiento(formatoFechaWSJA(datosEquino.getFechaNacimiento()));
        equido.setFiabilidad(datosEquino.getCodigoFiabilidad());
        equido.setIdAlternativo(datosEquino.getIdAlternativo());
        equido.setIdElectronico(datosEquino.getIdElectronica());
        equido.setLugarNacimiento(datosEquino.getCodigoLugarNacimiento());
        equido.setNombreComercial(datosEquino.getLiteralNombreNacimiento());
        equido.setNombreNacimiento(datosEquino.getLiteralNombreNacimiento());
        equido.setOrientacion(controladorBase.addCerosDelante(datosEquino.getCodigoOrientacion(), 2));
        equido.setRaza(datosEquino.getCodigoRaza());
        equido.setSexo(controladorBase.addCerosDelante(datosEquino.getCodigoSexo(), 2));
        equido.setTipoIdElectronico(controladorBase.addCerosDelante(datosEquino.getCodigoTipoIdentificacion(), 2));
        equido.setTipoLectura(controladorBase.addCerosDelante(datosEquino.getCodigoSistemaLectura(), 2));
        equido.setTipoMuerte("");
        equido.setNombreTitular(datosEquino.getLiteralNombreTitular());
        equido.setDireccionTitular(datosEquino.getLiteralDireccionTitular() == null ? "?" : datosEquino.getLiteralDireccionTitular());
        equido.setCpTitular(datosEquino.getCodigoPostal());
        equido.setProvinciaTitular(datosEquino.getCodigoProvinciaTitular());
        equido.setMunicipioTitular(datosEquino.getCodigoMunicipioTitular());
        equido.setPaisTitular(datosEquino.getCodigoLugarNacimiento());
        equido.setTelefonoTitular("?");
        equido.setDuplicado(datosEquino.getDuplicado());
        
        JAXBContext contextJAXB = JAXBContext.newInstance(Equido.class);
        Marshaller m = contextJAXB.createMarshaller();
        
        if(FORMATO_XML)
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
        
        StringWriter sw = new StringWriter();
        m.marshal(equido, sw);
        
        String peticionFirmada = new FirmadorWSJuntaExt().peticionFirmada(sw.toString());
        String peticionCodificadaBase64 = Base64.getEncoder().encodeToString(peticionFirmada.getBytes());
        
        EntradaEquidos entradaEquido = new EntradaEquidos();
        entradaEquido.setEntidad("G91037895");
        entradaEquido.setEquido(peticionCodificadaBase64);
        return entradaEquido;
    }
    
    private EntradaEquidos prepararEquidoModificacion(DatosEquidosComAut datosEquino) throws Exception {
        Equido equido = new Equido();
        equido.setUeln(datosEquino.getCodigoUELN());
        equido.setAptoConsumo(controladorBase.addCerosDelante(datosEquino.getCodigoAptitud(), 2));
        equido.setCapa(controladorBase.addCerosDelante(datosEquino.getCodigoCapa(), 2));
        equido.setCastrado(datosEquino.getCastrado());
        equido.setDniTitular(""); // No se puede modificar
        equido.setEspecie(datosEquino.getCodigoEspecie());
        equido.setExpIdentificacion(""); // No se puede modificar
        equido.setExpMuerte(datosEquino.getExplotacionMuerte()==null?"":datosEquino.getExplotacionMuerte());
        equido.setExpNacimiento(datosEquino.getExplotacionNacimiento());
        equido.setFecIdentificacion(formatoFechaWSJA(datosEquino.getFechaNacimiento()));
        equido.setFecInicioSuspension("");
        equido.setFecInicioTitularidad(""); // No se puede modificar
        equido.setFecMuerte(datosEquino.getFechaMuerte()==null?"":formatoFechaWSJA(datosEquino.getFechaMuerte()));
        equido.setFecNacimiento(formatoFechaWSJA(datosEquino.getFechaNacimiento()));
        equido.setFiabilidad(""); // No se puede modificar
        equido.setIdAlternativo(datosEquino.getIdAlternativo());
        equido.setIdElectronico("");//No se puede modificar
        equido.setLugarNacimiento(datosEquino.getCodigoLugarNacimiento());
        equido.setNombreComercial(datosEquino.getLiteralNombreNacimiento());
        equido.setNombreNacimiento(datosEquino.getLiteralNombreNacimiento());
        equido.setOrientacion(""); // No se puede modificar
        equido.setRaza(datosEquino.getCodigoRaza());
        equido.setSexo(controladorBase.addCerosDelante(datosEquino.getCodigoSexo(), 2));
        equido.setTipoIdElectronico(controladorBase.addCerosDelante(datosEquino.getCodigoTipoIdentificacion(), 2));
        equido.setTipoLectura(controladorBase.addCerosDelante(datosEquino.getCodigoSistemaLectura(), 2));
        equido.setTipoMuerte("");
        equido.setNombreTitular("");//No se puede modificar
        equido.setDireccionTitular(""); // No se puede modificar
        equido.setCpTitular(""); // No se puede modificar
        equido.setProvinciaTitular(""); //No se puede modificar
        equido.setMunicipioTitular(""); // No se puede modificar
        equido.setPaisTitular(""); //No se puede modificar
        equido.setTelefonoTitular("");//No se puede modificar
        equido.setDuplicado(""); //No se puede modificar
        
        JAXBContext contextJAXB = JAXBContext.newInstance(Equido.class);
        Marshaller m = contextJAXB.createMarshaller();
        
        if(FORMATO_XML)
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
        
        StringWriter sw = new StringWriter();
        m.marshal(equido, sw);
        
        String peticionFirmada = new FirmadorWSJuntaExt().peticionFirmada(sw.toString());
        String peticionCodificadaBase64 = Base64.getEncoder().encodeToString(peticionFirmada.getBytes());
        
        EntradaEquidos entradaEquido = new EntradaEquidos();
        entradaEquido.setEntidad("G91037895");
        entradaEquido.setEquido(peticionCodificadaBase64);
        return entradaEquido;
    }
    
    private EntradaEquidos prepararEquidoCambioTitular(DatosEquidosComAut datosEquino) throws Exception {
        Equido equido = new Equido();
        equido.setUeln(datosEquino.getCodigoUELN());
        equido.setEspecie(datosEquino.getCodigoEspecie());
        equido.setDniTitular(datosEquino.getNIFTitular());
        equido.setFecInicioTitularidad(formatoFechaWSJA(datosEquino.getFechaInicioTitular()));
        equido.setNombreTitular(datosEquino.getLiteralNombreTitular());
        equido.setDireccionTitular(datosEquino.getLiteralDireccionTitular() == null ? "?" : datosEquino.getLiteralDireccionTitular());
        equido.setCpTitular(datosEquino.getCodigoPostal());
        equido.setProvinciaTitular(datosEquino.getCodigoProvinciaTitular());
        equido.setMunicipioTitular(datosEquino.getCodigoMunicipioTitular());
        equido.setPaisTitular(datosEquino.getCodigoLugarNacimiento());
        equido.setTelefonoTitular("?");
        
        
        JAXBContext contextJAXB = JAXBContext.newInstance(Equido.class);
        Marshaller m = contextJAXB.createMarshaller();
        
        if(FORMATO_XML)
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
        
        StringWriter sw = new StringWriter();
        m.marshal(equido, sw);
        
        String peticionFirmada = new FirmadorWSJuntaExt().peticionFirmada(sw.toString());
        String peticionCodificadaBase64 = Base64.getEncoder().encodeToString(peticionFirmada.getBytes());
        
        EntradaEquidos entradaEquido = new EntradaEquidos();
        entradaEquido.setEntidad("G91037895");
        entradaEquido.setEquido(peticionCodificadaBase64);
        return entradaEquido;
    }
    
    public String modificarEquidoDesdeTabla(JTable table) throws Exception {
        StringBuilder sb = new StringBuilder();
        DatosEquidosComAut datosEquidosComAut = controladorBase.obtenerDatosEquidosComAutDesdeTabla(table);
        EntradaEquidos entradaEquidos = prepararEquidoModificacion(datosEquidosComAut);
        RespuestaEntradaEquidos respuesta = controlador.obtenerStub().modificarEquido(entradaEquidos);
        if(respuesta.getListaError()!=null && respuesta.getListaError().length>0){
            sb.append("Errores: \n");
            Errores[] errores = respuesta.getListaError();
            for (int i = 0; i < errores.length; i++) {
                sb.append(i);
                sb.append(") ");
                sb.append(errores[i].getIdError());
                sb.append(" - ");
                sb.append(errores[i].getDescError());
                sb.append("\n");
            }
        } else {
            sb.append("Sin errores. ");
            sb.append("Código de solicitud: ");
            sb.append(respuesta.getIdSolicitud());
        }
        return sb.toString();
    }
    
    public String actualizarDatosEquidoDesdeTabla(JTable table) throws Exception {
        StringBuilder sb = new StringBuilder();
        DatosEquidosComAut datosEquidosComAut = controladorBase.obtenerDatosEquidosComAutDesdeTabla(table);
        EntradaEquidos entradaEquidos = prepararEquidoAlta(datosEquidosComAut);
        RespuestaEntradaEquidos respuesta = controlador.obtenerStub().altaEquidos(entradaEquidos);
        if(respuesta.getListaError()!=null && respuesta.getListaError().length>0){
            sb.append("Errores: \n");
            Errores[] errores = respuesta.getListaError();
            for (int i = 0; i < errores.length; i++) {
                sb.append(i);
                sb.append(") ");
                sb.append(errores[i].getIdError());
                sb.append(" - ");
                sb.append(errores[i].getDescError());
                sb.append("\n");
            }
        } else {
            sb.append("Sin errores. ");
            sb.append("Código de solicitud: ");
            sb.append(respuesta.getIdSolicitud());
        }
        return sb.toString();
    }
    
    public String actualizarTitularidadDesdeDatosEquidosComAut(JTable table) throws Exception {
        StringBuilder sb = new StringBuilder();
        DatosEquidosComAut datosEquidosComAut = controladorBase.obtenerDatosEquidosComAutDesdeTabla(table);
        EntradaEquidos entradaEquidos = prepararEquidoCambioTitular(datosEquidosComAut);
        RespuestaEntradaEquidos respuesta = controlador.obtenerStub().cambioTitularidadEquido(entradaEquidos);
        if(respuesta.getListaError()!=null && respuesta.getListaError().length>0){
            sb.append("Errores: \n");
            Errores[] errores = respuesta.getListaError();
            for (int i = 0; i < errores.length; i++) {
                sb.append(i);
                sb.append(") ");
                sb.append(errores[i].getIdError());
                sb.append(" - ");
                sb.append(errores[i].getDescError());
                sb.append("\n");
            }
        } else {
            sb.append("Sin errores. ");
            sb.append("Código de solicitud: ");
            sb.append(respuesta.getIdSolicitud());
        }
        return sb.toString();
    }
    
    public String formatoFechaWSJA(String fechaOrigenEnFormatoOrigen) throws Exception {
        String res = null;
        if(fechaOrigenEnFormatoOrigen!=null){
            java.util.Date dateOrigen = new SimpleDateFormat("yyyy-MM-dd").parse(fechaOrigenEnFormatoOrigen);
            res = new SimpleDateFormat("dd/MM/yyyy").format(dateOrigen);
        }
        return res;
    }
}
