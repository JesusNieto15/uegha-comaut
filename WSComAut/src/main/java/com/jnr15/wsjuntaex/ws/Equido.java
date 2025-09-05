/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.wsjuntaex.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 * @author jesus
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equido", propOrder = {
    "ueln",
    "aptoConsumo",
    "capa",
    "castrado",
    "dniTitular",
    "especie",
    "expIdentificacion",
    "expMuerte",
    "expNacimiento",
    "fecIdentificacion",
    "fecInicioSuspension",
    "fecInicioTitularidad",
    "fecMuerte",
    "fecNacimiento",
    "fiabilidad",
    "idAlternativo",
    "idElectronico",
    "lugarNacimiento",
    "nombreComercial",
    "nombreNacimiento",
    "orientacion",
    "raza",
    "sexo",
    "tipoIdElectronico",
    "tipoLectura",
    "tipoMuerte",
    "nombreTitular",
    "direccionTitular",
    "cpTitular",
    "provinciaTitular",
    "municipioTitular",
    "paisTitular",
    "telefonoTitular",
    "duplicado"
})
@XmlRootElement(name="equido")
public class Equido {
    
    @XmlElement(name = "UELN")
    private String ueln;
    private String aptoConsumo;
    private String capa;
    private String castrado;
    private String dniTitular;
    private String especie;
    private String expIdentificacion;
    private String expMuerte;
    private String expNacimiento;
    private String fecIdentificacion;
    private String fecInicioSuspension;
    private String fecInicioTitularidad;
    private String fecMuerte;
    private String fecNacimiento;
    private String fiabilidad;
    private String idAlternativo;
    private String idElectronico;
    private String lugarNacimiento;
    private String nombreComercial;
    private String nombreNacimiento;
    private String orientacion;
    private String raza;
    private String sexo;
    private String tipoIdElectronico;
    private String tipoLectura;
    private String tipoMuerte;
    private String nombreTitular;
    private String direccionTitular;
    private String cpTitular;
    private String provinciaTitular;
    private String municipioTitular;
    private String paisTitular;
    private String telefonoTitular;
    private String duplicado;

    public String getUeln() {
        return ueln;
    }

    public void setUeln(String ueln) {
        this.ueln = ueln;
    }

    public String getAptoConsumo() {
        return aptoConsumo;
    }

    public void setAptoConsumo(String aptoConsumo) {
        this.aptoConsumo = aptoConsumo;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getCastrado() {
        return castrado;
    }

    public void setCastrado(String castrado) {
        this.castrado = castrado;
    }
    
    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getExpIdentificacion() {
        return expIdentificacion;
    }

    public void setExpIdentificacion(String expIdentificacion) {
        this.expIdentificacion = expIdentificacion;
    }

    public String getExpMuerte() {
        return expMuerte;
    }

    public void setExpMuerte(String expMuerte) {
        this.expMuerte = expMuerte;
    }

    public String getExpNacimiento() {
        return expNacimiento;
    }

    public void setExpNacimiento(String expNacimiento) {
        this.expNacimiento = expNacimiento;
    }

    public String getFecIdentificacion() {
        return fecIdentificacion;
    }

    public void setFecIdentificacion(String fecIdentificacion) {
        this.fecIdentificacion = fecIdentificacion;
    }

    public String getFecInicioSuspension() {
        return fecInicioSuspension;
    }

    public void setFecInicioSuspension(String fecInicioSuspension) {
        this.fecInicioSuspension = fecInicioSuspension;
    }

    public String getFecInicioTitularidad() {
        return fecInicioTitularidad;
    }

    public void setFecInicioTitularidad(String fecInicioTitularidad) {
        this.fecInicioTitularidad = fecInicioTitularidad;
    }

    public String getFecMuerte() {
        return fecMuerte;
    }

    public void setFecMuerte(String fecMuerte) {
        this.fecMuerte = fecMuerte;
    }

    public String getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(String fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public String getFiabilidad() {
        return fiabilidad;
    }

    public void setFiabilidad(String fiabilidad) {
        this.fiabilidad = fiabilidad;
    }

    public String getIdAlternativo() {
        return idAlternativo;
    }

    public void setIdAlternativo(String idAlternativo) {
        this.idAlternativo = idAlternativo;
    }

    public String getIdElectronico() {
        return idElectronico;
    }

    public void setIdElectronico(String idElectronico) {
        this.idElectronico = idElectronico;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNombreNacimiento() {
        return nombreNacimiento;
    }

    public void setNombreNacimiento(String nombreNacimiento) {
        this.nombreNacimiento = nombreNacimiento;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoIdElectronico() {
        return tipoIdElectronico;
    }

    public void setTipoIdElectronico(String tipoIdElectronico) {
        this.tipoIdElectronico = tipoIdElectronico;
    }

    public String getTipoLectura() {
        return tipoLectura;
    }

    public void setTipoLectura(String tipoLectura) {
        this.tipoLectura = tipoLectura;
    }

    public String getTipoMuerte() {
        return tipoMuerte;
    }

    public void setTipoMuerte(String tipoMuerte) {
        this.tipoMuerte = tipoMuerte;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    
    public String getDireccionTitular() {
        return direccionTitular;
    }

    public void setDireccionTitular(String direccionTitular) {
        this.direccionTitular = direccionTitular;
    }
    
    public String getCpTitular() {
        return cpTitular;
    }

    public void setCpTitular(String cpTitular) {
        this.cpTitular = cpTitular;
    }    

    public String getProvinciaTitular() {
        return provinciaTitular;
    }

    public void setProvinciaTitular(String provinciaTitular) {
        this.provinciaTitular = provinciaTitular;
    }

    public String getMunicipioTitular() {
        return municipioTitular;
    }

    public void setMunicipioTitular(String municipioTitular) {
        this.municipioTitular = municipioTitular;
    }

    public String getPaisTitular() {
        return paisTitular;
    }

    public void setPaisTitular(String paisTitular) {
        this.paisTitular = paisTitular;
    }

    public String getTelefonoTitular() {
        return telefonoTitular;
    }

    public void setTelefonoTitular(String telefonoTitular) {
        this.telefonoTitular = telefonoTitular;
    }

    public String getDuplicado() {
        return duplicado;
    }

    public void setDuplicado(String duplicado) {
        this.duplicado = duplicado;
    }
    
}
