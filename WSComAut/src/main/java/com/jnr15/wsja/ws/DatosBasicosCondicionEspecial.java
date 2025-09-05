/**
 * DatosBasicosCondicionEspecial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsja.ws;

public class DatosBasicosCondicionEspecial  implements java.io.Serializable {
    private java.util.Calendar fecha;

    private java.lang.String codigoCondicionEspecial;

    private java.lang.String condicionEspecial;

    public DatosBasicosCondicionEspecial() {
    }

    public DatosBasicosCondicionEspecial(
           java.util.Calendar fecha,
           java.lang.String codigoCondicionEspecial,
           java.lang.String condicionEspecial) {
           this.fecha = fecha;
           this.codigoCondicionEspecial = codigoCondicionEspecial;
           this.condicionEspecial = condicionEspecial;
    }


    /**
     * Gets the fecha value for this DatosBasicosCondicionEspecial.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this DatosBasicosCondicionEspecial.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the codigoCondicionEspecial value for this DatosBasicosCondicionEspecial.
     * 
     * @return codigoCondicionEspecial
     */
    public java.lang.String getCodigoCondicionEspecial() {
        return codigoCondicionEspecial;
    }


    /**
     * Sets the codigoCondicionEspecial value for this DatosBasicosCondicionEspecial.
     * 
     * @param codigoCondicionEspecial
     */
    public void setCodigoCondicionEspecial(java.lang.String codigoCondicionEspecial) {
        this.codigoCondicionEspecial = codigoCondicionEspecial;
    }


    /**
     * Gets the condicionEspecial value for this DatosBasicosCondicionEspecial.
     * 
     * @return condicionEspecial
     */
    public java.lang.String getCondicionEspecial() {
        return condicionEspecial;
    }


    /**
     * Sets the condicionEspecial value for this DatosBasicosCondicionEspecial.
     * 
     * @param condicionEspecial
     */
    public void setCondicionEspecial(java.lang.String condicionEspecial) {
        this.condicionEspecial = condicionEspecial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosBasicosCondicionEspecial)) return false;
        DatosBasicosCondicionEspecial other = (DatosBasicosCondicionEspecial) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.codigoCondicionEspecial==null && other.getCodigoCondicionEspecial()==null) || 
             (this.codigoCondicionEspecial!=null &&
              this.codigoCondicionEspecial.equals(other.getCodigoCondicionEspecial()))) &&
            ((this.condicionEspecial==null && other.getCondicionEspecial()==null) || 
             (this.condicionEspecial!=null &&
              this.condicionEspecial.equals(other.getCondicionEspecial())));
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
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getCodigoCondicionEspecial() != null) {
            _hashCode += getCodigoCondicionEspecial().hashCode();
        }
        if (getCondicionEspecial() != null) {
            _hashCode += getCondicionEspecial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosBasicosCondicionEspecial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosBasicosCondicionEspecial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCondicionEspecial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "CodigoCondicionEspecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicionEspecial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "CondicionEspecial"));
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
