/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15.dao.test;

import configBBDD.Propiedades;
import dao.IDAOComAutSolicitud;
import dao.IDAODatosEquidosComAut;
import dao.JDBCDAOComAutSolicitud;
import dao.JDBCDAODatosEquidosComAut;
import modelo.DatosEquidosComAut;
import modelo.ComAutSolicitud;

/**
 *
 * @author inven
 */
public class Test1 {
    
    private static Boolean USO_EXTERNO = Boolean.FALSE;
    
    public static void main(String[] args) {
        String maquina="192.168.1.35";
        String puerto="3306";
        if(USO_EXTERNO){
            maquina="ansoldes.com";
            puerto="2224";
        }
        Propiedades.obtenerPropiedades().modificarPropiedadesConexionBBDD(maquina, puerto, "uegha", "jesus", "19811224");
        try {
            test1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void test1() throws Exception {
            IDAOComAutSolicitud daoComAut = JDBCDAOComAutSolicitud.obtenerDao();
            IDAODatosEquidosComAut daoDatosEquidosJA = JDBCDAODatosEquidosComAut.obtenerDao();
            for(ComAutSolicitud s:daoComAut.solicitudesPendientesDeEnviar()){
                System.out.println("Solicitud: " + s.getId()+
                        ", UELN: " + s.getUeln() +
                        ", Motivo: " + s.getTipo());
                DatosEquidosComAut datosEquido = daoDatosEquidosJA.datosEquidosComAutPorUELN(s.getUeln());
                if(datosEquido==null)
                    continue;
                else
                    System.out.println("direccion Titular: " + datosEquido.getLiteralDireccionTitular());
            }
    }
   
}
