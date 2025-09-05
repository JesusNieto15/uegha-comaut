/**
 * DatosBasicosCondicionEspecialBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package riia_ws.veterinarios.beans;

public class DatosBasicosCondicionEspecialBean  implements java.io.Serializable {
    private java.util.Date fecha;

    private java.lang.String codigoCondicionEspecial;

    private java.lang.String condicionEspecial;

    public DatosBasicosCondicionEspecialBean() {
    }

    public DatosBasicosCondicionEspecialBean(
           java.util.Date fecha,
           java.lang.String codigoCondicionEspecial,
           java.lang.String condicionEspecial) {
           this.fecha = fecha;
           this.codigoCondicionEspecial = codigoCondicionEspecial;
           this.condicionEspecial = condicionEspecial;
    }


    /**
     * Gets the fecha value for this DatosBasicosCondicionEspecialBean.
     * 
     * @return fecha
     */
    public java.util.Date getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this DatosBasicosCondicionEspecialBean.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the codigoCondicionEspecial value for this DatosBasicosCondicionEspecialBean.
     * 
     * @return codigoCondicionEspecial
     */
    public java.lang.String getCodigoCondicionEspecial() {
        return codigoCondicionEspecial;
    }


    /**
     * Sets the codigoCondicionEspecial value for this DatosBasicosCondicionEspecialBean.
     * 
     * @param codigoCondicionEspecial
     */
    public void setCodigoCondicionEspecial(java.lang.String codigoCondicionEspecial) {
        this.codigoCondicionEspecial = codigoCondicionEspecial;
    }


    /**
     * Gets the condicionEspecial value for this DatosBasicosCondicionEspecialBean.
     * 
     * @return condicionEspecial
     */
    public java.lang.String getCondicionEspecial() {
        return condicionEspecial;
    }


    /**
     * Sets the condicionEspecial value for this DatosBasicosCondicionEspecialBean.
     * 
     * @param condicionEspecial
     */
    public void setCondicionEspecial(java.lang.String condicionEspecial) {
        this.condicionEspecial = condicionEspecial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosBasicosCondicionEspecialBean)) return false;
        DatosBasicosCondicionEspecialBean other = (DatosBasicosCondicionEspecialBean) obj;
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
        new org.apache.axis.description.TypeDesc(DatosBasicosCondicionEspecialBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.veterinarios.riia_ws", "DatosBasicosCondicionEspecialBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCondicionEspecial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCondicionEspecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicionEspecial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condicionEspecial"));
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
