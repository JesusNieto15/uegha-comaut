/**
 * ResultadoBorradoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package riia_ws.veterinarios.beans;

public class ResultadoBorradoBean  implements java.io.Serializable {
    private java.lang.String borradoOK;

    private java.lang.String codigoUELN;

    private java.lang.String codigoEspecie;

    private java.lang.String codigoError;

    private java.lang.String descripcionError;

    public ResultadoBorradoBean() {
    }

    public ResultadoBorradoBean(
           java.lang.String borradoOK,
           java.lang.String codigoUELN,
           java.lang.String codigoEspecie,
           java.lang.String codigoError,
           java.lang.String descripcionError) {
           this.borradoOK = borradoOK;
           this.codigoUELN = codigoUELN;
           this.codigoEspecie = codigoEspecie;
           this.codigoError = codigoError;
           this.descripcionError = descripcionError;
    }


    /**
     * Gets the borradoOK value for this ResultadoBorradoBean.
     * 
     * @return borradoOK
     */
    public java.lang.String getBorradoOK() {
        return borradoOK;
    }


    /**
     * Sets the borradoOK value for this ResultadoBorradoBean.
     * 
     * @param borradoOK
     */
    public void setBorradoOK(java.lang.String borradoOK) {
        this.borradoOK = borradoOK;
    }


    /**
     * Gets the codigoUELN value for this ResultadoBorradoBean.
     * 
     * @return codigoUELN
     */
    public java.lang.String getCodigoUELN() {
        return codigoUELN;
    }


    /**
     * Sets the codigoUELN value for this ResultadoBorradoBean.
     * 
     * @param codigoUELN
     */
    public void setCodigoUELN(java.lang.String codigoUELN) {
        this.codigoUELN = codigoUELN;
    }


    /**
     * Gets the codigoEspecie value for this ResultadoBorradoBean.
     * 
     * @return codigoEspecie
     */
    public java.lang.String getCodigoEspecie() {
        return codigoEspecie;
    }


    /**
     * Sets the codigoEspecie value for this ResultadoBorradoBean.
     * 
     * @param codigoEspecie
     */
    public void setCodigoEspecie(java.lang.String codigoEspecie) {
        this.codigoEspecie = codigoEspecie;
    }


    /**
     * Gets the codigoError value for this ResultadoBorradoBean.
     * 
     * @return codigoError
     */
    public java.lang.String getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this ResultadoBorradoBean.
     * 
     * @param codigoError
     */
    public void setCodigoError(java.lang.String codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the descripcionError value for this ResultadoBorradoBean.
     * 
     * @return descripcionError
     */
    public java.lang.String getDescripcionError() {
        return descripcionError;
    }


    /**
     * Sets the descripcionError value for this ResultadoBorradoBean.
     * 
     * @param descripcionError
     */
    public void setDescripcionError(java.lang.String descripcionError) {
        this.descripcionError = descripcionError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoBorradoBean)) return false;
        ResultadoBorradoBean other = (ResultadoBorradoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.borradoOK==null && other.getBorradoOK()==null) || 
             (this.borradoOK!=null &&
              this.borradoOK.equals(other.getBorradoOK()))) &&
            ((this.codigoUELN==null && other.getCodigoUELN()==null) || 
             (this.codigoUELN!=null &&
              this.codigoUELN.equals(other.getCodigoUELN()))) &&
            ((this.codigoEspecie==null && other.getCodigoEspecie()==null) || 
             (this.codigoEspecie!=null &&
              this.codigoEspecie.equals(other.getCodigoEspecie()))) &&
            ((this.codigoError==null && other.getCodigoError()==null) || 
             (this.codigoError!=null &&
              this.codigoError.equals(other.getCodigoError()))) &&
            ((this.descripcionError==null && other.getDescripcionError()==null) || 
             (this.descripcionError!=null &&
              this.descripcionError.equals(other.getDescripcionError())));
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
        if (getBorradoOK() != null) {
            _hashCode += getBorradoOK().hashCode();
        }
        if (getCodigoUELN() != null) {
            _hashCode += getCodigoUELN().hashCode();
        }
        if (getCodigoEspecie() != null) {
            _hashCode += getCodigoEspecie().hashCode();
        }
        if (getCodigoError() != null) {
            _hashCode += getCodigoError().hashCode();
        }
        if (getDescripcionError() != null) {
            _hashCode += getDescripcionError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultadoBorradoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.veterinarios.riia_ws", "ResultadoBorradoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("borradoOK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "borradoOK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUELN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoUELN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEspecie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoEspecie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionError"));
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
