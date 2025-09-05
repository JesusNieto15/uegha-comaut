/**
 * PIDA_WSSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsmapa.ws;

public class PIDA_WSSoapStub extends org.apache.axis.client.Stub implements com.jnr15.wsmapa.ws.PIDA_WSSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActualizarDatosEquidos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoUELN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoEspecie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoRaza"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoFiabilidad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoSexo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "castrado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoCapa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoLugarNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "explotacionNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "fechaNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoTipoIdentificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoSistemaLectura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "idElectronica"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "idAlternativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "fechaIdentificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "NIFTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "nombreTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "direccionTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "inicioTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoProvinciaTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoMunicipioTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoPostal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoOrientacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "nombreNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "nombreComercial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoAptitud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "inicioSuspension"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "duplicado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "fechaMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "explotacionMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoTipoMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "comunidadAutonomaGrabadora"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoGrabacionSolicitud"));
        oper.setReturnClass(com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ActualizarDatosEquidosResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActualizarDatosEquidos_");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoUELN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoEspecie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoRaza"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoFiabilidad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoSexo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "castrado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoCapa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoLugarNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "explotacionNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "fechaNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoTipoIdentificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoSistemaLectura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "idElectronica"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "idAlternativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "fechaIdentificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "NIFTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "nombreTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "direccionTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "inicioTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoProvinciaTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoMunicipioTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoPostal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoOrientacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "nombreNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "nombreComercial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoAptitud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "inicioSuspension"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "duplicado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "fechaMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "explotacionMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "codigoTipoMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "comunidadAutonomaGrabadora"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "explotacionUbicacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoGrabacionSolicitud"));
        oper.setReturnClass(com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ActualizarDatosEquidos_Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObtenerResultadoProcesamiento");
        oper.setReturnType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfResultadoProcesamientoSolicitud"));
        oper.setReturnClass(com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ObtenerResultadoProcesamientoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoProcesamientoSolicitud"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BorrarEquido");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "uelns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfResultadoBorrado"));
        oper.setReturnClass(com.jnr15.wsmapa.ws.ResultadoBorrado[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "BorrarEquidoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoBorrado"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObtenerResultadoProcesamientoPorSolicitud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "idSolicitud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoProcesamientoSolicitud"));
        oper.setReturnClass(com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ObtenerResultadoProcesamientoPorSolicitudResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObtenerResultadoProcesamientoEntreFechas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "fechaInicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "fechaFin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfResultadoProcesamientoSolicitud"));
        oper.setReturnClass(com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ObtenerResultadoProcesamientoEntreFechasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoProcesamientoSolicitud"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DameDatosBasicosEquido");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ueln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicos"));
        oper.setReturnClass(com.jnr15.wsmapa.ws.DatosBasicos.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DameDatosBasicosEquidoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DameDatosBasicosEquidos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ueln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfDatosBasicos"));
        oper.setReturnClass(com.jnr15.wsmapa.ws.DatosBasicos[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DameDatosBasicosEquidosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicos"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObtenerTitularidadesModificadasPorCCAA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "uelns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "fechaDesde"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "fechaHasta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfDatosTitular"));
        oper.setReturnClass(com.jnr15.wsmapa.ws.DatosTitular[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ObtenerTitularidadesModificadasPorCCAAResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosTitular"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DameUbicacionEquido");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ueln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "UbicacionEquido"));
        oper.setReturnClass(com.jnr15.wsmapa.ws.UbicacionEquido.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DameUbicacionEquidoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DameUbicacionEquidos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ueln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfUbicacionEquido"));
        oper.setReturnClass(com.jnr15.wsmapa.ws.UbicacionEquido[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DameUbicacionEquidosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "UbicacionEquido"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public PIDA_WSSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PIDA_WSSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PIDA_WSSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfDatosBasicos");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.DatosBasicos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicos");
            qName2 = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfDatosBasicosCondicionEspecial");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.DatosBasicosCondicionEspecial[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosCondicionEspecial");
            qName2 = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosCondicionEspecial");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfDatosBasicosTitular");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.DatosBasicosTitular[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosTitular");
            qName2 = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosTitular");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfDatosTitular");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.DatosTitular[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosTitular");
            qName2 = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosTitular");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfIncidencia");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.Incidencia[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Incidencia");
            qName2 = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Incidencia");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfResultadoBorrado");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.ResultadoBorrado[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoBorrado");
            qName2 = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoBorrado");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfResultadoProcesamientoSolicitud");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoProcesamientoSolicitud");
            qName2 = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoProcesamientoSolicitud");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ArrayOfUbicacionEquido");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.UbicacionEquido[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "UbicacionEquido");
            qName2 = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "UbicacionEquido");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicos");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.DatosBasicos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosCompleto");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.DatosBasicosCompleto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosCondicionEspecial");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.DatosBasicosCondicionEspecial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosTitular");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.DatosBasicosTitular.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosTitular");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.DatosTitular.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosTitularNotificadoPorMensaje");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.DatosTitularNotificadoPorMensaje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Incidencia");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.Incidencia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoBorrado");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.ResultadoBorrado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoGrabacionSolicitud");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoProcesamientoSolicitud");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "UbicacionEquido");
            cachedSerQNames.add(qName);
            cls = com.jnr15.wsmapa.ws.UbicacionEquido.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud actualizarDatosEquidos(java.lang.String codigoUELN, java.lang.String codigoEspecie, java.lang.String codigoRaza, java.lang.String codigoFiabilidad, java.lang.String codigoSexo, java.lang.String castrado, java.lang.String codigoCapa, java.lang.String codigoLugarNacimiento, java.lang.String explotacionNacimiento, java.lang.String fechaNacimiento, java.lang.String codigoTipoIdentificacion, java.lang.String codigoSistemaLectura, java.lang.String idElectronica, java.lang.String idAlternativo, java.lang.String fechaIdentificacion, java.lang.String NIFTitular, java.lang.String nombreTitular, java.lang.String direccionTitular, java.lang.String inicioTitular, java.lang.String codigoProvinciaTitular, java.lang.String codigoMunicipioTitular, java.lang.String codigoPostal, java.lang.String codigoOrientacion, java.lang.String nombreNacimiento, java.lang.String nombreComercial, java.lang.String codigoAptitud, java.lang.String inicioSuspension, java.lang.String duplicado, java.lang.String fechaMuerte, java.lang.String explotacionMuerte, java.lang.String codigoTipoMuerte, java.lang.String comunidadAutonomaGrabadora) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://servicio.mapama.gob.es/ws_equidos/ActualizarDatosEquidos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ActualizarDatosEquidos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoUELN, codigoEspecie, codigoRaza, codigoFiabilidad, codigoSexo, castrado, codigoCapa, codigoLugarNacimiento, explotacionNacimiento, fechaNacimiento, codigoTipoIdentificacion, codigoSistemaLectura, idElectronica, idAlternativo, fechaIdentificacion, NIFTitular, nombreTitular, direccionTitular, inicioTitular, codigoProvinciaTitular, codigoMunicipioTitular, codigoPostal, codigoOrientacion, nombreNacimiento, nombreComercial, codigoAptitud, inicioSuspension, duplicado, fechaMuerte, explotacionMuerte, codigoTipoMuerte, comunidadAutonomaGrabadora});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud) org.apache.axis.utils.JavaUtils.convert(_resp, com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud actualizarDatosEquidos_(java.lang.String codigoUELN, java.lang.String codigoEspecie, java.lang.String codigoRaza, java.lang.String codigoFiabilidad, java.lang.String codigoSexo, java.lang.String castrado, java.lang.String codigoCapa, java.lang.String codigoLugarNacimiento, java.lang.String explotacionNacimiento, java.lang.String fechaNacimiento, java.lang.String codigoTipoIdentificacion, java.lang.String codigoSistemaLectura, java.lang.String idElectronica, java.lang.String idAlternativo, java.lang.String fechaIdentificacion, java.lang.String NIFTitular, java.lang.String nombreTitular, java.lang.String direccionTitular, java.lang.String inicioTitular, java.lang.String codigoProvinciaTitular, java.lang.String codigoMunicipioTitular, java.lang.String codigoPostal, java.lang.String codigoOrientacion, java.lang.String nombreNacimiento, java.lang.String nombreComercial, java.lang.String codigoAptitud, java.lang.String inicioSuspension, java.lang.String duplicado, java.lang.String fechaMuerte, java.lang.String explotacionMuerte, java.lang.String codigoTipoMuerte, java.lang.String comunidadAutonomaGrabadora, java.lang.String explotacionUbicacion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://servicio.mapama.gob.es/ws_equidos/ActualizarDatosEquidos_");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ActualizarDatosEquidos_"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoUELN, codigoEspecie, codigoRaza, codigoFiabilidad, codigoSexo, castrado, codigoCapa, codigoLugarNacimiento, explotacionNacimiento, fechaNacimiento, codigoTipoIdentificacion, codigoSistemaLectura, idElectronica, idAlternativo, fechaIdentificacion, NIFTitular, nombreTitular, direccionTitular, inicioTitular, codigoProvinciaTitular, codigoMunicipioTitular, codigoPostal, codigoOrientacion, nombreNacimiento, nombreComercial, codigoAptitud, inicioSuspension, duplicado, fechaMuerte, explotacionMuerte, codigoTipoMuerte, comunidadAutonomaGrabadora, explotacionUbicacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud) org.apache.axis.utils.JavaUtils.convert(_resp, com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[] obtenerResultadoProcesamiento() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://servicio.mapama.gob.es/ws_equidos/ObtenerResultadoProcesamiento");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ObtenerResultadoProcesamiento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.jnr15.wsmapa.ws.ResultadoBorrado[] borrarEquido(java.lang.String[] uelns) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://servicio.mapama.gob.es/ws_equidos/BorrarEquido");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "BorrarEquido"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uelns});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.jnr15.wsmapa.ws.ResultadoBorrado[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.jnr15.wsmapa.ws.ResultadoBorrado[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.jnr15.wsmapa.ws.ResultadoBorrado[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud obtenerResultadoProcesamientoPorSolicitud(java.lang.String idSolicitud) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://servicio.mapama.gob.es/ws_equidos/ObtenerResultadoProcesamientoPorSolicitud");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ObtenerResultadoProcesamientoPorSolicitud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idSolicitud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud) org.apache.axis.utils.JavaUtils.convert(_resp, com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[] obtenerResultadoProcesamientoEntreFechas(java.lang.String fechaInicio, java.lang.String fechaFin) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://servicio.mapama.gob.es/ws_equidos/ObtenerResultadoProcesamientoEntreFechas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ObtenerResultadoProcesamientoEntreFechas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fechaInicio, fechaFin});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.jnr15.wsmapa.ws.DatosBasicos dameDatosBasicosEquido(java.lang.String ueln) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://servicio.mapama.gob.es/ws_equidos/DameDatosBasicosEquido");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DameDatosBasicosEquido"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ueln});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.jnr15.wsmapa.ws.DatosBasicos) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.jnr15.wsmapa.ws.DatosBasicos) org.apache.axis.utils.JavaUtils.convert(_resp, com.jnr15.wsmapa.ws.DatosBasicos.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.jnr15.wsmapa.ws.DatosBasicos[] dameDatosBasicosEquidos(java.lang.String[] ueln) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://servicio.mapama.gob.es/ws_equidos/DameDatosBasicosEquidos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DameDatosBasicosEquidos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ueln});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.jnr15.wsmapa.ws.DatosBasicos[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.jnr15.wsmapa.ws.DatosBasicos[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.jnr15.wsmapa.ws.DatosBasicos[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.jnr15.wsmapa.ws.DatosTitular[] obtenerTitularidadesModificadasPorCCAA(java.lang.String[] uelns, java.lang.String fechaDesde, java.lang.String fechaHasta) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://servicio.mapama.gob.es/ws_equidos/ObtenerTitularidadesModificadasPorCCAA");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ObtenerTitularidadesModificadasPorCCAA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uelns, fechaDesde, fechaHasta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.jnr15.wsmapa.ws.DatosTitular[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.jnr15.wsmapa.ws.DatosTitular[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.jnr15.wsmapa.ws.DatosTitular[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.jnr15.wsmapa.ws.UbicacionEquido dameUbicacionEquido(java.lang.String ueln) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://servicio.mapama.gob.es/ws_equidos/DameUbicacionEquido");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DameUbicacionEquido"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ueln});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.jnr15.wsmapa.ws.UbicacionEquido) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.jnr15.wsmapa.ws.UbicacionEquido) org.apache.axis.utils.JavaUtils.convert(_resp, com.jnr15.wsmapa.ws.UbicacionEquido.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.jnr15.wsmapa.ws.UbicacionEquido[] dameUbicacionEquidos(java.lang.String[] ueln) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://servicio.mapama.gob.es/ws_equidos/DameUbicacionEquidos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DameUbicacionEquidos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ueln});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.jnr15.wsmapa.ws.UbicacionEquido[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.jnr15.wsmapa.ws.UbicacionEquido[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.jnr15.wsmapa.ws.UbicacionEquido[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
