package com.jnr15.wsjcyl.ws;
/**
 * MoraIdentEquinosIF.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public interface MoraIdentEquinosIF extends java.rmi.Remote {
    public java.lang.String borradoAnimal(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String borradoDuplicado(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String borradoTitularidad(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String consultarAnimPorChip(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String consultarAnimPorUELN(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String consultarCEAEquino(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String consultarDatosRepartoPorCEA(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String exportarDatosPorUV(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String exportarEqContraste(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String exportarEqContrasteTotal() throws java.rmi.RemoteException;
    public java.lang.String exportarXMLAnimTituPorNIF(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String exportarXMLCEASEquinos() throws java.rmi.RemoteException;
    public java.lang.String exportarXMLCEASEquinosCyL() throws java.rmi.RemoteException;
    public java.lang.String exportarXMLCEASEquinosProv(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String exportarXMLCambiosCIFTitu() throws java.rmi.RemoteException;
    public java.lang.String exportarXMLMuertes(java.lang.String string_1, java.lang.String string_2, java.lang.String string_3) throws java.rmi.RemoteException;
    public java.lang.String exportarXMLTitusPorUELN(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String exportarXMLVeteIdentif() throws java.rmi.RemoteException;
    public java.lang.String importarXMLCambElec(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String importarXMLDuplicado(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String importarXMLEquidos(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String importarXMLMuertes(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String importarXMLRepAbastos(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String importarXMLReparto(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String importarXMLTME(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String importarXMLTitularidad(java.lang.String string_1) throws java.rmi.RemoteException;
    public java.lang.String importarXMLVeter(java.lang.String string_1) throws java.rmi.RemoteException;
}
