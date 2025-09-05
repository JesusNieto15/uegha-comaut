/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15;

import javax.swing.JTable;
import modelo.DatosEquidosComAut;
import org.apache.http.HttpEntity;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
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
public class ControladorWSBaleares {
    
    private static ControladorWSBaleares controlador = null;
    private final ControladorBase controladorBase;
    private static final String URL_SERVICIO_ALTA_EQUIDO = "https://intranet.caib.es/sgireapi/externa/SWAsoEquino/V1/altaEquido";
    private static final String URL_SERVICIO_ACTUALIZAR_EQUIDO = "https://intranet.caib.es/sgireapi/externa/SWAsoEquino/V1/actualizaEquido";
    //URL con método GET
    private static final String URL_SERVICIO_CONSULTA_EQUIDO = "https://intranet.caib.es/sgireapi/externa/SWAsoEquino/V1/consultaEquido/ueln";
    //URL con método GET
    //private static final String URL_SERVICIO_BORRAR_EQUIDO = "https://intranet.caib.es/sgireapi/externa/SWAsoEquino/V1/borraEquido/ueln";
    private CredentialsProvider provider = null;
    private CloseableHttpClient httpClient = null;
    private CloseableHttpResponse response = null;
    private HttpPost post = null;
    private HttpGet get = null;
    private HttpPut put = null;
    
    private ControladorWSBaleares() throws Exception {
        controladorBase = ControladorBase.obtenerControlador();
        provider = new BasicCredentialsProvider();
        provider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("e28627988a", "Jn19811224"));
        httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(provider)
                .build();
    }

    public static ControladorWSBaleares obtenerControlador() throws Exception {
        if (controlador == null) {
            controlador = new ControladorWSBaleares();
        }
        return controlador;
    }
    
    public String altaEquidoDesdeTabla(JTable table) throws Exception {
        DatosEquidosComAut datos = controladorBase.obtenerDatosEquidosComAutDesdeTabla(table);
        return altaEquido(datos);
    }
    
    public String altaEquido(DatosEquidosComAut datos) throws Exception {
        post=new HttpPost(URL_SERVICIO_ALTA_EQUIDO);
        JSONObject jsonObject = obtenerPeticionJSONAltaEquido(datos);
        post.setEntity(new StringEntity(jsonObject.toString()));
        response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode()!=200 && response.getStatusLine().getStatusCode()!=201) {
            return response.toString();
        } else {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                JSONObject jsonRespuesta = new JSONObject(EntityUtils.toString(entity));
                return jsonRespuesta.toString(4);//Utilizamos identFactor 4 para una salida tabulada de los pares clave:valor del jsonObject
            }
            return null;
        }
    }
    
    public String actualizarEquidoDesdeTabla(JTable table) throws Exception {
        DatosEquidosComAut datos = controladorBase.obtenerDatosEquidosComAutDesdeTabla(table);
        return actualizarEquido(datos);
    }
    
    public String actualizarEquido(DatosEquidosComAut datos) throws Exception {
        put=new HttpPut(URL_SERVICIO_ACTUALIZAR_EQUIDO);
        JSONObject jsonObject = obtenerPeticionJSONActualizarEquido(datos);
        put.setEntity(new StringEntity(jsonObject.toString()));
        response = httpClient.execute(put);
        if (response.getStatusLine().getStatusCode()!=200 && response.getStatusLine().getStatusCode()!=201) {
            return response.toString();
        } else {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                JSONObject jsonRespuesta = new JSONObject(EntityUtils.toString(entity));
                return jsonRespuesta.toString(4);//Utilizamos identFactor 4 para una salida tabulada de los pares clave:valor del jsonObject
            }
            return null;
        }
    }
    
    private JSONObject obtenerPeticionJSONAltaEquido(DatosEquidosComAut datos) throws Exception {
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
    
    private JSONObject obtenerPeticionJSONActualizarEquido(DatosEquidosComAut datos) throws Exception {
        JSONObject jsonObject = obtenerPeticionJSONAltaEquido(datos);
        jsonObject.put("fechaMuerte",controladorBase.formatoFechaDD_MM_YYYY(datos.getFechaMuerte()));
        jsonObject.put("explotacionMuerte", datos.getExplotacionMuerte());
        jsonObject.put("tipoMuerte", datos.getCodigoTipoMuerte());
        return jsonObject;
    }
    
    public String consultaEquido(String ueln) throws Exception {
        get = new HttpGet(URL_SERVICIO_CONSULTA_EQUIDO.replace("ueln", ueln));
        response = httpClient.execute(get);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            JSONObject json = new JSONObject(EntityUtils.toString(entity));
            return json.toString(4);//Utilizamos identFactor 4 para una salida tabulada de los pares clave:valor del jsonObject
        }
        return null;
    }
    
    public String obtenerPeticionJSONAltaEquidoPorUELN(String ueln) throws Exception{
        return this.obtenerPeticionJSONAltaEquido(ControladorBase.obtenerControlador().datosEquidosPorUeln(ueln)).toString();
    }
}
