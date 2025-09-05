/**
 * Solicitudes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsjuntaex.ws;

public class Solicitudes  implements java.io.Serializable {
    private java.lang.String especie;

    private com.jnr15.wsjuntaex.ws.Errores[] listaError;

    private java.lang.String UELN;

    private java.lang.String estado;

    private java.lang.String fechaProcesamiento;

    private java.lang.String idSolicitud;

    private java.lang.String tipoSolicitud;

    public Solicitudes() {
    }

    public Solicitudes(
           java.lang.String especie,
           com.jnr15.wsjuntaex.ws.Errores[] listaError,
           java.lang.String UELN,
           java.lang.String estado,
           java.lang.String fechaProcesamiento,
           java.lang.String idSolicitud,
           java.lang.String tipoSolicitud) {
           this.especie = especie;
           this.listaError = listaError;
           this.UELN = UELN;
           this.estado = estado;
           this.fechaProcesamiento = fechaProcesamiento;
           this.idSolicitud = idSolicitud;
           this.tipoSolicitud = tipoSolicitud;
    }


    /**
     * Gets the especie value for this Solicitudes.
     * 
     * @return especie
     */
    public java.lang.String getEspecie() {
        return especie;
    }


    /**
     * Sets the especie value for this Solicitudes.
     * 
     * @param especie
     */
    public void setEspecie(java.lang.String especie) {
        this.especie = especie;
    }


    /**
     * Gets the listaError value for this Solicitudes.
     * 
     * @return listaError
     */
    public com.jnr15.wsjuntaex.ws.Errores[] getListaError() {
        return listaError;
    }


    /**
     * Sets the listaError value for this Solicitudes.
     * 
     * @param listaError
     */
    public void setListaError(com.jnr15.wsjuntaex.ws.Errores[] listaError) {
        this.listaError = listaError;
    }


    /**
     * Gets the UELN value for this Solicitudes.
     * 
     * @return UELN
     */
    public java.lang.String getUELN() {
        return UELN;
    }


    /**
     * Sets the UELN value for this Solicitudes.
     * 
     * @param UELN
     */
    public void setUELN(java.lang.String UELN) {
        this.UELN = UELN;
    }


    /**
     * Gets the estado value for this Solicitudes.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Solicitudes.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the fechaProcesamiento value for this Solicitudes.
     * 
     * @return fechaProcesamiento
     */
    public java.lang.String getFechaProcesamiento() {
        return fechaProcesamiento;
    }


    /**
     * Sets the fechaProcesamiento value for this Solicitudes.
     * 
     * @param fechaProcesamiento
     */
    public void setFechaProcesamiento(java.lang.String fechaProcesamiento) {
        this.fechaProcesamiento = fechaProcesamiento;
    }


    /**
     * Gets the idSolicitud value for this Solicitudes.
     * 
     * @return idSolicitud
     */
    public java.lang.String getIdSolicitud() {
        return idSolicitud;
    }


    /**
     * Sets the idSolicitud value for this Solicitudes.
     * 
     * @param idSolicitud
     */
    public void setIdSolicitud(java.lang.String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }


    /**
     * Gets the tipoSolicitud value for this Solicitudes.
     * 
     * @return tipoSolicitud
     */
    public java.lang.String getTipoSolicitud() {
        return tipoSolicitud;
    }


    /**
     * Sets the tipoSolicitud value for this Solicitudes.
     * 
     * @param tipoSolicitud
     */
    public void setTipoSolicitud(java.lang.String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Solicitudes)) return false;
        Solicitudes other = (Solicitudes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.especie==null && other.getEspecie()==null) || 
             (this.especie!=null &&
              this.especie.equals(other.getEspecie()))) &&
            ((this.listaError==null && other.getListaError()==null) || 
             (this.listaError!=null &&
              java.util.Arrays.equals(this.listaError, other.getListaError()))) &&
            ((this.UELN==null && other.getUELN()==null) || 
             (this.UELN!=null &&
              this.UELN.equals(other.getUELN()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.fechaProcesamiento==null && other.getFechaProcesamiento()==null) || 
             (this.fechaProcesamiento!=null &&
              this.fechaProcesamiento.equals(other.getFechaProcesamiento()))) &&
            ((this.idSolicitud==null && other.getIdSolicitud()==null) || 
             (this.idSolicitud!=null &&
              this.idSolicitud.equals(other.getIdSolicitud()))) &&
            ((this.tipoSolicitud==null && other.getTipoSolicitud()==null) || 
             (this.tipoSolicitud!=null &&
              this.tipoSolicitud.equals(other.getTipoSolicitud())));
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
        if (getEspecie() != null) {
            _hashCode += getEspecie().hashCode();
        }
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
        if (getUELN() != null) {
            _hashCode += getUELN().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getFechaProcesamiento() != null) {
            _hashCode += getFechaProcesamiento().hashCode();
        }
        if (getIdSolicitud() != null) {
            _hashCode += getIdSolicitud().hashCode();
        }
        if (getTipoSolicitud() != null) {
            _hashCode += getTipoSolicitud().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Solicitudes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "Solicitudes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("especie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "Especie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "ListaError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "Errores"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "Errores"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UELN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "UELN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaProcesamiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "fechaProcesamiento"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "tipoSolicitud"));
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
