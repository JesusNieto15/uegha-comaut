/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15;

import dao.IDAOComAutSolicitud;
import dao.IDAODatosEquidosComAut;
import dao.IDAOInceccaConsultas;
import dao.JDBCDAOComAutSolicitud;
import dao.JDBCDAODatosEquidosComAut;
import dao.JDBCDAOInceccaConsultas;
import java.io.File;
import java.io.FileReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.DatosEquidosComAut;
import modelo.ComAutSolicitud;
import modelo.RespuestaComAutSolicitud;

/**
 *
 * @author Jesús Nieto Rodríguez jesusnieto@invengenio.com
 */
public class ControladorBase {

    private static ControladorBase controlador = null;
    private final IDAOComAutSolicitud daoComAutSolicitud;
    private final IDAODatosEquidosComAut daoDatosEquidosComAut;
    private final IDAOInceccaConsultas daoConsultasIncecca;
    private final Properties propiedades;

    private ControladorBase() throws Exception {
        daoComAutSolicitud = JDBCDAOComAutSolicitud.obtenerDao();
        daoDatosEquidosComAut = JDBCDAODatosEquidosComAut.obtenerDao();
        daoConsultasIncecca = JDBCDAOInceccaConsultas.obtenerDao();
        propiedades = new Properties();
        propiedades.load(new FileReader(new File("./recursos/variables_ws.properties")));
    }

    public static ControladorBase obtenerControlador() throws Exception {
        if (controlador == null) {
            controlador = new ControladorBase();
        }
        return controlador;
    }
    
    public Properties obtenerPropiedades(){
        return propiedades;
    }

    public String addCerosDelante(String campo, int longitudCampo) {
        String res = campo;
        while (res.length() < longitudCampo) {
            res = "0" + res;
        }
        return res;
    }

    public void ejecutarSolicitudesMasivamente() throws Exception {
        List<ComAutSolicitud> solicitudes = this.daoComAutSolicitud.solicitudesPendientesDeEnviar();
        String comunidadCompetente = null;
        RespuestaComAutSolicitud respuestaASolicitud = null;
        for (ComAutSolicitud solicitud : solicitudes) {
            respuestaASolicitud = new RespuestaComAutSolicitud();
            respuestaASolicitud.setId(solicitud.getId());
            respuestaASolicitud.setFecha(Date.valueOf(LocalDate.now()));
            respuestaASolicitud.setSolicitudCodigoUELN(solicitud.getUeln());
            try {
                if (solicitud.getTipo().equals(ConstantesComunes.MOTIVO_INSCRIPCION.getInteger())) {
                    comunidadCompetente = getComunidadCompetenteSegunREGA(solicitud);
                    if (comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_ANDALUCIA.getString())) {
                        ejecutarSolicitudAndaluciaActualizarEquido(solicitud);
                    } else if (comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_CASTILLAYLEON.getString())) {
                        ejecutarSolicitudCastillaYLeonActualizarEquido(solicitud);
                    } else if(comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_EXTREMADURA.getString())){
                        ejecutarSolicitudExtremaduraAlta(solicitud);
                    } else if(comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_CASTILLA_LA_MANCHA.getString())){
                        ejecutarSolicitudCastillaLaManchaActualizarEjemplar(solicitud);
                    } else if(comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_MADRID.getString())){
                        ejecutarSolicitudMadridActualizarEjemplar(solicitud);
                    } else if(comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_GALICIA.getString())){
                        ejecutarSolicitudGaliciaActualizarEjemplar(solicitud);
                    }

                } else {
                    comunidadCompetente = getComunidadCompetenteSegunMinisterio(solicitud);
                    if (comunidadCompetente == null) {
                        respuestaASolicitud.setSolicitudCodigoError(ConstantesComunes.CODIGO_MINISTERIO_SIN_CCAA.getString());
                        respuestaASolicitud.setSolicitudDescripcionError(ConstantesComunes.MENSAJE_MINISTERIO_SIN_CCAA.getString());
                        this.daoComAutSolicitud.insertar(respuestaASolicitud);
                        continue;
                    }
                    if (comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_ANDALUCIA.getString())) {
                        ejecutarSolicitudAndaluciaActualizarEquido(solicitud);
                    } else if (comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_CASTILLAYLEON.getString())) {
                        if (solicitud.getTipo().equals(ConstantesComunes.MOTIVO_CAMBIO_TITULAR.getInteger())) {
                            ejecutarSolicitudCastillaYLeonActualizarTitularidadEquido(solicitud);
                        } else {
                            //ejecutarSolicitudCastillaYLeonActualizarEquido(solicitud);
                        }
                    } else if(comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_EXTREMADURA.getString())){
                        if(solicitud.getTipo().equals(ConstantesComunes.MOTIVO_CAMBIO_TITULAR.getInteger())){
                            ejecutarSolicitudExtremaduraTitularidad(solicitud);
                        }
                    }else if(comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_CASTILLA_LA_MANCHA.getString())){
                        ejecutarSolicitudCastillaLaManchaActualizarEjemplar(solicitud);
                    }else if(comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_MADRID.getString())){
                        ejecutarSolicitudMadridActualizarEjemplar(solicitud);
                    }else if(comunidadCompetente.equals(ConstantesComunes.CODIGO_UBICACION_GALICIA.getString())){
                        ejecutarSolicitudGaliciaActualizarEjemplar(solicitud);
                    } else {
                        respuestaASolicitud.setSolicitudDescripcionError("CCAA competente: " + comunidadCompetente);
                    }
                }
            } catch (Exception e) {
                respuestaASolicitud.setSolicitudCodigoError(ConstantesComunes.CODIGO_EXCEPCION_INTERNA.getString());
                respuestaASolicitud.setSolicitudDescripcionError("Excepción: " + e.getMessage());
                this.daoComAutSolicitud.insertar(respuestaASolicitud);
            }
        }
    }

    private String getComunidadCompetenteSegunREGA(ComAutSolicitud solicitud) throws Exception {
        String rega = daoDatosEquidosComAut.datosEquidosComAutPorUELN(solicitud.getUeln()).getExplotacionNacimiento();
        if (rega.startsWith("ES04")
                || rega.startsWith("ES11")
                || rega.startsWith("ES14")
                || rega.startsWith("ES18")
                || rega.startsWith("ES21")
                || rega.startsWith("ES23")
                || rega.startsWith("ES29")
                || rega.startsWith("ES41")) {
            return ConstantesComunes.CODIGO_UBICACION_ANDALUCIA.getString();
        } else if (rega.startsWith("ES05")
                || rega.startsWith("ES09")
                || rega.startsWith("ES24")
                || rega.startsWith("ES34")
                || rega.startsWith("ES37")
                || rega.startsWith("ES40")
                || rega.startsWith("ES42")
                || rega.startsWith("ES47")
                || rega.startsWith("ES49")) {
            return ConstantesComunes.CODIGO_UBICACION_CASTILLAYLEON.getString();
        } else if (rega.startsWith("ES06")
                || rega.startsWith("ES10")) {
            return ConstantesComunes.CODIGO_UBICACION_EXTREMADURA.getString();
        } else if (rega.startsWith("ES02")
                || rega.startsWith("ES13")
                || rega.startsWith("ES16")
                || rega.startsWith("ES19")
                || rega.startsWith("ES45")) {
            return ConstantesComunes.CODIGO_UBICACION_CASTILLA_LA_MANCHA.getString();
        } else if(rega.startsWith("ES28")){
            return ConstantesComunes.CODIGO_UBICACION_MADRID.getString();
        } else if (rega.startsWith("ES15")
                || rega.startsWith("ES27")
                || rega.startsWith("ES32")
                || rega.startsWith("ES36")) {
            return ConstantesComunes.CODIGO_UBICACION_GALICIA.getString();
        } else {
            return "COMUNIDAD DESCONOCIDA";
        }
    }

    private String getComunidadCompetenteSegunMinisterio(ComAutSolicitud solicitud) throws Exception {
        String[] respuesta = getComunidadCompetenteSegunMinisterio(solicitud.getUeln());
        return respuesta != null ? respuesta[0] : null;
    }

    public String[] getComunidadCompetenteSegunMinisterio(String ueln) throws Exception {
        //Tras conversación mantenida con Castilla Y León, se determina que cualquier cambio en el animal (datos, titular, etc)
        //se debe comunicar a la comunidad competente de nacimiento, es decir, la comunidad declarada como organismo emisor.
        //Por ello comentamos el return de abajo, para desactivar lo que queda obsoleto, y declaramos el vigente return 
        //return ControladorWSMapa.obtenerControlador().obtenerCodigoUbicacionPorUeln(ueln);
        return getComunidadOrganismoEmisor(ueln);
    }
    
    public String[] getComunidadOrganismoEmisor(String ueln) throws Exception {
        return ControladorWSMapa.obtenerControlador().obtenerCodigoOrganismoEmisor(ueln);
    }

    private void ejecutarSolicitudAndaluciaActualizarEquido(ComAutSolicitud solicitud) throws Exception {
        ControladorWSJA controladorAndalucia = ControladorWSJA.obtenerControlador();
        controladorAndalucia.actualizarDatosEquidos(solicitud);
    }

    private void ejecutarSolicitudCastillaYLeonActualizarEquido(ComAutSolicitud solicitud) throws Exception {
        ControladorWsjcyl controladorCastillaYLeon = ControladorWsjcyl.obtenerControlador();
        controladorCastillaYLeon.actualizarDatosEquidos(solicitud);
    }

    private void ejecutarSolicitudCastillaYLeonActualizarTitularidadEquido(ComAutSolicitud solicitud) throws Exception {
        ControladorWsjcyl.obtenerControlador().actualizarTitularidadEquidos(solicitud);
    }
    
    private void ejecutarSolicitudExtremaduraAlta(ComAutSolicitud solicitud) throws Exception {
        ControladorWSJuntaExt.obtenerControlador().altaEquidos(solicitud);
    }
    
    private void ejecutarSolicitudExtremaduraTitularidad(ComAutSolicitud solicitud) throws Exception {
        ControladorWSJuntaExt.obtenerControlador().cambioTitularEquidos(solicitud);
    }
    
    private void ejecutarSolicitudCastillaLaManchaActualizarEjemplar(ComAutSolicitud solicitud) throws Exception {
        ControladorWSJCCM.obtenerControlador().actualizarDatosEquidos(solicitud);
    }
    
    private void ejecutarSolicitudMadridActualizarEjemplar(ComAutSolicitud solicitud) throws Exception {
        ControladorWSMadrid.obtenerControlador().actualizarDatosEquidos(solicitud);
    }
    
    private void ejecutarSolicitudGaliciaActualizarEjemplar(ComAutSolicitud solicitud) throws Exception {
        ControladorWSGalicia.obtenerControlador().actualizarDatosEquidos(solicitud);
    }

    public DatosEquidosComAut datosEquidosPorUeln(String ueln) throws Exception {
        return daoDatosEquidosComAut.datosEquidosComAutPorUELN(ueln);
    }

    public DatosEquidosComAut datosEquidosPorIdIncecca(Integer idIncecca) throws Exception {
        return daoDatosEquidosComAut.datosEquidosComAutPorIdProducto(idIncecca);
    }

    public DefaultTableModel obtenerModeloTablaDatosEquidoComAut(String ueln) throws Exception {
        DatosEquidosComAut datos = datosEquidosPorUeln(ueln);
        DefaultTableModel model = new DefaultTableModel(new String[]{"Campo", "Valor"}, 0);
        if (datos != null) {
            model.addRow(new Object[]{"Código UELN", datos.getCodigoUELN()});
            model.addRow(new Object[]{"Código especie", datos.getCodigoEspecie()});
            model.addRow(new Object[]{"Código raza", datos.getCodigoRaza()});
            model.addRow(new Object[]{"Código fiabilidad", datos.getCodigoFiabilidad()});
            model.addRow((new Object[]{"Código sexo", addCerosDelante(datos.getCodigoSexo(), 2)}));
            model.addRow(new Object[]{"Castrado", datos.getCastrado()});
            model.addRow(new Object[]{"Código capa", addCerosDelante(datos.getCodigoCapa(), 2)});
            model.addRow(new Object[]{"Código lugar nacimiento", datos.getCodigoLugarNacimiento()});
            model.addRow(new Object[]{"Explotación nacimiento", datos.getExplotacionNacimiento()});
            model.addRow(new Object[]{"Fecha nacimiento", datos.getFechaNacimiento()});
            model.addRow(new Object[]{"Tipo identificación", addCerosDelante(datos.getCodigoTipoIdentificacion(), 2)});
            model.addRow(new Object[]{"Código sistema de lectura", addCerosDelante(datos.getCodigoSistemaLectura(), 2)});
            model.addRow(new Object[]{"Identificación electrónica", datos.getIdElectronica()});
            model.addRow(new Object[]{"Identificación alternativa", datos.getIdAlternativo()});
            model.addRow(new Object[]{"Fecha identificación", datos.getFechaIdentificacion()});
            model.addRow(new Object[]{"NIF titular", datos.getNIFTitular()});
            model.addRow(new Object[]{"Nombre titular", datos.getNombreTitular()});
            model.addRow(new Object[]{"Apellidos titular", datos.getApellidosTitular()});
            model.addRow(new Object[]{"Dirección titular", datos.getLiteralDireccionTitular() == null ? "SIN DATOS" : datos.getLiteralDireccionTitular()});
            model.addRow(new Object[]{"Fecha inicio titularidad", datos.getFechaInicioTitular()});
            model.addRow(new Object[]{"Código provincia titular", datos.getCodigoProvinciaTitular()});
            model.addRow(new Object[]{"Código municipio titular", datos.getCodigoMunicipioTitular()});
            model.addRow(new Object[]{"Código postal", datos.getCodigoPostal()});
            model.addRow(new Object[]{"Código orientación", addCerosDelante(datos.getCodigoOrientacion(), 2)});
            model.addRow(new Object[]{"Nombre nacimiento", datos.getLiteralNombreNacimiento()});
            model.addRow(new Object[]{"Nombre comercial", datos.getLiteralNombreComercial()});
            model.addRow(new Object[]{"Código aptitud", addCerosDelante(datos.getCodigoAptitud(), 2)});
            model.addRow(new Object[]{"Fecha inicio suspensión", datos.getFechaInicioSuspension()});
            model.addRow(new Object[]{"Duplicado", datos.getDuplicado()});
            model.addRow(new Object[]{"Fecha muerte", datos.getFechaMuerte()});
            model.addRow(new Object[]{"Explotación muerte", datos.getExplotacionMuerte()});
            model.addRow(new Object[]{"Código tipo muerte", datos.getCodigoTipoMuerte() != null ? addCerosDelante(datos.getCodigoTipoMuerte(), 2) : datos.getCodigoTipoMuerte()});
            model.addRow(new Object[]{"Comunidad autónoma grabadora", datos.getCaGrabadora()});
            model.addRow(new Object[]{"Explotación ubicación", datos.getExplotacionUbicacion()});
        }
        return model;
    }

    public DefaultTableModel modeloTablaObtenerDatosEquidosDesdeCCAA(String comunidadAutonoma, String ueln, JTable tDatos) throws Exception {
        DefaultTableModel res = null;
        if (comunidadAutonoma.equals(ConstantesComunes.CODIGO_UBICACION_ANDALUCIA.getString())) {
            res = ControladorWSJA.obtenerControlador().obtenerDatosBasicosDeUnEquido(ueln);
        } else if (comunidadAutonoma.equals(ConstantesComunes.CODIGO_UBICACION_CASTILLAYLEON.getString())) {
            res = ControladorWsjcyl.obtenerControlador().obtenerDatosBasicosDeUnEquidoPorUELN(ueln);
        } else if (comunidadAutonoma.equals(ConstantesComunes.CODIGO_UBICACION_MADRID.getString())){
            res = ControladorWSMadrid.obtenerControlador().obtenerDatosBasicosDeUnEquido(ueln);
        }
        if (res != null) {
            tDatos.setModel(res);
        }
        return res;
    }

    public String respuestaWSViewEnvioPorUELN(String comunidadAutonoma, JTable tDatos) throws Exception {
        String res = null;
        if (comunidadAutonoma.equals(ConstantesComunes.CODIGO_UBICACION_ANDALUCIA.getString())) {
            res = ControladorWSJA.obtenerControlador().actualizarDatosEquidoDesdeTabla(tDatos);
        } else if (comunidadAutonoma.equals(ConstantesComunes.CODIGO_UBICACION_CASTILLAYLEON.getString())) {
            res = ControladorWsjcyl.obtenerControlador().actualizarDatosEquidoDesdeTabla(tDatos);
        } else if(comunidadAutonoma.equals(ConstantesComunes.CODIGO_UBICACION_EXTREMADURA.getString())){
            res = ControladorWSJuntaExt.obtenerControlador().actualizarDatosEquidoDesdeTabla(tDatos);
        } else if(comunidadAutonoma.equals(ConstantesComunes.CODIGO_UBICACION_CASTILLA_LA_MANCHA.getString())){
            res = ControladorWSJCCM.obtenerControlador().actualizarDatosEquidoDesdeTabla(tDatos);
        } else if(comunidadAutonoma.equals(ConstantesComunes.CODIGO_UBICACION_MADRID.getString())){
            res = ControladorWSMadrid.obtenerControlador().actualizarDatosEquidoDesdeTabla(tDatos);
        } else if(comunidadAutonoma.equals(ConstantesComunes.CODIGO_UBICACION_GALICIA.getString())){
            res = ControladorWSGalicia.obtenerControlador().actualizarDatosEquidoDesdeTabla(tDatos);
        } else if(comunidadAutonoma.equals(ConstantesComunes.CODIGO_UBICACION_BALEARES.getString())){
            res = ControladorWSBaleares.obtenerControlador().altaEquidoDesdeTabla(tDatos);
        } else if(comunidadAutonoma.equals(ConstantesComunes.TITULO_VENTANA_BALEARES_ACTUALIZAR_EQUIDO.getString())){
            res = ControladorWSBaleares.obtenerControlador().actualizarEquidoDesdeTabla(tDatos);
        }
        return res;
    }

    public DatosEquidosComAut obtenerDatosEquidosComAutDesdeTabla(JTable table) {
        DatosEquidosComAut datos = new DatosEquidosComAut();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if (model.getRowCount() > 0) {
            datos.setCodigoUELN((String) model.getValueAt(0, 1));
            datos.setCodigoEspecie((String) model.getValueAt(1, 1));
            datos.setCodigoRaza((String) model.getValueAt(2, 1));
            datos.setCodigoFiabilidad((String) model.getValueAt(3, 1));
            datos.setCodigoSexo((String) model.getValueAt(4, 1));
            datos.setCastrado((String) model.getValueAt(5, 1));
            datos.setCodigoCapa((String) model.getValueAt(6, 1));
            datos.setCodigoLugarNacimiento((String) model.getValueAt(7, 1));
            datos.setExplotacionNacimiento((String) model.getValueAt(8, 1));
            datos.setFechaNacimiento((String) model.getValueAt(9, 1));
            datos.setCodigoTipoIdentificacion((String) model.getValueAt(10, 1));
            datos.setCodigoSistemaLectura((String) model.getValueAt(11, 1));
            datos.setIdElectronica((String) model.getValueAt(12, 1));
            datos.setIdAlternativo((String) model.getValueAt(13, 1));
            datos.setFechaIdentificacion((String) model.getValueAt(14, 1));
            datos.setNIFTitular((String) model.getValueAt(15, 1));
            datos.setNombreTitular((String) model.getValueAt(16, 1));
            datos.setApellidosTitular((String) model.getValueAt(17, 1));
            datos.setLiteralDireccionTitular((String) model.getValueAt(18, 1));
            datos.setFechaInicioTitular((String) model.getValueAt(19, 1));
            datos.setCodigoProvinciaTitular((String) model.getValueAt(20, 1));
            datos.setCodigoMunicipioTitular((String) model.getValueAt(21, 1));
            datos.setCodigoPostal((String) model.getValueAt(22, 1));
            datos.setCodigoOrientacion((String) model.getValueAt(23, 1));
            datos.setLiteralNombreNacimiento((String) model.getValueAt(24, 1));
            datos.setLiteralNombreComercial((String) model.getValueAt(25, 1));
            datos.setCodigoAptitud((String) model.getValueAt(26, 1));
            datos.setFechaInicioSuspension((String) model.getValueAt(27, 1));
            datos.setDuplicado((String) model.getValueAt(28, 1));
            datos.setFechaMuerte((String) model.getValueAt(29, 1));
            datos.setExplotacionMuerte((String) model.getValueAt(30, 1));
            datos.setCodigoTipoMuerte((String) model.getValueAt(31, 1));
            datos.setCaGrabadora((String) model.getValueAt(32, 1));
            datos.setExplotacionUbicacion((String) model.getValueAt(33, 1));
        }
        return datos;
    }
    
    public String respuestaWSCyLCambioTitularidadDesdeTabla(JTable table) throws Exception {
        DatosEquidosComAut datosEquidosComAut = obtenerDatosEquidosComAutDesdeTabla(table);
        return ControladorWsjcyl.obtenerControlador().actualizarTitularidadDesdeDatosEquidosComAut(datosEquidosComAut);
    }
    
    public String respuestaWSCyLBorradoAnimal(JTable table) throws Exception {
        DatosEquidosComAut datosEquidosComAut = obtenerDatosEquidosComAutDesdeTabla(table);
        return ControladorWsjcyl.obtenerControlador().borrarEjemplarPorUelnDesdeDatosEquidosComAut(datosEquidosComAut);
    }
    
    public String respuestaWSJuntaExtremaduraCambioTitularidad(JTable table) throws Exception {
        return ControladorWSJuntaExt.obtenerControlador().actualizarTitularidadDesdeDatosEquidosComAut(table);
    }
    
    public String respuestaWSJuntaExtremaduraModificacion(JTable table) throws Exception {
        return ControladorWSJuntaExt.obtenerControlador().modificarEquidoDesdeTabla(table);
    }
    
    public String[] nombreApellidosEnInceccaPorNif(String nif) throws Exception {
        return daoConsultasIncecca.nombreApellidosPorNif(nif);
    }
    
    public String formatoFechaDDMMYYYY(String fecha) throws Exception {
        String res = null;
        if(fecha!=null){
            java.util.Date dateOrigen = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
            res = new SimpleDateFormat("dd/MM/yyyy").format(dateOrigen);
        }
        return res;
    }
    
    public String formatoFechaDD_MM_YYYY(String fecha) throws Exception {
        String res = null;
        if(fecha!=null){
            java.util.Date dateOrigen = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
            res = new SimpleDateFormat("dd-MM-yyyy").format(dateOrigen);
        }
        return res;
    }
    
    public String[] obtenerTelefonosEmailDesdeIncecca(String nif) throws Exception {
        return daoConsultasIncecca.telefonosEmailPorNif(nif);
    }

}
