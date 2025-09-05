/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15.main;

import com.jnr15.ControladorBase;
import com.jnr15.keystore.KeyStore;
import com.jnr15.logs.Log;
import configBBDD.Propiedades;

/**
 *
 * @author Jesús Nieto Rodríguez jesusnieto@invengenio.com
 */
public class MainComAut {
    
    //tipo de acceso a la base de datos (0 interno, 1 externo)
    private static final int TIPO_ACCESO = 1;
    
    public static void main(String[] args) {
        KeyStore.cargarKeyStore();
        Propiedades.obtenerPropiedades().modificarPropiedadesConexionBBDD(getMaquina(), getPuerto(), "uegha", "jesus", "19811224");
        try {
            ejecutar();
        } catch (Exception e) {
            try {
                Log.registrarExcepcion(e);
            } catch (Exception e2) {
                System.out.println("Exception: " + e2.getMessage());
            }
        }
    }
    
    private static void ejecutar() throws Exception {
        ControladorBase.obtenerControlador().ejecutarSolicitudesMasivamente();
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
