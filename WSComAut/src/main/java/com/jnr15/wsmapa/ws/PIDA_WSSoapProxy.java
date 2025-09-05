package com.jnr15.wsmapa.ws;

public class PIDA_WSSoapProxy implements com.jnr15.wsmapa.ws.PIDA_WSSoap {
  private String _endpoint = null;
  private com.jnr15.wsmapa.ws.PIDA_WSSoap pIDA_WSSoap = null;
  
  public PIDA_WSSoapProxy() {
    _initPIDA_WSSoapProxy();
  }
  
  public PIDA_WSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPIDA_WSSoapProxy();
  }
  
  private void _initPIDA_WSSoapProxy() {
    try {
      pIDA_WSSoap = (new com.jnr15.wsmapa.ws.PIDA_WSLocator()).getPIDA_WSSoap();
      if (pIDA_WSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pIDA_WSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pIDA_WSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pIDA_WSSoap != null)
      ((javax.xml.rpc.Stub)pIDA_WSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jnr15.wsmapa.ws.PIDA_WSSoap getPIDA_WSSoap() {
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap;
  }
  
  public com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud actualizarDatosEquidos(java.lang.String codigoUELN, java.lang.String codigoEspecie, java.lang.String codigoRaza, java.lang.String codigoFiabilidad, java.lang.String codigoSexo, java.lang.String castrado, java.lang.String codigoCapa, java.lang.String codigoLugarNacimiento, java.lang.String explotacionNacimiento, java.lang.String fechaNacimiento, java.lang.String codigoTipoIdentificacion, java.lang.String codigoSistemaLectura, java.lang.String idElectronica, java.lang.String idAlternativo, java.lang.String fechaIdentificacion, java.lang.String NIFTitular, java.lang.String nombreTitular, java.lang.String direccionTitular, java.lang.String inicioTitular, java.lang.String codigoProvinciaTitular, java.lang.String codigoMunicipioTitular, java.lang.String codigoPostal, java.lang.String codigoOrientacion, java.lang.String nombreNacimiento, java.lang.String nombreComercial, java.lang.String codigoAptitud, java.lang.String inicioSuspension, java.lang.String duplicado, java.lang.String fechaMuerte, java.lang.String explotacionMuerte, java.lang.String codigoTipoMuerte, java.lang.String comunidadAutonomaGrabadora) throws java.rmi.RemoteException{
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap.actualizarDatosEquidos(codigoUELN, codigoEspecie, codigoRaza, codigoFiabilidad, codigoSexo, castrado, codigoCapa, codigoLugarNacimiento, explotacionNacimiento, fechaNacimiento, codigoTipoIdentificacion, codigoSistemaLectura, idElectronica, idAlternativo, fechaIdentificacion, NIFTitular, nombreTitular, direccionTitular, inicioTitular, codigoProvinciaTitular, codigoMunicipioTitular, codigoPostal, codigoOrientacion, nombreNacimiento, nombreComercial, codigoAptitud, inicioSuspension, duplicado, fechaMuerte, explotacionMuerte, codigoTipoMuerte, comunidadAutonomaGrabadora);
  }
  
  public com.jnr15.wsmapa.ws.ResultadoGrabacionSolicitud actualizarDatosEquidos_(java.lang.String codigoUELN, java.lang.String codigoEspecie, java.lang.String codigoRaza, java.lang.String codigoFiabilidad, java.lang.String codigoSexo, java.lang.String castrado, java.lang.String codigoCapa, java.lang.String codigoLugarNacimiento, java.lang.String explotacionNacimiento, java.lang.String fechaNacimiento, java.lang.String codigoTipoIdentificacion, java.lang.String codigoSistemaLectura, java.lang.String idElectronica, java.lang.String idAlternativo, java.lang.String fechaIdentificacion, java.lang.String NIFTitular, java.lang.String nombreTitular, java.lang.String direccionTitular, java.lang.String inicioTitular, java.lang.String codigoProvinciaTitular, java.lang.String codigoMunicipioTitular, java.lang.String codigoPostal, java.lang.String codigoOrientacion, java.lang.String nombreNacimiento, java.lang.String nombreComercial, java.lang.String codigoAptitud, java.lang.String inicioSuspension, java.lang.String duplicado, java.lang.String fechaMuerte, java.lang.String explotacionMuerte, java.lang.String codigoTipoMuerte, java.lang.String comunidadAutonomaGrabadora, java.lang.String explotacionUbicacion) throws java.rmi.RemoteException{
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap.actualizarDatosEquidos_(codigoUELN, codigoEspecie, codigoRaza, codigoFiabilidad, codigoSexo, castrado, codigoCapa, codigoLugarNacimiento, explotacionNacimiento, fechaNacimiento, codigoTipoIdentificacion, codigoSistemaLectura, idElectronica, idAlternativo, fechaIdentificacion, NIFTitular, nombreTitular, direccionTitular, inicioTitular, codigoProvinciaTitular, codigoMunicipioTitular, codigoPostal, codigoOrientacion, nombreNacimiento, nombreComercial, codigoAptitud, inicioSuspension, duplicado, fechaMuerte, explotacionMuerte, codigoTipoMuerte, comunidadAutonomaGrabadora, explotacionUbicacion);
  }
  
  public com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[] obtenerResultadoProcesamiento() throws java.rmi.RemoteException{
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap.obtenerResultadoProcesamiento();
  }
  
  public com.jnr15.wsmapa.ws.ResultadoBorrado[] borrarEquido(java.lang.String[] uelns) throws java.rmi.RemoteException{
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap.borrarEquido(uelns);
  }
  
  public com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud obtenerResultadoProcesamientoPorSolicitud(java.lang.String idSolicitud) throws java.rmi.RemoteException{
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap.obtenerResultadoProcesamientoPorSolicitud(idSolicitud);
  }
  
  public com.jnr15.wsmapa.ws.ResultadoProcesamientoSolicitud[] obtenerResultadoProcesamientoEntreFechas(java.lang.String fechaInicio, java.lang.String fechaFin) throws java.rmi.RemoteException{
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap.obtenerResultadoProcesamientoEntreFechas(fechaInicio, fechaFin);
  }
  
  public com.jnr15.wsmapa.ws.DatosBasicos dameDatosBasicosEquido(java.lang.String ueln) throws java.rmi.RemoteException{
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap.dameDatosBasicosEquido(ueln);
  }
  
  public com.jnr15.wsmapa.ws.DatosBasicos[] dameDatosBasicosEquidos(java.lang.String[] ueln) throws java.rmi.RemoteException{
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap.dameDatosBasicosEquidos(ueln);
  }
  
  public com.jnr15.wsmapa.ws.DatosTitular[] obtenerTitularidadesModificadasPorCCAA(java.lang.String[] uelns, java.lang.String fechaDesde, java.lang.String fechaHasta) throws java.rmi.RemoteException{
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap.obtenerTitularidadesModificadasPorCCAA(uelns, fechaDesde, fechaHasta);
  }
  
  public com.jnr15.wsmapa.ws.UbicacionEquido dameUbicacionEquido(java.lang.String ueln) throws java.rmi.RemoteException{
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap.dameUbicacionEquido(ueln);
  }
  
  public com.jnr15.wsmapa.ws.UbicacionEquido[] dameUbicacionEquidos(java.lang.String[] ueln) throws java.rmi.RemoteException{
    if (pIDA_WSSoap == null)
      _initPIDA_WSSoapProxy();
    return pIDA_WSSoap.dameUbicacionEquidos(ueln);
  }
  
  
}