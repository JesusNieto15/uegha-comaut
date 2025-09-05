/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15;

import javax.swing.JTable;
import modelo.DatosEquidosComAut;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author jesus
 */
public class ControladorWSCataluna {
    
    private static ControladorWSCataluna controlador = null;
    private final ControladorBase controladorBase;
    private final String PASS_PRE = "5B84z438";
    private final String PASS_PRO = "JbTIEQ5c";
    private final String NIF_LOGIN = "G91037895";
    private final String NIF_JUAN = "28686009H";
    private static final String URL_SERVICIO_ALTA_EQUIDO_PRE = "https://preproduccio.aplicacions.agricultura.gencat.cat/gtr/WSRegistreEquidsOE/AppJava/WSAltaEquid";
    private static final String URL_SERVICIO_ALTA_EQUIDO_PRO = "https://aplicacions.agricultura.gencat.cat/gtr/WSRegistreEquidsOE/AppJava/WSAltaEquid";
    //private static final String URL_SERVICIO_ACTUALIZAR_EQUIDO = "https://intranet.caib.es/sgireapi/externa/SWAsoEquino/V1/actualizaEquido";
    //private static final String URL_SERVICIO_CONSULTA_EQUIDO = "https://intranet.caib.es/sgireapi/externa/SWAsoEquino/V1/consultaEquido/ueln";
    private CloseableHttpClient httpClient = null;
    private CloseableHttpResponse response = null;
    //private HttpPost post = null;
    //private HttpGet get = null;
    private HttpPut put = null;
    
    private ControladorWSCataluna() throws Exception {
        controladorBase = ControladorBase.obtenerControlador();
        httpClient = HttpClientBuilder.create().build();
    }

    public static ControladorWSCataluna obtenerControlador() throws Exception {
        if (controlador == null) {
            controlador = new ControladorWSCataluna();
        }
        return controlador;
    }
    
    public String altaEquidoDesdeTabla(JTable table) throws Exception {
        put = new HttpPut(URL_SERVICIO_ALTA_EQUIDO_PRO);
        DatosEquidosComAut datos = controladorBase.obtenerDatosEquidosComAutDesdeTabla(table);
        JSONObject jsonObject = obtenerPeticionJSONAltaEquido(datos);
        StringEntity ent = new StringEntity(jsonObject.toString(),"UTF-8");
        ent.setContentType(ContentType.APPLICATION_JSON.toString());
        put.setEntity(ent);
        response = httpClient.execute(put);
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
    
    public String altaEquidoDesdeUeln(String ueln) throws Exception {
        put = new HttpPut(URL_SERVICIO_ALTA_EQUIDO_PRO);
        DatosEquidosComAut datos = controladorBase.datosEquidosPorUeln(ueln);
        JSONObject jsonObject = obtenerPeticionJSONAltaEquido(datos);
        StringEntity ent = new StringEntity(jsonObject.toString(),"UTF-8");
        ent.setContentType(ContentType.APPLICATION_JSON.toString());
        put.setEntity(ent);
        response = httpClient.execute(put);
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
    
    
    public JSONObject obtenerPeticionJSONAltaEquido(DatosEquidosComAut datos) throws Exception {
        String[] nombreApellidos = controladorBase.nombreApellidosEnInceccaPorNif(datos.getNIFTitular());
        String[] telefonosEmail = controladorBase.obtenerTelefonosEmailDesdeIncecca(datos.getNIFTitular());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nif", NIF_LOGIN);
        jsonObject.put("password", PASS_PRO);
        jsonObject.put("codiUeln", datos.getCodigoUELN());      
        jsonObject.put("codiEspecie", datos.getCodigoEspecie());  
        jsonObject.put("codiRaca", datos.getCodigoRaza());
        jsonObject.put("codiSexe", controladorBase.addCerosDelante(datos.getCodigoSexo(), 2));
        jsonObject.put("castrat", datos.getCastrado());
        jsonObject.put("codiColor", controladorBase.addCerosDelante(datos.getCodigoSexo(), 2));
        jsonObject.put("codiPaisNaixement", datos.getCodigoLugarNacimiento());
        jsonObject.put("explotacioNaixement", datos.getExplotacionNacimiento());
        jsonObject.put("dataNaixement", controladorBase.formatoFechaDDMMYYYY(datos.getFechaNacimiento()));
        jsonObject.put("codiTipusIdentificacio", controladorBase.addCerosDelante(datos.getCodigoTipoIdentificacion(), 2));
        jsonObject.put("codiTipusLectura", controladorBase.addCerosDelante(datos.getCodigoSistemaLectura(), 2));
        jsonObject.put("identificacioElectronica", datos.getIdElectronica());
        jsonObject.put("identificacioAlternativa", datos.getIdAlternativo());
        jsonObject.put("dataIdentificacio", controladorBase.formatoFechaDDMMYYYY(datos.getFechaIdentificacion()));
        jsonObject.put("nomNaixement", datos.getLiteralNombreNacimiento());
        jsonObject.put("nomComercial", datos.getLiteralNombreComercial());
        jsonObject.put("aptitudConsum", datos.getCodigoAptitud().equals("1")?"S":"N");
        jsonObject.put("dataIniciSuspensio", "");
        jsonObject.put("duplicat", datos.getDuplicado());
        jsonObject.put("dataDuplicat","");
        jsonObject.put("regaUbicacio", datos.getExplotacionUbicacion());
        jsonObject.put("nifTitular", datos.getNIFTitular());
        jsonObject.put("nomTitular", nombreApellidos[0]);
        jsonObject.put("cognom1Titular",nombreApellidos[1]);
        jsonObject.put("cognom2Titular",nombreApellidos[2]);
        jsonObject.put("adreca", controladorBase.formatoFechaDDMMYYYY(datos.getFechaInicioTitular()));
        jsonObject.put("dataEfectiva",controladorBase.formatoFechaDDMMYYYY(datos.getFechaInicioTitular()));
        jsonObject.put("provincia", datos.getCodigoProvinciaTitular());
        jsonObject.put("municipi", datos.getCodigoMunicipioTitular());
        jsonObject.put("codiPostal", datos.getCodigoPostal());
        String telefono = telefonosEmail[0].trim();
        if(telefono.isEmpty())
            telefono = telefonosEmail[1].trim();
        jsonObject.put("telefon", telefono);
        jsonObject.put("correuElectronic",telefonosEmail[2].trim());
        return jsonObject;
    }  
}
