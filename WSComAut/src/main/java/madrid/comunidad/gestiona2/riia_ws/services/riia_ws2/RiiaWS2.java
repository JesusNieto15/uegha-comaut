/**
 * RiiaWS2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package madrid.comunidad.gestiona2.riia_ws.services.riia_ws2;

public interface RiiaWS2 extends java.rmi.Remote {
    public riia_ws.veterinarios.beans.ExplotacionBean consultaCodExplotacion(java.lang.String codExplotacion) throws java.rmi.RemoteException;
    public java.util.Vector altaAnimal(riia_ws.veterinarios.beans.AnimalBean[] listaAnimales) throws java.rmi.RemoteException;
    public java.lang.Object[] consultaExplotacEquidosActivas() throws java.rmi.RemoteException;
    public riia_ws.veterinarios.beans.EquidoBean[] consultaEquido(java.lang.String cEspecie, java.lang.String cUeln, java.lang.String cIdelectronica) throws java.rmi.RemoteException;
    public riia_ws.veterinarios.beans.DatosEquidoBean actualizarDatosEquido(java.lang.String codigoUELN, java.lang.String codigoEspecie, java.lang.String codigoRaza, java.lang.String codigoFiabilidad, java.lang.String codigoSexo, java.lang.String castrado, java.lang.String codigoCapa, java.lang.String codigoLugarNacimiento, java.lang.String explotacionNacimiento, java.lang.String fechaNacimiento, java.lang.String codigoTipoIdentificacion, java.lang.String codigoSistemaLectura, java.lang.String idElectronica, java.lang.String idAlternativo, java.lang.String fechaIdentificacion, java.lang.String NIFTitular, java.lang.String literalNombreTitular, java.lang.String literalDireccionTitular, java.lang.String fechaInicioTitular, java.lang.String codigoProvinciaTitular, java.lang.String codigoMunicipioTitular, java.lang.String codigoPostal, java.lang.String codigoOrientacion, java.lang.String literalNombreNacimiento, java.lang.String literalNombreComercial, java.lang.String codigoAptitud, java.lang.String fechaInicioSuspension, java.lang.String duplicado, java.lang.String fechaMuerte, java.lang.String explotacionMuerte, java.lang.String codigoTipoMuerte, java.lang.String caGrabadora, java.lang.String cfCoAsociacion) throws java.rmi.RemoteException;
    public riia_ws.veterinarios.beans.ResultadoBorradoBean[] borrarEquido(java.lang.String cUeln) throws java.rmi.RemoteException;
    public riia_ws.veterinarios.beans.DatosBasicosCompletoBean[] dameDatosBasicosEquido(java.lang.String cUeln) throws java.rmi.RemoteException;
    public riia_ws.veterinarios.beans.DatosMuerteEquidoBean[] dameDatosMuerteEquido(java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException;
    public void destroy() throws java.rmi.RemoteException;
}
