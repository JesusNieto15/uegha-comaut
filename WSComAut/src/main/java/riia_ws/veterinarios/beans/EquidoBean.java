/**
 * EquidoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package riia_ws.veterinarios.beans;

public class EquidoBean  implements java.io.Serializable {
    private java.lang.String c_especie_id;

    private java.lang.String c_codigo_ueln;

    private java.lang.String c_iden_elec;

    private riia_ws.veterinarios.beans.TitularesEquidoBean[] titulares;

    private java.lang.String error;

    public EquidoBean() {
    }

    public EquidoBean(
           java.lang.String c_especie_id,
           java.lang.String c_codigo_ueln,
           java.lang.String c_iden_elec,
           riia_ws.veterinarios.beans.TitularesEquidoBean[] titulares,
           java.lang.String error) {
           this.c_especie_id = c_especie_id;
           this.c_codigo_ueln = c_codigo_ueln;
           this.c_iden_elec = c_iden_elec;
           this.titulares = titulares;
           this.error = error;
    }


    /**
     * Gets the c_especie_id value for this EquidoBean.
     * 
     * @return c_especie_id
     */
    public java.lang.String getC_especie_id() {
        return c_especie_id;
    }


    /**
     * Sets the c_especie_id value for this EquidoBean.
     * 
     * @param c_especie_id
     */
    public void setC_especie_id(java.lang.String c_especie_id) {
        this.c_especie_id = c_especie_id;
    }


    /**
     * Gets the c_codigo_ueln value for this EquidoBean.
     * 
     * @return c_codigo_ueln
     */
    public java.lang.String getC_codigo_ueln() {
        return c_codigo_ueln;
    }


    /**
     * Sets the c_codigo_ueln value for this EquidoBean.
     * 
     * @param c_codigo_ueln
     */
    public void setC_codigo_ueln(java.lang.String c_codigo_ueln) {
        this.c_codigo_ueln = c_codigo_ueln;
    }


    /**
     * Gets the c_iden_elec value for this EquidoBean.
     * 
     * @return c_iden_elec
     */
    public java.lang.String getC_iden_elec() {
        return c_iden_elec;
    }


    /**
     * Sets the c_iden_elec value for this EquidoBean.
     * 
     * @param c_iden_elec
     */
    public void setC_iden_elec(java.lang.String c_iden_elec) {
        this.c_iden_elec = c_iden_elec;
    }


    /**
     * Gets the titulares value for this EquidoBean.
     * 
     * @return titulares
     */
    public riia_ws.veterinarios.beans.TitularesEquidoBean[] getTitulares() {
        return titulares;
    }


    /**
     * Sets the titulares value for this EquidoBean.
     * 
     * @param titulares
     */
    public void setTitulares(riia_ws.veterinarios.beans.TitularesEquidoBean[] titulares) {
        this.titulares = titulares;
    }


    /**
     * Gets the error value for this EquidoBean.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this EquidoBean.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EquidoBean)) return false;
        EquidoBean other = (EquidoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.c_especie_id==null && other.getC_especie_id()==null) || 
             (this.c_especie_id!=null &&
              this.c_especie_id.equals(other.getC_especie_id()))) &&
            ((this.c_codigo_ueln==null && other.getC_codigo_ueln()==null) || 
             (this.c_codigo_ueln!=null &&
              this.c_codigo_ueln.equals(other.getC_codigo_ueln()))) &&
            ((this.c_iden_elec==null && other.getC_iden_elec()==null) || 
             (this.c_iden_elec!=null &&
              this.c_iden_elec.equals(other.getC_iden_elec()))) &&
            ((this.titulares==null && other.getTitulares()==null) || 
             (this.titulares!=null &&
              java.util.Arrays.equals(this.titulares, other.getTitulares()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getC_especie_id() != null) {
            _hashCode += getC_especie_id().hashCode();
        }
        if (getC_codigo_ueln() != null) {
            _hashCode += getC_codigo_ueln().hashCode();
        }
        if (getC_iden_elec() != null) {
            _hashCode += getC_iden_elec().hashCode();
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
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EquidoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.veterinarios.riia_ws", "EquidoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("c_especie_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "c_especie_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("c_codigo_ueln");
        elemField.setXmlName(new javax.xml.namespace.QName("", "c_codigo_ueln"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("c_iden_elec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "c_iden_elec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulares");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titulares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans.veterinarios.riia_ws", "TitularesEquidoBean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
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
