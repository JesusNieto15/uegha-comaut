/**
 * SigganRiiaEquinoSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsja.ws;

public class SigganRiiaEquinoSoapStub extends org.apache.axis.client.Stub implements SigganRiiaEquinoSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActualizarDatosEquidos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoUELN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoEspecie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoRaza"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoFiabilidad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoSexo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "castrado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoCapa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoLugarNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "explotacionNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "fechaNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoTipoIdentificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoSistemaLectura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "idElectronica"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "idAlternativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "fechaIdentificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "NIFTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "nombreTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "direccionTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "inicioTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoProvinciaTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoMunicipioTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoPostal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoOrientacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "nombreNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "nombreComercial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoAptitud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "inicioSuspension"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "duplicado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "fechaMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "explotacionMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoTipoMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "comunidadAutonomaGrabadora"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoGrabacionSolicitud"));
        oper.setReturnClass(ResultadoGrabacionSolicitud.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ActualizarDatosEquidosResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActualizarDatosEquidos_");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoUELN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoEspecie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoRaza"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoFiabilidad"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoSexo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "castrado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoCapa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoLugarNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "explotacionNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "fechaNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoTipoIdentificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoSistemaLectura"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "idElectronica"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "idAlternativo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "fechaIdentificacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "NIFTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "nombreTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "direccionTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "inicioTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoProvinciaTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoMunicipioTitular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoPostal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoOrientacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "nombreNacimiento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "nombreComercial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoAptitud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "inicioSuspension"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "duplicado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "fechaMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "explotacionMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "codigoTipoMuerte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "comunidadAutonomaGrabadora"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "explotacionUbicacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoGrabacionSolicitud"));
        oper.setReturnClass(ResultadoGrabacionSolicitud.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ActualizarDatosEquidos_Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObtenerResultadoProcesamiento");
        oper.setReturnType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfResultadoProcesamientoSolicitud"));
        oper.setReturnClass(ResultadoProcesamientoSolicitud[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ObtenerResultadoProcesamientoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoProcesamientoSolicitud"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BorrarEquido");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "uelns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfResultadoBorrado"));
        oper.setReturnClass(ResultadoBorrado[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "BorrarEquidoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoBorrado"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObtenerResultadoProcesamientoPorSolicitud");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "idSolicitud"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoProcesamientoSolicitud"));
        oper.setReturnClass(ResultadoProcesamientoSolicitud.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ObtenerResultadoProcesamientoPorSolicitudResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObtenerResultadoProcesamientoEntreFechas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "fechaInicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "fechaFin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfResultadoProcesamientoSolicitud"));
        oper.setReturnClass(ResultadoProcesamientoSolicitud[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ObtenerResultadoProcesamientoEntreFechasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoProcesamientoSolicitud"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DameDatosBasicosEquido");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ueln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicos"));
        oper.setReturnClass(DatosBasicos.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DameDatosBasicosEquidoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DameDatosBasicosEquidos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ueln"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfDatosBasicos"));
        oper.setReturnClass(DatosBasicos[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DameDatosBasicosEquidosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicos"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ObtenerTitularidadesModificadasPorCCAA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "uelns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "fechaDesde"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "fechaHasta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfDatosTitular"));
        oper.setReturnClass(DatosTitular[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ObtenerTitularidadesModificadasPorCCAAResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosTitular"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public SigganRiiaEquinoSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SigganRiiaEquinoSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SigganRiiaEquinoSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfDatosBasicos");
            cachedSerQNames.add(qName);
            cls = DatosBasicos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicos");
            qName2 = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfDatosBasicosCondicionEspecial");
            cachedSerQNames.add(qName);
            cls = DatosBasicosCondicionEspecial[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicosCondicionEspecial");
            qName2 = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicosCondicionEspecial");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfDatosBasicosTitular");
            cachedSerQNames.add(qName);
            cls = DatosBasicosTitular[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicosTitular");
            qName2 = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicosTitular");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfDatosTitular");
            cachedSerQNames.add(qName);
            cls = DatosTitular[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosTitular");
            qName2 = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosTitular");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfIncidencia");
            cachedSerQNames.add(qName);
            cls = Incidencia[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Incidencia");
            qName2 = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Incidencia");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfResultadoBorrado");
            cachedSerQNames.add(qName);
            cls = ResultadoBorrado[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoBorrado");
            qName2 = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoBorrado");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfResultadoProcesamientoSolicitud");
            cachedSerQNames.add(qName);
            cls = ResultadoProcesamientoSolicitud[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoProcesamientoSolicitud");
            qName2 = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoProcesamientoSolicitud");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicos");
            cachedSerQNames.add(qName);
            cls = DatosBasicos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicosCompleto");
            cachedSerQNames.add(qName);
            cls = DatosBasicosCompleto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicosCondicionEspecial");
            cachedSerQNames.add(qName);
            cls = DatosBasicosCondicionEspecial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicosTitular");
            cachedSerQNames.add(qName);
            cls = DatosBasicosTitular.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosTitular");
            cachedSerQNames.add(qName);
            cls = DatosTitular.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosTitularNotificadoPorMensaje");
            cachedSerQNames.add(qName);
            cls = DatosTitularNotificadoPorMensaje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Incidencia");
            cachedSerQNames.add(qName);
            cls = Incidencia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoBorrado");
            cachedSerQNames.add(qName);
            cls = ResultadoBorrado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoGrabacionSolicitud");
            cachedSerQNames.add(qName);
            cls = ResultadoGrabacionSolicitud.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoProcesamientoSolicitud");
            cachedSerQNames.add(qName);
            cls = ResultadoProcesamientoSolicitud.class;
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

    public ResultadoGrabacionSolicitud actualizarDatosEquidos(java.lang.String codigoUELN, java.lang.String codigoEspecie, java.lang.String codigoRaza, java.lang.String codigoFiabilidad, java.lang.String codigoSexo, java.lang.String castrado, java.lang.String codigoCapa, java.lang.String codigoLugarNacimiento, java.lang.String explotacionNacimiento, java.lang.String fechaNacimiento, java.lang.String codigoTipoIdentificacion, java.lang.String codigoSistemaLectura, java.lang.String idElectronica, java.lang.String idAlternativo, java.lang.String fechaIdentificacion, java.lang.String NIFTitular, java.lang.String nombreTitular, java.lang.String direccionTitular, java.lang.String inicioTitular, java.lang.String codigoProvinciaTitular, java.lang.String codigoMunicipioTitular, java.lang.String codigoPostal, java.lang.String codigoOrientacion, java.lang.String nombreNacimiento, java.lang.String nombreComercial, java.lang.String codigoAptitud, java.lang.String inicioSuspension, java.lang.String duplicado, java.lang.String fechaMuerte, java.lang.String explotacionMuerte, java.lang.String codigoTipoMuerte, java.lang.String comunidadAutonomaGrabadora) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/ActualizarDatosEquidos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ActualizarDatosEquidos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoUELN, codigoEspecie, codigoRaza, codigoFiabilidad, codigoSexo, castrado, codigoCapa, codigoLugarNacimiento, explotacionNacimiento, fechaNacimiento, codigoTipoIdentificacion, codigoSistemaLectura, idElectronica, idAlternativo, fechaIdentificacion, NIFTitular, nombreTitular, direccionTitular, inicioTitular, codigoProvinciaTitular, codigoMunicipioTitular, codigoPostal, codigoOrientacion, nombreNacimiento, nombreComercial, codigoAptitud, inicioSuspension, duplicado, fechaMuerte, explotacionMuerte, codigoTipoMuerte, comunidadAutonomaGrabadora});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ResultadoGrabacionSolicitud) _resp;
            } catch (java.lang.Exception _exception) {
                return (ResultadoGrabacionSolicitud) org.apache.axis.utils.JavaUtils.convert(_resp, ResultadoGrabacionSolicitud.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ResultadoGrabacionSolicitud actualizarDatosEquidos_(java.lang.String codigoUELN, java.lang.String codigoEspecie, java.lang.String codigoRaza, java.lang.String codigoFiabilidad, java.lang.String codigoSexo, java.lang.String castrado, java.lang.String codigoCapa, java.lang.String codigoLugarNacimiento, java.lang.String explotacionNacimiento, java.lang.String fechaNacimiento, java.lang.String codigoTipoIdentificacion, java.lang.String codigoSistemaLectura, java.lang.String idElectronica, java.lang.String idAlternativo, java.lang.String fechaIdentificacion, java.lang.String NIFTitular, java.lang.String nombreTitular, java.lang.String direccionTitular, java.lang.String inicioTitular, java.lang.String codigoProvinciaTitular, java.lang.String codigoMunicipioTitular, java.lang.String codigoPostal, java.lang.String codigoOrientacion, java.lang.String nombreNacimiento, java.lang.String nombreComercial, java.lang.String codigoAptitud, java.lang.String inicioSuspension, java.lang.String duplicado, java.lang.String fechaMuerte, java.lang.String explotacionMuerte, java.lang.String codigoTipoMuerte, java.lang.String comunidadAutonomaGrabadora, java.lang.String explotacionUbicacion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/ActualizarDatosEquidos_");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ActualizarDatosEquidos_"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoUELN, codigoEspecie, codigoRaza, codigoFiabilidad, codigoSexo, castrado, codigoCapa, codigoLugarNacimiento, explotacionNacimiento, fechaNacimiento, codigoTipoIdentificacion, codigoSistemaLectura, idElectronica, idAlternativo, fechaIdentificacion, NIFTitular, nombreTitular, direccionTitular, inicioTitular, codigoProvinciaTitular, codigoMunicipioTitular, codigoPostal, codigoOrientacion, nombreNacimiento, nombreComercial, codigoAptitud, inicioSuspension, duplicado, fechaMuerte, explotacionMuerte, codigoTipoMuerte, comunidadAutonomaGrabadora, explotacionUbicacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ResultadoGrabacionSolicitud) _resp;
            } catch (java.lang.Exception _exception) {
                return (ResultadoGrabacionSolicitud) org.apache.axis.utils.JavaUtils.convert(_resp, ResultadoGrabacionSolicitud.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ResultadoProcesamientoSolicitud[] obtenerResultadoProcesamiento() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/ObtenerResultadoProcesamiento");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ObtenerResultadoProcesamiento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ResultadoProcesamientoSolicitud[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ResultadoProcesamientoSolicitud[]) org.apache.axis.utils.JavaUtils.convert(_resp, ResultadoProcesamientoSolicitud[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ResultadoBorrado[] borrarEquido(java.lang.String[] uelns) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/BorrarEquido");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "BorrarEquido"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uelns});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ResultadoBorrado[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ResultadoBorrado[]) org.apache.axis.utils.JavaUtils.convert(_resp, ResultadoBorrado[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ResultadoProcesamientoSolicitud obtenerResultadoProcesamientoPorSolicitud(java.lang.String idSolicitud) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/ObtenerResultadoProcesamientoPorSolicitud");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ObtenerResultadoProcesamientoPorSolicitud"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idSolicitud});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ResultadoProcesamientoSolicitud) _resp;
            } catch (java.lang.Exception _exception) {
                return (ResultadoProcesamientoSolicitud) org.apache.axis.utils.JavaUtils.convert(_resp, ResultadoProcesamientoSolicitud.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ResultadoProcesamientoSolicitud[] obtenerResultadoProcesamientoEntreFechas(java.lang.String fechaInicio, java.lang.String fechaFin) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/ObtenerResultadoProcesamientoEntreFechas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ObtenerResultadoProcesamientoEntreFechas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fechaInicio, fechaFin});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ResultadoProcesamientoSolicitud[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (ResultadoProcesamientoSolicitud[]) org.apache.axis.utils.JavaUtils.convert(_resp, ResultadoProcesamientoSolicitud[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DatosBasicos dameDatosBasicosEquido(java.lang.String ueln) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/DameDatosBasicosEquido");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DameDatosBasicosEquido"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ueln});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DatosBasicos) _resp;
            } catch (java.lang.Exception _exception) {
                return (DatosBasicos) org.apache.axis.utils.JavaUtils.convert(_resp, DatosBasicos.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DatosBasicos[] dameDatosBasicosEquidos(java.lang.String[] ueln) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/DameDatosBasicosEquidos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DameDatosBasicosEquidos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ueln});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DatosBasicos[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (DatosBasicos[]) org.apache.axis.utils.JavaUtils.convert(_resp, DatosBasicos[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DatosTitular[] obtenerTitularidadesModificadasPorCCAA(java.lang.String[] uelns, java.lang.String fechaDesde, java.lang.String fechaHasta) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/ObtenerTitularidadesModificadasPorCCAA");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ObtenerTitularidadesModificadasPorCCAA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uelns, fechaDesde, fechaHasta});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DatosTitular[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (DatosTitular[]) org.apache.axis.utils.JavaUtils.convert(_resp, DatosTitular[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
