/**
 * RespuestaResultadoSolicitudes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsjuntaex.ws;

public class RespuestaResultadoSolicitudes  implements java.io.Serializable {
    private com.jnr15.wsjuntaex.ws.Solicitudes[] listaSolicitudes;

    public RespuestaResultadoSolicitudes() {
    }

    public RespuestaResultadoSolicitudes(
           com.jnr15.wsjuntaex.ws.Solicitudes[] listaSolicitudes) {
           this.listaSolicitudes = listaSolicitudes;
    }


    /**
     * Gets the listaSolicitudes value for this RespuestaResultadoSolicitudes.
     * 
     * @return listaSolicitudes
     */
    public com.jnr15.wsjuntaex.ws.Solicitudes[] getListaSolicitudes() {
        return listaSolicitudes;
    }


    /**
     * Sets the listaSolicitudes value for this RespuestaResultadoSolicitudes.
     * 
     * @param listaSolicitudes
     */
    public void setListaSolicitudes(com.jnr15.wsjuntaex.ws.Solicitudes[] listaSolicitudes) {
        this.listaSolicitudes = listaSolicitudes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaResultadoSolicitudes)) return false;
        RespuestaResultadoSolicitudes other = (RespuestaResultadoSolicitudes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaSolicitudes==null && other.getListaSolicitudes()==null) || 
             (this.listaSolicitudes!=null &&
              java.util.Arrays.equals(this.listaSolicitudes, other.getListaSolicitudes())));
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
        if (getListaSolicitudes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaSolicitudes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaSolicitudes(), i);
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
        new org.apache.axis.description.TypeDesc(RespuestaResultadoSolicitudes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "RespuestaResultadoSolicitudes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaSolicitudes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "ListaSolicitudes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "Solicitudes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfEquinos", "Solicitudes"));
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
