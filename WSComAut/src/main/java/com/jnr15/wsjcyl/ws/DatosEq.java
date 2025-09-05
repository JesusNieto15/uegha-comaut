/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.wsjcyl.ws;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
*Ejemplo de respuesta XML
*<?xml version="1.0" encoding="UTF-8"?>
*<DatosEq>
*   <origen>IRMA</origen>
*   <c_iden_anim>724018000006000</c_iden_anim>
*   <c_especie_id>48</c_especie_id>
*   <d_especie>CABALLO</d_especie>
*   <d_nombre_com>NUEVO NOMBRE</d_nombre_com>
*   <d_nombre_nac>NUEVO NOMBRE</d_nombre_nac>
*   <c_raza_id>5106</c_raza_id>
*   <d_raza>HISPANO-ÁRABE</d_raza>
*   <c_sexo_id>02</c_sexo_id>
*   <d_sexo>HEMBRA</d_sexo>
*   <c_capa_id>22</c_capa_id>
*   <d_capa>LOBERA</d_capa>
*   <c_orie_anim_id>01</c_orie_anim_id>
*   <d_orie_anim>REGISTRADO</d_orie_anim>
*   <c_lugar_alta>008</c_lugar_alta>
*   <d_lugar_alta>Castilla y León</d_lugar_alta>
*   <c_nif_ult_tit>028627988A</c_nif_ult_tit>
*   <d_nombre_ult_tit>PROBANDO_JNR PROBANDO_JNR PROBANDO_JNR</d_nombre_ult_tit>
*   <c_apti_cons_id>02</c_apti_cons_id>
*   <f_muerte></f_muerte>
*   <f_ini_susp></f_ini_susp>
*   <c_iden_elec>8080B512D4D439CE</c_iden_elec>
*   <cea_situ>ES402070000018</cea_situ>
*   <c_expl_iden>ES402070000018</c_expl_iden>
*   <f_identific>2021-06-10</f_identific>
*   <c_expl_naci>ES402070000018</c_expl_naci>
*   <f_nacimiento>2021-03-22</f_nacimiento>
*   <b_doc_susti>N</b_doc_susti>
*   <c_id_altern></c_id_altern>
*</DatosEq>
*/

/**
 *
 * @author jesus
 */
@XmlRootElement(name = "DatosEq")
public class DatosEq {
    
    private String origen;
    private String ueln;
    private String cEspecieID;
    private String dEspecie;
    private String dNombreComercial;
    private String dNombreNacimiento;
    private String cRazaId;
    private String dRaza;
    private String cSexoId;
    private String dSexo;
    private String cCapaId;
    private String dCapa;
    private String cOrieAnimId;
    private String dOrieAnim;
    private String cLugarAlta;
    private String dLugarAlta;
    private String cNifUltimoTitular;
    private String dNombreUltimoTitular;
    private String cAptitudConsumoId;
    private String fMuerte;
    private String fInicioSuspension;
    private String cIdentificacionElectronica;
    private String cIdentificacionElectronicaDecimal;
    private String ceaSituacion;
    private String cExplotacionIdentificacion;
    private String fechaIdentificacion;
    private String codigoExplotacionNacimiento;
    private String fechaNacimiento;
    private String documentoSustitutivo;
    private String codigoIdentificacionAlternativa;
    
    @XmlElement(name="origen")
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    @XmlElement(name="c_iden_anim")
    public String getUeln() {
        return ueln;
    }

    public void setUeln(String ueln) {
        this.ueln = ueln;
    }
    @XmlElement(name="c_especie_id")
    public String getcEspecieID() {
        return cEspecieID;
    }

    public void setcEspecieID(String cEspecieID) {
        this.cEspecieID = cEspecieID;
    }
    @XmlElement(name="d_especie")
    public String getdEspecie() {
        return dEspecie;
    }

    public void setdEspecie(String dEspecie) {
        this.dEspecie = dEspecie;
    }
    @XmlElement(name="d_nombre_com")
    public String getdNombreComercial() {
        return dNombreComercial;
    }

    public void setdNombreComercial(String dNombreComercial) {
        this.dNombreComercial = dNombreComercial;
    }
    @XmlElement(name="d_nombre_nac")
    public String getdNombreNacimiento() {
        return dNombreNacimiento;
    }

    public void setdNombreNacimiento(String dNombreNacimiento) {
        this.dNombreNacimiento = dNombreNacimiento;
    }
    @XmlElement(name="c_raza_id")
    public String getcRazaId() {
        return cRazaId;
    }

    public void setcRazaId(String cRazaId) {
        this.cRazaId = cRazaId;
    }
    @XmlElement(name="d_raza")
    public String getdRaza() {
        return dRaza;
    }

    public void setdRaza(String dRaza) {
        this.dRaza = dRaza;
    }
    @XmlElement(name="c_sexo_id")
    public String getcSexoId() {
        return cSexoId;
    }

    public void setcSexoId(String cSexoId) {
        this.cSexoId = cSexoId;
    }
    @XmlElement(name="d_sexo")
    public String getdSexo() {
        return dSexo;
    }

    public void setdSexo(String dSexo) {
        this.dSexo = dSexo;
    }
    @XmlElement(name="c_capa_id")
    public String getcCapaId() {
        return cCapaId;
    }

    public void setcCapaId(String cCapaId) {
        this.cCapaId = cCapaId;
    }
    @XmlElement(name="d_capa")
    public String getdCapa() {
        return dCapa;
    }

    public void setdCapa(String dCapa) {
        this.dCapa = dCapa;
    }
    @XmlElement(name="c_orie_anim_id")
    public String getcOrieAnimId() {
        return cOrieAnimId;
    }

    public void setcOrieAnimId(String cOrieAnimId) {
        this.cOrieAnimId = cOrieAnimId;
    }
    @XmlElement(name="d_orie_anim")
    public String getdOrieAnim() {
        return dOrieAnim;
    }

    public void setdOrieAnim(String dOrieAnim) {
        this.dOrieAnim = dOrieAnim;
    }
    @XmlElement(name="c_lugar_alta")
    public String getcLugarAlta() {
        return cLugarAlta;
    }

    public void setcLugarAlta(String cLugarAlta) {
        this.cLugarAlta = cLugarAlta;
    }
    @XmlElement(name="d_lugar_alta")
    public String getdLugarAlta() {
        return dLugarAlta;
    }

    public void setdLugarAlta(String dLugarAlta) {
        this.dLugarAlta = dLugarAlta;
    }
    @XmlElement(name="c_nif_ult_tit")
    public String getcNifUltimoTitular() {
        return cNifUltimoTitular;
    }

    public void setcNifUltimoTitular(String cNifUltimoTitular) {
        this.cNifUltimoTitular = cNifUltimoTitular;
    }
    @XmlElement(name="d_nombre_ult_tit")
    public String getdNombreUltimoTitular() {
        return dNombreUltimoTitular;
    }

    public void setdNombreUltimoTitular(String dNombreUltimoTitular) {
        this.dNombreUltimoTitular = dNombreUltimoTitular;
    }
    @XmlElement(name="c_apti_cons_id")
    public String getcAptitudConsumoId() {
        return cAptitudConsumoId;
    }

    public void setcAptitudConsumoId(String cAptitudConsumoId) {
        this.cAptitudConsumoId = cAptitudConsumoId;
    }
    @XmlElement(name="f_muerte")
    public String getfMuerte() {
        return fMuerte;
    }

    public void setfMuerte(String fMuerte) {
        this.fMuerte = fMuerte;
    }
    @XmlElement(name="f_ini_susp")
    public String getfInicioSuspension() {
        return fInicioSuspension;
    }

    public void setfInicioSuspension(String fInicioSuspension) {
        this.fInicioSuspension = fInicioSuspension;
    }
    @XmlElement(name="c_iden_elec")
    public String getcIdentificacionElectronica() {
        return cIdentificacionElectronica;
    }

    public void setcIdentificacionElectronica(String cIdentificacionElectronica) {
        this.cIdentificacionElectronica = cIdentificacionElectronica;
    }
    
    @XmlElement(name="an_id_electronica_dec")
    public String getcIdentificacionElectronicaDecimal() {
        return cIdentificacionElectronicaDecimal;
    }

    public void setcIdentificacionElectronicaDecimal(String cIdentificacionElectronicaDeString) {
        this.cIdentificacionElectronicaDecimal = cIdentificacionElectronicaDeString;
    }
    
    @XmlElement(name="cea_situ")
    public String getCeaSituacion() {
        return ceaSituacion;
    }

    public void setCeaSituacion(String ceaSituacion) {
        this.ceaSituacion = ceaSituacion;
    }
    @XmlElement(name="c_expl_iden")
    public String getcExplotacionIdentificacion() {
        return cExplotacionIdentificacion;
    }

    public void setcExplotacionIdentificacion(String cExplotacionIdentificacion) {
        this.cExplotacionIdentificacion = cExplotacionIdentificacion;
    }
    @XmlElement(name="f_identific")
    public String getFechaIdentificacion() {
        return fechaIdentificacion;
    }

    public void setFechaIdentificacion(String fechaIdentificacion) {
        this.fechaIdentificacion = fechaIdentificacion;
    }
    @XmlElement(name="c_expl_naci")
    public String getCodigoExplotacionNacimiento() {
        return codigoExplotacionNacimiento;
    }

    public void setCodigoExplotacionNacimiento(String codigoExplotacionNacimiento) {
        this.codigoExplotacionNacimiento = codigoExplotacionNacimiento;
    }
    @XmlElement(name="f_nacimiento")
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    @XmlElement(name="b_doc_susti")
    public String getDocumentoSustitutivo() {
        return documentoSustitutivo;
    }

    public void setDocumentoSustitutivo(String documentoSustitutivo) {
        this.documentoSustitutivo = documentoSustitutivo;
    }
    @XmlElement(name="c_id_altern")
    public String getCodigoIdentificacionAlternativa() {
        return codigoIdentificacionAlternativa;
    }

    public void setCodigoIdentificacionAlternativa(String codigoIdentificacionAlternativa) {
        this.codigoIdentificacionAlternativa = codigoIdentificacionAlternativa;
    }
    
}
