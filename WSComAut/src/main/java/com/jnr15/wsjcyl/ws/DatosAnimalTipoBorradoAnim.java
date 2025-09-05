/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.wsjcyl.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author jesus
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosAnimal", propOrder = {
    "cEspecieId",
    "cIdenAnim"
})
public class DatosAnimalTipoBorradoAnim {
    
    @XmlElement(name = "c_especie_id", required = true)
    protected String cEspecieId;
    @XmlElement(name = "c_iden_anim", required = true)
    protected String cIdenAnim;
    
    /**
     * Obtiene el valor de la propiedad cEspecieId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEspecieId() {
        return cEspecieId;
    }

    /**
     * Define el valor de la propiedad cEspecieId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEspecieId(String value) {
        this.cEspecieId = value;
    }

    /**
     * Obtiene el valor de la propiedad cIdenAnim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIdenAnim() {
        return cIdenAnim;
    }

    /**
     * Define el valor de la propiedad cIdenAnim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIdenAnim(String value) {
        this.cIdenAnim = value;
    }
    
}
