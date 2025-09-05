/**
 * ResultadoProcesamientoSolicitud.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsja.ws;

public class ResultadoProcesamientoSolicitud  implements java.io.Serializable {
    private java.lang.String idSolicitud;

    private java.lang.String codigoUELN;

    private java.lang.String codigoEspecie;

    private java.lang.String fechaProcesamiento;

    private java.lang.String estado;

    private java.lang.String codigoError;

    private java.lang.String descripcionError;

    private java.lang.String observaciones;

    private Incidencia[] incidencias;

    public ResultadoProcesamientoSolicitud() {
    }

    public ResultadoProcesamientoSolicitud(
           java.lang.String idSolicitud,
           java.lang.String codigoUELN,
           java.lang.String codigoEspecie,
           java.lang.String fechaProcesamiento,
           java.lang.String estado,
           java.lang.String codigoError,
           java.lang.String descripcionError,
           java.lang.String observaciones,
           Incidencia[] incidencias) {
           this.idSolicitud = idSolicitud;
           this.codigoUELN = codigoUELN;
           this.codigoEspecie = codigoEspecie;
           this.fechaProcesamiento = fechaProcesamiento;
           this.estado = estado;
           this.codigoError = codigoError;
           this.descripcionError = descripcionError;
           this.observaciones = observaciones;
           this.incidencias = incidencias;
    }


    /**
     * Gets the idSolicitud value for this ResultadoProcesamientoSolicitud.
     * 
     * @return idSolicitud
     */
    public java.lang.String getIdSolicitud() {
        return idSolicitud;
    }


    /**
     * Sets the idSolicitud value for this ResultadoProcesamientoSolicitud.
     * 
     * @param idSolicitud
     */
    public void setIdSolicitud(java.lang.String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }


    /**
     * Gets the codigoUELN value for this ResultadoProcesamientoSolicitud.
     * 
     * @return codigoUELN
     */
    public java.lang.String getCodigoUELN() {
        return codigoUELN;
    }


    /**
     * Sets the codigoUELN value for this ResultadoProcesamientoSolicitud.
     * 
     * @param codigoUELN
     */
    public void setCodigoUELN(java.lang.String codigoUELN) {
        this.codigoUELN = codigoUELN;
    }


    /**
     * Gets the codigoEspecie value for this ResultadoProcesamientoSolicitud.
     * 
     * @return codigoEspecie
     */
    public java.lang.String getCodigoEspecie() {
        return codigoEspecie;
    }


    /**
     * Sets the codigoEspecie value for this ResultadoProcesamientoSolicitud.
     * 
     * @param codigoEspecie
     */
    public void setCodigoEspecie(java.lang.String codigoEspecie) {
        this.codigoEspecie = codigoEspecie;
    }


    /**
     * Gets the fechaProcesamiento value for this ResultadoProcesamientoSolicitud.
     * 
     * @return fechaProcesamiento
     */
    public java.lang.String getFechaProcesamiento() {
        return fechaProcesamiento;
    }


    /**
     * Sets the fechaProcesamiento value for this ResultadoProcesamientoSolicitud.
     * 
     * @param fechaProcesamiento
     */
    public void setFechaProcesamiento(java.lang.String fechaProcesamiento) {
        this.fechaProcesamiento = fechaProcesamiento;
    }


    /**
     * Gets the estado value for this ResultadoProcesamientoSolicitud.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this ResultadoProcesamientoSolicitud.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the codigoError value for this ResultadoProcesamientoSolicitud.
     * 
     * @return codigoError
     */
    public java.lang.String getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this ResultadoProcesamientoSolicitud.
     * 
     * @param codigoError
     */
    public void setCodigoError(java.lang.String codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the descripcionError value for this ResultadoProcesamientoSolicitud.
     * 
     * @return descripcionError
     */
    public java.lang.String getDescripcionError() {
        return descripcionError;
    }


    /**
     * Sets the descripcionError value for this ResultadoProcesamientoSolicitud.
     * 
     * @param descripcionError
     */
    public void setDescripcionError(java.lang.String descripcionError) {
        this.descripcionError = descripcionError;
    }


    /**
     * Gets the observaciones value for this ResultadoProcesamientoSolicitud.
     * 
     * @return observaciones
     */
    public java.lang.String getObservaciones() {
        return observaciones;
    }


    /**
     * Sets the observaciones value for this ResultadoProcesamientoSolicitud.
     * 
     * @param observaciones
     */
    public void setObservaciones(java.lang.String observaciones) {
        this.observaciones = observaciones;
    }


    /**
     * Gets the incidencias value for this ResultadoProcesamientoSolicitud.
     * 
     * @return incidencias
     */
    public Incidencia[] getIncidencias() {
        return incidencias;
    }


    /**
     * Sets the incidencias value for this ResultadoProcesamientoSolicitud.
     * 
     * @param incidencias
     */
    public void setIncidencias(Incidencia[] incidencias) {
        this.incidencias = incidencias;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoProcesamientoSolicitud)) return false;
        ResultadoProcesamientoSolicitud other = (ResultadoProcesamientoSolicitud) obj;
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
            ((this.fechaProcesamiento==null && other.getFechaProcesamiento()==null) || 
             (this.fechaProcesamiento!=null &&
              this.fechaProcesamiento.equals(other.getFechaProcesamiento()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.codigoError==null && other.getCodigoError()==null) || 
             (this.codigoError!=null &&
              this.codigoError.equals(other.getCodigoError()))) &&
            ((this.descripcionError==null && other.getDescripcionError()==null) || 
             (this.descripcionError!=null &&
              this.descripcionError.equals(other.getDescripcionError()))) &&
            ((this.observaciones==null && other.getObservaciones()==null) || 
             (this.observaciones!=null &&
              this.observaciones.equals(other.getObservaciones()))) &&
            ((this.incidencias==null && other.getIncidencias()==null) || 
             (this.incidencias!=null &&
              java.util.Arrays.equals(this.incidencias, other.getIncidencias())));
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
        if (getFechaProcesamiento() != null) {
            _hashCode += getFechaProcesamiento().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getCodigoError() != null) {
            _hashCode += getCodigoError().hashCode();
        }
        if (getDescripcionError() != null) {
            _hashCode += getDescripcionError().hashCode();
        }
        if (getObservaciones() != null) {
            _hashCode += getObservaciones().hashCode();
        }
        if (getIncidencias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncidencias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncidencias(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultadoProcesamientoSolicitud.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "ResultadoProcesamientoSolicitud"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "IdSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUELN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "CodigoUELN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEspecie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "CodigoEspecie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaProcesamiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "FechaProcesamiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "CodigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DescripcionError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Observaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidencias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Incidencias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Incidencia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Incidencia"));
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
