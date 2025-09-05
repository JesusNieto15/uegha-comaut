//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.04.20 a las 09:48:27 AM UTC 
//


package com.jnr15.wsjcyl.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosTituEqTipo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosTituEqTipo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosTituAnimal" type="{}datosTituAnimalTipo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosTituEqTipo", propOrder = {
    "datosTituAnimal"
})
public class DatosTituEqTipo {

    @XmlElement(required = true)
    protected DatosTituAnimalTipo datosTituAnimal;

    /**
     * Obtiene el valor de la propiedad datosTituAnimal.
     * 
     * @return
     *     possible object is
     *     {@link DatosTituAnimalTipo }
     *     
     */
    public DatosTituAnimalTipo getDatosTituAnimal() {
        return datosTituAnimal;
    }

    /**
     * Define el valor de la propiedad datosTituAnimal.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosTituAnimalTipo }
     *     
     */
    public void setDatosTituAnimal(DatosTituAnimalTipo value) {
        this.datosTituAnimal = value;
    }

}
