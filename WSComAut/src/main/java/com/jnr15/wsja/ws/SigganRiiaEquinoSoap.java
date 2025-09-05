/**
 * SigganRiiaEquinoSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jnr15.wsja.ws;

public interface SigganRiiaEquinoSoap extends java.rmi.Remote {
    public ResultadoGrabacionSolicitud actualizarDatosEquidos(java.lang.String codigoUELN, java.lang.String codigoEspecie, java.lang.String codigoRaza, java.lang.String codigoFiabilidad, java.lang.String codigoSexo, java.lang.String castrado, java.lang.String codigoCapa, java.lang.String codigoLugarNacimiento, java.lang.String explotacionNacimiento, java.lang.String fechaNacimiento, java.lang.String codigoTipoIdentificacion, java.lang.String codigoSistemaLectura, java.lang.String idElectronica, java.lang.String idAlternativo, java.lang.String fechaIdentificacion, java.lang.String NIFTitular, java.lang.String nombreTitular, java.lang.String direccionTitular, java.lang.String inicioTitular, java.lang.String codigoProvinciaTitular, java.lang.String codigoMunicipioTitular, java.lang.String codigoPostal, java.lang.String codigoOrientacion, java.lang.String nombreNacimiento, java.lang.String nombreComercial, java.lang.String codigoAptitud, java.lang.String inicioSuspension, java.lang.String duplicado, java.lang.String fechaMuerte, java.lang.String explotacionMuerte, java.lang.String codigoTipoMuerte, java.lang.String comunidadAutonomaGrabadora) throws java.rmi.RemoteException;
    public ResultadoGrabacionSolicitud actualizarDatosEquidos_(java.lang.String codigoUELN, java.lang.String codigoEspecie, java.lang.String codigoRaza, java.lang.String codigoFiabilidad, java.lang.String codigoSexo, java.lang.String castrado, java.lang.String codigoCapa, java.lang.String codigoLugarNacimiento, java.lang.String explotacionNacimiento, java.lang.String fechaNacimiento, java.lang.String codigoTipoIdentificacion, java.lang.String codigoSistemaLectura, java.lang.String idElectronica, java.lang.String idAlternativo, java.lang.String fechaIdentificacion, java.lang.String NIFTitular, java.lang.String nombreTitular, java.lang.String direccionTitular, java.lang.String inicioTitular, java.lang.String codigoProvinciaTitular, java.lang.String codigoMunicipioTitular, java.lang.String codigoPostal, java.lang.String codigoOrientacion, java.lang.String nombreNacimiento, java.lang.String nombreComercial, java.lang.String codigoAptitud, java.lang.String inicioSuspension, java.lang.String duplicado, java.lang.String fechaMuerte, java.lang.String explotacionMuerte, java.lang.String codigoTipoMuerte, java.lang.String comunidadAutonomaGrabadora, java.lang.String explotacionUbicacion) throws java.rmi.RemoteException;
    public ResultadoProcesamientoSolicitud[] obtenerResultadoProcesamiento() throws java.rmi.RemoteException;
    public ResultadoBorrado[] borrarEquido(java.lang.String[] uelns) throws java.rmi.RemoteException;
    public ResultadoProcesamientoSolicitud obtenerResultadoProcesamientoPorSolicitud(java.lang.String idSolicitud) throws java.rmi.RemoteException;
    public ResultadoProcesamientoSolicitud[] obtenerResultadoProcesamientoEntreFechas(java.lang.String fechaInicio, java.lang.String fechaFin) throws java.rmi.RemoteException;
    public DatosBasicos dameDatosBasicosEquido(java.lang.String ueln) throws java.rmi.RemoteException;
    public DatosBasicos[] dameDatosBasicosEquidos(java.lang.String[] ueln) throws java.rmi.RemoteException;
    public DatosTitular[] obtenerTitularidadesModificadasPorCCAA(java.lang.String[] uelns, java.lang.String fechaDesde, java.lang.String fechaHasta) throws java.rmi.RemoteException;
}
