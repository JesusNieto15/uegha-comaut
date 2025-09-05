package com.jnr15.wsjuntaex.ws;

public class IEquinosProxy implements com.jnr15.wsjuntaex.ws.IEquinos {
  private String _endpoint = null;
  private com.jnr15.wsjuntaex.ws.IEquinos iEquinos = null;
  
  public IEquinosProxy() {
    _initIEquinosProxy();
  }
  
  public IEquinosProxy(String endpoint) {
    _endpoint = endpoint;
    _initIEquinosProxy();
  }
  
  private void _initIEquinosProxy() {
    try {
      iEquinos = (new com.jnr15.wsjuntaex.ws.EquinosLocator()).getBasicHttpBinding_IEquinos();
      if (iEquinos != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iEquinos)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iEquinos)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iEquinos != null)
      ((javax.xml.rpc.Stub)iEquinos)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jnr15.wsjuntaex.ws.IEquinos getIEquinos() {
    if (iEquinos == null)
      _initIEquinosProxy();
    return iEquinos;
  }
  
  public com.jnr15.wsjuntaex.ws.RespuestaEntradaEquidos altaEquidos(com.jnr15.wsjuntaex.ws.EntradaEquidos entrada) throws java.rmi.RemoteException{
    if (iEquinos == null)
      _initIEquinosProxy();
    return iEquinos.altaEquidos(entrada);
  }
  
  public com.jnr15.wsjuntaex.ws.RespuestaResultadoSolicitudes obtenerResultadoPorSolicitud(java.lang.String datosSolicitud, java.lang.String entidad) throws java.rmi.RemoteException{
    if (iEquinos == null)
      _initIEquinosProxy();
    return iEquinos.obtenerResultadoPorSolicitud(datosSolicitud, entidad);
  }
  
  public com.jnr15.wsjuntaex.ws.RespuestaResultadoSolicitudes obtenerResultadoPorSolicitudEntreFechas(java.lang.String entidad, java.lang.String datos) throws java.rmi.RemoteException{
    if (iEquinos == null)
      _initIEquinosProxy();
    return iEquinos.obtenerResultadoPorSolicitudEntreFechas(entidad, datos);
  }
  
  public com.jnr15.wsjuntaex.ws.RespuestaEntradaEquidos modificarEquido(com.jnr15.wsjuntaex.ws.EntradaEquidos entrada) throws java.rmi.RemoteException{
    if (iEquinos == null)
      _initIEquinosProxy();
    return iEquinos.modificarEquido(entrada);
  }
  
  public com.jnr15.wsjuntaex.ws.RespuestaEntradaEquidos cambioTitularidadEquido(com.jnr15.wsjuntaex.ws.EntradaEquidos entrada) throws java.rmi.RemoteException{
    if (iEquinos == null)
      _initIEquinosProxy();
    return iEquinos.cambioTitularidadEquido(entrada);
  }
  
  public java.lang.String descargarFichero(java.lang.String idSolicitud) throws java.rmi.RemoteException{
    if (iEquinos == null)
      _initIEquinosProxy();
    return iEquinos.descargarFichero(idSolicitud);
  }
  
  
}