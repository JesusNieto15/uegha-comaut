/**
 * IEquinos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsjuntaex.ws;

public interface IEquinos extends java.rmi.Remote {
    public com.jnr15.wsjuntaex.ws.RespuestaEntradaEquidos altaEquidos(com.jnr15.wsjuntaex.ws.EntradaEquidos entrada) throws java.rmi.RemoteException;
    public com.jnr15.wsjuntaex.ws.RespuestaResultadoSolicitudes obtenerResultadoPorSolicitud(java.lang.String datosSolicitud, java.lang.String entidad) throws java.rmi.RemoteException;
    public com.jnr15.wsjuntaex.ws.RespuestaResultadoSolicitudes obtenerResultadoPorSolicitudEntreFechas(java.lang.String entidad, java.lang.String datos) throws java.rmi.RemoteException;
    public com.jnr15.wsjuntaex.ws.RespuestaEntradaEquidos modificarEquido(com.jnr15.wsjuntaex.ws.EntradaEquidos entrada) throws java.rmi.RemoteException;
    public com.jnr15.wsjuntaex.ws.RespuestaEntradaEquidos cambioTitularidadEquido(com.jnr15.wsjuntaex.ws.EntradaEquidos entrada) throws java.rmi.RemoteException;
    public java.lang.String descargarFichero(java.lang.String idSolicitud) throws java.rmi.RemoteException;
}
