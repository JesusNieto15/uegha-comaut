/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15.wsjcyl.test;

import com.jnr15.keystore.KeyStore;
import com.jnr15.ControladorWsjcyl;
import com.jnr15.wsjcyl.ws.DatosEq;
import com.jnr15.wsjcyl.ws.DatosEquinoTipo;
import com.jnr15.wsjcyl.ws.DatosTituEqTipo;
import com.jnr15.wsjcyl.ws.ObjectFactory;
import configBBDD.Propiedades;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.math.BigInteger;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author inven
 */
public class Test1 {
    
    private static final int TIPO_ACCESO = 1;
    private static final Integer CODIGO_PRUEBA_A_EJECUTAR = 5;
    private static ControladorWsjcyl controlador;
    
    public static void main(String[] args) {
        KeyStore.cargarKeyStore();
        System.setProperty("jdk.tls.maxHandshakeMessageSize", "65536");
        Propiedades.obtenerPropiedades().modificarPropiedadesConexionBBDD(getMaquina(), getPuerto(), "uegha", "jesus", "19811224");
        try {
            controlador = ControladorWsjcyl.obtenerControlador();
            switch (CODIGO_PRUEBA_A_EJECUTAR){
                case 0:
                    importarXMLEquido();
                    break;
                case 1:
                    dameDatosEquinoPorUeln();
                    break;      
                case 2:
                    //generarXMLFirmado();
                    break;
                case 3:
                    importarXMLTitularidad();
                    break;
                case 4:
                    probarJAXBDatosEq(null);
                    break;
                case 5:
                    System.out.println(microchipAHexadecimal("10010000724060001041791"));
                    break;
                default:
                    System.out.println("Código de prueba no contemplado");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void probarJAXBDatosEq(DatosEq datosEq) throws Exception {
        if(datosEq==null){
            DatosEq datos = new DatosEq();
            datos.setOrigen("probando origen");
            JAXBContext contexto = JAXBContext.newInstance(DatosEq.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(datos, System.out);
        }
    }
    
    private static void dameDatosEquinoPorUeln()throws Exception {
        DatosEq datosEq = controlador.dameDatosEquinoPorUeln("724018000006001");
        String peticion = controlador.obtenerPeticion();
        System.out.println("peticion: " + peticion);
        System.out.println("respuesta: "+datosEq.getOrigen());
    }
    
    private static void importarXMLEquido()throws Exception {
            DatosEquinoTipo de = PrepararDatosEquino();
            String respuestaServidor=controlador.importarXMLEquidoXades4J(de);
            String peticion = controlador.obtenerPeticion();
            System.out.println("peticion: " + peticion);
            System.out.println("respuesta: "+respuestaServidor);
            if(respuestaServidor.trim().length()==0)
                System.out.println("Sin errores");
    }
    
    private static void importarXMLTitularidad() throws Exception {
        DatosTituEqTipo de = PrepararDatosEquinoActualizarTitularidad();
        String respuestaServidor = controlador.importarXMLTitularidadXades4J(de);
        String peticion = controlador.obtenerPeticion();
        System.out.println("peticion: " + peticion);
        System.out.println("respuesta: "+respuestaServidor);
        if(respuestaServidor.trim().length()==0)
            System.out.println("Sin errores");
    }
    
    /*private static void generarXMLFirmado() throws Exception{
        DatosEquinoTipo de = PrepararDatosEquino();
        File ficheroAFirmar = controlador.generarFicheroXMLAFirmar(de);
        controlador.generarFicheroXMLFirmado(ficheroAFirmar);
    }*/
    
    private static DatosEquinoTipo PrepararDatosEquino() throws Exception {
        ObjectFactory of = new ObjectFactory();
        DatosEquinoTipo de = of.createDatosEquinoTipo();
        de.setDatosAnimal(of.createDatosAnimalTipo());
        de.getDatosAnimal().setCEspecieId("48");
        de.getDatosAnimal().setCIdenAnim("724018000006001");
        de.getDatosAnimal().setCRazaId("5106");
        de.getDatosAnimal().setCSexoId("02");
        de.getDatosAnimal().setFNacimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar("2021-03-22"));
        de.getDatosAnimal().setCExplNaci("ES402070000018");
        //de.getDatosAnimal().setCPaisNaci("724");
        de.getDatosAnimal().setCExplIden("ES402070000018");
        de.getDatosAnimal().setCIdenElec(microchipAHexadecimal("10010000724080880089551"));
        de.getDatosAnimal().setCTipoIdenId("03");
        de.getDatosAnimal().setCCapaId("22");
        de.getDatosAnimal().setCOrieAnimId("01");
        de.getDatosAnimal().setDNombreCom("NUEVO NOMBRE");
        de.getDatosAnimal().setDNombreNac("NUEVO NOMBRE");
        de.getDatosAnimal().setCAptiConsId("02");
        de.getDatosAnimal().setCTipoLectId("01");
        de.getDatosAnimal().setCFiabilidad("16");
        de.getDatosAnimal().setBCastrado("N");
        de.getDatosAnimal().setFIniTitu(DatatypeFactory.newInstance().newXMLGregorianCalendar("2021-03-22"));
        de.getDatosAnimal().getCCifnif().add("007811979Y");
        de.getDatosAnimal().setDNombre("PROBANDO_2");
        de.getDatosAnimal().setDApellidos("PROBANDO_2 PROBANDO_2");
        de.getDatosAnimal().setDCalle("EL ROBLEDAL 21");
        de.getDatosAnimal().setCProvincia(40);
        de.getDatosAnimal().setCMunicipio(906);
        de.getDatosAnimal().setCPostal("40197");
        de.getDatosAnimal().setCAsociacionId("024");
        de.getDatosAnimal().setFIdentific(DatatypeFactory.newInstance().newXMLGregorianCalendar("2021-06-10"));
        return de;
    }
    
    private static DatosTituEqTipo PrepararDatosEquinoActualizarTitularidad() throws Exception {
        ObjectFactory of = new ObjectFactory();
        DatosTituEqTipo de = of.createDatosTituEqTipo();
        de.setDatosTituAnimal(of.createDatosTituAnimalTipo());
        de.getDatosTituAnimal().setCEspecieId("48");
        de.getDatosTituAnimal().setCIdenAnim("724018000006000");
        de.getDatosTituAnimal().setFIniTitu(DatatypeFactory.newInstance().newXMLGregorianCalendar("2023-03-22"));
        de.getDatosTituAnimal().getCCifnif().add("028627988A");
        de.getDatosTituAnimal().setDNombre("PROBANDO_JNR");
        de.getDatosTituAnimal().setDApellidos("PROBANDO_JNR PROBANDO_JNR");
        de.getDatosTituAnimal().setDCalle("PROBANDO DOMICILIO");
        de.getDatosTituAnimal().setCProvincia(40);
        de.getDatosTituAnimal().setCMunicipio(906);
        de.getDatosTituAnimal().setCPostal("40197");
        return de;
    }
    
    private static String microchipAHexadecimal(String decimal){
        StringBuilder sb = new StringBuilder();
        String bloque1 = decimal.substring(0, 1);
        String bloque2 = decimal.substring(1, 2);
        String bloque3 = decimal.substring(2, 4);
        String bloque4 = decimal.substring(4,6);
        String bloque5 = decimal.substring(6, 7);
        String bloque6 = decimal.substring(7,11);
        String bloque7 = decimal.substring(11);
        Integer b1 = Integer.valueOf(bloque1, 2);
        sb.append(establecerLongitudString(b1.toString(), 1));
        Integer b2 = Integer.valueOf(bloque2, 2);
        sb.append(establecerLongitudString(b2.toString(), 3));
        Integer b3 = Integer.valueOf(bloque3,2);
        sb.append(establecerLongitudString(b3.toString(), 5));
        Integer b4 = Integer.valueOf(bloque4,2);
        sb.append(establecerLongitudString(b4.toString(), 6));
        Integer b5 = Integer.valueOf(bloque5,2);
        sb.append(establecerLongitudString(b5.toString(), 1));
        Integer b6 = Integer.valueOf(bloque6);
        Integer cocienteB6 = b6/512;
        Integer restoB6 = b6%512;
        sb.append(establecerLongitudString(Integer.toString(cocienteB6, 2),1));
        sb.append(establecerLongitudString(Integer.toString(restoB6, 2), 9));
        BigInteger b7 = new BigInteger(bloque7);
        BigInteger resto1B7 = b7.divide(BigInteger.valueOf(512L*512*512*512)).mod(BigInteger.valueOf(512));
        BigInteger resto2B7 = b7.divide(BigInteger.valueOf(512*512*512)).mod(BigInteger.valueOf(512));
        BigInteger resto3B7 = b7.divide(BigInteger.valueOf(512*512)).mod(BigInteger.valueOf(512));
        BigInteger resto4B7 = b7.divide(BigInteger.valueOf(512)).mod(BigInteger.valueOf(512));
        BigInteger parteB7 = b7.subtract((b7.divide(BigInteger.valueOf(512))).multiply(BigInteger.valueOf(512)));
        sb.append(establecerLongitudString(resto1B7.toString(2), 2));
        sb.append(establecerLongitudString(resto2B7.toString(2), 9));
        sb.append(establecerLongitudString(resto3B7.toString(2), 9));
        sb.append(establecerLongitudString(resto4B7.toString(2), 9));
        sb.append(establecerLongitudString(parteB7.toString(2), 9));  
        BigInteger microchipBinario = new BigInteger(sb.toString(),2);
        return microchipBinario.toString(16).toUpperCase();
    }
    
    private static String establecerLongitudString(String origen, int longStringResultante){
        String resul = origen;
        int longStringOrigen = origen.length();
        if(longStringOrigen<longStringResultante){
            while(longStringOrigen<longStringResultante){
                resul = "0" + resul;
                longStringOrigen = resul.length();
            }
        }
        return resul;
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
    
}
