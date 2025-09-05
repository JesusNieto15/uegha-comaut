/**
 * Errores.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsjuntaex.ws;

public class Errores  implements java.io.Serializable {
    private java.lang.String descError;

    private java.lang.String idError;

    public Errores() {
    }

    public Errores(
           java.lang.String descError,
           java.lang.String idError) {
           this.descError = descError;
           this.idError = idError;
    }


    /**
     * Gets the descError value for this Errores.
     * 
     * @return descError
     */
    public java.lang.String getDescError() {
        return descError;
    }


    /**
     * Sets the descError value for this Errores.
     * 
     * @param descError
     */
    public void setDescError(java.lang.String descError) {
        this.descError = descError;
    }


    /**
     * Gets the idError value for this Errores.
     * 
     * @return idError
     */
    public java.lang.String getIdError() {
        return idError;
    }


    /**
     * Sets the idError value for this Errores.
     * 
     * @param idError
     */
    public void setIdError(java.lang.String idError) {
        this.idError = idError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Errores)) return false;
        Errores other = (Errores) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descError==null && other.getDescError()==null) || 
             (this.descError!=null &&
              this.descError.equals(other.getDescError()))) &&
            ((this.idError==null && other.getIdError()==null) || 
             (this.idError!=null &&
              this.idError.equals(other.getIdError())));
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
        if (getDescError() != null) {
            _hashCode += getDescError().hashCode();
        }
        if (getIdError() != null) {
            _hashCode += getIdError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Errores.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "Errores"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "DescError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "IdError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
