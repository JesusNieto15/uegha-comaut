/**
 * ExplotacionBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package riia_ws.veterinarios.beans;

public class ExplotacionBean  implements java.io.Serializable {
    private java.lang.String codExplotacion;

    private java.lang.String existe;

    private java.lang.String nombre;

    public ExplotacionBean() {
    }

    public ExplotacionBean(
           java.lang.String codExplotacion,
           java.lang.String existe,
           java.lang.String nombre) {
           this.codExplotacion = codExplotacion;
           this.existe = existe;
           this.nombre = nombre;
    }


    /**
     * Gets the codExplotacion value for this ExplotacionBean.
     * 
     * @return codExplotacion
     */
    public java.lang.String getCodExplotacion() {
        return codExplotacion;
    }


    /**
     * Sets the codExplotacion value for this ExplotacionBean.
     * 
     * @param codExplotacion
     */
    public void setCodExplotacion(java.lang.String codExplotacion) {
        this.codExplotacion = codExplotacion;
    }


    /**
     * Gets the existe value for this ExplotacionBean.
     * 
     * @return existe
     */
    public java.lang.String getExiste() {
        return existe;
    }


    /**
     * Sets the existe value for this ExplotacionBean.
     * 
     * @param existe
     */
    public void setExiste(java.lang.String existe) {
        this.existe = existe;
    }


    /**
     * Gets the nombre value for this ExplotacionBean.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ExplotacionBean.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExplotacionBean)) return false;
        ExplotacionBean other = (ExplotacionBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codExplotacion==null && other.getCodExplotacion()==null) || 
             (this.codExplotacion!=null &&
              this.codExplotacion.equals(other.getCodExplotacion()))) &&
            ((this.existe==null && other.getExiste()==null) || 
             (this.existe!=null &&
              this.existe.equals(other.getExiste()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre())));
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
        if (getCodExplotacion() != null) {
            _hashCode += getCodExplotacion().hashCode();
        }
        if (getExiste() != null) {
            _hashCode += getExiste().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExplotacionBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.veterinarios.riia_ws", "ExplotacionBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codExplotacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codExplotacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "existe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
