/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.galicia.test;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author jesus
 */
public class Test1 {

    public static final String TOKEN_REQUEST_URL = "https://sso.xunta.gal/auth/realms/amtega/protocol/openid-connect/token";
    public static final String CLIENT_ID = "uegha-ext";
    public static final String CLIENT_SECRET = "a4b71327-307c-4df0-8da7-8d5ddc5eeb37";
    public static final String USUARIO = "app-uegha-ext";
    public static final String PASSWORD = "1PE6w*FuW2/p";
    public static final String RESOURCE_URL
            = "https://apis-ext.xunta.gal/xesgan/external/rest/mogan/equidosRegistradosWs/actualizarDatosEquidos";
    private static CloseableHttpClient HTTP_CLIENTE = null;
    private static CloseableHttpResponse RESPONSE = null;
    private static HttpPost POST = null;
    private static String entityJSonEjemplo = "{\"inicioTitular\":\"04/01/2024\",\"codigoEspecie\":\"48\",\"explotacionUbicacion\":\"ES150780106801\",\"codigoUELN\":\"724018000006364\",\"codigoOrientacion\":\"01\",\"comunidadAutonomaGrabadora\":\"011\",\"castrado\":\"N\",\"codigoSistemaLectura\":\"01\",\"codigoTipoIdentificacion\":\"03\",\"codigoPostal\":\"15702\",\"codigoMunicipioTitular\":\"078\",\"codigoProvinciaTitular\":\"15\",\"nombreTitular\":\"FRANCISCO JOSE\",\"codigoRaza\":\"5106\",\"nifTitular\":\"44834269R\",\"codigoLugarNacimiento\":\"111\",\"codigoAptitud\":\"02\",\"codigoCapa\":\"01\",\"codigoSexo\":\"01\",\"fechaIdentificacion\":\"05/02/2024\"}";
    
    
    public static void main(String[] args) {
        try {
            OAuthClient client = new OAuthClient(new URLConnectionClient());

            OAuthClientRequest request
                    = OAuthClientRequest.tokenLocation(TOKEN_REQUEST_URL)
                            .setGrantType(GrantType.PASSWORD)
                            .setClientId(CLIENT_ID)
                            .setClientSecret(CLIENT_SECRET)
                            .setUsername(USUARIO)
                            .setPassword(PASSWORD)
                            .buildBodyMessage();

            String token
                    = client.accessToken(request, "POST",OAuthJSONAccessTokenResponse.class)
                            .getAccessToken();
            HTTP_CLIENTE = HttpClientBuilder.create()
                    .build();
            
            POST = new HttpPost(RESOURCE_URL);
            POST.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + token);
            StringEntity ent = new StringEntity(entityJSonEjemplo);
            ent.setContentType(ContentType.APPLICATION_JSON.toString());
            POST.setEntity(ent);
            RESPONSE = HTTP_CLIENTE.execute(POST);
            HttpEntity entity = RESPONSE.getEntity();
            System.out.println(EntityUtils.toString(entity));
        } catch (Exception exn) {
            exn.printStackTrace();
        }
    }

}
