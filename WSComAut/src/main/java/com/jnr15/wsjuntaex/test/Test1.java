/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.wsjuntaex.test;

import com.jnr15.ControladorWSJuntaExt;
import com.jnr15.keystore.KeyStore;
import com.jnr15.wsjuntaex.ws.EntradaEquidos;
import com.jnr15.wsjuntaex.ws.Equido;
import com.jnr15.wsjuntaex.ws.FirmadorWSJuntaExt;
import com.jnr15.wsjuntaex.ws.RespuestaEntradaEquidos;
import configBBDD.Propiedades;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.Base64;

/**
 *
 * @author jesus
 */
public class Test1 {
    
    private static final int TIPO_ACCESO = 0;
    private static ControladorWSJuntaExt controlador;
    private static final boolean FORMATO_XML = Boolean.TRUE;
    private static final Integer METODO_EJECUTAR = 1;
    
    public static void main(String[] args) {
        KeyStore.cargarKeyStore();
        Propiedades.obtenerPropiedades().modificarPropiedadesConexionBBDD(getMaquina(), getPuerto(), "uegha", "jesus", "19811224");
        try {
            controlador=ControladorWSJuntaExt.obtenerControlador(); 
            switch(METODO_EJECUTAR){
                case 0:
                    //altaEquidos();
                    break;
                case 1:
                    modificacionEquidos();
                    break;
                default:
                    System.out.println("CASO NO CONTEMPLADO");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static String getMaquina(){
        if(TIPO_ACCESO==0)
            return "192.168.1.35";
        return "invengenio.com";
    }
    
    private static String getPuerto(){
        if(TIPO_ACCESO==0)
            return "3306";
        return "2224";
    }
    
    /*private static void altaEquidos() throws Exception {
        String uelnBase = "7240180000072";
        String microchipBase = "100100007240101800042";
        String nombreBase = "NOMBRE";
        String ueln, microchip, nombre;
        Integer cont = 0;
        while (cont++ < 99) {
            ueln = uelnBase;
            microchip = microchipBase;
            nombre = nombreBase;
            String adicional = cont.toString();
            if (adicional.length() < 2) {
                adicional = "0" + adicional;
            }
            ueln = ueln + adicional;
            microchip = microchip + adicional;
            nombre = nombre + adicional;
            System.out.println(ueln + ", " + microchip + ", " + nombre);
            RespuestaEntradaEquidos respuesta = controlador.obtenerStub().altaEquidos(prepararEquidoAlta(ueln, microchip, nombre));
            System.out.println("Id respuesta: " + respuesta.getIdSolicitud());
            System.out.println("Ueln respuesta: " + respuesta.getCodigoUELN());
            if (respuesta.getListaError() != null && respuesta.getListaError().length > 0) {
                System.out.println("Primer error respuesta: " + respuesta.getListaError()[0].getDescError());
            }
        }
    }*/
    
    private static void modificacionEquidos() throws Exception{
        String ueln = "724018000006591";
        System.out.println("Ueln generado: " + ueln);
        RespuestaEntradaEquidos respuesta = controlador.obtenerStub().modificarEquido(prepararEquidosModificacion(ueln));
            System.out.println("Id respuesta: " + respuesta.getIdSolicitud());
            System.out.println("Ueln respuesta: " + respuesta.getCodigoUELN());
            if (respuesta.getListaError() != null && respuesta.getListaError().length > 0) {
                System.out.println("Primer error respuesta: " + respuesta.getListaError()[0].getDescError());
            }
    }
    
    /*public static EntradaEquidos prepararEquidoAlta(String ueln) throws Exception{
        Equido equido = new Equido();
        equido.setUeln(ueln);
        equido.setEspecie("48");
        equido.setExpIdentificacion("ES101950001058");
        
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
    } */
    
    public static EntradaEquidos prepararEquidosModificacion(String ueln) throws Exception {
        Equido equido = new Equido();
        equido.setUeln(ueln);
        equido.setAptoConsumo("");
        equido.setCapa("");
        equido.setCastrado("");
        equido.setDniTitular("");
        equido.setEspecie("48");
        equido.setExpIdentificacion("");
        equido.setExpMuerte("");
        equido.setExpNacimiento("ES101950001058");
        equido.setFecIdentificacion("");
        equido.setFecInicioSuspension("");
        equido.setFecInicioTitularidad("");
        equido.setFecMuerte("");
        equido.setFecNacimiento("");
        equido.setFiabilidad("");
        equido.setIdAlternativo("");
        equido.setIdElectronico("");
        equido.setLugarNacimiento("");
        equido.setNombreComercial("");
        equido.setNombreNacimiento("");
        equido.setOrientacion("");
        equido.setRaza("");
        equido.setSexo("");
        equido.setTipoIdElectronico("");
        equido.setTipoLectura("");
        equido.setTipoMuerte("");
        equido.setNombreTitular("");
        equido.setDireccionTitular("");
        equido.setCpTitular("");
        equido.setProvinciaTitular("");
        equido.setMunicipioTitular("");
        equido.setPaisTitular("");
        equido.setTelefonoTitular("");
        equido.setDuplicado("");
        
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
}
