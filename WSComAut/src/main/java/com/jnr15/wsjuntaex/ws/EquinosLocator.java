/**
 * EquinosLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsjuntaex.ws;

public class EquinosLocator extends org.apache.axis.client.Service implements com.jnr15.wsjuntaex.ws.Equinos {

    public EquinosLocator() {
    }


    public EquinosLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EquinosLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IEquinos
    //URL desarrollo
    //private java.lang.String BasicHttpBinding_IEquinos_address = "https://pruwsequidos.juntaex.es/Equinos.svc";
    //URL producción
    private java.lang.String BasicHttpBinding_IEquinos_address = "https://wsequidos.juntaex.es/Equinos.svc";

    public java.lang.String getBasicHttpBinding_IEquinosAddress() {
        return BasicHttpBinding_IEquinos_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IEquinosWSDDServiceName = "BasicHttpBinding_IEquinos";

    public java.lang.String getBasicHttpBinding_IEquinosWSDDServiceName() {
        return BasicHttpBinding_IEquinosWSDDServiceName;
    }

    public void setBasicHttpBinding_IEquinosWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IEquinosWSDDServiceName = name;
    }

    public com.jnr15.wsjuntaex.ws.IEquinos getBasicHttpBinding_IEquinos() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IEquinos_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IEquinos(endpoint);
    }

    public com.jnr15.wsjuntaex.ws.IEquinos getBasicHttpBinding_IEquinos(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.jnr15.wsjuntaex.ws.BasicHttpBinding_IEquinosStub _stub = new com.jnr15.wsjuntaex.ws.BasicHttpBinding_IEquinosStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IEquinosWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IEquinosEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IEquinos_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.jnr15.wsjuntaex.ws.IEquinos.class.isAssignableFrom(serviceEndpointInterface)) {
                com.jnr15.wsjuntaex.ws.BasicHttpBinding_IEquinosStub _stub = new com.jnr15.wsjuntaex.ws.BasicHttpBinding_IEquinosStub(new java.net.URL(BasicHttpBinding_IEquinos_address), this);
                _stub.setPortName(getBasicHttpBinding_IEquinosWSDDServiceName());
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
        if ("BasicHttpBinding_IEquinos".equals(inputPortName)) {
            return getBasicHttpBinding_IEquinos();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "Equinos");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IEquinos"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IEquinos".equals(portName)) {
            setBasicHttpBinding_IEquinosEndpointAddress(address);
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
