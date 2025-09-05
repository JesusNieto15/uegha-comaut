/**
 * PIDA_WSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsmapa.ws;

public class PIDA_WSLocator extends org.apache.axis.client.Service implements com.jnr15.wsmapa.ws.PIDA_WS {

/**
 * Servicio Web que devuelve datos relativos a Équidos.
 */

    public PIDA_WSLocator() {
    }


    public PIDA_WSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PIDA_WSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PIDA_WSSoap
    private java.lang.String PIDA_WSSoap_address = "https://servicio.mapa.gob.es/ws_equidos/PIDA_WS.asmx";

    public java.lang.String getPIDA_WSSoapAddress() {
        return PIDA_WSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PIDA_WSSoapWSDDServiceName = "PIDA_WSSoap";

    public java.lang.String getPIDA_WSSoapWSDDServiceName() {
        return PIDA_WSSoapWSDDServiceName;
    }

    public void setPIDA_WSSoapWSDDServiceName(java.lang.String name) {
        PIDA_WSSoapWSDDServiceName = name;
    }

    public com.jnr15.wsmapa.ws.PIDA_WSSoap getPIDA_WSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PIDA_WSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPIDA_WSSoap(endpoint);
    }

    public com.jnr15.wsmapa.ws.PIDA_WSSoap getPIDA_WSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.jnr15.wsmapa.ws.PIDA_WSSoapStub _stub = new com.jnr15.wsmapa.ws.PIDA_WSSoapStub(portAddress, this);
            _stub.setPortName(getPIDA_WSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPIDA_WSSoapEndpointAddress(java.lang.String address) {
        PIDA_WSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.jnr15.wsmapa.ws.PIDA_WSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.jnr15.wsmapa.ws.PIDA_WSSoapStub _stub = new com.jnr15.wsmapa.ws.PIDA_WSSoapStub(new java.net.URL(PIDA_WSSoap_address), this);
                _stub.setPortName(getPIDA_WSSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PIDA_WSSoap".equals(inputPortName)) {
            return getPIDA_WSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "PIDA_WS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "PIDA_WSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PIDA_WSSoap".equals(portName)) {
            setPIDA_WSSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
