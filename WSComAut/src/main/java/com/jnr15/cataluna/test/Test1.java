/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.cataluna.test;

import com.jnr15.ControladorBase;
import com.jnr15.ControladorWSCataluna;
import configBBDD.Propiedades;
import modelo.DatosEquidosComAut;
import org.json.JSONObject;

/**
 *
 * @author jesus
 */
public class Test1 {
    
    private static final Boolean USO_EXTERNO = Boolean.FALSE;

    public static void main(String[] args) {
        iniciarConexionBBDD();
        try {
            DatosEquidosComAut datos = ControladorBase.obtenerControlador().datosEquidosPorUeln("724018000007000");
            JSONObject objetoJson = ControladorWSCataluna.obtenerControlador().obtenerPeticionJSONAltaEquido(datos);
            System.out.println(objetoJson.toString(4));
            String respuesta = ControladorWSCataluna.obtenerControlador().altaEquidoDesdeUeln("724018000007000");
            System.out.println(respuesta);
        } catch (Exception e) {
            e.printStackTrace();
        }

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
    
}
