/**
 * DatosBasicosCompletoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package riia_ws.veterinarios.beans;

public class DatosBasicosCompletoBean  implements java.io.Serializable {
    private riia_ws.veterinarios.beans.DatosBasicosBean datosBasicos;

    private java.lang.String fiabilidad;

    private java.lang.String codigoCapa;

    private java.lang.String capa;

    private java.lang.String codigoLugarNacimiento;

    private java.lang.String lugarNacimiento;

    private java.util.Date fechaMuerte;

    private java.lang.String explotacionMuerte;

    private java.lang.String codigoTipoMuerte;

    private java.lang.String tipoMuerte;

    private java.lang.String codigoOrientacion;

    private java.lang.String orientacion;

    private java.lang.String nombreNacimiento;

    private java.lang.String nombreComercial;

    private java.lang.String codigoAptitudConsumo;

    private java.lang.String aptitudConsumo;

    private java.util.Date fechaInicioSuspension;

    //private java.lang.String documentoSustitutivo;
    private java.lang.Boolean documentoSustitutivo;
    
    private java.lang.Boolean castrado;

    private java.lang.Boolean duplicado;

    private riia_ws.veterinarios.beans.DatosBasicosCondicionEspecialBean[] condicionesEspeciales;

    private riia_ws.veterinarios.beans.DatosBasicosTitularBean[] titulares;

    public DatosBasicosCompletoBean() {
    }

    public DatosBasicosCompletoBean(
           riia_ws.veterinarios.beans.DatosBasicosBean datosBasicos,
           java.lang.String fiabilidad,
           java.lang.String codigoCapa,
           java.lang.String capa,
           java.lang.String codigoLugarNacimiento,
           java.lang.String lugarNacimiento,
           java.util.Date fechaMuerte,
           java.lang.String explotacionMuerte,
           java.lang.String codigoTipoMuerte,
           java.lang.String tipoMuerte,
           java.lang.String codigoOrientacion,
           java.lang.String orientacion,
           java.lang.String nombreNacimiento,
           java.lang.String nombreComercial,
           java.lang.String codigoAptitudConsumo,
           java.lang.String aptitudConsumo,
           java.util.Date fechaInicioSuspension,
           java.lang.Boolean documentoSustitutivo,
           java.lang.Boolean castrado,
           java.lang.Boolean duplicado,
           riia_ws.veterinarios.beans.DatosBasicosCondicionEspecialBean[] condicionesEspeciales,
           riia_ws.veterinarios.beans.DatosBasicosTitularBean[] titulares) {
           this.datosBasicos = datosBasicos;
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
     * Gets the datosBasicos value for this DatosBasicosCompletoBean.
     * 
     * @return datosBasicos
     */
    public riia_ws.veterinarios.beans.DatosBasicosBean getDatosBasicos() {
        return datosBasicos;
    }


    /**
     * Sets the datosBasicos value for this DatosBasicosCompletoBean.
     * 
     * @param datosBasicos
     */
    public void setDatosBasicos(riia_ws.veterinarios.beans.DatosBasicosBean datosBasicos) {
        this.datosBasicos = datosBasicos;
    }


    /**
     * Gets the fiabilidad value for this DatosBasicosCompletoBean.
     * 
     * @return fiabilidad
     */
    public java.lang.String getFiabilidad() {
        return fiabilidad;
    }


    /**
     * Sets the fiabilidad value for this DatosBasicosCompletoBean.
     * 
     * @param fiabilidad
     */
    public void setFiabilidad(java.lang.String fiabilidad) {
        this.fiabilidad = fiabilidad;
    }


    /**
     * Gets the codigoCapa value for this DatosBasicosCompletoBean.
     * 
     * @return codigoCapa
     */
    public java.lang.String getCodigoCapa() {
        return codigoCapa;
    }


    /**
     * Sets the codigoCapa value for this DatosBasicosCompletoBean.
     * 
     * @param codigoCapa
     */
    public void setCodigoCapa(java.lang.String codigoCapa) {
        this.codigoCapa = codigoCapa;
    }


    /**
     * Gets the capa value for this DatosBasicosCompletoBean.
     * 
     * @return capa
     */
    public java.lang.String getCapa() {
        return capa;
    }


    /**
     * Sets the capa value for this DatosBasicosCompletoBean.
     * 
     * @param capa
     */
    public void setCapa(java.lang.String capa) {
        this.capa = capa;
    }


    /**
     * Gets the codigoLugarNacimiento value for this DatosBasicosCompletoBean.
     * 
     * @return codigoLugarNacimiento
     */
    public java.lang.String getCodigoLugarNacimiento() {
        return codigoLugarNacimiento;
    }


    /**
     * Sets the codigoLugarNacimiento value for this DatosBasicosCompletoBean.
     * 
     * @param codigoLugarNacimiento
     */
    public void setCodigoLugarNacimiento(java.lang.String codigoLugarNacimiento) {
        this.codigoLugarNacimiento = codigoLugarNacimiento;
    }


    /**
     * Gets the lugarNacimiento value for this DatosBasicosCompletoBean.
     * 
     * @return lugarNacimiento
     */
    public java.lang.String getLugarNacimiento() {
        return lugarNacimiento;
    }


    /**
     * Sets the lugarNacimiento value for this DatosBasicosCompletoBean.
     * 
     * @param lugarNacimiento
     */
    public void setLugarNacimiento(java.lang.String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }


    /**
     * Gets the fechaMuerte value for this DatosBasicosCompletoBean.
     * 
     * @return fechaMuerte
     */
    public java.util.Date getFechaMuerte() {
        return fechaMuerte;
    }


    /**
     * Sets the fechaMuerte value for this DatosBasicosCompletoBean.
     * 
     * @param fechaMuerte
     */
    public void setFechaMuerte(java.util.Date fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }


    /**
     * Gets the explotacionMuerte value for this DatosBasicosCompletoBean.
     * 
     * @return explotacionMuerte
     */
    public java.lang.String getExplotacionMuerte() {
        return explotacionMuerte;
    }


    /**
     * Sets the explotacionMuerte value for this DatosBasicosCompletoBean.
     * 
     * @param explotacionMuerte
     */
    public void setExplotacionMuerte(java.lang.String explotacionMuerte) {
        this.explotacionMuerte = explotacionMuerte;
    }


    /**
     * Gets the codigoTipoMuerte value for this DatosBasicosCompletoBean.
     * 
     * @return codigoTipoMuerte
     */
    public java.lang.String getCodigoTipoMuerte() {
        return codigoTipoMuerte;
    }


    /**
     * Sets the codigoTipoMuerte value for this DatosBasicosCompletoBean.
     * 
     * @param codigoTipoMuerte
     */
    public void setCodigoTipoMuerte(java.lang.String codigoTipoMuerte) {
        this.codigoTipoMuerte = codigoTipoMuerte;
    }


    /**
     * Gets the tipoMuerte value for this DatosBasicosCompletoBean.
     * 
     * @return tipoMuerte
     */
    public java.lang.String getTipoMuerte() {
        return tipoMuerte;
    }


    /**
     * Sets the tipoMuerte value for this DatosBasicosCompletoBean.
     * 
     * @param tipoMuerte
     */
    public void setTipoMuerte(java.lang.String tipoMuerte) {
        this.tipoMuerte = tipoMuerte;
    }


    /**
     * Gets the codigoOrientacion value for this DatosBasicosCompletoBean.
     * 
     * @return codigoOrientacion
     */
    public java.lang.String getCodigoOrientacion() {
        return codigoOrientacion;
    }


    /**
     * Sets the codigoOrientacion value for this DatosBasicosCompletoBean.
     * 
     * @param codigoOrientacion
     */
    public void setCodigoOrientacion(java.lang.String codigoOrientacion) {
        this.codigoOrientacion = codigoOrientacion;
    }


    /**
     * Gets the orientacion value for this DatosBasicosCompletoBean.
     * 
     * @return orientacion
     */
    public java.lang.String getOrientacion() {
        return orientacion;
    }


    /**
     * Sets the orientacion value for this DatosBasicosCompletoBean.
     * 
     * @param orientacion
     */
    public void setOrientacion(java.lang.String orientacion) {
        this.orientacion = orientacion;
    }


    /**
     * Gets the nombreNacimiento value for this DatosBasicosCompletoBean.
     * 
     * @return nombreNacimiento
     */
    public java.lang.String getNombreNacimiento() {
        return nombreNacimiento;
    }


    /**
     * Sets the nombreNacimiento value for this DatosBasicosCompletoBean.
     * 
     * @param nombreNacimiento
     */
    public void setNombreNacimiento(java.lang.String nombreNacimiento) {
        this.nombreNacimiento = nombreNacimiento;
    }


    /**
     * Gets the nombreComercial value for this DatosBasicosCompletoBean.
     * 
     * @return nombreComercial
     */
    public java.lang.String getNombreComercial() {
        return nombreComercial;
    }


    /**
     * Sets the nombreComercial value for this DatosBasicosCompletoBean.
     * 
     * @param nombreComercial
     */
    public void setNombreComercial(java.lang.String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }


    /**
     * Gets the codigoAptitudConsumo value for this DatosBasicosCompletoBean.
     * 
     * @return codigoAptitudConsumo
     */
    public java.lang.String getCodigoAptitudConsumo() {
        return codigoAptitudConsumo;
    }


    /**
     * Sets the codigoAptitudConsumo value for this DatosBasicosCompletoBean.
     * 
     * @param codigoAptitudConsumo
     */
    public void setCodigoAptitudConsumo(java.lang.String codigoAptitudConsumo) {
        this.codigoAptitudConsumo = codigoAptitudConsumo;
    }


    /**
     * Gets the aptitudConsumo value for this DatosBasicosCompletoBean.
     * 
     * @return aptitudConsumo
     */
    public java.lang.String getAptitudConsumo() {
        return aptitudConsumo;
    }


    /**
     * Sets the aptitudConsumo value for this DatosBasicosCompletoBean.
     * 
     * @param aptitudConsumo
     */
    public void setAptitudConsumo(java.lang.String aptitudConsumo) {
        this.aptitudConsumo = aptitudConsumo;
    }


    /**
     * Gets the fechaInicioSuspension value for this DatosBasicosCompletoBean.
     * 
     * @return fechaInicioSuspension
     */
    public java.util.Date getFechaInicioSuspension() {
        return fechaInicioSuspension;
    }


    /**
     * Sets the fechaInicioSuspension value for this DatosBasicosCompletoBean.
     * 
     * @param fechaInicioSuspension
     */
    public void setFechaInicioSuspension(java.util.Date fechaInicioSuspension) {
        this.fechaInicioSuspension = fechaInicioSuspension;
    }


    /**
     * Gets the documentoSustitutivo value for this DatosBasicosCompletoBean.
     * 
     * @return documentoSustitutivo
     */
    public java.lang.Boolean getDocumentoSustitutivo() {
        return documentoSustitutivo;
    }


    /**
     * Sets the documentoSustitutivo value for this DatosBasicosCompletoBean.
     * 
     * @param documentoSustitutivo
     */
    public void setDocumentoSustitutivo(java.lang.Boolean documentoSustitutivo) {
        this.documentoSustitutivo = documentoSustitutivo;
    }


    /**
     * Gets the castrado value for this DatosBasicosCompletoBean.
     * 
     * @return castrado
     */
    public java.lang.Boolean getCastrado() {
        return castrado;
    }


    /**
     * Sets the castrado value for this DatosBasicosCompletoBean.
     * 
     * @param castrado
     */
    public void setCastrado(java.lang.Boolean castrado) {
        this.castrado = castrado;
    }


    /**
     * Gets the duplicado value for this DatosBasicosCompletoBean.
     * 
     * @return duplicado
     */
    public java.lang.Boolean getDuplicado() {
        return duplicado;
    }


    /**
     * Sets the duplicado value for this DatosBasicosCompletoBean.
     * 
     * @param duplicado
     */
    public void setDuplicado(java.lang.Boolean duplicado) {
        this.duplicado = duplicado;
    }


    /**
     * Gets the condicionesEspeciales value for this DatosBasicosCompletoBean.
     * 
     * @return condicionesEspeciales
     */
    public riia_ws.veterinarios.beans.DatosBasicosCondicionEspecialBean[] getCondicionesEspeciales() {
        return condicionesEspeciales;
    }


    /**
     * Sets the condicionesEspeciales value for this DatosBasicosCompletoBean.
     * 
     * @param condicionesEspeciales
     */
    public void setCondicionesEspeciales(riia_ws.veterinarios.beans.DatosBasicosCondicionEspecialBean[] condicionesEspeciales) {
        this.condicionesEspeciales = condicionesEspeciales;
    }


    /**
     * Gets the titulares value for this DatosBasicosCompletoBean.
     * 
     * @return titulares
     */
    public riia_ws.veterinarios.beans.DatosBasicosTitularBean[] getTitulares() {
        return titulares;
    }


    /**
     * Sets the titulares value for this DatosBasicosCompletoBean.
     * 
     * @param titulares
     */
    public void setTitulares(riia_ws.veterinarios.beans.DatosBasicosTitularBean[] titulares) {
        this.titulares = titulares;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosBasicosCompletoBean)) return false;
        DatosBasicosCompletoBean other = (DatosBasicosCompletoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosBasicos==null && other.getDatosBasicos()==null) || 
             (this.datosBasicos!=null &&
              this.datosBasicos.equals(other.getDatosBasicos()))) &&
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
            ((this.documentoSustitutivo==null && other.getDocumentoSustitutivo()==null) || 
             (this.documentoSustitutivo!=null &&
              this.documentoSustitutivo.equals(other.getDocumentoSustitutivo()))) &&
            ((this.castrado==null && other.getCastrado()==null) || 
             (this.castrado!=null &&
              this.castrado.equals(other.getCastrado()))) &&
            ((this.duplicado==null && other.getDuplicado()==null) || 
             (this.duplicado!=null &&
              this.duplicado.equals(other.getDuplicado()))) &&
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
        int _hashCode = 1;
        if (getDatosBasicos() != null) {
            _hashCode += getDatosBasicos().hashCode();
        }
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
        if (getDocumentoSustitutivo() != null) {
            _hashCode += getDocumentoSustitutivo().hashCode();
        }
        if (getCastrado() != null) {
            _hashCode += getCastrado().hashCode();
        }
        if (getDuplicado() != null) {
            _hashCode += getDuplicado().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(DatosBasicosCompletoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.veterinarios.riia_ws", "DatosBasicosCompletoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosBasicos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datosBasicos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.veterinarios.riia_ws", "DatosBasicosBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiabilidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fiabilidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCapa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCapa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoLugarNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoLugarNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lugarNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lugarNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaMuerte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaMuerte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explotacionMuerte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "explotacionMuerte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoMuerte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTipoMuerte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoMuerte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoMuerte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoOrientacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoOrientacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orientacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orientacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreComercial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreComercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAptitudConsumo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoAptitudConsumo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aptitudConsumo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aptitudConsumo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicioSuspension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaInicioSuspension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoSustitutivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentoSustitutivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("castrado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "castrado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duplicado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicionesEspeciales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condicionesEspeciales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.veterinarios.riia_ws", "DatosBasicosCondicionEspecialBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulares");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titulares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.veterinarios.riia_ws", "DatosBasicosTitularBean"));
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
