package com.jnr15;

import java.io.StringWriter;
import java.net.URL;
import com.jnr15.wsjcyl.firmadorXML.Firmador;
import com.jnr15.wsjcyl.ws.DatosBorradoAnimTipo;
import com.jnr15.wsjcyl.ws.DatosEq;
import com.jnr15.wsjcyl.ws.DatosEquinoTipo;
import com.jnr15.wsjcyl.ws.DatosTituEqTipo;
import com.jnr15.wsjcyl.ws.MoraIdentEquinos;
import com.jnr15.wsjcyl.ws.MoraIdentEquinosIF;
import com.jnr15.wsjcyl.ws.MoraIdentEquinosIFBindingStub;
import com.jnr15.wsjcyl.ws.MoraIdentEquinosLocator;
import com.jnr15.wsjcyl.ws.ObjectFactory;
import dao.JDBCDAOComAutSolicitud;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.datatype.DatatypeFactory;
import modelo.DatosEquidosComAut;
import modelo.ComAutSolicitud;
import modelo.RespuestaComAutSolicitud;

public class ControladorWsjcyl {

    private String peticion;
    private static ControladorWsjcyl controlador;
    private final ControladorBase controladorBase;
    private final MoraIdentEquinosIF stubWebJcyl;

    private ControladorWsjcyl() throws Exception {
        controladorBase = ControladorBase.obtenerControlador();
        //ajustSizeHandshakeMessage();
        MoraIdentEquinos fServicio = new MoraIdentEquinosLocator();
        stubWebJcyl = new MoraIdentEquinosIFBindingStub(new URL(controladorBase.obtenerPropiedades().getProperty("endpoint_wsjcyl")), fServicio);
    }

    public static ControladorWsjcyl obtenerControlador() throws Exception {
        if (controlador == null) {
            controlador = new ControladorWsjcyl();
        }
        return controlador;
    }

    //Par pruebas exclusivas de este WS (Test1) habrá que habilitar este método y descomentar su invocación en el constructor 
    /*private void ajustSizeHandshakeMessage() {
        //Ajustamos el tamaño a dos veces lo establecido por defecto (32768), siendo el resultado de 65536
        System.setProperty("jdk.tls.maxHandshakeMessageSize", "65536");
    }*/
    public DatosEq dameDatosEquinoPorUeln(String ueln) throws Exception {
        String respuestaServidor = stubWebJcyl.consultarAnimPorUELN(ueln);
        StringReader sR = new StringReader(respuestaServidor);
        JAXBContext contexto = JAXBContext.newInstance(DatosEq.class);
        Unmarshaller unmarshaller = contexto.createUnmarshaller();
        return (DatosEq) unmarshaller.unmarshal(sR);
    }

    public String importarXMLEquidoXades4J(DatosEquinoTipo datosEquino) throws Exception {
        ObjectFactory of = new ObjectFactory();
        JAXBElement<DatosEquinoTipo> jaxbElement = of.createDatosEquino(datosEquino);
        JAXBContext contextJAXB = JAXBContext.newInstance(DatosEquinoTipo.class);
        Marshaller m = contextJAXB.createMarshaller();
        StringWriter sw = new StringWriter();
        m.marshal(jaxbElement, sw);
        peticion = Firmador.obtenerFirmador().firmarXML(sw.toString(),
                controladorBase.obtenerPropiedades().getProperty("ruta_certificado_pfx"),
                controladorBase.obtenerPropiedades().getProperty("tipo_certificado_pfx"),
                controladorBase.obtenerPropiedades().getProperty("passkeystore"));
        return stubWebJcyl.importarXMLEquidos(peticion);
    }

    public String importarXMLTitularidadXades4J(DatosTituEqTipo datosTitularidad) throws Exception {
        ObjectFactory of = new ObjectFactory();
        JAXBElement<DatosTituEqTipo> jaxbElement = of.createDatosTituEq(datosTitularidad);
        JAXBContext contextJAXB = JAXBContext.newInstance(DatosTituEqTipo.class);
        Marshaller m = contextJAXB.createMarshaller();
        StringWriter sw = new StringWriter();
        m.marshal(jaxbElement, sw);
        peticion = Firmador.obtenerFirmador().firmarXML(sw.toString(),
                controladorBase.obtenerPropiedades().getProperty("ruta_certificado_pfx"),
                controladorBase.obtenerPropiedades().getProperty("tipo_certificado_pfx"),
                controladorBase.obtenerPropiedades().getProperty("passkeystore"));
        return stubWebJcyl.importarXMLTitularidad(peticion);
    }
    
    public String borradoAnimal(DatosBorradoAnimTipo datosBorrado) throws Exception {
        ObjectFactory of = new ObjectFactory();
        JAXBElement<DatosBorradoAnimTipo> jaxbElement = of.createDatosBorradoAnim(datosBorrado);
        JAXBContext contextoJAXB = JAXBContext.newInstance(DatosBorradoAnimTipo.class);
        Marshaller m = contextoJAXB.createMarshaller();
        StringWriter sw = new StringWriter();
        m.marshal(jaxbElement,sw);
        peticion = Firmador.obtenerFirmador().firmarXML(sw.toString(),
                controladorBase.obtenerPropiedades().getProperty("ruta_certificado_pfx"),
                controladorBase.obtenerPropiedades().getProperty("tipo_certificado_pfx"),
                controladorBase.obtenerPropiedades().getProperty("passkeystore"));
        return stubWebJcyl.borradoAnimal(peticion);
    }   

    public DefaultTableModel obtenerDatosBasicosDeUnEquidoPorUELN(String ueln) throws Exception {
        DatosEq datosEquido = dameDatosEquinoPorUeln(ueln);
        if (datosEquido == null || datosEquido.getUeln() == null || datosEquido.getUeln().trim().length() == 0) {
            return null;
        } else {
            Object[][] datosTabla = new Object[30][2];
            datosTabla[0][0] = "Origen";
            datosTabla[0][1] = datosEquido.getOrigen();
            datosTabla[1][0] = "Código Identificación";
            datosTabla[1][1] = datosEquido.getUeln();
            datosTabla[2][0] = "Código especie id";
            datosTabla[2][1] = datosEquido.getcEspecieID();
            datosTabla[3][0] = "Descripción especie";
            datosTabla[3][1] = datosEquido.getdEspecie();
            datosTabla[4][0] = "Nombre comercial";
            datosTabla[4][1] = datosEquido.getdNombreComercial();
            datosTabla[5][0] = "Nombre nacimiento";
            datosTabla[5][1] = datosEquido.getdNombreNacimiento();
            datosTabla[6][0] = "Código raza";
            datosTabla[6][1] = datosEquido.getcRazaId();
            datosTabla[7][0] = "Descripción raza";
            datosTabla[7][1] = datosEquido.getdRaza();
            datosTabla[8][0] = "Sexo id";
            datosTabla[8][1] = datosEquido.getcSexoId();
            datosTabla[9][0] = "Descripción sexo";
            datosTabla[9][1] = datosEquido.getdSexo();
            datosTabla[10][0] = "Código capa";
            datosTabla[10][1] = datosEquido.getcCapaId();
            datosTabla[11][0] = "Descripción capa";
            datosTabla[11][1] = datosEquido.getdCapa();
            datosTabla[12][0] = "Código orientación";
            datosTabla[12][1] = datosEquido.getcOrieAnimId();
            datosTabla[13][0] = "Descripción orientación";
            datosTabla[13][1] = datosEquido.getdOrieAnim();
            datosTabla[14][0] = "Código lugar alta";
            datosTabla[14][1] = datosEquido.getcLugarAlta();
            datosTabla[15][0] = "Descripción lugar alta";
            datosTabla[15][1] = datosEquido.getdLugarAlta();
            datosTabla[16][0] = "NIF último titular";
            datosTabla[16][1] = datosEquido.getcNifUltimoTitular();
            datosTabla[17][0] = "Nombre último titular";
            datosTabla[17][1] = datosEquido.getdNombreUltimoTitular();
            datosTabla[18][0] = "Aptitud consumo humano";
            datosTabla[18][1] = datosEquido.getcAptitudConsumoId();
            datosTabla[19][0] = "Fecha muerte";
            datosTabla[19][1] = datosEquido.getfMuerte();
            datosTabla[20][0] = "Fecha inicio suspensión";
            datosTabla[20][1] = datosEquido.getfInicioSuspension();
            datosTabla[21][0] = "Identificación electrónica";
            datosTabla[21][1] = datosEquido.getcIdentificacionElectronica();
            datosTabla[22][0] = "Identificación electrónica decimal";
            datosTabla[22][1] = datosEquido.getcIdentificacionElectronicaDecimal();
            datosTabla[23][0] = "CEA situación";
            datosTabla[23][1] = datosEquido.getCeaSituacion();
            datosTabla[24][0] = "Explotación ubicación";
            datosTabla[24][1] = datosEquido.getcExplotacionIdentificacion();
            datosTabla[25][0] = "Fecha identificación";
            datosTabla[25][1] = datosEquido.getFechaIdentificacion();
            datosTabla[26][0] = "Explotación nacimiento";
            datosTabla[26][1] = datosEquido.getCodigoExplotacionNacimiento();
            datosTabla[27][0] = "Fecha nacimiento";
            datosTabla[27][1] = datosEquido.getFechaNacimiento();
            datosTabla[28][0] = "Documento sustitutivo";
            datosTabla[28][1] = datosEquido.getDocumentoSustitutivo();
            datosTabla[29][0] = "Identificación alternativa";
            datosTabla[29][1] = datosEquido.getCodigoIdentificacionAlternativa();
            return new DefaultTableModel(datosTabla, new String[]{"Campo", "Valor"});
        }
    }

    /*public File generarFicheroXMLAFirmar(DatosEquinoTipo datosEquino) throws Exception {
        File ficheroSalida = new File("./temp/" + Calendar.getInstance().getTimeInMillis() + ".xml");
        ObjectFactory of = new ObjectFactory();
        JAXBElement<DatosEquinoTipo> jaxbElement = of.createDatosEquino(datosEquino);
        JAXBContext contextJAXB = JAXBContext.newInstance(DatosEquinoTipo.class);
        Marshaller m = contextJAXB.createMarshaller();
        FileWriter writer = new FileWriter(ficheroSalida);
        m.marshal(jaxbElement, writer);
        return ficheroSalida;
    }

    public File generarFicheroXMLFirmado(File ficheroAFirmar) throws Exception {
        return new Firmador().firmarXML(ficheroAFirmar,
                propiedades.getProperty("ruta_certificado_pfx"),
                propiedades.getProperty("tipo_certificado_pfx"),
                propiedades.getProperty("passkeystore"));
    }*/
    public String obtenerPeticion() {
        return peticion;
    }

    public void actualizarDatosEquidos(ComAutSolicitud solicitud) throws Exception {
        try {
            if (solicitud == null) {
                throw new Exception("LA INSTANCIA DE SolicitudComAut NO PUEDE SER NULA");
            }
            DatosEquidosComAut datosEquido = this.controladorBase.datosEquidosPorUeln(solicitud.getUeln());
            RespuestaComAutSolicitud respuestaASolicitud = new RespuestaComAutSolicitud();
            respuestaASolicitud.setId(solicitud.getId());
            respuestaASolicitud.setFecha(Date.valueOf(LocalDate.now()));
            respuestaASolicitud.setSolicitudCodigoUELN(solicitud.getUeln());
            if (datosEquido != null) {
                DatosEquinoTipo datos = prepararDatosEquinoImportarXMLEquidos(datosEquido);
                String respuestaServidor = importarXMLEquidoXades4J(datos);
                if (respuestaServidor != null && respuestaServidor.trim().length() != 0) {
                    respuestaASolicitud.setSolicitudCodigoError("0");
                    respuestaASolicitud.setSolicitudDescripcionError(respuestaServidor);
                }
                //Insertamos la solicitud ComAut en su correspondiente tabla con el resultado obtenido
                JDBCDAOComAutSolicitud.obtenerDao().insertar(respuestaASolicitud);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void actualizarTitularidadEquidos(ComAutSolicitud solicitud) throws Exception {
        try {
            if (solicitud == null) {
                throw new Exception("LA INSTANCIA DE SolicitudComAut NO PUEDE SER NULA");
            }
            DatosEquidosComAut datosEquido = this.controladorBase.datosEquidosPorUeln(solicitud.getUeln());
            RespuestaComAutSolicitud respuestaASolicitud = new RespuestaComAutSolicitud();
            respuestaASolicitud.setId(solicitud.getId());
            respuestaASolicitud.setFecha(Date.valueOf(LocalDate.now()));
            respuestaASolicitud.setSolicitudCodigoUELN(solicitud.getUeln());
            if (datosEquido != null) {
                DatosTituEqTipo datos = prepararDatosEquinoImportarXMLTitularidad(datosEquido);
                String respuestaServidor = importarXMLTitularidadXades4J(datos);
                if (respuestaServidor != null && respuestaServidor.trim().length() != 0) {
                    respuestaASolicitud.setSolicitudCodigoError("0");
                    respuestaASolicitud.setSolicitudDescripcionError(respuestaServidor);
                }
                //Insertamos la solicitud ComAut en su correspondiente tabla con el resultado obtenido
                JDBCDAOComAutSolicitud.obtenerDao().insertar(respuestaASolicitud);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private DatosEquinoTipo prepararDatosEquinoImportarXMLEquidos(DatosEquidosComAut datosEquino) throws Exception {
        ObjectFactory of = new ObjectFactory();
        DatosEquinoTipo de = new DatosEquinoTipo();
        de.setDatosAnimal(of.createDatosAnimalTipo());
        de.getDatosAnimal().setCEspecieId(datosEquino.getCodigoEspecie());
        de.getDatosAnimal().setCIdenAnim(datosEquino.getCodigoUELN());
        de.getDatosAnimal().setCRazaId(datosEquino.getCodigoRaza());
        de.getDatosAnimal().setCSexoId(controladorBase.addCerosDelante(datosEquino.getCodigoSexo(), 2));
        de.getDatosAnimal().setFNacimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar(datosEquino.getFechaNacimiento()));
        de.getDatosAnimal().setCExplNaci(datosEquino.getExplotacionNacimiento());
        de.getDatosAnimal().setCExplIden(datosEquino.getExplotacionNacimiento());
        de.getDatosAnimal().setCPaisNaci(datosEquino.getCodigoLugarNacimiento());
        de.getDatosAnimal().setCIdenElec(microchipAHexadecimal(datosEquino.getIdElectronica()));
        de.getDatosAnimal().setCTipoIdenId(controladorBase.addCerosDelante(datosEquino.getCodigoTipoIdentificacion(), 2));
        de.getDatosAnimal().setCCapaId(controladorBase.addCerosDelante(datosEquino.getCodigoCapa(), 2));
        de.getDatosAnimal().setCOrieAnimId(controladorBase.addCerosDelante(datosEquino.getCodigoOrientacion(), 2));
        String nombreNacimiento = datosEquino.getLiteralNombreNacimiento().length() < 51
                ? datosEquino.getLiteralNombreNacimiento()
                : datosEquino.getLiteralNombreNacimiento().substring(0, 50);
        de.getDatosAnimal().setDNombreCom(nombreNacimiento);
        de.getDatosAnimal().setDNombreNac(nombreNacimiento);
        de.getDatosAnimal().setCAptiConsId(controladorBase.addCerosDelante(datosEquino.getCodigoAptitud(), 2));
        de.getDatosAnimal().setCTipoLectId(controladorBase.addCerosDelante(datosEquino.getCodigoSistemaLectura(), 2));
        de.getDatosAnimal().setCFiabilidad(datosEquino.getCodigoFiabilidad());
        de.getDatosAnimal().setBCastrado(datosEquino.getCastrado());
        de.getDatosAnimal().setFIniTitu(DatatypeFactory.newInstance().newXMLGregorianCalendar(datosEquino.getFechaInicioTitular()));
        de.getDatosAnimal().getCCifnif().add(obtenerStringDNI(datosEquino.getNIFTitular()));
        String nombreTitular = datosEquino.getNombreTitular().length() < 16
                ? datosEquino.getNombreTitular()
                : datosEquino.getNombreTitular().substring(0, 15);
        de.getDatosAnimal().setDNombre(nombreTitular.toUpperCase());
        String apellidosTitular = datosEquino.getApellidosTitular().length() < 46
                ? datosEquino.getApellidosTitular()
                : datosEquino.getApellidosTitular().substring(0, 45);
        de.getDatosAnimal().setDApellidos(apellidosTitular.toUpperCase());
        String domicilioTitular = datosEquino.getLiteralDireccionTitular().length() < 61
                ? datosEquino.getLiteralDireccionTitular()
                : datosEquino.getLiteralDireccionTitular().substring(0, 60);
        de.getDatosAnimal().setDCalle(domicilioTitular.toUpperCase());
        de.getDatosAnimal().setCProvincia(Integer.valueOf(datosEquino.getCodigoProvinciaTitular()));
        de.getDatosAnimal().setCMunicipio(Integer.valueOf(datosEquino.getCodigoMunicipioTitular()));
        de.getDatosAnimal().setCPostal(datosEquino.getCodigoPostal());
        de.getDatosAnimal().setCAsociacionId("024");
        de.getDatosAnimal().setFIdentific(DatatypeFactory.newInstance().newXMLGregorianCalendar(datosEquino.getFechaIdentificacion()));
        return de;
    }

    private DatosTituEqTipo prepararDatosEquinoImportarXMLTitularidad(DatosEquidosComAut datosEquino) throws Exception {
        ObjectFactory of = new ObjectFactory();
        DatosTituEqTipo de = new DatosTituEqTipo();
        de.setDatosTituAnimal(of.createDatosTituAnimalTipo());
        de.getDatosTituAnimal().setCEspecieId(datosEquino.getCodigoEspecie());
        de.getDatosTituAnimal().setCIdenAnim(datosEquino.getCodigoUELN());
        de.getDatosTituAnimal().setFIniTitu(DatatypeFactory.newInstance().newXMLGregorianCalendar(datosEquino.getFechaInicioTitular()));
        de.getDatosTituAnimal().getCCifnif().add(obtenerStringDNI(datosEquino.getNIFTitular()));
        String nombreTitular = datosEquino.getNombreTitular().length() < 16
                ? datosEquino.getNombreTitular()
                : datosEquino.getNombreTitular().substring(0, 15);
        de.getDatosTituAnimal().setDNombre(nombreTitular);
        String apellidosTitular = datosEquino.getApellidosTitular().length() < 46
                ? datosEquino.getApellidosTitular()
                : datosEquino.getApellidosTitular().substring(0, 45);
        de.getDatosTituAnimal().setDApellidos(apellidosTitular);
        String domicilioTitular = datosEquino.getLiteralDireccionTitular().length() < 61
                ? datosEquino.getLiteralDireccionTitular()
                : datosEquino.getLiteralDireccionTitular().substring(0, 60);
        de.getDatosTituAnimal().setDCalle(domicilioTitular);
        de.getDatosTituAnimal().setCProvincia(Integer.parseInt(datosEquino.getCodigoProvinciaTitular()));
        de.getDatosTituAnimal().setCMunicipio(Integer.parseInt(datosEquino.getCodigoMunicipioTitular()));
        de.getDatosTituAnimal().setCPostal(datosEquino.getCodigoPostal());
        return de;
    }

    private String microchipAHexadecimal(String microchipDecimal) {
        StringBuilder sb = new StringBuilder();
        String esMicrochipFormatoAntiguo = microchipDecimalFormatoAntiguo(microchipDecimal);
        String decimal = esMicrochipFormatoAntiguo != null ? esMicrochipFormatoAntiguo : microchipDecimal;

        String bloque1 = decimal.substring(0, 1);
        String bloque2 = decimal.substring(1, 2);
        String bloque3 = decimal.substring(2, 4);
        String bloque4 = decimal.substring(4, 6);
        String bloque5 = decimal.substring(6, 7);
        String bloque6 = decimal.substring(7, 11);
        String bloque7 = decimal.substring(11);
        Integer b1 = Integer.valueOf(bloque1, 2);
        sb.append(establecerLongitudString(b1.toString(), 1));
        Integer b2 = Integer.valueOf(bloque2, 2);
        sb.append(establecerLongitudString(b2.toString(), 3));
        Integer b3 = Integer.valueOf(bloque3, 2);
        sb.append(establecerLongitudString(b3.toString(), 5));
        Integer b4 = Integer.valueOf(bloque4, 2);
        sb.append(establecerLongitudString(b4.toString(), 6));
        Integer b5 = Integer.valueOf(bloque5, 2);
        sb.append(establecerLongitudString(b5.toString(), 1));
        Integer b6 = Integer.valueOf(bloque6);
        Integer cocienteB6 = b6 / 512;
        Integer restoB6 = b6 % 512;
        sb.append(establecerLongitudString(Integer.toString(cocienteB6, 2), 1));
        sb.append(establecerLongitudString(Integer.toString(restoB6, 2), 9));
        BigInteger b7 = new BigInteger(bloque7);
        BigInteger resto1B7 = b7.divide(BigInteger.valueOf(512L * 512 * 512 * 512)).mod(BigInteger.valueOf(512));
        BigInteger resto2B7 = b7.divide(BigInteger.valueOf(512 * 512 * 512)).mod(BigInteger.valueOf(512));
        BigInteger resto3B7 = b7.divide(BigInteger.valueOf(512 * 512)).mod(BigInteger.valueOf(512));
        BigInteger resto4B7 = b7.divide(BigInteger.valueOf(512)).mod(BigInteger.valueOf(512));
        BigInteger parteB7 = b7.subtract((b7.divide(BigInteger.valueOf(512))).multiply(BigInteger.valueOf(512)));
        sb.append(establecerLongitudString(resto1B7.toString(2), 2));
        sb.append(establecerLongitudString(resto2B7.toString(2), 9));
        sb.append(establecerLongitudString(resto3B7.toString(2), 9));
        sb.append(establecerLongitudString(resto4B7.toString(2), 9));
        sb.append(establecerLongitudString(parteB7.toString(2), 9));
        BigInteger microchipBinario = new BigInteger(sb.toString(), 2);
        return microchipBinario.toString(16).toUpperCase();
    }

    //Devuelve null si no es formato antiguo
    private String microchipDecimalFormatoAntiguo(String microchipDecimal) {
        String res = null;
        if (microchipDecimal.startsWith("9")) {
            res = "10000000" + microchipDecimal;
        }
        return res;
    }

    private String establecerLongitudString(String origen, int longStringResultante) {
        String resul = origen;
        int longStringOrigen = origen.length();
        if (longStringOrigen < longStringResultante) {
            while (longStringOrigen < longStringResultante) {
                resul = "0" + resul;
                longStringOrigen = resul.length();
            }
        }
        return resul;
    }

    private String obtenerStringDNI(String dni) {
        if (dni != null && dni.length() > 0) {
            if (Character.isDigit(dni.charAt(0))) {
                return "0" + dni;
            }
        }
        return dni;
    }

    public String actualizarDatosEquidoDesdeTabla(JTable table) throws Exception {
        StringBuilder sb = new StringBuilder();
        DatosEquinoTipo datos = prepararDatosEquinoImportarXMLEquidos(controladorBase.obtenerDatosEquidosComAutDesdeTabla(table));
        String resultado = importarXMLEquidoXades4J(datos);
        sb.append((resultado == null || resultado.equals("")) ? "Comunicación realizada con éxito" : resultado);
        return sb.toString();
    }

    public String actualizarTitularidadDesdeDatosEquidosComAut(DatosEquidosComAut datosEquidosComAut) throws Exception {
        StringBuilder sb = new StringBuilder();
        DatosTituEqTipo datosTituEqTipo = prepararDatosEquinoImportarXMLTitularidad(datosEquidosComAut);
        String respuesta = importarXMLTitularidadXades4J(datosTituEqTipo);
        sb.append((respuesta==null || respuesta.trim().length()==0) ? "Comunicación realizado con éxito" : respuesta);
        return sb.toString();
    }
    
    public String borrarEjemplarPorUelnDesdeDatosEquidosComAut(DatosEquidosComAut datosEquidosComAut) throws Exception {
        StringBuilder sb = new StringBuilder();
        ObjectFactory of = new ObjectFactory();
        DatosBorradoAnimTipo datosBorrado = of.createDatosBorradoAnimTipo();
        datosBorrado.setDatosAnimal(of.createDatosAnimalTipoBorradoAnim());
        datosBorrado.getDatosAnimal().setCEspecieId(datosEquidosComAut.getCodigoEspecie());
        datosBorrado.getDatosAnimal().setCIdenAnim(datosEquidosComAut.getCodigoUELN());
        String respuesta = borradoAnimal(datosBorrado);
        sb.append((respuesta==null || respuesta.trim().length()==0) ? "Comunicación realizado con éxito" : respuesta);
        return sb.toString();
    }
}
