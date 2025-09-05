package com.jnr15.wsja.ws;

public class SigganRiiaEquinoSoapProxy implements SigganRiiaEquinoSoap {
  private String _endpoint = null;
  private SigganRiiaEquinoSoap sigganRiiaEquinoSoap = null;
  
  public SigganRiiaEquinoSoapProxy() {
    _initSigganRiiaEquinoSoapProxy();
  }
  
  public SigganRiiaEquinoSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSigganRiiaEquinoSoapProxy();
  }
  
  private void _initSigganRiiaEquinoSoapProxy() {
    try {
      sigganRiiaEquinoSoap = (new SigganRiiaEquinoLocator()).getsigganRiiaEquinoSoap();
      if (sigganRiiaEquinoSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sigganRiiaEquinoSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sigganRiiaEquinoSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sigganRiiaEquinoSoap != null)
      ((javax.xml.rpc.Stub)sigganRiiaEquinoSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public SigganRiiaEquinoSoap getSigganRiiaEquinoSoap() {
    if (sigganRiiaEquinoSoap == null)
      _initSigganRiiaEquinoSoapProxy();
    return sigganRiiaEquinoSoap;
  }
  
  public ResultadoGrabacionSolicitud actualizarDatosEquidos(java.lang.String codigoUELN, java.lang.String codigoEspecie, java.lang.String codigoRaza, java.lang.String codigoFiabilidad, java.lang.String codigoSexo, java.lang.String castrado, java.lang.String codigoCapa, java.lang.String codigoLugarNacimiento, java.lang.String explotacionNacimiento, java.lang.String fechaNacimiento, java.lang.String codigoTipoIdentificacion, java.lang.String codigoSistemaLectura, java.lang.String idElectronica, java.lang.String idAlternativo, java.lang.String fechaIdentificacion, java.lang.String NIFTitular, java.lang.String nombreTitular, java.lang.String direccionTitular, java.lang.String inicioTitular, java.lang.String codigoProvinciaTitular, java.lang.String codigoMunicipioTitular, java.lang.String codigoPostal, java.lang.String codigoOrientacion, java.lang.String nombreNacimiento, java.lang.String nombreComercial, java.lang.String codigoAptitud, java.lang.String inicioSuspension, java.lang.String duplicado, java.lang.String fechaMuerte, java.lang.String explotacionMuerte, java.lang.String codigoTipoMuerte, java.lang.String comunidadAutonomaGrabadora) throws java.rmi.RemoteException{
    if (sigganRiiaEquinoSoap == null)
      _initSigganRiiaEquinoSoapProxy();
    return sigganRiiaEquinoSoap.actualizarDatosEquidos(codigoUELN, codigoEspecie, codigoRaza, codigoFiabilidad, codigoSexo, castrado, codigoCapa, codigoLugarNacimiento, explotacionNacimiento, fechaNacimiento, codigoTipoIdentificacion, codigoSistemaLectura, idElectronica, idAlternativo, fechaIdentificacion, NIFTitular, nombreTitular, direccionTitular, inicioTitular, codigoProvinciaTitular, codigoMunicipioTitular, codigoPostal, codigoOrientacion, nombreNacimiento, nombreComercial, codigoAptitud, inicioSuspension, duplicado, fechaMuerte, explotacionMuerte, codigoTipoMuerte, comunidadAutonomaGrabadora);
  }
  
  public ResultadoGrabacionSolicitud actualizarDatosEquidos_(java.lang.String codigoUELN, java.lang.String codigoEspecie, java.lang.String codigoRaza, java.lang.String codigoFiabilidad, java.lang.String codigoSexo, java.lang.String castrado, java.lang.String codigoCapa, java.lang.String codigoLugarNacimiento, java.lang.String explotacionNacimiento, java.lang.String fechaNacimiento, java.lang.String codigoTipoIdentificacion, java.lang.String codigoSistemaLectura, java.lang.String idElectronica, java.lang.String idAlternativo, java.lang.String fechaIdentificacion, java.lang.String NIFTitular, java.lang.String nombreTitular, java.lang.String direccionTitular, java.lang.String inicioTitular, java.lang.String codigoProvinciaTitular, java.lang.String codigoMunicipioTitular, java.lang.String codigoPostal, java.lang.String codigoOrientacion, java.lang.String nombreNacimiento, java.lang.String nombreComercial, java.lang.String codigoAptitud, java.lang.String inicioSuspension, java.lang.String duplicado, java.lang.String fechaMuerte, java.lang.String explotacionMuerte, java.lang.String codigoTipoMuerte, java.lang.String comunidadAutonomaGrabadora, java.lang.String explotacionUbicacion) throws java.rmi.RemoteException{
    if (sigganRiiaEquinoSoap == null)
      _initSigganRiiaEquinoSoapProxy();
    return sigganRiiaEquinoSoap.actualizarDatosEquidos_(codigoUELN, codigoEspecie, codigoRaza, codigoFiabilidad, codigoSexo, castrado, codigoCapa, codigoLugarNacimiento, explotacionNacimiento, fechaNacimiento, codigoTipoIdentificacion, codigoSistemaLectura, idElectronica, idAlternativo, fechaIdentificacion, NIFTitular, nombreTitular, direccionTitular, inicioTitular, codigoProvinciaTitular, codigoMunicipioTitular, codigoPostal, codigoOrientacion, nombreNacimiento, nombreComercial, codigoAptitud, inicioSuspension, duplicado, fechaMuerte, explotacionMuerte, codigoTipoMuerte, comunidadAutonomaGrabadora, explotacionUbicacion);
  }
  
  public ResultadoProcesamientoSolicitud[] obtenerResultadoProcesamiento() throws java.rmi.RemoteException{
    if (sigganRiiaEquinoSoap == null)
      _initSigganRiiaEquinoSoapProxy();
    return sigganRiiaEquinoSoap.obtenerResultadoProcesamiento();
  }
  
  public ResultadoBorrado[] borrarEquido(java.lang.String[] uelns) throws java.rmi.RemoteException{
    if (sigganRiiaEquinoSoap == null)
      _initSigganRiiaEquinoSoapProxy();
    return sigganRiiaEquinoSoap.borrarEquido(uelns);
  }
  
  public ResultadoProcesamientoSolicitud obtenerResultadoProcesamientoPorSolicitud(java.lang.String idSolicitud) throws java.rmi.RemoteException{
    if (sigganRiiaEquinoSoap == null)
      _initSigganRiiaEquinoSoapProxy();
    return sigganRiiaEquinoSoap.obtenerResultadoProcesamientoPorSolicitud(idSolicitud);
  }
  
  public ResultadoProcesamientoSolicitud[] obtenerResultadoProcesamientoEntreFechas(java.lang.String fechaInicio, java.lang.String fechaFin) throws java.rmi.RemoteException{
    if (sigganRiiaEquinoSoap == null)
      _initSigganRiiaEquinoSoapProxy();
    return sigganRiiaEquinoSoap.obtenerResultadoProcesamientoEntreFechas(fechaInicio, fechaFin);
  }
  
  public DatosBasicos dameDatosBasicosEquido(java.lang.String ueln) throws java.rmi.RemoteException{
    if (sigganRiiaEquinoSoap == null)
      _initSigganRiiaEquinoSoapProxy();
    return sigganRiiaEquinoSoap.dameDatosBasicosEquido(ueln);
  }
  
  public DatosBasicos[] dameDatosBasicosEquidos(java.lang.String[] ueln) throws java.rmi.RemoteException{
    if (sigganRiiaEquinoSoap == null)
      _initSigganRiiaEquinoSoapProxy();
    return sigganRiiaEquinoSoap.dameDatosBasicosEquidos(ueln);
  }
  
  public DatosTitular[] obtenerTitularidadesModificadasPorCCAA(java.lang.String[] uelns, java.lang.String fechaDesde, java.lang.String fechaHasta) throws java.rmi.RemoteException{
    if (sigganRiiaEquinoSoap == null)
      _initSigganRiiaEquinoSoapProxy();
    return sigganRiiaEquinoSoap.obtenerTitularidadesModificadasPorCCAA(uelns, fechaDesde, fechaHasta);
  }
  
  
}