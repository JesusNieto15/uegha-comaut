/**
 * DatosBasicosCompleto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsmapa.ws;

public class DatosBasicosCompleto  extends com.jnr15.wsmapa.ws.DatosBasicos  implements java.io.Serializable {
    private java.lang.String fiabilidad;

    private java.lang.String codigoCapa;

    private java.lang.String capa;

    private java.lang.String codigoLugarNacimiento;

    private java.lang.String lugarNacimiento;

    private java.util.Calendar fechaMuerte;

    private java.lang.String explotacionMuerte;

    private java.lang.String codigoTipoMuerte;

    private java.lang.String tipoMuerte;

    private java.lang.String codigoOrientacion;

    private java.lang.String orientacion;

    private java.lang.String nombreNacimiento;

    private java.lang.String nombreComercial;

    private java.lang.String codigoAptitudConsumo;

    private java.lang.String aptitudConsumo;

    private java.util.Calendar fechaInicioSuspension;

    private boolean documentoSustitutivo;

    private boolean castrado;

    private boolean duplicado;

    private com.jnr15.wsmapa.ws.DatosBasicosCondicionEspecial[] condicionesEspeciales;

    private com.jnr15.wsmapa.ws.DatosBasicosTitular[] titulares;

    public DatosBasicosCompleto() {
    }

    public DatosBasicosCompleto(
           java.lang.String UELN,
           java.lang.String codigoEspecie,
           java.lang.String especie,
           java.lang.String codigoSexo,
           java.lang.String sexo,
           java.lang.String codigoRaza,
           java.lang.String raza,
           java.lang.String identificadorElectronico,
           java.lang.String codigoOrganismoEmisor,
           java.lang.String organismoEmisor,
           java.lang.String explotacionNacimiento,
           java.util.Calendar fechaNacimiento,
           java.lang.String fiabilidad,
           java.lang.String codigoCapa,
           java.lang.String capa,
           java.lang.String codigoLugarNacimiento,
           java.lang.String lugarNacimiento,
           java.util.Calendar fechaMuerte,
           java.lang.String explotacionMuerte,
           java.lang.String codigoTipoMuerte,
           java.lang.String tipoMuerte,
           java.lang.String codigoOrientacion,
           java.lang.String orientacion,
           java.lang.String nombreNacimiento,
           java.lang.String nombreComercial,
           java.lang.String codigoAptitudConsumo,
           java.lang.String aptitudConsumo,
           java.util.Calendar fechaInicioSuspension,
           boolean documentoSustitutivo,
           boolean castrado,
           boolean duplicado,
           com.jnr15.wsmapa.ws.DatosBasicosCondicionEspecial[] condicionesEspeciales,
           com.jnr15.wsmapa.ws.DatosBasicosTitular[] titulares) {
        super(
            UELN,
            codigoEspecie,
            especie,
            codigoSexo,
            sexo,
            codigoRaza,
            raza,
            identificadorElectronico,
            codigoOrganismoEmisor,
            organismoEmisor,
            explotacionNacimiento,
            fechaNacimiento);
        this.fiabilidad = fiabilidad;
        this.codigoCapa = codigoCapa;
        this.capa = capa;
        this.codigoLugarNacimiento = codigoLugarNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.fechaMuerte = fechaMuerte;
        this.explotacionMuerte = explotacionMuerte;
        this.codigoTipoMuerte = codigoTipoMuerte;
        this.tipoMuerte = tipoMuerte;
        this.codigoOrientacion = codigoOrientacion;
        this.orientacion = orientacion;
        this.nombreNacimiento = nombreNacimiento;
        this.nombreComercial = nombreComercial;
        this.codigoAptitudConsumo = codigoAptitudConsumo;
        this.aptitudConsumo = aptitudConsumo;
        this.fechaInicioSuspension = fechaInicioSuspension;
        this.documentoSustitutivo = documentoSustitutivo;
        this.castrado = castrado;
        this.duplicado = duplicado;
        this.condicionesEspeciales = condicionesEspeciales;
        this.titulares = titulares;
    }


    /**
     * Gets the fiabilidad value for this DatosBasicosCompleto.
     * 
     * @return fiabilidad
     */
    public java.lang.String getFiabilidad() {
        return fiabilidad;
    }


    /**
     * Sets the fiabilidad value for this DatosBasicosCompleto.
     * 
     * @param fiabilidad
     */
    public void setFiabilidad(java.lang.String fiabilidad) {
        this.fiabilidad = fiabilidad;
    }


    /**
     * Gets the codigoCapa value for this DatosBasicosCompleto.
     * 
     * @return codigoCapa
     */
    public java.lang.String getCodigoCapa() {
        return codigoCapa;
    }


    /**
     * Sets the codigoCapa value for this DatosBasicosCompleto.
     * 
     * @param codigoCapa
     */
    public void setCodigoCapa(java.lang.String codigoCapa) {
        this.codigoCapa = codigoCapa;
    }


    /**
     * Gets the capa value for this DatosBasicosCompleto.
     * 
     * @return capa
     */
    public java.lang.String getCapa() {
        return capa;
    }


    /**
     * Sets the capa value for this DatosBasicosCompleto.
     * 
     * @param capa
     */
    public void setCapa(java.lang.String capa) {
        this.capa = capa;
    }


    /**
     * Gets the codigoLugarNacimiento value for this DatosBasicosCompleto.
     * 
     * @return codigoLugarNacimiento
     */
    public java.lang.String getCodigoLugarNacimiento() {
        return codigoLugarNacimiento;
    }


    /**
     * Sets the codigoLugarNacimiento value for this DatosBasicosCompleto.
     * 
     * @param codigoLugarNacimiento
     */
    public void setCodigoLugarNacimiento(java.lang.String codigoLugarNacimiento) {
        this.codigoLugarNacimiento = codigoLugarNacimiento;
    }


    /**
     * Gets the lugarNacimiento value for this DatosBasicosCompleto.
     * 
     * @return lugarNacimiento
     */
    public java.lang.String getLugarNacimiento() {
        return lugarNacimiento;
    }


    /**
     * Sets the lugarNacimiento value for this DatosBasicosCompleto.
     * 
     * @param lugarNacimiento
     */
    public void setLugarNacimiento(java.lang.String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }


    /**
     * Gets the fechaMuerte value for this DatosBasicosCompleto.
     * 
     * @return fechaMuerte
     */
    public java.util.Calendar getFechaMuerte() {
        return fechaMuerte;
    }


    /**
     * Sets the fechaMuerte value for this DatosBasicosCompleto.
     * 
     * @param fechaMuerte
     */
    public void setFechaMuerte(java.util.Calendar fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }


    /**
     * Gets the explotacionMuerte value for this DatosBasicosCompleto.
     * 
     * @return explotacionMuerte
     */
    public java.lang.String getExplotacionMuerte() {
        return explotacionMuerte;
    }


    /**
     * Sets the explotacionMuerte value for this DatosBasicosCompleto.
     * 
     * @param explotacionMuerte
     */
    public void setExplotacionMuerte(java.lang.String explotacionMuerte) {
        this.explotacionMuerte = explotacionMuerte;
    }


    /**
     * Gets the codigoTipoMuerte value for this DatosBasicosCompleto.
     * 
     * @return codigoTipoMuerte
     */
    public java.lang.String getCodigoTipoMuerte() {
        return codigoTipoMuerte;
    }


    /**
     * Sets the codigoTipoMuerte value for this DatosBasicosCompleto.
     * 
     * @param codigoTipoMuerte
     */
    public void setCodigoTipoMuerte(java.lang.String codigoTipoMuerte) {
        this.codigoTipoMuerte = codigoTipoMuerte;
    }


    /**
     * Gets the tipoMuerte value for this DatosBasicosCompleto.
     * 
     * @return tipoMuerte
     */
    public java.lang.String getTipoMuerte() {
        return tipoMuerte;
    }


    /**
     * Sets the tipoMuerte value for this DatosBasicosCompleto.
     * 
     * @param tipoMuerte
     */
    public void setTipoMuerte(java.lang.String tipoMuerte) {
        this.tipoMuerte = tipoMuerte;
    }


    /**
     * Gets the codigoOrientacion value for this DatosBasicosCompleto.
     * 
     * @return codigoOrientacion
     */
    public java.lang.String getCodigoOrientacion() {
        return codigoOrientacion;
    }


    /**
     * Sets the codigoOrientacion value for this DatosBasicosCompleto.
     * 
     * @param codigoOrientacion
     */
    public void setCodigoOrientacion(java.lang.String codigoOrientacion) {
        this.codigoOrientacion = codigoOrientacion;
    }


    /**
     * Gets the orientacion value for this DatosBasicosCompleto.
     * 
     * @return orientacion
     */
    public java.lang.String getOrientacion() {
        return orientacion;
    }


    /**
     * Sets the orientacion value for this DatosBasicosCompleto.
     * 
     * @param orientacion
     */
    public void setOrientacion(java.lang.String orientacion) {
        this.orientacion = orientacion;
    }


    /**
     * Gets the nombreNacimiento value for this DatosBasicosCompleto.
     * 
     * @return nombreNacimiento
     */
    public java.lang.String getNombreNacimiento() {
        return nombreNacimiento;
    }


    /**
     * Sets the nombreNacimiento value for this DatosBasicosCompleto.
     * 
     * @param nombreNacimiento
     */
    public void setNombreNacimiento(java.lang.String nombreNacimiento) {
        this.nombreNacimiento = nombreNacimiento;
    }


    /**
     * Gets the nombreComercial value for this DatosBasicosCompleto.
     * 
     * @return nombreComercial
     */
    public java.lang.String getNombreComercial() {
        return nombreComercial;
    }


    /**
     * Sets the nombreComercial value for this DatosBasicosCompleto.
     * 
     * @param nombreComercial
     */
    public void setNombreComercial(java.lang.String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }


    /**
     * Gets the codigoAptitudConsumo value for this DatosBasicosCompleto.
     * 
     * @return codigoAptitudConsumo
     */
    public java.lang.String getCodigoAptitudConsumo() {
        return codigoAptitudConsumo;
    }


    /**
     * Sets the codigoAptitudConsumo value for this DatosBasicosCompleto.
     * 
     * @param codigoAptitudConsumo
     */
    public void setCodigoAptitudConsumo(java.lang.String codigoAptitudConsumo) {
        this.codigoAptitudConsumo = codigoAptitudConsumo;
    }


    /**
     * Gets the aptitudConsumo value for this DatosBasicosCompleto.
     * 
     * @return aptitudConsumo
     */
    public java.lang.String getAptitudConsumo() {
        return aptitudConsumo;
    }


    /**
     * Sets the aptitudConsumo value for this DatosBasicosCompleto.
     * 
     * @param aptitudConsumo
     */
    public void setAptitudConsumo(java.lang.String aptitudConsumo) {
        this.aptitudConsumo = aptitudConsumo;
    }


    /**
     * Gets the fechaInicioSuspension value for this DatosBasicosCompleto.
     * 
     * @return fechaInicioSuspension
     */
    public java.util.Calendar getFechaInicioSuspension() {
        return fechaInicioSuspension;
    }


    /**
     * Sets the fechaInicioSuspension value for this DatosBasicosCompleto.
     * 
     * @param fechaInicioSuspension
     */
    public void setFechaInicioSuspension(java.util.Calendar fechaInicioSuspension) {
        this.fechaInicioSuspension = fechaInicioSuspension;
    }


    /**
     * Gets the documentoSustitutivo value for this DatosBasicosCompleto.
     * 
     * @return documentoSustitutivo
     */
    public boolean isDocumentoSustitutivo() {
        return documentoSustitutivo;
    }


    /**
     * Sets the documentoSustitutivo value for this DatosBasicosCompleto.
     * 
     * @param documentoSustitutivo
     */
    public void setDocumentoSustitutivo(boolean documentoSustitutivo) {
        this.documentoSustitutivo = documentoSustitutivo;
    }


    /**
     * Gets the castrado value for this DatosBasicosCompleto.
     * 
     * @return castrado
     */
    public boolean isCastrado() {
        return castrado;
    }


    /**
     * Sets the castrado value for this DatosBasicosCompleto.
     * 
     * @param castrado
     */
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }


    /**
     * Gets the duplicado value for this DatosBasicosCompleto.
     * 
     * @return duplicado
     */
    public boolean isDuplicado() {
        return duplicado;
    }


    /**
     * Sets the duplicado value for this DatosBasicosCompleto.
     * 
     * @param duplicado
     */
    public void setDuplicado(boolean duplicado) {
        this.duplicado = duplicado;
    }


    /**
     * Gets the condicionesEspeciales value for this DatosBasicosCompleto.
     * 
     * @return condicionesEspeciales
     */
    public com.jnr15.wsmapa.ws.DatosBasicosCondicionEspecial[] getCondicionesEspeciales() {
        return condicionesEspeciales;
    }


    /**
     * Sets the condicionesEspeciales value for this DatosBasicosCompleto.
     * 
     * @param condicionesEspeciales
     */
    public void setCondicionesEspeciales(com.jnr15.wsmapa.ws.DatosBasicosCondicionEspecial[] condicionesEspeciales) {
        this.condicionesEspeciales = condicionesEspeciales;
    }


    /**
     * Gets the titulares value for this DatosBasicosCompleto.
     * 
     * @return titulares
     */
    public com.jnr15.wsmapa.ws.DatosBasicosTitular[] getTitulares() {
        return titulares;
    }


    /**
     * Sets the titulares value for this DatosBasicosCompleto.
     * 
     * @param titulares
     */
    public void setTitulares(com.jnr15.wsmapa.ws.DatosBasicosTitular[] titulares) {
        this.titulares = titulares;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosBasicosCompleto)) return false;
        DatosBasicosCompleto other = (DatosBasicosCompleto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fiabilidad==null && other.getFiabilidad()==null) || 
             (this.fiabilidad!=null &&
              this.fiabilidad.equals(other.getFiabilidad()))) &&
            ((this.codigoCapa==null && other.getCodigoCapa()==null) || 
             (this.codigoCapa!=null &&
              this.codigoCapa.equals(other.getCodigoCapa()))) &&
            ((this.capa==null && other.getCapa()==null) || 
             (this.capa!=null &&
              this.capa.equals(other.getCapa()))) &&
            ((this.codigoLugarNacimiento==null && other.getCodigoLugarNacimiento()==null) || 
             (this.codigoLugarNacimiento!=null &&
              this.codigoLugarNacimiento.equals(other.getCodigoLugarNacimiento()))) &&
            ((this.lugarNacimiento==null && other.getLugarNacimiento()==null) || 
             (this.lugarNacimiento!=null &&
              this.lugarNacimiento.equals(other.getLugarNacimiento()))) &&
            ((this.fechaMuerte==null && other.getFechaMuerte()==null) || 
             (this.fechaMuerte!=null &&
              this.fechaMuerte.equals(other.getFechaMuerte()))) &&
            ((this.explotacionMuerte==null && other.getExplotacionMuerte()==null) || 
             (this.explotacionMuerte!=null &&
              this.explotacionMuerte.equals(other.getExplotacionMuerte()))) &&
            ((this.codigoTipoMuerte==null && other.getCodigoTipoMuerte()==null) || 
             (this.codigoTipoMuerte!=null &&
              this.codigoTipoMuerte.equals(other.getCodigoTipoMuerte()))) &&
            ((this.tipoMuerte==null && other.getTipoMuerte()==null) || 
             (this.tipoMuerte!=null &&
              this.tipoMuerte.equals(other.getTipoMuerte()))) &&
            ((this.codigoOrientacion==null && other.getCodigoOrientacion()==null) || 
             (this.codigoOrientacion!=null &&
              this.codigoOrientacion.equals(other.getCodigoOrientacion()))) &&
            ((this.orientacion==null && other.getOrientacion()==null) || 
             (this.orientacion!=null &&
              this.orientacion.equals(other.getOrientacion()))) &&
            ((this.nombreNacimiento==null && other.getNombreNacimiento()==null) || 
             (this.nombreNacimiento!=null &&
              this.nombreNacimiento.equals(other.getNombreNacimiento()))) &&
            ((this.nombreComercial==null && other.getNombreComercial()==null) || 
             (this.nombreComercial!=null &&
              this.nombreComercial.equals(other.getNombreComercial()))) &&
            ((this.codigoAptitudConsumo==null && other.getCodigoAptitudConsumo()==null) || 
             (this.codigoAptitudConsumo!=null &&
              this.codigoAptitudConsumo.equals(other.getCodigoAptitudConsumo()))) &&
            ((this.aptitudConsumo==null && other.getAptitudConsumo()==null) || 
             (this.aptitudConsumo!=null &&
              this.aptitudConsumo.equals(other.getAptitudConsumo()))) &&
            ((this.fechaInicioSuspension==null && other.getFechaInicioSuspension()==null) || 
             (this.fechaInicioSuspension!=null &&
              this.fechaInicioSuspension.equals(other.getFechaInicioSuspension()))) &&
            this.documentoSustitutivo == other.isDocumentoSustitutivo() &&
            this.castrado == other.isCastrado() &&
            this.duplicado == other.isDuplicado() &&
            ((this.condicionesEspeciales==null && other.getCondicionesEspeciales()==null) || 
             (this.condicionesEspeciales!=null &&
              java.util.Arrays.equals(this.condicionesEspeciales, other.getCondicionesEspeciales()))) &&
            ((this.titulares==null && other.getTitulares()==null) || 
             (this.titulares!=null &&
              java.util.Arrays.equals(this.titulares, other.getTitulares())));
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
        if (getFiabilidad() != null) {
            _hashCode += getFiabilidad().hashCode();
        }
        if (getCodigoCapa() != null) {
            _hashCode += getCodigoCapa().hashCode();
        }
        if (getCapa() != null) {
            _hashCode += getCapa().hashCode();
        }
        if (getCodigoLugarNacimiento() != null) {
            _hashCode += getCodigoLugarNacimiento().hashCode();
        }
        if (getLugarNacimiento() != null) {
            _hashCode += getLugarNacimiento().hashCode();
        }
        if (getFechaMuerte() != null) {
            _hashCode += getFechaMuerte().hashCode();
        }
        if (getExplotacionMuerte() != null) {
            _hashCode += getExplotacionMuerte().hashCode();
        }
        if (getCodigoTipoMuerte() != null) {
            _hashCode += getCodigoTipoMuerte().hashCode();
        }
        if (getTipoMuerte() != null) {
            _hashCode += getTipoMuerte().hashCode();
        }
        if (getCodigoOrientacion() != null) {
            _hashCode += getCodigoOrientacion().hashCode();
        }
        if (getOrientacion() != null) {
            _hashCode += getOrientacion().hashCode();
        }
        if (getNombreNacimiento() != null) {
            _hashCode += getNombreNacimiento().hashCode();
        }
        if (getNombreComercial() != null) {
            _hashCode += getNombreComercial().hashCode();
        }
        if (getCodigoAptitudConsumo() != null) {
            _hashCode += getCodigoAptitudConsumo().hashCode();
        }
        if (getAptitudConsumo() != null) {
            _hashCode += getAptitudConsumo().hashCode();
        }
        if (getFechaInicioSuspension() != null) {
            _hashCode += getFechaInicioSuspension().hashCode();
        }
        _hashCode += (isDocumentoSustitutivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCastrado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDuplicado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCondicionesEspeciales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCondicionesEspeciales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCondicionesEspeciales(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitulares() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitulares());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitulares(), i);
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
        new org.apache.axis.description.TypeDesc(DatosBasicosCompleto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosCompleto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiabilidad");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Fiabilidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCapa");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "CodigoCapa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capa");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Capa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoLugarNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "CodigoLugarNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lugarNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "LugarNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaMuerte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "FechaMuerte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explotacionMuerte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "ExplotacionMuerte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoMuerte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "CodigoTipoMuerte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoMuerte");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "TipoMuerte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoOrientacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "CodigoOrientacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orientacion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Orientacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "NombreNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreComercial");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "NombreComercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAptitudConsumo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "CodigoAptitudConsumo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aptitudConsumo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "AptitudConsumo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicioSuspension");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "FechaInicioSuspension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoSustitutivo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DocumentoSustitutivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("castrado");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Castrado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicado");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Duplicado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicionesEspeciales");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "CondicionesEspeciales"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosCondicionEspecial"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosCondicionEspecial"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulares");
        elemField.setXmlName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "Titulares"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosTitular"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://servicio.mapama.gob.es/ws_equidos/", "DatosBasicosTitular"));
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
