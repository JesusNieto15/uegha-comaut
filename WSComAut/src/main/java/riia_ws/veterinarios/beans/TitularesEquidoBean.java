/**
 * TitularesEquidoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package riia_ws.veterinarios.beans;

public class TitularesEquidoBean  implements java.io.Serializable {
    private java.lang.String c_cifnif;

    private java.lang.String d_nombre;

    private java.lang.String f_fin_titu;

    private java.lang.String f_ini_titu;

    public TitularesEquidoBean() {
    }

    public TitularesEquidoBean(
           java.lang.String c_cifnif,
           java.lang.String d_nombre,
           java.lang.String f_fin_titu,
           java.lang.String f_ini_titu) {
           this.c_cifnif = c_cifnif;
           this.d_nombre = d_nombre;
           this.f_fin_titu = f_fin_titu;
           this.f_ini_titu = f_ini_titu;
    }


    /**
     * Gets the c_cifnif value for this TitularesEquidoBean.
     * 
     * @return c_cifnif
     */
    public java.lang.String getC_cifnif() {
        return c_cifnif;
    }


    /**
     * Sets the c_cifnif value for this TitularesEquidoBean.
     * 
     * @param c_cifnif
     */
    public void setC_cifnif(java.lang.String c_cifnif) {
        this.c_cifnif = c_cifnif;
    }


    /**
     * Gets the d_nombre value for this TitularesEquidoBean.
     * 
     * @return d_nombre
     */
    public java.lang.String getD_nombre() {
        return d_nombre;
    }


    /**
     * Sets the d_nombre value for this TitularesEquidoBean.
     * 
     * @param d_nombre
     */
    public void setD_nombre(java.lang.String d_nombre) {
        this.d_nombre = d_nombre;
    }


    /**
     * Gets the f_fin_titu value for this TitularesEquidoBean.
     * 
     * @return f_fin_titu
     */
    public java.lang.String getF_fin_titu() {
        return f_fin_titu;
    }


    /**
     * Sets the f_fin_titu value for this TitularesEquidoBean.
     * 
     * @param f_fin_titu
     */
    public void setF_fin_titu(java.lang.String f_fin_titu) {
        this.f_fin_titu = f_fin_titu;
    }


    /**
     * Gets the f_ini_titu value for this TitularesEquidoBean.
     * 
     * @return f_ini_titu
     */
    public java.lang.String getF_ini_titu() {
        return f_ini_titu;
    }


    /**
     * Sets the f_ini_titu value for this TitularesEquidoBean.
     * 
     * @param f_ini_titu
     */
    public void setF_ini_titu(java.lang.String f_ini_titu) {
        this.f_ini_titu = f_ini_titu;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TitularesEquidoBean)) return false;
        TitularesEquidoBean other = (TitularesEquidoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.c_cifnif==null && other.getC_cifnif()==null) || 
             (this.c_cifnif!=null &&
              this.c_cifnif.equals(other.getC_cifnif()))) &&
            ((this.d_nombre==null && other.getD_nombre()==null) || 
             (this.d_nombre!=null &&
              this.d_nombre.equals(other.getD_nombre()))) &&
            ((this.f_fin_titu==null && other.getF_fin_titu()==null) || 
             (this.f_fin_titu!=null &&
              this.f_fin_titu.equals(other.getF_fin_titu()))) &&
            ((this.f_ini_titu==null && other.getF_ini_titu()==null) || 
             (this.f_ini_titu!=null &&
              this.f_ini_titu.equals(other.getF_ini_titu())));
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
        if (getC_cifnif() != null) {
            _hashCode += getC_cifnif().hashCode();
        }
        if (getD_nombre() != null) {
            _hashCode += getD_nombre().hashCode();
        }
        if (getF_fin_titu() != null) {
            _hashCode += getF_fin_titu().hashCode();
        }
        if (getF_ini_titu() != null) {
            _hashCode += getF_ini_titu().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TitularesEquidoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.veterinarios.riia_ws", "TitularesEquidoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("c_cifnif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "c_cifnif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("d_nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "d_nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("f_fin_titu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f_fin_titu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("f_ini_titu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f_ini_titu"));
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
