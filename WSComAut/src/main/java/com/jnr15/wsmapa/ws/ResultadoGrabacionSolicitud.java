/**
 * ResultadoGrabacionSolicitud.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsmapa.ws;

public class ResultadoGrabacionSolicitud  implements java.io.Serializable {
    private java.lang.String idSolicitud;

    private java.lang.String codigoUELN;

    private java.lang.String codigoEspecie;

    private java.lang.String codigoError;

    private java.lang.String descripcionError;

    public ResultadoGrabacionSolicitud() {
    }

    public ResultadoGrabacionSolicitud(
           java.lang.String idSolicitud,
           java.lang.String codigoUELN,
           java.lang.String codigoEspecie,
           java.lang.String codigoError,
           java.lang.String descripcionError) {
           this.idSolicitud = idSolicitud;
           this.codigoUELN = codigoUELN;
           this.codigoEspecie = codigoEspecie;
           this.codigoError = codigoError;
           this.descripcionError = descripcionError;
    }


    /**
     * Gets the idSolicitud value for this ResultadoGrabacionSolicitud.
     * 
     * @return idSolicitud
     */
    public java.lang.String getIdSolicitud() {
        return idSolicitud;
    }


    /**
     * Sets the idSolicitud value for this ResultadoGrabacionSolicitud.
     * 
     * @param idSolicitud
     */
    public void setIdSolicitud(java.lang.String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }


    /**
     * Gets the codigoUELN value for this ResultadoGrabacionSolicitud.
     * 
     * @return codigoUELN
     */
    public java.lang.String getCodigoUELN() {
        return codigoUELN;
    }


    /**
     * Sets the codigoUELN value for this ResultadoGrabacionSolicitud.
     * 
     * @param codigoUELN
     */
    public void setCodigoUELN(java.lang.String codigoUELN) {
        this.codigoUELN = codigoUELN;
    }


    /**
     * Gets the codigoEspecie value for this ResultadoGrabacionSolicitud.
     * 
     * @return codigoEspecie
     */
    public java.lang.String getCodigoEspecie() {
        return codigoEspecie;
    }


    /**
     * Sets the codigoEspecie value for this ResultadoGrabacionSolicitud.
     * 
     * @param codigoEspecie
     */
    public void setCodigoEspecie(java.lang.String codigoEspecie) {
        this.codigoEspecie = codigoEspecie;
    }


    /**
     * Gets the codigoError value for this ResultadoGrabacionSolicitud.
     * 
     * @return codigoError
     */
    public java.lang.String getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this ResultadoGrabacionSolicitud.
     * 
     * @param codigoError
     */
    public void setCodigoError(java.lang.String codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the descripcionError value for this ResultadoGrabacionSolicitud.
     * 
     * @return descripcionError
     */
    public java.lang.String getDescripcionError() {
        return descripcionError;
    }


    /**
     * Sets the descripcionError value for this ResultadoGrabacionSolicitud.
     * 
     * @param descripcionError
     */
    public void setDescripcionError(java.lang.String descripcionError) {
        this.descripcionError = descripcionError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoGrabacionSolicitud)) return false;
        ResultadoGrabacionSolicitud other = (ResultadoGrabacionSolicitud) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idSolicitud==null && other.getIdSolicitud()==null) || 
             (this.idSolicitud!=null &&
              this.idSolicitud.equals(other.getIdSolicitud()))) &&
            ((this.codigoUELN==null && other.getCodigoUELN()==null) || 
             (this.codigoUELN!=null &&
              this.codigoUELN.equals(other.getCodigoUELN()))) &&
            ((this.codigoEspecie==null && other.getCodigoEspecie()==null) || 
             (this.codigoEspecie!=null &&
              this.codigoEspecie.equals(other.getCodigoEspecie()))) &&
            ((this.codigoError==null && other.getCodigoError()==null) || 
             (this.codigoError!=null &&
              this.codigoError.equals(other.getCodigoError()))) &&
            ((this.descripcionError==null && other.getDescripcionError()==null) || 
             (this.descripcionError!=null &&
              this.descripcionError.equals(other.getDescripcionError())));
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
        if (getIdSolicitud() != null) {
            _hashCode += getIdSolicitud().hashCode();
        }
        if (getCodigoUELN() != null) {
            _hashCode += getCodigoUELN().hashCode();
        }
        if (getCodigoEspecie() != null) {
            _hashCode += getCodigoEspecie().hashCode();
        }
        if (getCodigoError() != null) {
            _hashCode += getCodigoError().hashCode();
        }
        if (getDescripcionError() != null) {
            _hashCode += getDescripcionError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultadoGrabacionSolicitud.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ResultadoGrabacionSolicitud"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "IdSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUELN");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "CodigoUELN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEspecie");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "CodigoEspecie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "CodigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionError");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DescripcionError"));
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
