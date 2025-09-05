/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.cantabria.ws;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;

/**
 *
 * @author jesus
 */
@XmlRootElement(name = "TT_LOTE")
@XmlType(propOrder = {"error","cr_fichero","cr_fc_com","cr_persona","version"})
public class Lote {
    
    private Error error;
    private String cr_fichero;
    private String cr_fc_com;
    private String cr_persona;
    private String version;
    //private Explot explot;
    
    
    public Lote(){
        error = new Error();
        this.cr_fichero="";
    }
    
    //@XmlElement(name="error",required = true)
    public Error getError(){
        return error;
    }
    
    public void setError(Error error){
        this.error=error;
    }
    
    @XmlElement
    public String getCr_fichero() {
        return cr_fichero;
    }

    public void setCr_fichero(String cr_fichero) {
        this.cr_fichero = cr_fichero;
    }
    
    @XmlElement
    public String getCr_fc_com() {
        return cr_fc_com;
    }

    public void setCr_fc_com(String cr_fc_com) {
        this.cr_fc_com = cr_fc_com;
    }
    
    @XmlElement
    public String getCr_persona() {
        return cr_persona;
    }

    public void setCr_persona(String cr_persona) {
        this.cr_persona = cr_persona;
    }
    
    @XmlElement
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    } 
}

class Error {
    
    @XmlAttribute
    public String getErr(){
        return "";
    }
}

class Explot {
    @XmlAttribute(name="ex_id_explot")
    private String atrRega;
    @XmlValue
    private String valRega;
    @XmlElement(name="error")
    private Error error;
    @XmlElement(name="TT_IDS_EQUIDO")
    private IdsEquido idsEquido;
}

class IdsEquido {
    @XmlElement(name="error")
    private Error error;
}
