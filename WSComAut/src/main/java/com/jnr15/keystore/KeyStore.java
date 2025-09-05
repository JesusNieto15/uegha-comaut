/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15.keystore;

import com.jnr15.ControladorBase;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author inven
 */
public class KeyStore {
    
    private static final String TIPO_KEYSTORE = "PKCS12";
    
    public static void cargarKeyStore(){
        System.setProperty("javax.net.ssl.keyStore","./almacen_keystore/keystorejnr.jks");
        System.setProperty("javax.net.ssl.keyStoreType","jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "22Je24Ch14Je");
        System.setProperty("javax.net.ssl.trustStore", "./almacen_keystore/keystorejnr.jks");
    }
    
    public static java.security.KeyStore obtenerKeyStore() throws Exception {
        java.security.KeyStore ks = java.security.KeyStore.getInstance(TIPO_KEYSTORE);
        Properties propiedades = ControladorBase.obtenerControlador().obtenerPropiedades();
        ks.load(new FileInputStream(propiedades.getProperty("ruta_certificado_pfx")), propiedades.getProperty("passkeystore").toCharArray());
        return ks;
    }
    
}
