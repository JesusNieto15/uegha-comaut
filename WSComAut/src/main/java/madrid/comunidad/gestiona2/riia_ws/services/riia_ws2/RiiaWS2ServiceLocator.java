/**
 * RiiaWS2ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package madrid.comunidad.gestiona2.riia_ws.services.riia_ws2;

public class RiiaWS2ServiceLocator extends org.apache.axis.client.Service implements madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.RiiaWS2Service {

    public RiiaWS2ServiceLocator() {
    }


    public RiiaWS2ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RiiaWS2ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for riia_ws2
    private java.lang.String riia_ws2_address = "https://gestiona2.comunidad.madrid/riia_ws/services/riia_ws2";

    public java.lang.String getriia_ws2Address() {
        return riia_ws2_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String riia_ws2WSDDServiceName = "riia_ws2";

    public java.lang.String getriia_ws2WSDDServiceName() {
        return riia_ws2WSDDServiceName;
    }

    public void setriia_ws2WSDDServiceName(java.lang.String name) {
        riia_ws2WSDDServiceName = name;
    }

    public madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.RiiaWS2 getriia_ws2() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(riia_ws2_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getriia_ws2(endpoint);
    }

    public madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.RiiaWS2 getriia_ws2(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.Riia_ws2SoapBindingStub _stub = new madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.Riia_ws2SoapBindingStub(portAddress, this);
            _stub.setPortName(getriia_ws2WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setriia_ws2EndpointAddress(java.lang.String address) {
        riia_ws2_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.RiiaWS2.class.isAssignableFrom(serviceEndpointInterface)) {
                madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.Riia_ws2SoapBindingStub _stub = new madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.Riia_ws2SoapBindingStub(new java.net.URL(riia_ws2_address), this);
                _stub.setPortName(getriia_ws2WSDDServiceName());
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
        if ("riia_ws2".equals(inputPortName)) {
            return getriia_ws2();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://gestiona2.comunidad.madrid/riia_ws/services/riia_ws2", "RiiaWS2Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://gestiona2.comunidad.madrid/riia_ws/services/riia_ws2", "riia_ws2"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("riia_ws2".equals(portName)) {
            setriia_ws2EndpointAddress(address);
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
