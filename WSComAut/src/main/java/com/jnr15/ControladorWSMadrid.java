/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15;

import dao.JDBCDAOComAutSolicitud;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.RiiaWS2Service;
import madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.RiiaWS2ServiceLocator;
import madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.Riia_ws2SoapBindingStub;
import modelo.ComAutSolicitud;
import modelo.DatosEquidosComAut;
import modelo.RespuestaComAutSolicitud;
import riia_ws.veterinarios.beans.AnimalBean;
import riia_ws.veterinarios.beans.DatosBasicosBean;
import riia_ws.veterinarios.beans.DatosBasicosCompletoBean;
import riia_ws.veterinarios.beans.DatosBasicosTitularBean;
import riia_ws.veterinarios.beans.DatosEquidoBean;

/**
 *
 * @author jesus
 */
public class ControladorWSMadrid {

    private static ControladorWSMadrid controlador = null;
    private final ControladorBase controladorBase;
    private Riia_ws2SoapBindingStub stub;

    private ControladorWSMadrid() throws Exception {
        controladorBase = ControladorBase.obtenerControlador();
        stub = obtenerStub();
    }

    public static ControladorWSMadrid obtenerControlador() throws Exception {
        if (controlador == null) {
            controlador = new ControladorWSMadrid();
        }
        return controlador;
    }

    private Riia_ws2SoapBindingStub obtenerStub() throws Exception {
        RiiaWS2Service servicio = new RiiaWS2ServiceLocator();
        Riia_ws2SoapBindingStub stub = new Riia_ws2SoapBindingStub(new URL(servicio.getriia_ws2Address()), servicio);
        
        return stub;
    }
    
    public String altaEquido(String ueln) throws Exception {
        StringBuilder sb = new StringBuilder();
        DatosEquidosComAut datos = controladorBase.datosEquidosPorUeln(ueln);
        AnimalBean animalBean = new AnimalBean();
        animalBean.setC_codigo_ueln(ueln);
        AnimalBean[] listaAnimales = new AnimalBean[1];
        listaAnimales[0] = animalBean;
        DatosEquidoBean datosEquidoBean = (DatosEquidoBean)(stub.altaAnimal(listaAnimales)).firstElement();
        return datosEquidoBean.getDescripcionError();
    }

    public String actualizarDatosEquidoDesdeTabla(JTable table) throws Exception {
        StringBuilder sb = new StringBuilder();
        DatosEquidosComAut datos = controladorBase.obtenerDatosEquidosComAutDesdeTabla(table);
        DatosEquidoBean respuesta = stub.actualizarDatosEquido(
                datos.getCodigoUELN(),
                datos.getCodigoEspecie(),
                datos.getCodigoRaza(),
                datos.getCodigoFiabilidad(),
                controladorBase.addCerosDelante(datos.getCodigoSexo(), 2),
                datos.getCastrado(),
                controladorBase.addCerosDelante(datos.getCodigoCapa(), 2),
                datos.getCodigoLugarNacimiento(),
                datos.getExplotacionNacimiento(),
                controladorBase.formatoFechaDDMMYYYY(datos.getFechaNacimiento()),
                controladorBase.addCerosDelante(datos.getCodigoTipoIdentificacion(), 2),
                controladorBase.addCerosDelante(datos.getCodigoSistemaLectura(), 2),
                datos.getIdElectronica(),
                datos.getIdAlternativo(),
                controladorBase.formatoFechaDDMMYYYY(datos.getFechaIdentificacion()),
                datos.getNIFTitular(),
                datos.getLiteralNombreTitular(),
                datos.getLiteralDireccionTitular() == null ? "SIN DATOS" : datos.getLiteralDireccionTitular(),
                controladorBase.formatoFechaDDMMYYYY(datos.getFechaInicioTitular()),
                datos.getCodigoProvinciaTitular(),
                datos.getCodigoMunicipioTitular(),
                datos.getCodigoPostal(),
                controladorBase.addCerosDelante(datos.getCodigoOrientacion(), 2),
                datos.getLiteralNombreNacimiento(),
                datos.getLiteralNombreComercial(),
                controladorBase.addCerosDelante(datos.getCodigoAptitud(), 2),
                controladorBase.formatoFechaDDMMYYYY(datos.getFechaInicioSuspension()),
                datos.getDuplicado(),
                controladorBase.formatoFechaDDMMYYYY(datos.getFechaMuerte()),
                datos.getExplotacionMuerte(),
                datos.getCodigoTipoMuerte() != null ? controladorBase.addCerosDelante(datos.getCodigoTipoMuerte(), 2) : datos.getCodigoTipoMuerte(),
                "012",
                "024");
                sb.append("Id Solicitud: ");
                sb.append(respuesta.getIdSolicitud());
                sb.append("\n");
                sb.append("Resultado: ");
                String aux = respuesta.getCodigoError() == null ? "Comunicación realizada con éxito" : "Código de error: "
                    + respuesta.getCodigoError() + "\nDescripción del error: " + respuesta.getDescripcionError();
                sb.append(aux);
        return sb.toString();
    }

    public void actualizarDatosEquidos(ComAutSolicitud solicitud) throws Exception {
        try {
            if (solicitud == null) {
                throw new Exception("LA INSTANCIA DE SolicitudComAut NO PUEDE SER NULA");
            }
            DatosEquidosComAut datos = this.controladorBase.datosEquidosPorUeln(solicitud.getUeln());
            RespuestaComAutSolicitud respuestaASolicitud = new RespuestaComAutSolicitud();
            respuestaASolicitud.setId(solicitud.getId());
            respuestaASolicitud.setFecha(Date.valueOf(LocalDate.now()));
            respuestaASolicitud.setSolicitudCodigoUELN(solicitud.getUeln());
            if (datos != null) {
                DatosEquidoBean respuesta = stub.actualizarDatosEquido(
                        datos.getCodigoUELN(),
                        datos.getCodigoEspecie(),
                        datos.getCodigoRaza(),
                        datos.getCodigoFiabilidad(),
                        controladorBase.addCerosDelante(datos.getCodigoSexo(), 2),
                        datos.getCastrado(),
                        controladorBase.addCerosDelante(datos.getCodigoCapa(), 2),
                        datos.getCodigoLugarNacimiento(),
                        datos.getExplotacionNacimiento(),
                        controladorBase.formatoFechaDDMMYYYY(datos.getFechaNacimiento()),
                        controladorBase.addCerosDelante(datos.getCodigoTipoIdentificacion(), 2),
                        controladorBase.addCerosDelante(datos.getCodigoSistemaLectura(), 2),
                        datos.getIdElectronica(),
                        datos.getIdAlternativo(),
                        controladorBase.formatoFechaDDMMYYYY(datos.getFechaIdentificacion()),
                        datos.getNIFTitular(),
                        datos.getLiteralNombreTitular(),
                        datos.getLiteralDireccionTitular() == null ? "SIN DATOS" : datos.getLiteralDireccionTitular(),
                        controladorBase.formatoFechaDDMMYYYY(datos.getFechaInicioTitular()),
                        datos.getCodigoProvinciaTitular(),
                        datos.getCodigoMunicipioTitular(),
                        datos.getCodigoPostal(),
                        controladorBase.addCerosDelante(datos.getCodigoOrientacion(), 2),
                        datos.getLiteralNombreNacimiento(),
                        datos.getLiteralNombreComercial(),
                        controladorBase.addCerosDelante(datos.getCodigoAptitud(), 2),
                        controladorBase.formatoFechaDDMMYYYY(datos.getFechaInicioSuspension()),
                        datos.getDuplicado(),
                        controladorBase.formatoFechaDDMMYYYY(datos.getFechaMuerte()),
                        datos.getExplotacionMuerte(),
                        datos.getCodigoTipoMuerte() != null ? controladorBase.addCerosDelante(datos.getCodigoTipoMuerte(), 2) : datos.getCodigoTipoMuerte(),
                        "012",
                        "024");
                respuestaASolicitud.setSolicitudIdSolicitud(respuesta.getIdSolicitud());
                respuestaASolicitud.setSolicitudCodigoError(respuesta.getCodigoError());
                respuestaASolicitud.setSolicitudDescripcionError(respuesta.getDescripcionError());
                JDBCDAOComAutSolicitud.obtenerDao().insertar(respuestaASolicitud);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public DefaultTableModel obtenerDatosBasicosDeUnEquido(String ueln) throws Exception {
        List<String[]> datosEnLista = new ArrayList<>();
        DatosBasicosCompletoBean[] datosBasicos = stub.dameDatosBasicosEquido(ueln);
        if (datosBasicos != null && datosBasicos.length>0) {
            DatosBasicosCompletoBean datos = datosBasicos[0];
            DatosBasicosBean datosB = datos.getDatosBasicos();
            DatosBasicosTitularBean[] datosTitulares = datos.getTitulares();
            if (datosB != null) {
                datosEnLista.add(new String[]{"UELN", datosB.getUeln()});
                datosEnLista.add(new String[]{"Microchip", datosB.getIdentificadorElectronico()});
                datosEnLista.add(new String[]{"Fecha nacimiento", datosB.getFechaNacimiento().toString()});
                datosEnLista.add(new String[]{"Capa", datos.getCapa()});
                datosEnLista.add(new String[]{"Aptitud consumo", datos.getCodigoAptitudConsumo()});
                datosEnLista.add(new String[]{"Nombre nacimiento", datos.getNombreNacimiento()});
                datosEnLista.add(new String[]{"Organismo Emisor", datosB.getOrganismoEmisor()});
                datosEnLista.add(new String[]{"Raza", datosB.getRaza()});
                datosEnLista.add(new String[]{"Explotación nacimiento", datosB.getExplotacionNacimiento()});
                if(datosTitulares!=null && datosTitulares.length>0){
                    for (DatosBasicosTitularBean datosTitular : datosTitulares) {
                        datosEnLista.add(new String[]{"Fecha inicio titular", datosTitular.getFechaInicioTitularidad().toString()});
                        datosEnLista.add(new String[]{"NIF Titular", datosTitular.getNif()});
                        datosEnLista.add(new String[]{"Nombre titular", datosTitular.getNombre()});
                    }
                }
            }
        }
        if (!datosEnLista.isEmpty()) {
            Object[][] datosTabla = new Object[datosEnLista.size()][2];
            int contadorFila = 0;
            for (String[] fila : datosEnLista) {
                datosTabla[contadorFila++] = fila;
            }
            if (datosTabla != null) {
                return new DefaultTableModel(datosTabla, new String[]{"Campo", "Valor"});
            }
        }
        return null;
    }
}
