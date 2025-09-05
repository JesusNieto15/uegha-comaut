/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.asturias.test;

import com.jnr15.asturias.ws.ActualizarDatosEquidos;
import configBBDD.Propiedades;
import dao.IDAODatosEquidosComAut;
import dao.JDBCDAODatosEquidosComAut;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.io.FileWriter;
import java.io.StringWriter;
import modelo.DatosEquidosComAut;

/**
 *
 * @author jesus
 */
public class TestJAXBAnimal {
    
    private static final Boolean USO_EXTERNO = Boolean.FALSE;
    
    public static void main(String[] args) {
        iniciarConexionBBDD();
        test1();
    }
    
    private static void iniciarConexionBBDD(){
        String maquina="192.168.1.35";
        String puerto="3306";
        if(USO_EXTERNO){
            maquina="ansoldes.com";
            puerto="2224";
        }
        Propiedades.obtenerPropiedades().modificarPropiedadesConexionBBDD(maquina, puerto, "uegha", "jesus", "19811224");
    }
    
    private static void test1(){
        ActualizarDatosEquidos actualizar = new ActualizarDatosEquidos();
        try {
            IDAODatosEquidosComAut daoDatosEquidosJA = JDBCDAODatosEquidosComAut.obtenerDao();
            DatosEquidosComAut datosEquido = daoDatosEquidosJA.datosEquidosComAutPorUELN("724018000006391");
            actualizar.addAnimal(datosEquido);
            JAXBContext contexto = JAXBContext.newInstance(ActualizarDatosEquidos.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT,Boolean.TRUE);//Para eliminar la declaración <?xml version="1.0" ....> inicial
            StringWriter sw = new StringWriter();
            sw.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
            marshaller.marshal(actualizar, sw);
            System.out.println(sw.toString());
            FileWriter fw = new FileWriter("./temp/prueba.xml");
            fw.write(sw.toString());
            fw.flush();
            fw.close();        
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static String addCerosDelante(String campo,int longitudCampo){
        String res = campo;
        while(res.length()<longitudCampo)
            res="0"+res;
        return res;
    }
    
}
