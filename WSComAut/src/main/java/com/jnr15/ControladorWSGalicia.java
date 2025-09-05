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
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.json.JSONObject;

/**
 *
 * @author jesus
 */
public class ControladorWSGalicia {

    private static ControladorWSGalicia controlador = null;
    private final ControladorBase controladorBase;
    private static final String RESOURCE_URL
            = "https://apis-ext.xunta.gal/xesgan/external/rest/mogan/equidosRegistradosWs/actualizarDatosEquidos";
    private static final String TOKEN_REQUEST_URL = "https://sso.xunta.gal/auth/realms/amtega/protocol/openid-connect/token";
    private static final String CLIENT_ID = "uegha-ext";
    private static final String CLIENT_SECRET = "a4b71327-307c-4df0-8da7-8d5ddc5eeb37";
    private static final String USUARIO = "app-uegha-ext";
    private static final String PASSWORD = "1PE6w*FuW2/p";
    private CloseableHttpClient httpClient = null;
    private CloseableHttpResponse response = null;
    private HttpPost post = null;

    private ControladorWSGalicia() throws Exception {
        controladorBase = ControladorBase.obtenerControlador();
        httpClient = HttpClientBuilder.create().build();
    }

    public static ControladorWSGalicia obtenerControlador() throws Exception {
        if (controlador == null) {
            controlador = new ControladorWSGalicia();
        }
        return controlador;
    }

    public String actualizarDatosEquidoDesdeTabla(JTable table) throws Exception {
        post = new HttpPost(RESOURCE_URL);
        post.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + obtenerTokenOAuth2());
        DatosEquidosComAut datos = controladorBase.obtenerDatosEquidosComAutDesdeTabla(table);
        JSONObject jsonObject = obtenerPeticionJSON(datos);
        StringEntity ent = new StringEntity(jsonObject.toString(),"UTF-8");
        ent.setContentType(ContentType.APPLICATION_JSON.toString());
        post.setEntity(ent);
        response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() != 200) {
            return response.toString();
        } else {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                return EntityUtils.toString(entity);
            }
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
            post = new HttpPost(RESOURCE_URL);
            post.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + obtenerTokenOAuth2());
            JSONObject peticionJSON = obtenerPeticionJSON(datosEquido);
            StringEntity ent = new StringEntity(peticionJSON.toString(),"UTF-8");
            ent.setContentType(ContentType.APPLICATION_JSON.toString());
            post.setEntity(ent);
            response = httpClient.execute(post);
            if (response.getStatusLine().getStatusCode() != 200) {
                respuestaASolicitud.setSolicitudDescripcionError(response.toString());
            } else {
                HttpEntity entityResponse = response.getEntity();
                if (entityResponse != null) {
                    JSONObject respuestaJSON = new JSONObject(EntityUtils.toString(entityResponse));
                    if (respuestaJSON.getString("codigoError") != null && respuestaJSON.getString("codigoError").length() > 0) {
                        String error = respuestaJSON.getString("codigoError");
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

    private String obtenerTokenOAuth2() throws Exception {
        OAuthClient client = new OAuthClient(new URLConnectionClient());

        OAuthClientRequest request
                = OAuthClientRequest.tokenLocation(TOKEN_REQUEST_URL)
                        .setGrantType(GrantType.PASSWORD)
                        .setClientId(CLIENT_ID)
                        .setClientSecret(CLIENT_SECRET)
                        .setUsername(USUARIO)
                        .setPassword(PASSWORD)
                        .buildBodyMessage();

        return client.accessToken(request, "POST", OAuthJSONAccessTokenResponse.class)
                .getAccessToken();
    }

    private JSONObject obtenerPeticionJSON(DatosEquidosComAut datos) throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("codigoUELN", datos.getCodigoUELN());
        jsonObject.put("codigoEspecie", datos.getCodigoEspecie());
        jsonObject.put("codigoRaza", datos.getCodigoRaza());
        jsonObject.put("codigoFiabilidad", datos.getCodigoFiabilidad());
        jsonObject.put("codigoSexo", controladorBase.addCerosDelante(datos.getCodigoSexo(), 2));
        jsonObject.put("castrado", datos.getCastrado());
        jsonObject.put("codigoCapa", controladorBase.addCerosDelante(datos.getCodigoSexo(), 2));
        jsonObject.put("codigoLugarNacimiento", datos.getCodigoLugarNacimiento());
        jsonObject.put("explotacionNacimiento", datos.getExplotacionNacimiento());
        jsonObject.put("fechaNacimiento", controladorBase.formatoFechaDDMMYYYY(datos.getFechaNacimiento()));
        jsonObject.put("codigoTipoIdentificacion", controladorBase.addCerosDelante(datos.getCodigoTipoIdentificacion(), 2));
        jsonObject.put("codigoSistemaLectura", controladorBase.addCerosDelante(datos.getCodigoSistemaLectura(), 2));
        jsonObject.put("idElectronica", datos.getIdElectronica());
        jsonObject.put("idAlternativo", datos.getIdAlternativo());
        jsonObject.put("fechaIdentificacion", controladorBase.formatoFechaDDMMYYYY(datos.getFechaIdentificacion()));
        jsonObject.put("nifTitular", datos.getNIFTitular());
        jsonObject.put("nombreTitular", datos.getNombreTitular());
        jsonObject.put("direccionTitular", datos.getLiteralDireccionTitular());
        jsonObject.put("inicioTitular", controladorBase.formatoFechaDDMMYYYY(datos.getFechaInicioTitular()));
        jsonObject.put("codigoProvinciaTitular", datos.getCodigoProvinciaTitular());
        jsonObject.put("codigoMunicipioTitular", datos.getCodigoMunicipioTitular());
        jsonObject.put("codigoPostal", datos.getCodigoPostal());
        jsonObject.put("codigoOrientacion", controladorBase.addCerosDelante(datos.getCodigoOrientacion(), 2));
        jsonObject.put("nombreNacimiento", datos.getLiteralNombreNacimiento());
        jsonObject.put("nombreComercial", datos.getLiteralNombreComercial());
        jsonObject.put("codigoAptitud", controladorBase.addCerosDelante(datos.getCodigoAptitud(), 2));
        jsonObject.put("duplicado", datos.getDuplicado());
        jsonObject.put("comunidadAutonomaGrabadora", "011");
        jsonObject.put("explotacionUbicacion", datos.getExplotacionUbicacion());
        return jsonObject;
    }

}
