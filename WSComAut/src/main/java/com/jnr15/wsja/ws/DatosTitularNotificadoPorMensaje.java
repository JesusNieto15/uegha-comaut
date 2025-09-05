/**
 * DatosTitularNotificadoPorMensaje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsja.ws;

public class DatosTitularNotificadoPorMensaje  extends DatosTitular  implements java.io.Serializable {
    private java.util.Calendar fechaMensaje;

    private java.lang.String CAMensaje;

    private java.lang.String codigoCAMensaje;

    public DatosTitularNotificadoPorMensaje() {
    }

    public DatosTitularNotificadoPorMensaje(
           java.lang.String UELN,
           java.lang.String codigoEspecie,
           java.lang.String especie,
           java.util.Calendar fechaInicioTitularidad,
           java.util.Calendar fechaFinTitularidad,
           java.lang.String NIF,
           java.lang.String nombre,
           java.lang.String direccion,
           java.lang.String codigoPostal,
           java.lang.String municipio,
           java.lang.String codigoMunicipio,
           java.lang.String provincia,
           java.lang.String codigoProvincia,
           java.lang.String telefono,
           boolean notificadoPorMensaje,
           java.util.Calendar fechaMensaje,
           java.lang.String CAMensaje,
           java.lang.String codigoCAMensaje) {
        super(
            UELN,
            codigoEspecie,
            especie,
            fechaInicioTitularidad,
            fechaFinTitularidad,
            NIF,
            nombre,
            direccion,
            codigoPostal,
            municipio,
            codigoMunicipio,
            provincia,
            codigoProvincia,
            telefono,
            notificadoPorMensaje);
        this.fechaMensaje = fechaMensaje;
        this.CAMensaje = CAMensaje;
        this.codigoCAMensaje = codigoCAMensaje;
    }


    /**
     * Gets the fechaMensaje value for this DatosTitularNotificadoPorMensaje.
     * 
     * @return fechaMensaje
     */
    public java.util.Calendar getFechaMensaje() {
        return fechaMensaje;
    }


    /**
     * Sets the fechaMensaje value for this DatosTitularNotificadoPorMensaje.
     * 
     * @param fechaMensaje
     */
    public void setFechaMensaje(java.util.Calendar fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }


    /**
     * Gets the CAMensaje value for this DatosTitularNotificadoPorMensaje.
     * 
     * @return CAMensaje
     */
    public java.lang.String getCAMensaje() {
        return CAMensaje;
    }


    /**
     * Sets the CAMensaje value for this DatosTitularNotificadoPorMensaje.
     * 
     * @param CAMensaje
     */
    public void setCAMensaje(java.lang.String CAMensaje) {
        this.CAMensaje = CAMensaje;
    }


    /**
     * Gets the codigoCAMensaje value for this DatosTitularNotificadoPorMensaje.
     * 
     * @return codigoCAMensaje
     */
    public java.lang.String getCodigoCAMensaje() {
        return codigoCAMensaje;
    }


    /**
     * Sets the codigoCAMensaje value for this DatosTitularNotificadoPorMensaje.
     * 
     * @param codigoCAMensaje
     */
    public void setCodigoCAMensaje(java.lang.String codigoCAMensaje) {
        this.codigoCAMensaje = codigoCAMensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosTitularNotificadoPorMensaje)) return false;
        DatosTitularNotificadoPorMensaje other = (DatosTitularNotificadoPorMensaje) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fechaMensaje==null && other.getFechaMensaje()==null) || 
             (this.fechaMensaje!=null &&
              this.fechaMensaje.equals(other.getFechaMensaje()))) &&
            ((this.CAMensaje==null && other.getCAMensaje()==null) || 
             (this.CAMensaje!=null &&
              this.CAMensaje.equals(other.getCAMensaje()))) &&
            ((this.codigoCAMensaje==null && other.getCodigoCAMensaje()==null) || 
             (this.codigoCAMensaje!=null &&
              this.codigoCAMensaje.equals(other.getCodigoCAMensaje())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getFechaMensaje() != null) {
            _hashCode += getFechaMensaje().hashCode();
        }
        if (getCAMensaje() != null) {
            _hashCode += getCAMensaje().hashCode();
        }
        if (getCodigoCAMensaje() != null) {
            _hashCode += getCodigoCAMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosTitularNotificadoPorMensaje.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosTitularNotificadoPorMensaje"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaMensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "FechaMensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAMensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "CAMensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCAMensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "CodigoCAMensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
