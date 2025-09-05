//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.08 a las 12:12:01 PM CEST 
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
 * <p>Clase Java para datosAnimalTipo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosAnimalTipo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="c_especie_id" type="{}especieIdType"/&gt;
 *         &lt;element name="c_iden_anim" type="{}idenAnimType"/&gt;
 *         &lt;element name="c_raza_id" type="{}razaIdType"/&gt;
 *         &lt;element name="c_sexo_id" type="{}sexoIdType"/&gt;
 *         &lt;element name="f_nacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="c_expl_naci" type="{}CEASinFormatoType" minOccurs="0"/&gt;
 *         &lt;element name="c_pais_naci" type="{}paisIdType" minOccurs="0"/&gt;
 *         &lt;element name="f_muerte" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="c_expl_muer" type="{}CEAMuerType" minOccurs="0"/&gt;
 *         &lt;element name="c_tipo_muer_id" type="{}tipoMuerIdType" minOccurs="0"/&gt;
 *         &lt;element name="f_identific" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="c_expl_iden" type="{}CEAType"/&gt;
 *         &lt;element name="d_observ" type="{}observType" minOccurs="0"/&gt;
 *         &lt;element name="c_iden_elec" type="{}idenElecType"/&gt;
 *         &lt;element name="c_tipo_iden_id" type="{}tipoIdenIdType"/&gt;
 *         &lt;element name="c_capa_id" type="{}capaIdType"/&gt;
 *         &lt;element name="c_orie_anim_id" type="{}orieAnimIdType"/&gt;
 *         &lt;element name="d_nombre_com" type="{}nombreAnimType" minOccurs="0"/&gt;
 *         &lt;element name="d_nombre_nac" type="{}nombreAnimType"/&gt;
 *         &lt;element name="c_apti_cons_id" type="{}aptiConsIdType"/&gt;
 *         &lt;element name="b_doc_susti" type="{}booleanType" minOccurs="0"/&gt;
 *         &lt;element name="f_ini_susp" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="c_tipo_lect_id" type="{}tipoLectIdType"/&gt;
 *         &lt;element name="c_id_altern_id" type="{}idAlternType" minOccurs="0"/&gt;
 *         &lt;element name="c_fiabilidad" type="{}condEspeIdType"/&gt;
 *         &lt;element name="b_tarj_inte" type="{}booleanType" minOccurs="0"/&gt;
 *         &lt;element name="b_castrado" type="{}booleanType"/&gt;
 *         &lt;element name="c_cifnif_vete" type="{}CIFNIFType" minOccurs="0"/&gt;
 *         &lt;element name="d_obs_cabeza" type="{}obsAnimType" minOccurs="0"/&gt;
 *         &lt;element name="d_obs_delizq" type="{}obsAnimType" minOccurs="0"/&gt;
 *         &lt;element name="d_obs_delder" type="{}obsAnimType" minOccurs="0"/&gt;
 *         &lt;element name="d_obs_traizq" type="{}obsAnimType" minOccurs="0"/&gt;
 *         &lt;element name="d_obs_trader" type="{}obsAnimType" minOccurs="0"/&gt;
 *         &lt;element name="d_obs_cuerpo" type="{}obsAnimType" minOccurs="0"/&gt;
 *         &lt;element name="d_obs_marcas" type="{}obsAnimType" minOccurs="0"/&gt;
 *         &lt;element name="d_img_izq" type="{}imagenType" minOccurs="0"/&gt;
 *         &lt;element name="d_img_der" type="{}imagenType" minOccurs="0"/&gt;
 *         &lt;element name="d_img_frontal" type="{}imagenType" minOccurs="0"/&gt;
 *         &lt;element name="d_img_resena" type="{}imagenTypeObl" minOccurs="0"/&gt;
 *         &lt;element name="f_ini_titu" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="c_expl_titu" type="{}CEAType" minOccurs="0"/&gt;
 *         &lt;element name="c_cifnif" type="{}CIFNIFType" minOccurs="0"/&gt;
 *         &lt;element name="d_nombre" type="{}nombreTitType" minOccurs="0"/&gt;
 *         &lt;element name="d_apellidos" type="{}apellidosTitType" minOccurs="0"/&gt;
 *         &lt;element name="d_calle" type="{}calleTitType" minOccurs="0"/&gt;
 *         &lt;element name="c_provincia" type="{}provIdTitType" minOccurs="0"/&gt;
 *         &lt;element name="c_municipio" type="{}muniIdTitType" minOccurs="0"/&gt;
 *         &lt;element name="c_postal" type="{}CPTitType" minOccurs="0"/&gt;
 *         &lt;element name="d_telefono" type="{}telefonoTitType" minOccurs="0"/&gt;
 *         &lt;element name="c_cifnif_repr" type="{}CIFNIFType" minOccurs="0"/&gt;
 *         &lt;element name="d_nombre_repr" type="{}nombreTitType" minOccurs="0"/&gt;
 *         &lt;element name="d_apellidos_repr" type="{}apellidosTitType" minOccurs="0"/&gt;
 *         &lt;element name="c_asociacion_id" type="{}asociacionType" minOccurs="0"/&gt;
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
@XmlType(name = "datosAnimalTipo", propOrder = {
    "cEspecieId",
    "cIdenAnim",
    "cRazaId",
    "cSexoId",
    "fNacimiento",
    "cExplNaci",
    "cPaisNaci",
    "fMuerte",
    "cExplMuer",
    "cTipoMuerId",
    "fIdentific",
    "cExplIden",
    "dObserv",
    "cIdenElec",
    "cTipoIdenId",
    "cCapaId",
    "cOrieAnimId",
    "dNombreCom",
    "dNombreNac",
    "cAptiConsId",
    "bDocSusti",
    "fIniSusp",
    "cTipoLectId",
    "cIdAlternId",
    "cFiabilidad",
    "bTarjInte",
    "bCastrado",
    "cCifnifVete",
    "dObsCabeza",
    "dObsDelizq",
    "dObsDelder",
    "dObsTraizq",
    "dObsTrader",
    "dObsCuerpo",
    "dObsMarcas",
    "dImgIzq",
    "dImgDer",
    "dImgFrontal",
    "dImgResena",
    "fIniTitu",
    "cExplTitu",
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
    "cAsociacionId",
    "cPaisResiTit",
    "cTipoDocTit"
})
public class DatosAnimalTipo {

    
    @XmlElement(name = "c_especie_id", required = true)
    protected String cEspecieId;
    @XmlElement(name = "c_iden_anim", required = true)
    protected String cIdenAnim;
    @XmlElement(name = "c_raza_id", required = true)
    protected String cRazaId;
    @XmlElement(name = "c_sexo_id", required = true)
    protected String cSexoId;
    @XmlElement(name = "f_nacimiento", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fNacimiento;
    @XmlElement(name = "c_expl_naci")
    protected String cExplNaci;
    @XmlElement(name = "c_pais_naci")
    protected String cPaisNaci;
    @XmlElement(name = "f_muerte")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fMuerte;
    @XmlElement(name = "c_expl_muer")
    protected String cExplMuer;
    @XmlElement(name = "c_tipo_muer_id")
    protected String cTipoMuerId;
    @XmlElement(name = "f_identific", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fIdentific;
    @XmlElement(name = "c_expl_iden", required = true)
    protected String cExplIden;
    @XmlElement(name = "d_observ")
    protected String dObserv;
    @XmlElement(name = "c_iden_elec", required = true)
    protected String cIdenElec;
    @XmlElement(name = "c_tipo_iden_id", required = true)
    protected String cTipoIdenId;
    @XmlElement(name = "c_capa_id", required = true)
    protected String cCapaId;
    @XmlElement(name = "c_orie_anim_id", required = true)
    protected String cOrieAnimId;
    @XmlElement(name = "d_nombre_com")
    protected String dNombreCom;
    @XmlElement(name = "d_nombre_nac", required = true)
    protected String dNombreNac;
    @XmlElement(name = "c_apti_cons_id", required = true)
    protected String cAptiConsId;
    @XmlElement(name = "b_doc_susti")
    protected String bDocSusti;
    @XmlElement(name = "f_ini_susp")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fIniSusp;
    @XmlElement(name = "c_tipo_lect_id", required = true)
    protected String cTipoLectId;
    @XmlElement(name = "c_id_altern_id")
    protected String cIdAlternId;
    @XmlElement(name = "c_fiabilidad", required = true)
    protected String cFiabilidad;
    @XmlElement(name = "b_tarj_inte")
    protected String bTarjInte;
    @XmlElement(name = "b_castrado", required = true)
    protected String bCastrado;
    @XmlList
    @XmlElement(name = "c_cifnif_vete")
    protected List<String> cCifnifVete;
    @XmlElement(name = "d_obs_cabeza")
    protected String dObsCabeza;
    @XmlElement(name = "d_obs_delizq")
    protected String dObsDelizq;
    @XmlElement(name = "d_obs_delder")
    protected String dObsDelder;
    @XmlElement(name = "d_obs_traizq")
    protected String dObsTraizq;
    @XmlElement(name = "d_obs_trader")
    protected String dObsTrader;
    @XmlElement(name = "d_obs_cuerpo")
    protected String dObsCuerpo;
    @XmlElement(name = "d_obs_marcas")
    protected String dObsMarcas;
    @XmlElement(name = "d_img_izq")
    protected String dImgIzq;
    @XmlElement(name = "d_img_der")
    protected String dImgDer;
    @XmlElement(name = "d_img_frontal")
    protected String dImgFrontal;
    @XmlElement(name = "d_img_resena")
    protected String dImgResena;
    @XmlElement(name = "f_ini_titu")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fIniTitu;
    @XmlElement(name = "c_expl_titu")
    protected String cExplTitu;
    @XmlList
    @XmlElement(name = "c_cifnif")
    protected List<String> cCifnif;
    @XmlElement(name = "d_nombre")
    protected String dNombre;
    @XmlElement(name = "d_apellidos")
    protected String dApellidos;
    @XmlElement(name = "d_calle")
    protected String dCalle;
    @XmlElement(name = "c_provincia")
    @XmlSchemaType(name = "integer")
    protected Integer cProvincia;
    @XmlElement(name = "c_municipio")
    @XmlSchemaType(name = "integer")
    protected Integer cMunicipio;
    @XmlElement(name = "c_postal")
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
    @XmlElement(name = "c_asociacion_id")
    protected String cAsociacionId;
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
     * Obtiene el valor de la propiedad cRazaId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRazaId() {
        return cRazaId;
    }

    /**
     * Define el valor de la propiedad cRazaId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRazaId(String value) {
        this.cRazaId = value;
    }

    /**
     * Obtiene el valor de la propiedad cSexoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSexoId() {
        return cSexoId;
    }

    /**
     * Define el valor de la propiedad cSexoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSexoId(String value) {
        this.cSexoId = value;
    }

    /**
     * Obtiene el valor de la propiedad fNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFNacimiento() {
        return fNacimiento;
    }

    /**
     * Define el valor de la propiedad fNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFNacimiento(XMLGregorianCalendar value) {
        this.fNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad cExplNaci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCExplNaci() {
        return cExplNaci;
    }

    /**
     * Define el valor de la propiedad cExplNaci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCExplNaci(String value) {
        this.cExplNaci = value;
    }

    /**
     * Obtiene el valor de la propiedad cPaisNaci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPaisNaci() {
        return cPaisNaci;
    }

    /**
     * Define el valor de la propiedad cPaisNaci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPaisNaci(String value) {
        this.cPaisNaci = value;
    }

    /**
     * Obtiene el valor de la propiedad fMuerte.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFMuerte() {
        return fMuerte;
    }

    /**
     * Define el valor de la propiedad fMuerte.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFMuerte(XMLGregorianCalendar value) {
        this.fMuerte = value;
    }

    /**
     * Obtiene el valor de la propiedad cExplMuer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCExplMuer() {
        return cExplMuer;
    }

    /**
     * Define el valor de la propiedad cExplMuer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCExplMuer(String value) {
        this.cExplMuer = value;
    }

    /**
     * Obtiene el valor de la propiedad cTipoMuerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipoMuerId() {
        return cTipoMuerId;
    }

    /**
     * Define el valor de la propiedad cTipoMuerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipoMuerId(String value) {
        this.cTipoMuerId = value;
    }

    /**
     * Obtiene el valor de la propiedad fIdentific.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFIdentific() {
        return fIdentific;
    }

    /**
     * Define el valor de la propiedad fIdentific.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFIdentific(XMLGregorianCalendar value) {
        this.fIdentific = value;
    }

    /**
     * Obtiene el valor de la propiedad cExplIden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCExplIden() {
        return cExplIden;
    }

    /**
     * Define el valor de la propiedad cExplIden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCExplIden(String value) {
        this.cExplIden = value;
    }

    /**
     * Obtiene el valor de la propiedad dObserv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDObserv() {
        return dObserv;
    }

    /**
     * Define el valor de la propiedad dObserv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDObserv(String value) {
        this.dObserv = value;
    }

    /**
     * Obtiene el valor de la propiedad cIdenElec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIdenElec() {
        return cIdenElec;
    }

    /**
     * Define el valor de la propiedad cIdenElec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIdenElec(String value) {
        this.cIdenElec = value;
    }

    /**
     * Obtiene el valor de la propiedad cTipoIdenId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipoIdenId() {
        return cTipoIdenId;
    }

    /**
     * Define el valor de la propiedad cTipoIdenId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipoIdenId(String value) {
        this.cTipoIdenId = value;
    }

    /**
     * Obtiene el valor de la propiedad cCapaId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCapaId() {
        return cCapaId;
    }

    /**
     * Define el valor de la propiedad cCapaId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCapaId(String value) {
        this.cCapaId = value;
    }

    /**
     * Obtiene el valor de la propiedad cOrieAnimId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOrieAnimId() {
        return cOrieAnimId;
    }

    /**
     * Define el valor de la propiedad cOrieAnimId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOrieAnimId(String value) {
        this.cOrieAnimId = value;
    }

    /**
     * Obtiene el valor de la propiedad dNombreCom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNombreCom() {
        return dNombreCom;
    }

    /**
     * Define el valor de la propiedad dNombreCom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNombreCom(String value) {
        this.dNombreCom = value;
    }

    /**
     * Obtiene el valor de la propiedad dNombreNac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNombreNac() {
        return dNombreNac;
    }

    /**
     * Define el valor de la propiedad dNombreNac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNombreNac(String value) {
        this.dNombreNac = value;
    }

    /**
     * Obtiene el valor de la propiedad cAptiConsId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAptiConsId() {
        return cAptiConsId;
    }

    /**
     * Define el valor de la propiedad cAptiConsId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAptiConsId(String value) {
        this.cAptiConsId = value;
    }

    /**
     * Obtiene el valor de la propiedad bDocSusti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDocSusti() {
        return bDocSusti;
    }

    /**
     * Define el valor de la propiedad bDocSusti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDocSusti(String value) {
        this.bDocSusti = value;
    }

    /**
     * Obtiene el valor de la propiedad fIniSusp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFIniSusp() {
        return fIniSusp;
    }

    /**
     * Define el valor de la propiedad fIniSusp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFIniSusp(XMLGregorianCalendar value) {
        this.fIniSusp = value;
    }

    /**
     * Obtiene el valor de la propiedad cTipoLectId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipoLectId() {
        return cTipoLectId;
    }

    /**
     * Define el valor de la propiedad cTipoLectId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipoLectId(String value) {
        this.cTipoLectId = value;
    }

    /**
     * Obtiene el valor de la propiedad cIdAlternId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIdAlternId() {
        return cIdAlternId;
    }

    /**
     * Define el valor de la propiedad cIdAlternId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIdAlternId(String value) {
        this.cIdAlternId = value;
    }

    /**
     * Obtiene el valor de la propiedad cFiabilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFiabilidad() {
        return cFiabilidad;
    }

    /**
     * Define el valor de la propiedad cFiabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFiabilidad(String value) {
        this.cFiabilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad bTarjInte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBTarjInte() {
        return bTarjInte;
    }

    /**
     * Define el valor de la propiedad bTarjInte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBTarjInte(String value) {
        this.bTarjInte = value;
    }

    /**
     * Obtiene el valor de la propiedad bCastrado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCastrado() {
        return bCastrado;
    }

    /**
     * Define el valor de la propiedad bCastrado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCastrado(String value) {
        this.bCastrado = value;
    }

    /**
     * Gets the value of the cCifnifVete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cCifnifVete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCifnifVete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCCifnifVete() {
        if (cCifnifVete == null) {
            cCifnifVete = new ArrayList<String>();
        }
        return this.cCifnifVete;
    }

    /**
     * Obtiene el valor de la propiedad dObsCabeza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDObsCabeza() {
        return dObsCabeza;
    }

    /**
     * Define el valor de la propiedad dObsCabeza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDObsCabeza(String value) {
        this.dObsCabeza = value;
    }

    /**
     * Obtiene el valor de la propiedad dObsDelizq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDObsDelizq() {
        return dObsDelizq;
    }

    /**
     * Define el valor de la propiedad dObsDelizq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDObsDelizq(String value) {
        this.dObsDelizq = value;
    }

    /**
     * Obtiene el valor de la propiedad dObsDelder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDObsDelder() {
        return dObsDelder;
    }

    /**
     * Define el valor de la propiedad dObsDelder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDObsDelder(String value) {
        this.dObsDelder = value;
    }

    /**
     * Obtiene el valor de la propiedad dObsTraizq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDObsTraizq() {
        return dObsTraizq;
    }

    /**
     * Define el valor de la propiedad dObsTraizq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDObsTraizq(String value) {
        this.dObsTraizq = value;
    }

    /**
     * Obtiene el valor de la propiedad dObsTrader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDObsTrader() {
        return dObsTrader;
    }

    /**
     * Define el valor de la propiedad dObsTrader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDObsTrader(String value) {
        this.dObsTrader = value;
    }

    /**
     * Obtiene el valor de la propiedad dObsCuerpo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDObsCuerpo() {
        return dObsCuerpo;
    }

    /**
     * Define el valor de la propiedad dObsCuerpo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDObsCuerpo(String value) {
        this.dObsCuerpo = value;
    }

    /**
     * Obtiene el valor de la propiedad dObsMarcas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDObsMarcas() {
        return dObsMarcas;
    }

    /**
     * Define el valor de la propiedad dObsMarcas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDObsMarcas(String value) {
        this.dObsMarcas = value;
    }

    /**
     * Obtiene el valor de la propiedad dImgIzq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDImgIzq() {
        return dImgIzq;
    }

    /**
     * Define el valor de la propiedad dImgIzq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDImgIzq(String value) {
        this.dImgIzq = value;
    }

    /**
     * Obtiene el valor de la propiedad dImgDer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDImgDer() {
        return dImgDer;
    }

    /**
     * Define el valor de la propiedad dImgDer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDImgDer(String value) {
        this.dImgDer = value;
    }

    /**
     * Obtiene el valor de la propiedad dImgFrontal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDImgFrontal() {
        return dImgFrontal;
    }

    /**
     * Define el valor de la propiedad dImgFrontal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDImgFrontal(String value) {
        this.dImgFrontal = value;
    }

    /**
     * Obtiene el valor de la propiedad dImgResena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDImgResena() {
        return dImgResena;
    }

    /**
     * Define el valor de la propiedad dImgResena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDImgResena(String value) {
        this.dImgResena = value;
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
     * Obtiene el valor de la propiedad cExplTitu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCExplTitu() {
        return cExplTitu;
    }

    /**
     * Define el valor de la propiedad cExplTitu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCExplTitu(String value) {
        this.cExplTitu = value;
    }

    /**
     * Gets the value of the cCifnif property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCProvincia() {
        return cProvincia;
    }

    /**
     * Define el valor de la propiedad cProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCProvincia(Integer value) {
        this.cProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad cMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCMunicipio() {
        return cMunicipio;
    }

    /**
     * Define el valor de la propiedad cMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCMunicipio(Integer value) {
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
     * returned list will be present inside the Jakarta XML Binding object.
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
     * Obtiene el valor de la propiedad cAsociacionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAsociacionId() {
        return cAsociacionId;
    }

    /**
     * Define el valor de la propiedad cAsociacionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAsociacionId(String value) {
        this.cAsociacionId = value;
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
