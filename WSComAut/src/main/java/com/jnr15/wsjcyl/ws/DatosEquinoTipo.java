//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.08 a las 12:12:01 PM CEST 
//


package com.jnr15.wsjcyl.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosEquinoTipo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosEquinoTipo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosAnimal" type="{}datosAnimalTipo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosEquinoTipo", propOrder = {
    "datosAnimal"
})
public class DatosEquinoTipo {

    @XmlElement(required = true)
    protected DatosAnimalTipo datosAnimal;

    /**
     * Obtiene el valor de la propiedad datosAnimal.
     * 
     * @return
     *     possible object is
     *     {@link DatosAnimalTipo }
     *     
     */
    public DatosAnimalTipo getDatosAnimal() {
        return datosAnimal;
    }

    /**
     * Define el valor de la propiedad datosAnimal.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosAnimalTipo }
     *     
     */
    public void setDatosAnimal(DatosAnimalTipo value) {
        this.datosAnimal = value;
    }

}
