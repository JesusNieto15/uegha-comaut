//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.08 a las 12:12:01 PM CEST 
//

//******************** nota *************************
//Para generar las clases desde ficheros xsd hacemos uso del comando xcj (herramienta de generación de clases desde ficheros xsd suministrada por JAXB)
//el comando sería: xjc -d carpeta_destino -p nombrePaquete fichero.xsd
//***************************************************

package com.jnr15.wsjcyl.ws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsjcyl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DatosEquino_QNAME = new QName("", "datosEquino");
    private final static QName _DatosTituEq_QNAME = new QName("", "datosTituEq");
    private final static QName _DatosBorradoAnim_QNAME = new QName("","borradoAnim");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsjcyl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatosEquinoTipo }
     * 
     */
    public DatosEquinoTipo createDatosEquinoTipo() {
        return new DatosEquinoTipo();
    }

    /**
     * Create an instance of {@link DatosAnimalTipo }
     * 
     */
    public DatosAnimalTipo createDatosAnimalTipo() {
        return new DatosAnimalTipo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosEquinoTipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosEquinoTipo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "datosEquino")
    public JAXBElement<DatosEquinoTipo> createDatosEquino(DatosEquinoTipo value) {
        return new JAXBElement<DatosEquinoTipo>(_DatosEquino_QNAME, DatosEquinoTipo.class, null, value);
    }
    
     /**
     * Create an instance of {@link DatosTituEqTipo }
     * 
     */
    public DatosTituEqTipo createDatosTituEqTipo() {
        return new DatosTituEqTipo();
    }
    
    /**
     * Create an instance of {@link DatosTituAnimalTipo }
     * 
     */
    public DatosTituAnimalTipo createDatosTituAnimalTipo() {
        return new DatosTituAnimalTipo();
    }
    
    /**
     * Create an instance of {@link DatosAnimalTipoBorradoAnim }
     * 
     */
    public DatosAnimalTipoBorradoAnim createDatosAnimalTipoBorradoAnim(){
        return new DatosAnimalTipoBorradoAnim();
    }
    
    /**
     * Create an instance of {@link DatosBorradoAnimTipo }
     * 
     */
    public DatosBorradoAnimTipo createDatosBorradoAnimTipo(){
        return new DatosBorradoAnimTipo();
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosTituEqTipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosTituEqTipo }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "datosTituEq")
    public JAXBElement<DatosTituEqTipo> createDatosTituEq(DatosTituEqTipo value) {
        return new JAXBElement<DatosTituEqTipo>(_DatosTituEq_QNAME, DatosTituEqTipo.class, null, value);
    }
    
    @XmlElementDecl(namespace="",name="borradoAnim")
    public JAXBElement<DatosBorradoAnimTipo> createDatosBorradoAnim(DatosBorradoAnimTipo value){
        return new JAXBElement<DatosBorradoAnimTipo>(_DatosBorradoAnim_QNAME,DatosBorradoAnimTipo.class,null,value);
    }

}
