/**
 * DatosTitular.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsja.ws;

public class DatosTitular  implements java.io.Serializable {
    private java.lang.String UELN;

    private java.lang.String codigoEspecie;

    private java.lang.String especie;

    private java.util.Calendar fechaInicioTitularidad;

    private java.util.Calendar fechaFinTitularidad;

    private java.lang.String NIF;

    private java.lang.String nombre;

    private java.lang.String direccion;

    private java.lang.String codigoPostal;

    private java.lang.String municipio;

    private java.lang.String codigoMunicipio;

    private java.lang.String provincia;

    private java.lang.String codigoProvincia;

    private java.lang.String telefono;

    private boolean notificadoPorMensaje;

    public DatosTitular() {
    }

    public DatosTitular(
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
           boolean notificadoPorMensaje) {
           this.UELN = UELN;
           this.codigoEspecie = codigoEspecie;
           this.especie = especie;
           this.fechaInicioTitularidad = fechaInicioTitularidad;
           this.fechaFinTitularidad = fechaFinTitularidad;
           this.NIF = NIF;
           this.nombre = nombre;
           this.direccion = direccion;
           this.codigoPostal = codigoPostal;
           this.municipio = municipio;
           this.codigoMunicipio = codigoMunicipio;
           this.provincia = provincia;
           this.codigoProvincia = codigoProvincia;
           this.telefono = telefono;
           this.notificadoPorMensaje = notificadoPorMensaje;
    }


    /**
     * Gets the UELN value for this DatosTitular.
     * 
     * @return UELN
     */
    public java.lang.String getUELN() {
        return UELN;
    }


    /**
     * Sets the UELN value for this DatosTitular.
     * 
     * @param UELN
     */
    public void setUELN(java.lang.String UELN) {
        this.UELN = UELN;
    }


    /**
     * Gets the codigoEspecie value for this DatosTitular.
     * 
     * @return codigoEspecie
     */
    public java.lang.String getCodigoEspecie() {
        return codigoEspecie;
    }


    /**
     * Sets the codigoEspecie value for this DatosTitular.
     * 
     * @param codigoEspecie
     */
    public void setCodigoEspecie(java.lang.String codigoEspecie) {
        this.codigoEspecie = codigoEspecie;
    }


    /**
     * Gets the especie value for this DatosTitular.
     * 
     * @return especie
     */
    public java.lang.String getEspecie() {
        return especie;
    }


    /**
     * Sets the especie value for this DatosTitular.
     * 
     * @param especie
     */
    public void setEspecie(java.lang.String especie) {
        this.especie = especie;
    }


    /**
     * Gets the fechaInicioTitularidad value for this DatosTitular.
     * 
     * @return fechaInicioTitularidad
     */
    public java.util.Calendar getFechaInicioTitularidad() {
        return fechaInicioTitularidad;
    }


    /**
     * Sets the fechaInicioTitularidad value for this DatosTitular.
     * 
     * @param fechaInicioTitularidad
     */
    public void setFechaInicioTitularidad(java.util.Calendar fechaInicioTitularidad) {
        this.fechaInicioTitularidad = fechaInicioTitularidad;
    }


    /**
     * Gets the fechaFinTitularidad value for this DatosTitular.
     * 
     * @return fechaFinTitularidad
     */
    public java.util.Calendar getFechaFinTitularidad() {
        return fechaFinTitularidad;
    }


    /**
     * Sets the fechaFinTitularidad value for this DatosTitular.
     * 
     * @param fechaFinTitularidad
     */
    public void setFechaFinTitularidad(java.util.Calendar fechaFinTitularidad) {
        this.fechaFinTitularidad = fechaFinTitularidad;
    }


    /**
     * Gets the NIF value for this DatosTitular.
     * 
     * @return NIF
     */
    public java.lang.String getNIF() {
        return NIF;
    }


    /**
     * Sets the NIF value for this DatosTitular.
     * 
     * @param NIF
     */
    public void setNIF(java.lang.String NIF) {
        this.NIF = NIF;
    }


    /**
     * Gets the nombre value for this DatosTitular.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DatosTitular.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the direccion value for this DatosTitular.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this DatosTitular.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the codigoPostal value for this DatosTitular.
     * 
     * @return codigoPostal
     */
    public java.lang.String getCodigoPostal() {
        return codigoPostal;
    }


    /**
     * Sets the codigoPostal value for this DatosTitular.
     * 
     * @param codigoPostal
     */
    public void setCodigoPostal(java.lang.String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    /**
     * Gets the municipio value for this DatosTitular.
     * 
     * @return municipio
     */
    public java.lang.String getMunicipio() {
        return municipio;
    }


    /**
     * Sets the municipio value for this DatosTitular.
     * 
     * @param municipio
     */
    public void setMunicipio(java.lang.String municipio) {
        this.municipio = municipio;
    }


    /**
     * Gets the codigoMunicipio value for this DatosTitular.
     * 
     * @return codigoMunicipio
     */
    public java.lang.String getCodigoMunicipio() {
        return codigoMunicipio;
    }


    /**
     * Sets the codigoMunicipio value for this DatosTitular.
     * 
     * @param codigoMunicipio
     */
    public void setCodigoMunicipio(java.lang.String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }


    /**
     * Gets the provincia value for this DatosTitular.
     * 
     * @return provincia
     */
    public java.lang.String getProvincia() {
        return provincia;
    }


    /**
     * Sets the provincia value for this DatosTitular.
     * 
     * @param provincia
     */
    public void setProvincia(java.lang.String provincia) {
        this.provincia = provincia;
    }


    /**
     * Gets the codigoProvincia value for this DatosTitular.
     * 
     * @return codigoProvincia
     */
    public java.lang.String getCodigoProvincia() {
        return codigoProvincia;
    }


    /**
     * Sets the codigoProvincia value for this DatosTitular.
     * 
     * @param codigoProvincia
     */
    public void setCodigoProvincia(java.lang.String codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }


    /**
     * Gets the telefono value for this DatosTitular.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this DatosTitular.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the notificadoPorMensaje value for this DatosTitular.
     * 
     * @return notificadoPorMensaje
     */
    public boolean isNotificadoPorMensaje() {
        return notificadoPorMensaje;
    }


    /**
     * Sets the notificadoPorMensaje value for this DatosTitular.
     * 
     * @param notificadoPorMensaje
     */
    public void setNotificadoPorMensaje(boolean notificadoPorMensaje) {
        this.notificadoPorMensaje = notificadoPorMensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosTitular)) return false;
        DatosTitular other = (DatosTitular) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.UELN==null && other.getUELN()==null) || 
             (this.UELN!=null &&
              this.UELN.equals(other.getUELN()))) &&
            ((this.codigoEspecie==null && other.getCodigoEspecie()==null) || 
             (this.codigoEspecie!=null &&
              this.codigoEspecie.equals(other.getCodigoEspecie()))) &&
            ((this.especie==null && other.getEspecie()==null) || 
             (this.especie!=null &&
              this.especie.equals(other.getEspecie()))) &&
            ((this.fechaInicioTitularidad==null && other.getFechaInicioTitularidad()==null) || 
             (this.fechaInicioTitularidad!=null &&
              this.fechaInicioTitularidad.equals(other.getFechaInicioTitularidad()))) &&
            ((this.fechaFinTitularidad==null && other.getFechaFinTitularidad()==null) || 
             (this.fechaFinTitularidad!=null &&
              this.fechaFinTitularidad.equals(other.getFechaFinTitularidad()))) &&
            ((this.NIF==null && other.getNIF()==null) || 
             (this.NIF!=null &&
              this.NIF.equals(other.getNIF()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.codigoPostal==null && other.getCodigoPostal()==null) || 
             (this.codigoPostal!=null &&
              this.codigoPostal.equals(other.getCodigoPostal()))) &&
            ((this.municipio==null && other.getMunicipio()==null) || 
             (this.municipio!=null &&
              this.municipio.equals(other.getMunicipio()))) &&
            ((this.codigoMunicipio==null && other.getCodigoMunicipio()==null) || 
             (this.codigoMunicipio!=null &&
              this.codigoMunicipio.equals(other.getCodigoMunicipio()))) &&
            ((this.provincia==null && other.getProvincia()==null) || 
             (this.provincia!=null &&
              this.provincia.equals(other.getProvincia()))) &&
            ((this.codigoProvincia==null && other.getCodigoProvincia()==null) || 
             (this.codigoProvincia!=null &&
              this.codigoProvincia.equals(other.getCodigoProvincia()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            this.notificadoPorMensaje == other.isNotificadoPorMensaje();
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
        if (getUELN() != null) {
            _hashCode += getUELN().hashCode();
        }
        if (getCodigoEspecie() != null) {
            _hashCode += getCodigoEspecie().hashCode();
        }
        if (getEspecie() != null) {
            _hashCode += getEspecie().hashCode();
        }
        if (getFechaInicioTitularidad() != null) {
            _hashCode += getFechaInicioTitularidad().hashCode();
        }
        if (getFechaFinTitularidad() != null) {
            _hashCode += getFechaFinTitularidad().hashCode();
        }
        if (getNIF() != null) {
            _hashCode += getNIF().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getCodigoPostal() != null) {
            _hashCode += getCodigoPostal().hashCode();
        }
        if (getMunicipio() != null) {
            _hashCode += getMunicipio().hashCode();
        }
        if (getCodigoMunicipio() != null) {
            _hashCode += getCodigoMunicipio().hashCode();
        }
        if (getProvincia() != null) {
            _hashCode += getProvincia().hashCode();
        }
        if (getCodigoProvincia() != null) {
            _hashCode += getCodigoProvincia().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        _hashCode += (isNotificadoPorMensaje() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosTitular.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "DatosTitular"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UELN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "UELN"));
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
        elemField.setFieldName("especie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Especie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicioTitularidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "FechaInicioTitularidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFinTitularidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "FechaFinTitularidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NIF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "NIF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "CodigoPostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Municipio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoMunicipio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "CodigoMunicipio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Provincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "CodigoProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "Telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificadoPorMensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://juntadeandalucia.es/agriculturaypesca/siggan/riiaequino/", "NotificadoPorMensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
