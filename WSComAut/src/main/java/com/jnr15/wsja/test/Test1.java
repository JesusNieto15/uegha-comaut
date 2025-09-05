/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15.wsja.test;

import com.jnr15.keystore.KeyStore;
import com.jnr15.wsja.ws.DatosBasicos;
import com.jnr15.wsja.ws.DatosTitular;
import com.jnr15.wsja.ws.ResultadoGrabacionSolicitud;
import com.jnr15.wsja.ws.SigganRiiaEquino;
import com.jnr15.wsja.ws.SigganRiiaEquinoLocator;
import com.jnr15.wsja.ws.SigganRiiaEquinoSoap;
import com.jnr15.wsja.ws.SigganRiiaEquinoSoapStub;
import configBBDD.Propiedades;
import dao.IDAOComAutSolicitud;
import dao.IDAODatosEquidosComAut;
import dao.JDBCDAOComAutSolicitud;
import dao.JDBCDAODatosEquidosComAut;
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
import javax.xml.namespace.QName;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;
import javax.xml.soap.SOAPElement;
import modelo.DatosEquidosComAut;
import modelo.RespuestaComAutSolicitud;
import modelo.ComAutSolicitud;

/**
 *
 * @author inven
 */
public class Test1 {
    
    private static final Boolean USO_EXTERNO = Boolean.TRUE;
    private static final int MOTIVO_DUPLICADO = 5;
    private static IDAOComAutSolicitud DAO_COM_AUT_SOLICITUD;
    private static IDAODatosEquidosComAut DAO_DATOS_EQUIDOS_COM_AUT;
    private static SigganRiiaEquinoSoap SIGGAN_RIIA_EQUINO_SOAP;
    private static String REGA_PRUEBA = "ES410640009010";
    private static ComAutSolicitud SOLICITUD_ACTUAL;
    private static RespuestaComAutSolicitud RESPUESTA_SOLICITUD_ACTUAL;
    private static int CONTADOR_SOLICITUD;
    private static String FECHA_DESDE = "01/01/2000";
    private static String FECHA_HASTA = "31/12/2022";
    private static int GESTIONANDO_CCAA = 0;
    private static int GESTIONANDO_CCAA_ANDALUCIA = 0;
    private static int GESTIONANDO_DEFAULT = -1;
    private static int MAX_CONTADOR_SOLICITUD = 2000;
    
    //entero para ejecutar test concreto
    private static int CODIGO_TEST = 2;
    
    public static void main(String[] args) {
        try {
            inicializarPropiedades();
            switch(CODIGO_TEST){
                case 1:
                    testActualizarDatosEquidos();
                    break;
                case 2:
                    testDameDatosBasicosEquido("724018000003493");
                    break;
                case 3:
                    testCambioSTitularidadesJuntaAndalucia(new String[]{"724018000005286"}, "01/01/2000", "20/09/2022");
                    break;
                case 4:
                    testMasivo();
                    break;
                default:
                    throw new Exception("CODIGO DE TEST NO CONTEMPLADO");
            }
            //testActualizarDatosEquidos(SIGGAN_RIIA_EQUINO_SOAP);
            //testDameDatosBasicosEquido("724018000005286");
            //testCambioSTitularidadesJuntaAndalucia(new String[]{"724018000005286"}, "01/01/2000", "20/09/2022");
            //testMasivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static SigganRiiaEquinoSoap obtenerStub()throws Exception {
        SigganRiiaEquino servicio = new SigganRiiaEquinoLocator();
        SigganRiiaEquinoSoap stub = new SigganRiiaEquinoSoapStub(new URL(servicio.getsigganRiiaEquinoSoapAddress()),servicio);
        Stub st = (Stub)stub;
        //addWsSecurityHeader(st, "UEGHA", "JCADPYCTZT");
        addWsSecurityHeader(st, "UEGHA", "WZQDIMYMEU");
        return stub;
    }
    
    private static void inicializarPropiedades() throws Exception {
        cargarKeyStore();
        String maquina="192.168.1.35";
        String puerto="3306";
        if(USO_EXTERNO){
            maquina="ansoldes.com";
            puerto="2224";
        }
        Propiedades.obtenerPropiedades().modificarPropiedadesConexionBBDD(maquina, puerto, "uegha", "jesus", "19811224");
        SIGGAN_RIIA_EQUINO_SOAP = obtenerStub();
        DAO_COM_AUT_SOLICITUD = JDBCDAOComAutSolicitud.obtenerDao();
        DAO_DATOS_EQUIDOS_COM_AUT = JDBCDAODatosEquidosComAut.obtenerDao();
        CONTADOR_SOLICITUD=0;
    }
    
    private static void cargarKeyStore(){
//        System.setProperty("javax.net.ssl.keyStore","./almacen_keystore/keystorejnr.jks");
//        System.setProperty("javax.net.ssl.keyStoreType","jks");
//        System.setProperty("javax.net.ssl.keyStorePassword", "22Je24Ch14Je");
//        System.setProperty("javax.net.ssl.trustStore", "./almacen_keystore/keystorejnr.jks");
          KeyStore.cargarKeyStore();
    }
    
    private static String addCerosDelante(String campo,int longitudCampo){
        String res = campo;
        while(res.length()<longitudCampo)
            res="0"+res;
        return res;
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
	
	SOAPElement created = usernameToken.addChildElement("Created","wsu","http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
	created.addTextNode(createdDate);
        
	binding.setHeader(header);
    }
    
    //A partir de aquí el código de las pruebas
    
    private static void testActualizarDatosEquidos()throws Exception {
        try {
            for(ComAutSolicitud s:DAO_COM_AUT_SOLICITUD.solicitudesPendientesDeEnviar()){
                SOLICITUD_ACTUAL = s;
                testActualizarDatosEquidoSolicitudActual();
            }            
        } catch (Exception e) {
            throw e;
        }
    }
    
    private static void testActualizarDatosEquidoSolicitudActual() throws Exception {
        RESPUESTA_SOLICITUD_ACTUAL = actualizarDatosEquidos_(SOLICITUD_ACTUAL);
        
        StringBuilder sb = new StringBuilder();
        sb.append(++CONTADOR_SOLICITUD);
        sb.append(") Resultado de actualizarDatosEquidos(): ");
        if(GESTIONANDO_CCAA!=GESTIONANDO_CCAA_ANDALUCIA){
            sb.append("Solicitud no corresponde a la Comunidad Autónoma de Andalucía");
        }
        else if(JDBCDAOComAutSolicitud.obtenerDao().insertar(RESPUESTA_SOLICITUD_ACTUAL)==1)
            sb.append(SOLICITUD_ACTUAL);
        else
            sb.append("Más de un valor devuelto en el registro de la solicitud con código: " + SOLICITUD_ACTUAL.getId());
        System.out.println(sb.toString());
    }
    
    private static void testDameDatosBasicosEquido(String ueln)throws Exception {
        StringBuilder sb = new StringBuilder();
        try{
            DatosBasicos datosBasicos = SIGGAN_RIIA_EQUINO_SOAP.dameDatosBasicosEquido(ueln);
            sb.append(++CONTADOR_SOLICITUD);
            sb.append(") Resultado de dameDatosBasicosEquido(");
            sb.append(ueln);
            sb.append("): ");
            sb.append(datosBasicosEquidoAString(datosBasicos));
            System.out.println(sb.toString());
        }catch(Exception e){
            throw e;
        }
    }
    
    private static void testCambioSTitularidadesJuntaAndalucia(String[] uelns,String fechaDesde,String fechaHasta) throws Exception {
        StringBuilder sb = new StringBuilder();
        try {
            DatosTitular[] datos = SIGGAN_RIIA_EQUINO_SOAP.obtenerTitularidadesModificadasPorCCAA(uelns, fechaDesde, fechaHasta);
            sb.append(++CONTADOR_SOLICITUD);
            sb.append(") Resultado de obtenerTitularidadesModificadasPorCCAA(");
            sb.append(uelns[0]);
            sb.append(",");
            sb.append(fechaDesde);
            sb.append(",");
            sb.append(fechaHasta);
            sb.append("): ");
            if(datos!=null && datos.length>0){
                for(int i=0;i<datos.length;i++){
                    sb.append(datosTitularAString(datos[i]));
                }
            }
            else{
                sb.append("Respuesta nula o sin datos que mostrar");
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            throw e;
        }
    }
    
    private static RespuestaComAutSolicitud actualizarDatosEquidos_(ComAutSolicitud solicitud) throws Exception {
        if(solicitud==null)
            throw new Exception("LA INSTANCIA DE SolicitudComAut NO PUEDE SER NULA");
        RespuestaComAutSolicitud respuesta = null;
        DatosEquidosComAut datosEquido = DAO_DATOS_EQUIDOS_COM_AUT.datosEquidosComAutPorUELN(solicitud.getUeln());
        if(datosEquido!=null){
            GESTIONANDO_CCAA = GESTIONANDO_CCAA_ANDALUCIA;
            datosEquido.setExplotacionNacimiento(REGA_PRUEBA);
            datosEquido.setExplotacionUbicacion(REGA_PRUEBA);
            ResultadoGrabacionSolicitud result = SIGGAN_RIIA_EQUINO_SOAP.actualizarDatosEquidos_(
                            datosEquido.getCodigoUELN(), 
                            datosEquido.getCodigoEspecie(), 
                            datosEquido.getCodigoRaza(), 
                            datosEquido.getCodigoFiabilidad(), 
                            addCerosDelante(datosEquido.getCodigoSexo(),2), 
                            datosEquido.getCastrado(), 
                            addCerosDelante(datosEquido.getCodigoCapa(), 2), 
                            datosEquido.getCodigoLugarNacimiento(), 
                            datosEquido.getExplotacionNacimiento(), 
                            datosEquido.getFechaNacimiento(), 
                            addCerosDelante(datosEquido.getCodigoTipoIdentificacion(), 2), 
                            addCerosDelante(datosEquido.getCodigoSistemaLectura(), 2), 
                            datosEquido.getIdElectronica(), 
                            datosEquido.getIdAlternativo(), 
                            datosEquido.getFechaIdentificacion(), 
                            datosEquido.getNIFTitular(), 
                            datosEquido.getLiteralNombreTitular(), 
                            datosEquido.getLiteralDireccionTitular()==null?"SIN DATOS":datosEquido.getLiteralDireccionTitular(),
                            datosEquido.getFechaInicioTitular(), 
                            datosEquido.getCodigoProvinciaTitular(), 
                            datosEquido.getCodigoMunicipioTitular(), 
                            datosEquido.getCodigoPostal(), 
                            addCerosDelante(datosEquido.getCodigoOrientacion(), 2), 
                            datosEquido.getLiteralNombreNacimiento(), 
                            datosEquido.getLiteralNombreComercial(), 
                            addCerosDelante(datosEquido.getCodigoAptitud(), 2), 
                            datosEquido.getFechaInicioSuspension(), 
                            datosEquido.getDuplicado(), 
                            datosEquido.getFechaMuerte(), 
                            datosEquido.getExplotacionMuerte(), 
                            datosEquido.getCodigoTipoMuerte()!=null?addCerosDelante(datosEquido.getCodigoTipoMuerte(), 2):datosEquido.getCodigoTipoMuerte(),
                            datosEquido.getCaGrabadora(),
                            datosEquido.getExplotacionUbicacion()
                    );
            respuesta = new RespuestaComAutSolicitud();
            respuesta.setFecha(Date.valueOf(LocalDate.now()));
            respuesta.setSolicitudIdSolicitud(result.getIdSolicitud());
            respuesta.setSolicitudCodigoError(result.getCodigoError());
            respuesta.setSolicitudCodigoUELN(result.getCodigoUELN());
            respuesta.setSolicitudDescripcionError(result.getDescripcionError());
        }
        else{
            GESTIONANDO_CCAA = GESTIONANDO_DEFAULT;
        }
        return respuesta;
    }
    
    private static String datosTitularAString(DatosTitular datosTitular) {
        StringBuilder sb = new StringBuilder();
        if(datosTitular!=null){
            sb.append("UELN: ");sb.append(datosTitular.getUELN());
            sb.append(", NIF del titular: ");sb.append(datosTitular.getNIF());
            sb.append(", Fecha inicio titularidad: ");sb.append(datosTitular.getFechaInicioTitularidad());
            return sb.toString();
        }
        sb.append("Respuesta nula");
        return sb.toString();
    }
    
    private static String datosBasicosEquidoAString(DatosBasicos datosBasicosEquido) {
        StringBuilder sb = new StringBuilder();
        if(datosBasicosEquido!=null){
            sb.append("UELN: ");sb.append(datosBasicosEquido.getUELN());
            sb.append(", MICROCHIP: ");sb.append(datosBasicosEquido.getIdentificadorElectronico());
            sb.append(", ORGANISMO EMISOR: ");sb.append(datosBasicosEquido.getCodigoOrganismoEmisor());
            sb.append(", REGA NACIMIENTO: ");sb.append(datosBasicosEquido.getExplotacionNacimiento());
            sb.append(", TITULAR: ");
            return sb.toString();
        }
        sb.append("Respuesta nula");
        return sb.toString();
    } 
    
    private static void testMasivo() throws Exception {
        try {
            for(ComAutSolicitud s:DAO_COM_AUT_SOLICITUD.solicitudesPendientesDeEnviar()){
                if(CONTADOR_SOLICITUD==MAX_CONTADOR_SOLICITUD){
                    System.out.println("Información: Se ha alcanzado el máximo de solicitudes enviadas en una ejecución del programa ComAut");
                    return;
                }
                SOLICITUD_ACTUAL = s;
                testActualizarDatosEquidoSolicitudActual();
                String ueln = SOLICITUD_ACTUAL.getUeln();
                testDameDatosBasicosEquido(ueln);
                testCambioSTitularidadesJuntaAndalucia(new String[]{ueln}, FECHA_DESDE, FECHA_HASTA);
                System.out.println("----------------------------------------------------------------------------------------------------------");
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
