//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0.1 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.04.20 a las 09:48:27 AM UTC 
//


package com.jnr15.wsjcyl.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosTituAnimalTipo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosTituAnimalTipo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="c_especie_id" type="{}especieIdType"/&gt;
 *         &lt;element name="c_iden_anim" type="{}idenAnimType"/&gt;
 *         &lt;element name="f_ini_titu" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="c_cifnif" type="{}CIFNIFType"/&gt;
 *         &lt;element name="d_nombre" type="{}nombreTitType" minOccurs="0"/&gt;
 *         &lt;element name="d_apellidos" type="{}apellidosTitType"/&gt;
 *         &lt;element name="d_calle" type="{}calleTitType"/&gt;
 *         &lt;element name="c_provincia" type="{}provIdTitType"/&gt;
 *         &lt;element name="c_municipio" type="{}muniIdTitType"/&gt;
 *         &lt;element name="c_postal" type="{}CPTitType"/&gt;
 *         &lt;element name="d_telefono" type="{}telefonoTitType" minOccurs="0"/&gt;
 *         &lt;element name="c_cifnif_repr" type="{}CIFNIFType" minOccurs="0"/&gt;
 *         &lt;element name="d_nombre_repr" type="{}nombreTitType" minOccurs="0"/&gt;
 *         &lt;element name="d_apellidos_repr" type="{}apellidosTitType" minOccurs="0"/&gt;
 *         &lt;element name="a_cea" type="{}CEAType" minOccurs="0"/&gt;
 *         &lt;element name="c_pais_resi_tit" type="{}paisResiType" minOccurs="0"/&gt;
 *         &lt;element name="c_tipo_doc_tit" type="{}tipoDocuType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosTituAnimalTipo", propOrder = {
    "cEspecieId",
    "cIdenAnim",
    "fIniTitu",
    "cCifnif",
    "dNombre",
    "dApellidos",
    "dCalle",
    "cProvincia",
    "cMunicipio",
    "cPostal",
    "dTelefono",
    "cCifnifRepr",
    "dNombreRepr",
    "dApellidosRepr",
    "aCea",
    "cPaisResiTit",
    "cTipoDocTit"
})
public class DatosTituAnimalTipo {

    @XmlElement(name = "c_especie_id", required = true)
    protected String cEspecieId;
    @XmlElement(name = "c_iden_anim", required = true)
    protected String cIdenAnim;
    @XmlElement(name = "f_ini_titu", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fIniTitu;
    @XmlList
    @XmlElement(name = "c_cifnif", required = true)
    protected List<String> cCifnif;
    @XmlElement(name = "d_nombre")
    protected String dNombre;
    @XmlElement(name = "d_apellidos", required = true)
    protected String dApellidos;
    @XmlElement(name = "d_calle", required = true)
    protected String dCalle;
    @XmlElement(name = "c_provincia")
    @XmlSchemaType(name = "integer")
    protected int cProvincia;
    @XmlElement(name = "c_municipio")
    @XmlSchemaType(name = "integer")
    protected int cMunicipio;
    @XmlElement(name = "c_postal", required = true)
    protected String cPostal;
    @XmlElement(name = "d_telefono")
    protected String dTelefono;
    @XmlList
    @XmlElement(name = "c_cifnif_repr")
    protected List<String> cCifnifRepr;
    @XmlElement(name = "d_nombre_repr")
    protected String dNombreRepr;
    @XmlElement(name = "d_apellidos_repr")
    protected String dApellidosRepr;
    @XmlElement(name = "a_cea")
    protected String aCea;
    @XmlElement(name = "c_pais_resi_tit")
    protected String cPaisResiTit;
    @XmlElement(name = "c_tipo_doc_tit")
    protected String cTipoDocTit;

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

    /**
     * Obtiene el valor de la propiedad fIniTitu.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFIniTitu() {
        return fIniTitu;
    }

    /**
     * Define el valor de la propiedad fIniTitu.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFIniTitu(XMLGregorianCalendar value) {
        this.fIniTitu = value;
    }

    /**
     * Gets the value of the cCifnif property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cCifnif property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCifnif().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCCifnif() {
        if (cCifnif == null) {
            cCifnif = new ArrayList<String>();
        }
        return this.cCifnif;
    }

    /**
     * Obtiene el valor de la propiedad dNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNombre() {
        return dNombre;
    }

    /**
     * Define el valor de la propiedad dNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNombre(String value) {
        this.dNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad dApellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDApellidos() {
        return dApellidos;
    }

    /**
     * Define el valor de la propiedad dApellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDApellidos(String value) {
        this.dApellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad dCalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCalle() {
        return dCalle;
    }

    /**
     * Define el valor de la propiedad dCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCalle(String value) {
        this.dCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad cProvincia.
     * 
     */
    public int getCProvincia() {
        return cProvincia;
    }

    /**
     * Define el valor de la propiedad cProvincia.
     * 
     */
    public void setCProvincia(int value) {
        this.cProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad cMunicipio.
     * 
     */
    public int getCMunicipio() {
        return cMunicipio;
    }

    /**
     * Define el valor de la propiedad cMunicipio.
     * 
     */
    public void setCMunicipio(int value) {
        this.cMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad cPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPostal() {
        return cPostal;
    }

    /**
     * Define el valor de la propiedad cPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPostal(String value) {
        this.cPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad dTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTelefono() {
        return dTelefono;
    }

    /**
     * Define el valor de la propiedad dTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTelefono(String value) {
        this.dTelefono = value;
    }

    /**
     * Gets the value of the cCifnifRepr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cCifnifRepr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCifnifRepr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCCifnifRepr() {
        if (cCifnifRepr == null) {
            cCifnifRepr = new ArrayList<String>();
        }
        return this.cCifnifRepr;
    }

    /**
     * Obtiene el valor de la propiedad dNombreRepr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNombreRepr() {
        return dNombreRepr;
    }

    /**
     * Define el valor de la propiedad dNombreRepr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNombreRepr(String value) {
        this.dNombreRepr = value;
    }

    /**
     * Obtiene el valor de la propiedad dApellidosRepr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDApellidosRepr() {
        return dApellidosRepr;
    }

    /**
     * Define el valor de la propiedad dApellidosRepr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDApellidosRepr(String value) {
        this.dApellidosRepr = value;
    }

    /**
     * Obtiene el valor de la propiedad aCea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACea() {
        return aCea;
    }

    /**
     * Define el valor de la propiedad aCea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACea(String value) {
        this.aCea = value;
    }

    /**
     * Obtiene el valor de la propiedad cPaisResiTit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPaisResiTit() {
        return cPaisResiTit;
    }

    /**
     * Define el valor de la propiedad cPaisResiTit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPaisResiTit(String value) {
        this.cPaisResiTit = value;
    }

    /**
     * Obtiene el valor de la propiedad cTipoDocTit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipoDocTit() {
        return cTipoDocTit;
    }

    /**
     * Define el valor de la propiedad cTipoDocTit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipoDocTit(String value) {
        this.cTipoDocTit = value;
    }

}
