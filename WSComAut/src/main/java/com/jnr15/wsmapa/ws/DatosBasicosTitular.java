/**
 * DatosBasicosTitular.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsmapa.ws;

public class DatosBasicosTitular  implements java.io.Serializable {
    private java.lang.String NIF;

    private java.lang.String nombre;

    private java.util.Calendar fechaInicioTitularidad;

    private java.lang.String telefono;

    public DatosBasicosTitular() {
    }

    public DatosBasicosTitular(
           java.lang.String NIF,
           java.lang.String nombre,
           java.util.Calendar fechaInicioTitularidad,
           java.lang.String telefono) {
           this.NIF = NIF;
           this.nombre = nombre;
           this.fechaInicioTitularidad = fechaInicioTitularidad;
           this.telefono = telefono;
    }


    /**
     * Gets the NIF value for this DatosBasicosTitular.
     * 
     * @return NIF
     */
    public java.lang.String getNIF() {
        return NIF;
    }


    /**
     * Sets the NIF value for this DatosBasicosTitular.
     * 
     * @param NIF
     */
    public void setNIF(java.lang.String NIF) {
        this.NIF = NIF;
    }


    /**
     * Gets the nombre value for this DatosBasicosTitular.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DatosBasicosTitular.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the fechaInicioTitularidad value for this DatosBasicosTitular.
     * 
     * @return fechaInicioTitularidad
     */
    public java.util.Calendar getFechaInicioTitularidad() {
        return fechaInicioTitularidad;
    }


    /**
     * Sets the fechaInicioTitularidad value for this DatosBasicosTitular.
     * 
     * @param fechaInicioTitularidad
     */
    public void setFechaInicioTitularidad(java.util.Calendar fechaInicioTitularidad) {
        this.fechaInicioTitularidad = fechaInicioTitularidad;
    }


    /**
     * Gets the telefono value for this DatosBasicosTitular.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this DatosBasicosTitular.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosBasicosTitular)) return false;
        DatosBasicosTitular other = (DatosBasicosTitular) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NIF==null && other.getNIF()==null) || 
             (this.NIF!=null &&
              this.NIF.equals(other.getNIF()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.fechaInicioTitularidad==null && other.getFechaInicioTitularidad()==null) || 
             (this.fechaInicioTitularidad!=null &&
              this.fechaInicioTitularidad.equals(other.getFechaInicioTitularidad()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono())));
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
        if (getNIF() != null) {
            _hashCode += getNIF().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getFechaInicioTitularidad() != null) {
            _hashCode += getFechaInicioTitularidad().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosBasicosTitular.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosTitular"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIF");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "NIF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicioTitularidad");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "FechaInicioTitularidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Telefono"));
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
