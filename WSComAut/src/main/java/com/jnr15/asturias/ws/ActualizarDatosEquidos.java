/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.asturias.ws;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import modelo.DatosEquidosComAut;

/**
 *
 * @author jesus
 */
@XmlRootElement(name = "ActualizarDatosEquidos")
public class ActualizarDatosEquidos {

    private final List<ActualizarDatosEquido> lista = new ArrayList();

    @XmlElement(name="ActualizarDatosEquido")
    public List<ActualizarDatosEquido> getLista() {
        return lista;
    }

    public void addAnimal(DatosEquidosComAut datosEquido) {
        Animal animal = fabricaAnimal(datosEquido);
        ActualizarDatosEquido actualizarDatosEquido = new ActualizarDatosEquido();
        actualizarDatosEquido.setAnimal(animal);
        lista.add(actualizarDatosEquido);
    }

    private Animal fabricaAnimal(DatosEquidosComAut datosEquido) {
        Animal animal = new Animal();
        animal.setCodigoUeln(datosEquido.getCodigoUELN());
        animal.setCodigoEspecie(datosEquido.getCodigoEspecie());
        animal.setCodigoRaza(datosEquido.getCodigoRaza());
        animal.setCodigoFiabilidad(datosEquido.getCodigoFiabilidad());
        animal.setCodigoSexo(addCerosDelante(datosEquido.getCodigoSexo(), 2));
        animal.setCastrado(datosEquido.getCastrado());
        animal.setCodigoCapa(addCerosDelante(datosEquido.getCodigoCapa(), 2));
        animal.setCodigoLugarNacimiento(datosEquido.getCodigoLugarNacimiento());
        animal.setExplotacionNacimiento(datosEquido.getExplotacionNacimiento());
        animal.setFechaNacimiento(datosEquido.getFechaNacimiento());
        animal.setCodigoTipoIdentificacion(addCerosDelante(datosEquido.getCodigoTipoIdentificacion(), 2));
        animal.setCodigoSistemaLectura(addCerosDelante(datosEquido.getCodigoSistemaLectura(), 2));
        animal.setIdElectronica(datosEquido.getIdElectronica());
        animal.setIdAlternativo(datosEquido.getIdAlternativo());
        animal.setFechaIdentificacion(datosEquido.getFechaIdentificacion());
        animal.setNIFTitular(datosEquido.getNIFTitular());
        animal.setNombreTitular(datosEquido.getNombreTitular() + " " + datosEquido.getApellidosTitular());
        animal.setDireccionTitular(datosEquido.getLiteralDireccionTitular());
        animal.setInicioTitular(datosEquido.getFechaInicioTitular());
        animal.setCodigoProvinciaTitular(datosEquido.getCodigoProvinciaTitular());
        animal.setCodigoMunicipioTitular(datosEquido.getCodigoMunicipioTitular());
        animal.setCodigoPostal(datosEquido.getCodigoPostal());
        animal.setCodigoOrientacion(addCerosDelante(datosEquido.getCodigoOrientacion(), 2));
        animal.setNombreNacimiento(datosEquido.getLiteralNombreNacimiento());
        animal.setNombreComercial(datosEquido.getLiteralNombreComercial() == null ? "" : datosEquido.getLiteralNombreComercial());
        animal.setCodigoAptitud(addCerosDelante(datosEquido.getCodigoAptitud(), 2));
        animal.setInicioSuspension(datosEquido.getFechaInicioSuspension()==null?"":datosEquido.getFechaInicioSuspension());
        animal.setDuplicado(datosEquido.getDuplicado());
        animal.setFechaMuerte(datosEquido.getFechaMuerte()==null?"":datosEquido.getFechaMuerte());
        animal.setExplotacionMuerte(datosEquido.getExplotacionMuerte()==null?"":datosEquido.getExplotacionMuerte());
        animal.setCodigoTipoMuerte(datosEquido.getCodigoTipoMuerte()==null?"":datosEquido.getCodigoTipoMuerte());
        animal.setComunidadAutonomaGrabadora("11");
        return animal;
    }

    private static String addCerosDelante(String campo, int longitudCampo) {
        String res = campo;
        while (res.length() < longitudCampo) {
            res = "0" + res;
        }
        return res;
    }

}

class ActualizarDatosEquido {

    private Animal animal;

    @XmlElement(name = "Animal")
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}

@XmlType(propOrder = {
    "codigoUeln", "codigoEspecie", "codigoRaza", "codigoFiabilidad", "codigoSexo", "castrado", "codigoCapa", "codigoLugarNacimiento",
    "explotacionNacimiento", "fechaNacimiento", "codigoTipoIdentificacion", "codigoSistemaLectura", "idElectronica", "idAlternativo",
    "fechaIdentificacion", "nifTitular", "nombreTitular", "direccionTitular", "inicioTitular", "codigoProvinciaTitular", "codigoMunicipioTitular",
    "codigoPostal", "codigoOrientacion", "nombreNacimiento", "nombreComercial", "codigoAptitud", "inicioSuspension", "duplicado", "fechaMuerte",
    "explotacionMuerte", "codigoTipoMuerte", "comunidadAutonomaGrabadora"
})
class Animal {

    private String codigoUeln, codigoEspecie, codigoRaza, codigoFiabilidad, codigoSexo, castrado, codigoCapa, codigoLugarNacimiento,
            explotacionNacimiento, fechaNacimiento, codigoTipoIdentificacion, codigoSistemaLectura, idElectronica, idAlternativo,
            fechaIdentificacion, nifTitular, nombreTitular, direccionTitular, inicioTitular, codigoProvinciaTitular, codigoMunicipioTitular,
            codigoPostal, codigoOrientacion, nombreNacimiento, nombreComercial, codigoAptitud, inicioSuspension, duplicado, fechaMuerte, explotacionMuerte,
            codigoTipoMuerte, comunidadAutonomaGrabadora;

    @XmlElement(name = "CodigoUeln",required = true)
    public String getCodigoUeln() {
        return codigoUeln;
    }

    public void setCodigoUeln(String CodigoUeln) {
        this.codigoUeln = CodigoUeln;
    }

    @XmlElement(name = "CodigoEspecie", defaultValue = "",required = true)
    public String getCodigoEspecie() {
        return codigoEspecie;
    }

    public void setCodigoEspecie(String CodigoEspecie) {
        this.codigoEspecie = CodigoEspecie;
    }

    @XmlElement(name = "CodigoRaza", defaultValue = "",required = true)
    public String getCodigoRaza() {
        return codigoRaza;
    }

    public void setCodigoRaza(String CodigoRaza) {
        this.codigoRaza = CodigoRaza;
    }

    @XmlElement(name = "CodigoFiabilidad", defaultValue = "",required = true)
    public String getCodigoFiabilidad() {
        return codigoFiabilidad;
    }

    public void setCodigoFiabilidad(String CodigoFiabilidad) {
        this.codigoFiabilidad = CodigoFiabilidad;
    }

    @XmlElement(name = "CodigoSexo", defaultValue = "",required = true)
    public String getCodigoSexo() {
        return codigoSexo;
    }

    public void setCodigoSexo(String CodigoSexo) {
        this.codigoSexo = CodigoSexo;
    }

    @XmlElement(name = "Castrado", defaultValue = "",required = true)
    public String getCastrado() {
        return castrado;
    }

    public void setCastrado(String Castrado) {
        this.castrado = Castrado;
    }

    @XmlElement(name = "CodigoCapa", defaultValue = "",required = true)
    public String getCodigoCapa() {
        return codigoCapa;
    }

    public void setCodigoCapa(String CodigoCapa) {
        this.codigoCapa = CodigoCapa;
    }

    @XmlElement(name = "CodigoLugarNacimiento", defaultValue = "",required = true)
    public String getCodigoLugarNacimiento() {
        return codigoLugarNacimiento;
    }

    public void setCodigoLugarNacimiento(String CodigoLugarNacimiento) {
        this.codigoLugarNacimiento = CodigoLugarNacimiento;
    }

    @XmlElement(name = "ExplotacionNacimiento", defaultValue = "",required = true)
    public String getExplotacionNacimiento() {
        return explotacionNacimiento;
    }

    public void setExplotacionNacimiento(String ExplotacionNacimiento) {
        this.explotacionNacimiento = ExplotacionNacimiento;
    }

    @XmlElement(name = "FechaNacimiento", defaultValue = "",required = true)
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.fechaNacimiento = FechaNacimiento;
    }

    @XmlElement(name = "CodigoTipoIdentificacion", defaultValue = "",required = true)
    public String getCodigoTipoIdentificacion() {
        return codigoTipoIdentificacion;
    }

    public void setCodigoTipoIdentificacion(String CodigoTipoIdentificacion) {
        this.codigoTipoIdentificacion = CodigoTipoIdentificacion;
    }

    @XmlElement(name = "CodigoSistemaLectura", defaultValue = "",required = true)
    public String getCodigoSistemaLectura() {
        return codigoSistemaLectura;
    }

    public void setCodigoSistemaLectura(String CodigoSistemaLectura) {
        this.codigoSistemaLectura = CodigoSistemaLectura;
    }

    @XmlElement(name = "IdElectronica", defaultValue = "",required = true)
    public String getIdElectronica() {
        return idElectronica;
    }

    public void setIdElectronica(String IdElectronica) {
        this.idElectronica = IdElectronica;
    }

    @XmlElement(name = "IdAlternativo", defaultValue = "",required = true)
    public String getIdAlternativo() {
        return idAlternativo;
    }

    public void setIdAlternativo(String IdAlternativo) {
        this.idAlternativo = IdAlternativo;
    }

    @XmlElement(name = "FechaIdentificacion", defaultValue = "",required = true)
    public String getFechaIdentificacion() {
        return fechaIdentificacion;
    }

    public void setFechaIdentificacion(String FechaIdentificacion) {
        this.fechaIdentificacion = FechaIdentificacion;
    }

    @XmlElement(name = "NIFTitular", defaultValue = "",required = true)
    public String getNifTitular() {
        return nifTitular;
    }

    public void setNIFTitular(String NIFTitular) {
        this.nifTitular = NIFTitular;
    }

    @XmlElement(name = "NombreTitular", defaultValue = "",required = true)
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String NombreTitular) {
        this.nombreTitular = NombreTitular;
    }

    @XmlElement(name = "DireccionTitular", defaultValue = "",required = true)
    public String getDireccionTitular() {
        return direccionTitular;
    }

    public void setDireccionTitular(String DireccionTitular) {
        this.direccionTitular = DireccionTitular;
    }

    @XmlElement(name = "InicioTitular", defaultValue = "",required = true)
    public String getInicioTitular() {
        return inicioTitular;
    }

    public void setInicioTitular(String InicioTitular) {
        this.inicioTitular = InicioTitular;
    }

    @XmlElement(name = "CodigoProvinciaTitular", defaultValue = "",required = true)
    public String getCodigoProvinciaTitular() {
        return codigoProvinciaTitular;
    }

    public void setCodigoProvinciaTitular(String CodigoProvinciaTitular) {
        this.codigoProvinciaTitular = CodigoProvinciaTitular;
    }

    @XmlElement(name = "CodigoMunicipioTitular", defaultValue = "",required = true)
    public String getCodigoMunicipioTitular() {
        return codigoMunicipioTitular;
    }

    public void setCodigoMunicipioTitular(String CodigoMunicipioTitular) {
        this.codigoMunicipioTitular = CodigoMunicipioTitular;
    }

    @XmlElement(name = "CodigoPostal", defaultValue = "",required = true)
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String CodigoPostal) {
        this.codigoPostal = CodigoPostal;
    }

    @XmlElement(name = "CodigoOrientacion", defaultValue = "",required = true)
    public String getCodigoOrientacion() {
        return codigoOrientacion;
    }

    public void setCodigoOrientacion(String CodigoOrientacion) {
        this.codigoOrientacion = CodigoOrientacion;
    }

    @XmlElement(name = "NombreNacimiento", defaultValue = "",required = true)
    public String getNombreNacimiento() {
        return nombreNacimiento;
    }

    public void setNombreNacimiento(String NombreNacimiento) {
        this.nombreNacimiento = NombreNacimiento;
    }

    @XmlElement(name = "NombreComercial", defaultValue = "",required = true)
    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String NombreComercial) {
        this.nombreComercial = NombreComercial;
    }

    @XmlElement(name = "CodigoAptitud", defaultValue = "",required = true)
    public String getCodigoAptitud() {
        return codigoAptitud;
    }

    public void setCodigoAptitud(String CodigoAptitud) {
        this.codigoAptitud = CodigoAptitud;
    }

    @XmlElement(name = "InicioSuspension", defaultValue = "",required = true)
    public String getInicioSuspension() {
        return inicioSuspension;
    }

    public void setInicioSuspension(String InicioSuspension) {
        this.inicioSuspension = InicioSuspension;
    }

    @XmlElement(name = "Duplicado", defaultValue = "",required = true)
    public String getDuplicado() {
        return duplicado;
    }

    public void setDuplicado(String Duplicado) {
        this.duplicado = Duplicado;
    }

    @XmlElement(name = "FechaMuerte", defaultValue = "",required = true)
    public String getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(String FechaMuerte) {
        this.fechaMuerte = FechaMuerte;
    }

    @XmlElement(name = "ExplotacionMuerte", defaultValue = "",required = true)
    public String getExplotacionMuerte() {
        return explotacionMuerte;
    }

    public void setExplotacionMuerte(String ExplotacionMuerte) {
        this.explotacionMuerte = ExplotacionMuerte;
    }

    @XmlElement(name = "CodigoTipoMuerte", defaultValue = "",required = true)
    public String getCodigoTipoMuerte() {
        return codigoTipoMuerte;
    }

    public void setCodigoTipoMuerte(String CodigoTipoMuerte) {
        this.codigoTipoMuerte = CodigoTipoMuerte;
    }

    @XmlElement(name = "ComunidadAutonomaGrabadora", defaultValue = "",required = true)
    public String getComunidadAutonomaGrabadora() {
        return comunidadAutonomaGrabadora;
    }

    public void setComunidadAutonomaGrabadora(String ComunidadAutonomaGrabadora) {
        this.comunidadAutonomaGrabadora = ComunidadAutonomaGrabadora;
    }
}
