/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.baleares.test;

import com.jnr15.ControladorBase;
import com.jnr15.keystore.KeyStore;
import configBBDD.Propiedades;
import modelo.DatosEquidosComAut;
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
import org.json.JSONObject;

/**
 *
 * @author jesus
 */
public class Test1 {
    
    private static final Boolean USO_EXTERNO = Boolean.FALSE;
    private static final String URL_SERVICIO_ALTA_EQUIDO = "https://intranet.caib.es/sgireapi/externa/SWAsoEquino/V1/altaEquido";
    //private static final String URL_SERVICIO_ALTA_EQUIDO = "https://proves.caib.es/sgireapi/externa/SWAsoEquino/V1/altaEquido";
    private static ControladorBase controladorBase = null;

    public static void main(String[] args) {
        iniciarConexionBBDD();
        KeyStore.cargarKeyStore();
        try {
            CredentialsProvider provider = new BasicCredentialsProvider();
            provider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("e28627988a", "Jn19811224"));
            CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
            HttpPost post = new HttpPost(URL_SERVICIO_ALTA_EQUIDO);
            controladorBase = ControladorBase.obtenerControlador();
            DatosEquidosComAut datos = controladorBase.datosEquidosPorUeln("724018000006861");
            JSONObject jsonObject = obtenerPeticionJSONAltaEquido(datos);
            post.setEntity(new StringEntity(jsonObject.toString()));
            CloseableHttpResponse response = httpClient.execute(post);
            
            if (response.getStatusLine().getStatusCode()!=200 && response.getStatusLine().getStatusCode()!=201) {
                System.out.println(response.toString());
            } else {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    JSONObject jsonRespuesta = new JSONObject(EntityUtils.toString(entity));
                    System.out.println(jsonRespuesta.toString(4));//Utilizamos identFactor 4 para una salida tabulada de los pares clave:valor del jsonObject
                }
            }
            //String peticionJSON = ControladorWSBaleares.obtenerControlador().obtenerPeticionJSONAltaEquidoPorUELN("724018000006861");
            //System.out.println(peticionJSON);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    private static void iniciarConexionBBDD(){
        String maquina="192.168.1.35";
        String puerto="3306";
        if(USO_EXTERNO){
            maquina="ansoldes.com";
            puerto="2224";
        }
        Propiedades.obtenerPropiedades().modificarPropiedadesConexionBBDD(maquina, puerto, "uegha", "jesus", "19811224");
    }
    
    private static JSONObject obtenerPeticionJSONAltaEquido(DatosEquidosComAut datos) throws Exception {
        String[] nombreApellidos = controladorBase.nombreApellidosEnInceccaPorNif(datos.getNIFTitular());
        String[] telefonosEmail = controladorBase.obtenerTelefonosEmailDesdeIncecca(datos.getNIFTitular());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ueln", datos.getCodigoUELN());
        jsonObject.put("codigoAsociacion", "024");
        jsonObject.put("identificadorElectronico", datos.getIdElectronica());
        jsonObject.put("tipoLectura", controladorBase.addCerosDelante(datos.getCodigoSistemaLectura(), 2));
        jsonObject.put("identificacionAlternativa", datos.getIdAlternativo());
        jsonObject.put("especie", datos.getCodigoEspecie());
        jsonObject.put("raza", datos.getCodigoRaza());
        jsonObject.put("sexo", controladorBase.addCerosDelante(datos.getCodigoSexo(), 2));
        jsonObject.put("capa", controladorBase.addCerosDelante(datos.getCodigoSexo(), 2));
        jsonObject.put("castrado", datos.getCastrado());
        jsonObject.put("aptitud", controladorBase.addCerosDelante(datos.getCodigoAptitud(), 2));
        jsonObject.put("nombreAnimal", datos.getLiteralNombreNacimiento());
        jsonObject.put("nombreComercial", datos.getLiteralNombreComercial());
        jsonObject.put("tipoIdentificacion", controladorBase.addCerosDelante(datos.getCodigoTipoIdentificacion(), 2));
        jsonObject.put("explotacionIdentificacion", datos.getExplotacionNacimiento());
        jsonObject.put("fechaIdentificacion", controladorBase.formatoFechaDD_MM_YYYY(datos.getFechaIdentificacion()));
        jsonObject.put("paisNacimiento", datos.getCodigoLugarNacimiento());
        jsonObject.put("fechaNacimiento", controladorBase.formatoFechaDD_MM_YYYY(datos.getFechaNacimiento()));
        jsonObject.put("explotacionNacimiento", datos.getExplotacionNacimiento());
        jsonObject.put("explotacionUbicacion", datos.getExplotacionUbicacion());
        jsonObject.put("fechaSuspension", "");
        jsonObject.put("duplicado", datos.getDuplicado());
        jsonObject.put("cifnif", datos.getNIFTitular());
        jsonObject.put("pasaporte", "");
        jsonObject.put("nombreTitular", nombreApellidos[0]);
        jsonObject.put("apellidosTitular", nombreApellidos[1]+" "+nombreApellidos[2]);
        jsonObject.put("direccion", datos.getLiteralDireccionTitular());
        jsonObject.put("provincia", datos.getCodigoProvinciaTitular());
        jsonObject.put("municipio", datos.getCodigoMunicipioTitular());
        jsonObject.put("codigoPostal", datos.getCodigoPostal());
        jsonObject.put("fechaInicioTitularidad", controladorBase.formatoFechaDD_MM_YYYY(datos.getFechaInicioTitular()));
        String telefono = telefonosEmail[0].trim();
        if(telefono.isEmpty())
            telefono = telefonosEmail[1].trim();
        jsonObject.put("telefono", telefono);
        jsonObject.put("email",telefonosEmail[2].trim());
        jsonObject.put("actualizaDatosPersonales","");
        return jsonObject;
    }

}
