/**
 * SigganRiiaEquinoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsja.ws;

import org.apache.axis.AxisFault;

public class SigganRiiaEquinoLocator extends org.apache.axis.client.Service implements SigganRiiaEquino {

    public SigganRiiaEquinoLocator() {
    }


    public SigganRiiaEquinoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SigganRiiaEquinoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for sigganRiiaEquinoSoap
    //address de prueba
    //private java.lang.String sigganRiiaEquinoSoap_address = "http://pre.agapa.junta-andalucia.es/agriculturaypesca/siggan/services/sigganRiiaEquino";
    
    //address de producción
    private java.lang.String sigganRiiaEquinoSoap_address = "https://ws142.juntadeandalucia.es/agriculturaypesca/siggan/services/sigganRiiaEquino";

    public java.lang.String getsigganRiiaEquinoSoapAddress() {
        return sigganRiiaEquinoSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String sigganRiiaEquinoSoapWSDDServiceName = "sigganRiiaEquinoSoap";

    public java.lang.String getsigganRiiaEquinoSoapWSDDServiceName() {
        return sigganRiiaEquinoSoapWSDDServiceName;
    }

    public void setsigganRiiaEquinoSoapWSDDServiceName(java.lang.String name) {
        sigganRiiaEquinoSoapWSDDServiceName = name;
    }

    public SigganRiiaEquinoSoap getsigganRiiaEquinoSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(sigganRiiaEquinoSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsigganRiiaEquinoSoap(endpoint);
    }

    public SigganRiiaEquinoSoap getsigganRiiaEquinoSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SigganRiiaEquinoSoapStub _stub = new SigganRiiaEquinoSoapStub(portAddress, this);
            _stub.setPortName(getsigganRiiaEquinoSoapWSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setsigganRiiaEquinoSoapEndpointAddress(java.lang.String address) {
        sigganRiiaEquinoSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (SigganRiiaEquinoSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                SigganRiiaEquinoSoapStub _stub = new SigganRiiaEquinoSoapStub(new java.net.URL(sigganRiiaEquinoSoap_address), this);
                _stub.setPortName(getsigganRiiaEquinoSoapWSDDServiceName());
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
        if ("sigganRiiaEquinoSoap".equals(inputPortName)) {
            return getsigganRiiaEquinoSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "sigganRiiaEquino");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "sigganRiiaEquinoSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("sigganRiiaEquinoSoap".equals(portName)) {
            setsigganRiiaEquinoSoapEndpointAddress(address);
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
