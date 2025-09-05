/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15;

import dao.JDBCDAOComAutSolicitud;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JTable;
import modelo.ComAutSolicitud;
import modelo.DatosEquidosComAut;
import modelo.RespuestaComAutSolicitud;
import org.apache.http.HttpEntity;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

/**
 *
 * @author jesus
 */
public class ControladorWSJCCM {

    private static ControladorWSJCCM controlador = null;
    private final ControladorBase controladorBase;
    private static final String URL_SERVICIO_CONSULTAR_ESTADO_REGISTRO_ANIMAL = "https://uganadera.jccm.es/ws/consultarEstadoRegistroAnimal";
    private static final String URL_SERVICIO_REGISTRAR_ANIMAL = "https://uganadera.jccm.es/ws/registrarAnimal";
    private static final String URL_SERVICIO_CONSULTAR_DATOS_ANIMAL = "https://uganadera.jccm.es/ws/consultarDatosAnimal";
    private CredentialsProvider provider = null;
    private CloseableHttpClient httpClient = null;
    private CloseableHttpResponse response = null;
    private HttpPost post = null;

    private ControladorWSJCCM() throws Exception {
        controladorBase = ControladorBase.obtenerControlador();
        provider = new BasicCredentialsProvider();
        provider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("G91037895", "InBZhC1rz8rF5WyCzmVY"));
        httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
    }

    public static ControladorWSJCCM obtenerControlador() throws Exception {
        if (controlador == null) {
            controlador = new ControladorWSJCCM();
        }
        return controlador;
    }

    public String actualizarDatosEquidoDesdeTabla(JTable table) throws Exception {
        post = new HttpPost(URL_SERVICIO_REGISTRAR_ANIMAL);
        DatosEquidosComAut datos = controladorBase.obtenerDatosEquidosComAutDesdeTabla(table);
        JSONObject jsonObject = obtenerPeticionJSON(datos);
        post.setEntity(new StringEntity(jsonObject.toString(), ContentType.APPLICATION_JSON));
        response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode()!=200) {
            return response.toString();
        } else {
            HttpEntity entity = response.getEntity();
            if (entity != null) 
                return EntityUtils.toString(entity);
            return null;
        }
    }

    public void actualizarDatosEquidos(ComAutSolicitud solicitud) throws Exception {
        if (solicitud == null) {
            throw new Exception("LA INSTANCIA DE SolicitudComAut NO PUEDE SER NULA");
        }
        DatosEquidosComAut datosEquido = this.controladorBase.datosEquidosPorUeln(solicitud.getUeln());
        RespuestaComAutSolicitud respuestaASolicitud = new RespuestaComAutSolicitud();
        respuestaASolicitud.setId(solicitud.getId());
        respuestaASolicitud.setFecha(Date.valueOf(LocalDate.now()));
        respuestaASolicitud.setSolicitudCodigoUELN(solicitud.getUeln());
        if (datosEquido != null) {
            post = new HttpPost(URL_SERVICIO_REGISTRAR_ANIMAL);
            JSONObject peticionJSON = obtenerPeticionJSON(datosEquido);
            post.setEntity(new StringEntity(peticionJSON.toString(), ContentType.APPLICATION_JSON));
            response = httpClient.execute(post);
            if (response.getStatusLine().getStatusCode()!=200) {
                respuestaASolicitud.setSolicitudDescripcionError(response.toString());
            } else {
                HttpEntity entityResponse = response.getEntity();
                if (entityResponse != null) {
                    JSONObject respuestaJSON = new JSONObject(EntityUtils.toString(entityResponse));
                    if (respuestaJSON.has("error")) {
                        String error = respuestaJSON.getString("error");
                        String descripcionError = respuestaJSON.getString("descripcionError");
                        respuestaASolicitud.setSolicitudCodigoError(error);
                        respuestaASolicitud.setSolicitudDescripcionError(descripcionError);
                    } else {
                        respuestaASolicitud.setSolicitudIdSolicitud(respuestaJSON.getString("idSolicitud"));
                    }
                }
            }
            JDBCDAOComAutSolicitud.obtenerDao().insertar(respuestaASolicitud);
        }
    }

    private JSONObject obtenerPeticionJSON(DatosEquidosComAut datos) throws Exception {
        String[] nombreApellidos = controladorBase.nombreApellidosEnInceccaPorNif(datos.getNIFTitular());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ueln", datos.getCodigoUELN());
        jsonObject.put("especie", datos.getCodigoEspecie());
        jsonObject.put("raza", datos.getCodigoRaza());
        jsonObject.put("fiabilidad", datos.getCodigoFiabilidad());
        jsonObject.put("sexo", controladorBase.addCerosDelante(datos.getCodigoSexo(), 2));
        jsonObject.put("castrado", datos.getCastrado());
        jsonObject.put("capa", controladorBase.addCerosDelante(datos.getCodigoCapa(), 2));
        jsonObject.put("lugarNacimiento", datos.getCodigoLugarNacimiento());
        jsonObject.put("explotacionNacimiento", datos.getExplotacionNacimiento());
        jsonObject.put("fechaNacimiento", controladorBase.formatoFechaDDMMYYYY(datos.getFechaNacimiento()));
        jsonObject.put("tipoIdentificacion", controladorBase.addCerosDelante(datos.getCodigoTipoIdentificacion(), 2));
        jsonObject.put("sistemaLectura", controladorBase.addCerosDelante(datos.getCodigoSistemaLectura(), 2));
        jsonObject.put("idElectronica", datos.getIdElectronica());
        jsonObject.put("idAlternativo", datos.getIdAlternativo());
        jsonObject.put("fechaIdentificacion", controladorBase.formatoFechaDDMMYYYY(datos.getFechaIdentificacion()));
        jsonObject.put("orientacion", controladorBase.addCerosDelante(datos.getCodigoOrientacion(), 2));
        jsonObject.put("nombreNacimiento", datos.getLiteralNombreNacimiento());
        jsonObject.put("nombreComercial", datos.getLiteralNombreComercial());
        jsonObject.put("aptitud", controladorBase.addCerosDelante(datos.getCodigoAptitud(), 2));
        jsonObject.put("duplicado", datos.getDuplicado());
        jsonObject.put("explotacionUbicacion", datos.getExplotacionUbicacion());
        jsonObject.put("nifTitular", datos.getNIFTitular());
        jsonObject.put("nombreTitular", nombreApellidos[0]);
        jsonObject.put("apellido1Titular", nombreApellidos[1]);
        jsonObject.put("apellido2Titular", nombreApellidos[2]);
        jsonObject.put("direccionTitular", ""); //Comentamos esta línea por varios problemas que está dando este campo en la comunicación, y
        //no es un campo obligatorio de comunicar.
        jsonObject.put("codigoProvinciaTitular", datos.getCodigoProvinciaTitular());
        jsonObject.put("codigoMunicipioTitular", datos.getCodigoMunicipioTitular());
        jsonObject.put("fechaInicioTitular", controladorBase.formatoFechaDDMMYYYY(datos.getFechaInicioTitular()));
        jsonObject.put("codigoPostalTitular", datos.getCodigoPostal());
        return jsonObject;
    }

    public String consultarEstadoSolicitud(String idSolicitud) throws Exception {
        post = new HttpPost(URL_SERVICIO_CONSULTAR_ESTADO_REGISTRO_ANIMAL);
        post.setEntity(new StringEntity("{\"idSolicitud\":\"" + idSolicitud + "\"}"));
        response = httpClient.execute(post);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            return EntityUtils.toString(entity);
        }
        return null;
    }

    public String consultarDatosAnimal(String ueln) throws Exception {
        post = new HttpPost(URL_SERVICIO_CONSULTAR_DATOS_ANIMAL);
        post.setEntity(new StringEntity("{\"ueln\":\"" + ueln + "\",\"especie\":\"48\"}"));
        response = httpClient.execute(post);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            return EntityUtils.toString(entity);
        }
        return null;
    }

}
