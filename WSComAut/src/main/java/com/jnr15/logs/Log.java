/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15.logs;

import com.jnr15.ConstantesComunes;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

/**
 *
 * @author Jesús Nieto Rodríguez jesusnieto@invengenio.com
 */
public class Log {

    private static PrintWriter obtenerPrintWriter() throws Exception {
        File fichero = new File(ConstantesComunes.DIRECTORIO_LOGS.getString() + Calendar.getInstance().getTime() + ".txt");
        if (fichero.createNewFile()) {
            return new PrintWriter(fichero);
        }
        return null;
    }

    public static void registrarExcepcion(Exception e) throws Exception {
        PrintWriter pw = obtenerPrintWriter();
        e.printStackTrace(pw);
        pw.close();
    }

    public static void registrarUelnsSinComunidadAutonoma(String uelns) {
        File fichero = new File(ConstantesComunes.DIRECTORIO_LOGS.getString() + "uelns_sin_ccaa_" + Calendar.getInstance().getTime() + ".txt");
        try {
            if (fichero.createNewFile()) {
                PrintWriter pw = new PrintWriter(fichero);
                pw.write(uelns);
                pw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void obtenerRegistroDeExcepcionesEnActualizacionMasiva(String mensaje) {
        File fichero = new File(ConstantesComunes.DIRECTORIO_LOGS.getString() + "excepciones_" + Calendar.getInstance().getTime() + ".txt");
        try {
            if (fichero.createNewFile()) {
                PrintWriter pw = new PrintWriter(fichero);
                pw.write(mensaje);
                pw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void obtenerRegistroFinProcesoCargaMasiva(String mensaje){
        File fichero = new File(ConstantesComunes.DIRECTORIO_LOGS.getString() + "panel_informativo_fin_proceso_carga_masiva_" + Calendar.getInstance().getTime()+".txt");
        try {
            if(fichero.createNewFile()){
                PrintWriter pw = new PrintWriter(fichero);
                pw.write(mensaje);
                pw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
