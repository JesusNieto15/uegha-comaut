/**
 * PIDA_WS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsmapa.ws;

public interface PIDA_WS extends javax.xml.rpc.Service {

/**
 * Servicio Web que devuelve datos relativos a Équidos.
 */
    public java.lang.String getPIDA_WSSoapAddress();

    public com.jnr15.wsmapa.ws.PIDA_WSSoap getPIDA_WSSoap() throws javax.xml.rpc.ServiceException;

    public com.jnr15.wsmapa.ws.PIDA_WSSoap getPIDA_WSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
