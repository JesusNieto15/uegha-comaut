/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15;

import com.jnr15.wsja.ws.DatosBasicos;
import com.jnr15.wsja.ws.DatosBasicosCompleto;
import com.jnr15.wsja.ws.DatosBasicosTitular;
import com.jnr15.wsja.ws.ResultadoGrabacionSolicitud;
import com.jnr15.wsja.ws.SigganRiiaEquino;
import com.jnr15.wsja.ws.SigganRiiaEquinoLocator;
import com.jnr15.wsja.ws.SigganRiiaEquinoSoap;
import com.jnr15.wsja.ws.SigganRiiaEquinoSoapStub;
import dao.JDBCDAOComAutSolicitud;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Base64;
import java.util.Calendar;
import java.util.TimeZone;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import modelo.ComAutSolicitud;
import modelo.DatosEquidosComAut;
import modelo.RespuestaComAutSolicitud;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;

/**
 *
 * @author Jesús Nieto Rodríguez jesusnieto@invengenio.com
 */
public class ControladorWSJA  {

    private static ControladorWSJA controlador = null;
    private final ControladorBase controladorBase;
    private final SigganRiiaEquinoSoap sigganRiiaEquinoSoap;

    private ControladorWSJA() throws Exception {
        controladorBase = ControladorBase.obtenerControlador();
        sigganRiiaEquinoSoap = obtenerStub();
    }

    public static ControladorWSJA obtenerControlador() throws Exception {
        if (controlador == null) {
            controlador = new ControladorWSJA();
        }
        return controlador;
    }

    private SigganRiiaEquinoSoap obtenerStub() throws Exception {
        SigganRiiaEquino servicio = new SigganRiiaEquinoLocator();
        SigganRiiaEquinoSoap stub = new SigganRiiaEquinoSoapStub(new URL(servicio.getsigganRiiaEquinoSoapAddress()), servicio);
        Stub st = (Stub) stub;
        addWsSecurityHeader(st, "UEGHA", "WZQDIMYMEU");
        return stub;
    }

    public String actualizarDatosEquidoDesdeTabla(JTable table) throws Exception {
        StringBuilder sb = new StringBuilder();
        DatosEquidosComAut datos = controladorBase.obtenerDatosEquidosComAutDesdeTabla(table);
        ResultadoGrabacionSolicitud result = sigganRiiaEquinoSoap.actualizarDatosEquidos_(
                datos.getCodigoUELN(),
                datos.getCodigoEspecie(),
                datos.getCodigoRaza(),
                datos.getCodigoFiabilidad(),
                controladorBase.addCerosDelante(datos.getCodigoSexo(), 2),
                datos.getCastrado(),
                controladorBase.addCerosDelante(datos.getCodigoCapa(), 2),
                datos.getCodigoLugarNacimiento(),
                datos.getExplotacionNacimiento(),
                formatoFechaWSJA(datos.getFechaNacimiento()),
                controladorBase.addCerosDelante(datos.getCodigoTipoIdentificacion(), 2),
                controladorBase.addCerosDelante(datos.getCodigoSistemaLectura(), 2),
                datos.getIdElectronica(),
                datos.getIdAlternativo(),
                formatoFechaWSJA(datos.getFechaIdentificacion()),
                datos.getNIFTitular(),
                datos.getLiteralNombreTitular(),
                datos.getLiteralDireccionTitular() == null ? "SIN DATOS" : datos.getLiteralDireccionTitular(),
                formatoFechaWSJA(datos.getFechaInicioTitular()),
                datos.getCodigoProvinciaTitular(),
                datos.getCodigoMunicipioTitular(),
                datos.getCodigoPostal(),
                controladorBase.addCerosDelante(datos.getCodigoOrientacion(), 2),
                datos.getLiteralNombreNacimiento(),
                datos.getLiteralNombreComercial(),
                controladorBase.addCerosDelante(datos.getCodigoAptitud(), 2),
                formatoFechaWSJA(datos.getFechaInicioSuspension()),
                datos.getDuplicado(),
                formatoFechaWSJA(datos.getFechaMuerte()),
                datos.getExplotacionMuerte(),
                datos.getCodigoTipoMuerte() != null ? controladorBase.addCerosDelante(datos.getCodigoTipoMuerte(), 2) : datos.getCodigoTipoMuerte(),
                datos.getCaGrabadora(),
                datos.getExplotacionUbicacion()
        );
        sb.append("Id Solicitud: ");
        sb.append(result.getIdSolicitud());
        sb.append("\n");
        sb.append("Resultado: ");
        String aux = result.getCodigoError() == null ? "Comunicación realizada con éxito" : "Código de error: "
                + result.getCodigoError() + "\nDescripción del error: " + result.getDescripcionError();
        sb.append(aux);
        return sb.toString();
    }

    public void actualizarDatosEquidos(ComAutSolicitud solicitud) throws Exception {
        try {
            if (solicitud == null) {
                throw new Exception("LA INSTANCIA DE SolicitudComAut NO PUEDE SER NULA");
            }
            DatosEquidosComAut datosEquido = this.controladorBase.datosEquidosPorUeln(solicitud.getUeln());
            RespuestaComAutSolicitud respuestaASolicitud = new RespuestaComAutSolicitud();
            respuestaASolicitud.setId(solicitud.getId());
            respuestaASolicitud.setFecha(Date.valueOf(LocalDate.now()));
            respuestaASolicitud.setSolicitudCodigoUELN(solicitud.getUeln());
            if (datosEquido != null) {
                //Comentamos las lineas de abajo por quedar obsoleto con la nueva versión
//                if (solicitud.getMotivo().equals(ConstantesComunes.MOTIVO_DUPLICADO.getInteger())) {
//                    datosEquido.setDuplicado("S");
//                }
                ResultadoGrabacionSolicitud result = sigganRiiaEquinoSoap.actualizarDatosEquidos_(
                        datosEquido.getCodigoUELN(),
                        datosEquido.getCodigoEspecie(),
                        datosEquido.getCodigoRaza(),
                        datosEquido.getCodigoFiabilidad(),
                        controladorBase.addCerosDelante(datosEquido.getCodigoSexo(), 2),
                        datosEquido.getCastrado(),
                        controladorBase.addCerosDelante(datosEquido.getCodigoCapa(), 2),
                        datosEquido.getCodigoLugarNacimiento(),
                        datosEquido.getExplotacionNacimiento(),
                        formatoFechaWSJA(datosEquido.getFechaNacimiento()),
                        controladorBase.addCerosDelante(datosEquido.getCodigoTipoIdentificacion(), 2),
                        controladorBase.addCerosDelante(datosEquido.getCodigoSistemaLectura(), 2),
                        datosEquido.getIdElectronica(),
                        datosEquido.getIdAlternativo(),
                        formatoFechaWSJA(datosEquido.getFechaIdentificacion()),
                        datosEquido.getNIFTitular(),
                        datosEquido.getLiteralNombreTitular(),
                        datosEquido.getLiteralDireccionTitular() == null ? "SIN DATOS" : datosEquido.getLiteralDireccionTitular(),
                        formatoFechaWSJA(datosEquido.getFechaInicioTitular()),
                        datosEquido.getCodigoProvinciaTitular(),
                        datosEquido.getCodigoMunicipioTitular(),
                        datosEquido.getCodigoPostal(),
                        controladorBase.addCerosDelante(datosEquido.getCodigoOrientacion(), 2),
                        datosEquido.getLiteralNombreNacimiento(),
                        datosEquido.getLiteralNombreComercial(),
                        controladorBase.addCerosDelante(datosEquido.getCodigoAptitud(), 2),
                        formatoFechaWSJA(datosEquido.getFechaInicioSuspension()),
                        datosEquido.getDuplicado(),
                        formatoFechaWSJA(datosEquido.getFechaMuerte()),
                        datosEquido.getExplotacionMuerte(),
                        datosEquido.getCodigoTipoMuerte() != null ? controladorBase.addCerosDelante(datosEquido.getCodigoTipoMuerte(), 2) : datosEquido.getCodigoTipoMuerte(),
                        datosEquido.getCaGrabadora(),
                        datosEquido.getExplotacionUbicacion()
                );
                respuestaASolicitud.setSolicitudIdSolicitud(result.getIdSolicitud());
                respuestaASolicitud.setSolicitudCodigoError(result.getCodigoError());
                respuestaASolicitud.setSolicitudDescripcionError(result.getDescripcionError());
                //Insertamos la solicitud ComAut en su correspondiente tabla con el resultado obtenido
                JDBCDAOComAutSolicitud.obtenerDao().insertar(respuestaASolicitud);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public DefaultTableModel obtenerDatosBasicosDeUnEquido(String ueln) throws Exception {
        Object[][] datosTabla = null;
        DatosBasicosCompleto datosBasicosCompleto = null;
        int numColumnas = 2;
        int numFilas = 12;
        DatosBasicos datosBasicos = sigganRiiaEquinoSoap.dameDatosBasicosEquidos(new String[]{ueln})[0];
        if(datosBasicos!=null){
            datosTabla = new Object[numFilas][numColumnas];
            if(datosBasicos instanceof DatosBasicosCompleto){
                datosBasicosCompleto = (DatosBasicosCompleto)datosBasicos;
                numFilas++;
                int lengthTitulares = datosBasicosCompleto.getTitulares().length;
                numFilas += (lengthTitulares*3);
                datosTabla=new Object[numFilas][numColumnas];
            }
        }
        if(datosBasicos!=null){
            String codigoEspecie = datosBasicos.getCodigoEspecie();
            datosTabla[0][0]="Código Especie";datosTabla[0][1]=codigoEspecie;
            String codigoOrganismoEmisor = datosBasicos.getCodigoOrganismoEmisor();
            datosTabla[1][0]="Código Organismo Emisor";datosTabla[1][1]=codigoOrganismoEmisor;
            String codigoRaza = datosBasicos.getCodigoRaza();
            datosTabla[2][0]="Código Raza";datosTabla[2][1]=codigoRaza;
            String codigoSexo = datosBasicos.getCodigoSexo();
            datosTabla[3][0]="Código Sexo";datosTabla[3][1]=codigoSexo;
            String especie = datosBasicos.getEspecie();
            datosTabla[4][0]="Especie";datosTabla[4][1]=especie;
            String explotacionNacimiento = datosBasicos.getExplotacionNacimiento();
            datosTabla[5][0]="Explotación Nacimiento";datosTabla[5][1]=explotacionNacimiento;
            Calendar fechaNacimiento = datosBasicos.getFechaNacimiento();
            datosTabla[6][0]="Fecha Nacimiento";datosTabla[6][1]=fechaNacimiento.getTime().toString();
            String microchip = datosBasicos.getIdentificadorElectronico();
            datosTabla[7][0]="Microchip";datosTabla[7][1]=microchip;
            String organismoEmisor = datosBasicos.getOrganismoEmisor();
            datosTabla[8][0]="Organismo emisor";datosTabla[8][1]=organismoEmisor;
            String raza = datosBasicos.getRaza();
            datosTabla[9][0]="Raza";datosTabla[9][1]=raza;
            String sexo = datosBasicos.getSexo();
            datosTabla[10][0]="Sexo";datosTabla[10][1]=sexo;
            String uelnTabla = datosBasicos.getUELN();
            datosTabla[11][0]="UELN";datosTabla[11][1]=uelnTabla;
        }
        if(datosBasicosCompleto!=null){
            String consumoHumano = datosBasicosCompleto.getAptitudConsumo();
            datosTabla[12][0]="Consumo humano";datosTabla[12][1]=consumoHumano;
            int siguienteIndiceFila = 13;
            DatosBasicosTitular[] datosTitular = datosBasicosCompleto.getTitulares();
            for (DatosBasicosTitular datosT : datosTitular) {
                    String fechaInicioTitularidad = datosT.getFechaInicioTitularidad().getTime().toString();
                    datosTabla[siguienteIndiceFila][0]="Fecha inicio Titularidad";datosTabla[siguienteIndiceFila++][1]=fechaInicioTitularidad;
                    String nifTitular = datosT.getNIF();
                    datosTabla[siguienteIndiceFila][0]="NIF Titular";datosTabla[siguienteIndiceFila++][1]=nifTitular;
                    String nombreTitular = datosT.getNombre();
                    datosTabla[siguienteIndiceFila][0]="Nombre titular";datosTabla[siguienteIndiceFila++][1]=nombreTitular;
                }
        }
        if(datosTabla!=null)
            return new DefaultTableModel(datosTabla,new String[]{"Campo","Valor"});
        return null;
    }

    private static void addWsSecurityHeader(Stub binding, String usernameStr, String passwordStr) throws Exception {
        //From the spec: Password_Digest = Base64 (SHA-1(nonce + created + password))
        //Make the nonce
        SecureRandom rand = SecureRandom.getInstance("SHA1PRNG");
        rand.setSeed(System.currentTimeMillis());
        byte[] nonceBytes = new byte[16];
        rand.nextBytes(nonceBytes);

        //Make the created date
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        df.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
        String createdDate = df.format(Calendar.getInstance().getTime());
        byte[] createdDateBytes = createdDate.getBytes("UTF-8");

        //Make the password
        byte[] passwordBytes = passwordStr.getBytes("UTF-8");

        //SHA-1 hash the bunch of it.
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(nonceBytes);
        baos.write(createdDateBytes);
        baos.write(passwordBytes);
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] digestedPassword = md.digest(baos.toByteArray());

        //Encode the password and nonce for sending
        String passwordB64 = Base64.getEncoder().encodeToString(digestedPassword);
        String nonceB64 = Base64.getEncoder().encodeToString(nonceBytes);

        //Now create the header with all the appropriate elements
        // Create the top-level WS-Security SOAP header XML name.
        QName headerName = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security");
        //QName headerName = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd","Security","wsse");
        SOAPHeaderElement header = new SOAPHeaderElement(headerName);
        //  no intermediate actors are involved.
        header.setActor(null);
        // not important, "wsse" is standard
        header.setPrefix("wsse");
        header.setMustUnderstand(false);

        SOAPElement usernameToken = header.addChildElement("UsernameToken");
        SOAPElement username = usernameToken.addChildElement("Username");
        username.addTextNode(usernameStr);

        SOAPElement password = usernameToken.addChildElement("Password");
        password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest");
        password.addTextNode(passwordB64);

        SOAPElement nonce = usernameToken.addChildElement("Nonce");
        nonce.setAttribute("EncodingType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
        nonce.addTextNode(nonceB64);

        SOAPElement created = usernameToken.addChildElement("Created", "wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
        created.addTextNode(createdDate);

        binding.setHeader(header);
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
