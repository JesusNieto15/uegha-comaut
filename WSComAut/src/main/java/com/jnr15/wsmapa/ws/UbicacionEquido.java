/**
 * UbicacionEquido.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsmapa.ws;

public class UbicacionEquido  implements java.io.Serializable {
    private java.lang.String ueln;

    private java.lang.String codigoUbicacion;

    private java.lang.String descripcionUbicacion;

    public UbicacionEquido() {
    }

    public UbicacionEquido(
           java.lang.String ueln,
           java.lang.String codigoUbicacion,
           java.lang.String descripcionUbicacion) {
           this.ueln = ueln;
           this.codigoUbicacion = codigoUbicacion;
           this.descripcionUbicacion = descripcionUbicacion;
    }


    /**
     * Gets the ueln value for this UbicacionEquido.
     * 
     * @return ueln
     */
    public java.lang.String getUeln() {
        return ueln;
    }


    /**
     * Sets the ueln value for this UbicacionEquido.
     * 
     * @param ueln
     */
    public void setUeln(java.lang.String ueln) {
        this.ueln = ueln;
    }


    /**
     * Gets the codigoUbicacion value for this UbicacionEquido.
     * 
     * @return codigoUbicacion
     */
    public java.lang.String getCodigoUbicacion() {
        return codigoUbicacion;
    }


    /**
     * Sets the codigoUbicacion value for this UbicacionEquido.
     * 
     * @param codigoUbicacion
     */
    public void setCodigoUbicacion(java.lang.String codigoUbicacion) {
        this.codigoUbicacion = codigoUbicacion;
    }


    /**
     * Gets the descripcionUbicacion value for this UbicacionEquido.
     * 
     * @return descripcionUbicacion
     */
    public java.lang.String getDescripcionUbicacion() {
        return descripcionUbicacion;
    }


    /**
     * Sets the descripcionUbicacion value for this UbicacionEquido.
     * 
     * @param descripcionUbicacion
     */
    public void setDescripcionUbicacion(java.lang.String descripcionUbicacion) {
        this.descripcionUbicacion = descripcionUbicacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UbicacionEquido)) return false;
        UbicacionEquido other = (UbicacionEquido) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ueln==null && other.getUeln()==null) || 
             (this.ueln!=null &&
              this.ueln.equals(other.getUeln()))) &&
            ((this.codigoUbicacion==null && other.getCodigoUbicacion()==null) || 
             (this.codigoUbicacion!=null &&
              this.codigoUbicacion.equals(other.getCodigoUbicacion()))) &&
            ((this.descripcionUbicacion==null && other.getDescripcionUbicacion()==null) || 
             (this.descripcionUbicacion!=null &&
              this.descripcionUbicacion.equals(other.getDescripcionUbicacion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUeln() != null) {
            _hashCode += getUeln().hashCode();
        }
        if (getCodigoUbicacion() != null) {
            _hashCode += getCodigoUbicacion().hashCode();
        }
        if (getDescripcionUbicacion() != null) {
            _hashCode += getDescripcionUbicacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UbicacionEquido.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "UbicacionEquido"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ueln");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Ueln"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUbicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "CodigoUbicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionUbicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DescripcionUbicacion"));
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
