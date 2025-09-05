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
@XmlType(name = "datosBorradoAnimTipo", propOrder = {
    "datosAnimal"
})
public class DatosBorradoAnimTipo {
    
    @XmlElement(required = true)
    protected DatosAnimalTipoBorradoAnim datosAnimal;

    public DatosAnimalTipoBorradoAnim getDatosAnimal() {
        return datosAnimal;
    }

    public void setDatosAnimal(DatosAnimalTipoBorradoAnim datosAnimal) {
        this.datosAnimal = datosAnimal;
    }
}
