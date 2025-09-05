/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.wsjuntaex.ws;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringWriter;

/**
 *
 * @author jesus
 */
public class FirmadorWSJuntaExt {
    
    private static final String FICHERO_TEMPORAL = "temp/peticion.xml";
    private static final String FICHERO_TEMPORAL_FIRMADO = "temp/peticion.signed";
    //private static String FILTRO_CERTIFICADO = "subject.contains:28627988A";
    private static final String PASS_CERT = "22Je24Ch14Je";
    private static final String RUTA_CERTIFICADO ="almacen_keystore/c_jnr.pfx";
    private static final String FILTRO_CERT = "{c84e8d72-7116-46aa-befd-1cd12739499f}";
    
    public String peticionFirmada(String peticion) throws Exception {
        if(peticion==null || peticion.length()==0)
            throw new Exception("La petición no puede ser nula o estar vacía");
        File ficheroTemporal = new File(FICHERO_TEMPORAL);
        File ficheroTemporalFirmado = new File(FICHERO_TEMPORAL_FIRMADO);
        FileWriter fw = new FileWriter(ficheroTemporal);
        fw.write(peticion);
        fw.close();       
        String comandoDelSistema = "autofirma sign"
                + " -i " + ficheroTemporal.getAbsolutePath()
                + " -o " + ficheroTemporalFirmado.getAbsolutePath()
                + " -format xades"
                + " -store pkcs12:"+RUTA_CERTIFICADO
                + " -password "+PASS_CERT
                + " -filter " + FILTRO_CERT;
        Process procesoComando = Runtime.getRuntime().exec(comandoDelSistema);
        procesoComando.waitFor();
        if(!ficheroTemporalFirmado.exists())
            throw new Exception("No se ha podido crear el fichero temporal firmado");
        BufferedReader br = new BufferedReader(new FileReader(ficheroTemporalFirmado));
        StringWriter sw = new StringWriter();
        String lectura = br.readLine();
        while(lectura!=null){
            sw.write(lectura);
            lectura = br.readLine();
        }
        br.close();
        ficheroTemporal.delete();
        ficheroTemporalFirmado.delete();
        return sw.toString();
    }
    
}
