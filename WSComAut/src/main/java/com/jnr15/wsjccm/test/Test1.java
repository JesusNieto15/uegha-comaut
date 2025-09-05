/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.wsjccm.test;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author jesus
 */
public class Test1 {
    
    //private static final String URL_SERVICIO = "https://uganadera-pre.jccm.es/ws/consultarEstadoRegistroAnimal";
    private static final String URL_SERVICIO = "https://uganadera.jccm.es/ws/registrarAnimal";
    
    public static void main(String[] args) throws IOException {
        
        HttpPost post = new HttpPost(URL_SERVICIO);
        //String peticionString = "{\"apellido2Titular\":\"DE AREVALO Y DELGADO\",\"codigoPostalTitular\":\"16\",\"nombreNacimiento\":\"LENTISCO 31,25%\",\"fechaNacimiento\":\"05/06/2023\",\"tipoIdentificacion\":\"03\",\"duplicado\":\"N\",\"apellido1Titular\":\"FERNANDEZ\",\"idElectronica\":\"10010000724079070021893\",\"idAlternativo\":\"\",\"explotacionNacimiento\":\"ES130930000036\",\"especie\":\"48\",\"explotacionUbicacion\":\"ES130930000036\",\"fiabilidad\":\"16\",\"castrado\":\"N\",\"fechaInicioTitular\":\"08/02/2024\",\"capa\":\"01\",\"sistemaLectura\":\"01\",\"raza\":\"5106\",\"ueln\":\"724018000006464\",\"direccionTitular\":\"C/ SAN ANTON Nº 24, 02600, Villarrobledo, Albacete\",\"codigoMunicipioTitular\":\"081\",\"codigoProvinciaTitular\":\"02\",\"orientacion\":\"01\",\"nombreTitular\":\"FRANCISCO\",\"aptitud\":\"01\",\"nifTitular\":\"08433719X\",\"sexo\":\"01\",\"lugarNacimiento\":\"111\",\"fechaIdentificacion\":\"01/04/2024\"}";
        String formatoJsonAnimal = "{"
                + "\"apellido2Titular\":\"ALCÁZAR\","
                + "\"codigoPostalTitular\":\"13\","
                + "\"nombreNacimiento\":\"ALMONTEÑA DE ALCÁZAR 37,5%\","
                + "\"fechaNacimiento\":\"29/05/2024\","
                + "\"tipoIdentificacion\":\"03\","
                + "\"duplicado\":\"N\","
                + "\"apellido1Titular\":\"MUÑOZ\","
                + "\"idElectronica\":\"10010000724079070031753\","
                + "\"idAlternativo\":\"\","
                + "\"explotacionNacimiento\":\"ES130840000068\","
                + "\"especie\":\"48\","
                + "\"explotacionUbicacion\":\"ES130840000068\","
                + "\"fiabilidad\":\"16\","
                + "\"castrado\":\"N\","
                + "\"fechaInicioTitular\":\"25/02/2025\","
                + "\"capa\":\"12\","
                + "\"sistemaLectura\":\"01\","
                + "\"raza\":\"5106\","
                + "\"ueln\":\"724018000007068\","
                + "\"direccionTitular\":\"C/ SANTIAGO Nº.34, 13344, Torre de Juan Abad, Ciudad Real\","
                + "\"codigoMunicipioTitular\":\"084\","
                + "\"codigoProvinciaTitular\":\"13\","
                + "\"orientacion\":\"01\","
                + "\"nombreTitular\":\"JOSÉ ANTONIO\","
                + "\"aptitud\":\"01\","
                + "\"nifTitular\":\"71357813Z\","
                + "\"sexo\":\"02\","
                + "\"lugarNacimiento\":\"111\","
                + "\"fechaIdentificacion\":\"30/06/2025\""
                + "}";
        JSONObject jsonAnimal = new JSONObject(formatoJsonAnimal);
        System.out.println(jsonAnimal.toString());
        post.setEntity(new StringEntity(jsonAnimal.toString()));
        
        CredentialsProvider provider = new BasicCredentialsProvider();
        provider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("G91037895", "InBZhC1rz8rF5WyCzmVY"));
        
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
        CloseableHttpResponse response = httpClient.execute(post);
        
        System.out.println(response.getStatusLine().getStatusCode());
        
        HttpEntity entity = response.getEntity();
        if(entity!=null){
            String result = EntityUtils.toString(entity);
            System.out.println(result);
            JSONArray obj = new JSONArray(result);
            JSONObject jSonObject = obj.getJSONObject(0);
            System.out.println("El estado de la solicitud es: " + jSonObject.get("estado"));
        }
        
    }
    
}
