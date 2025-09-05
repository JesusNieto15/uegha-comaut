/**
 * RespuestaEntradaEquidos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsjuntaex.ws;

public class RespuestaEntradaEquidos  implements java.io.Serializable {
    private com.jnr15.wsjuntaex.ws.Errores[] listaError;

    private java.lang.String codigoEspecie;

    private java.lang.String codigoUELN;

    private java.lang.String idElectronico;

    private java.lang.String idSolicitud;

    public RespuestaEntradaEquidos() {
    }

    public RespuestaEntradaEquidos(
           com.jnr15.wsjuntaex.ws.Errores[] listaError,
           java.lang.String codigoEspecie,
           java.lang.String codigoUELN,
           java.lang.String idElectronico,
           java.lang.String idSolicitud) {
           this.listaError = listaError;
           this.codigoEspecie = codigoEspecie;
           this.codigoUELN = codigoUELN;
           this.idElectronico = idElectronico;
           this.idSolicitud = idSolicitud;
    }


    /**
     * Gets the listaError value for this RespuestaEntradaEquidos.
     * 
     * @return listaError
     */
    public com.jnr15.wsjuntaex.ws.Errores[] getListaError() {
        return listaError;
    }


    /**
     * Sets the listaError value for this RespuestaEntradaEquidos.
     * 
     * @param listaError
     */
    public void setListaError(com.jnr15.wsjuntaex.ws.Errores[] listaError) {
        this.listaError = listaError;
    }


    /**
     * Gets the codigoEspecie value for this RespuestaEntradaEquidos.
     * 
     * @return codigoEspecie
     */
    public java.lang.String getCodigoEspecie() {
        return codigoEspecie;
    }


    /**
     * Sets the codigoEspecie value for this RespuestaEntradaEquidos.
     * 
     * @param codigoEspecie
     */
    public void setCodigoEspecie(java.lang.String codigoEspecie) {
        this.codigoEspecie = codigoEspecie;
    }


    /**
     * Gets the codigoUELN value for this RespuestaEntradaEquidos.
     * 
     * @return codigoUELN
     */
    public java.lang.String getCodigoUELN() {
        return codigoUELN;
    }


    /**
     * Sets the codigoUELN value for this RespuestaEntradaEquidos.
     * 
     * @param codigoUELN
     */
    public void setCodigoUELN(java.lang.String codigoUELN) {
        this.codigoUELN = codigoUELN;
    }


    /**
     * Gets the idElectronico value for this RespuestaEntradaEquidos.
     * 
     * @return idElectronico
     */
    public java.lang.String getIdElectronico() {
        return idElectronico;
    }


    /**
     * Sets the idElectronico value for this RespuestaEntradaEquidos.
     * 
     * @param idElectronico
     */
    public void setIdElectronico(java.lang.String idElectronico) {
        this.idElectronico = idElectronico;
    }


    /**
     * Gets the idSolicitud value for this RespuestaEntradaEquidos.
     * 
     * @return idSolicitud
     */
    public java.lang.String getIdSolicitud() {
        return idSolicitud;
    }


    /**
     * Sets the idSolicitud value for this RespuestaEntradaEquidos.
     * 
     * @param idSolicitud
     */
    public void setIdSolicitud(java.lang.String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaEntradaEquidos)) return false;
        RespuestaEntradaEquidos other = (RespuestaEntradaEquidos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaError==null && other.getListaError()==null) || 
             (this.listaError!=null &&
              java.util.Arrays.equals(this.listaError, other.getListaError()))) &&
            ((this.codigoEspecie==null && other.getCodigoEspecie()==null) || 
             (this.codigoEspecie!=null &&
              this.codigoEspecie.equals(other.getCodigoEspecie()))) &&
            ((this.codigoUELN==null && other.getCodigoUELN()==null) || 
             (this.codigoUELN!=null &&
              this.codigoUELN.equals(other.getCodigoUELN()))) &&
            ((this.idElectronico==null && other.getIdElectronico()==null) || 
             (this.idElectronico!=null &&
              this.idElectronico.equals(other.getIdElectronico()))) &&
            ((this.idSolicitud==null && other.getIdSolicitud()==null) || 
             (this.idSolicitud!=null &&
              this.idSolicitud.equals(other.getIdSolicitud())));
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
        if (getListaError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaError(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodigoEspecie() != null) {
            _hashCode += getCodigoEspecie().hashCode();
        }
        if (getCodigoUELN() != null) {
            _hashCode += getCodigoUELN().hashCode();
        }
        if (getIdElectronico() != null) {
            _hashCode += getIdElectronico().hashCode();
        }
        if (getIdSolicitud() != null) {
            _hashCode += getIdSolicitud().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaEntradaEquidos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "RespuestaEntradaEquidos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "ListaError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "Errores"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "Errores"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEspecie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "codigoEspecie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUELN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "codigoUELN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idElectronico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "idElectronico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "idSolicitud"));
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
