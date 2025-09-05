/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15.wsjcyl.firmadorXML;

import com.sun.xml.txw2.output.ResultFactory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;
import xades4j.algorithms.EnvelopedSignatureTransform;
import xades4j.production.DataObjectReference;
import xades4j.production.SignedDataObjects;
import xades4j.production.XadesBesSigningProfile;
import xades4j.production.XadesSigner;
import xades4j.properties.DataObjectDesc;
import xades4j.properties.DataObjectFormatProperty;
import xades4j.providers.KeyingDataProvider;
import xades4j.providers.impl.FileSystemKeyStoreKeyingDataProvider;
import xades4j.utils.DOMHelper;

/**
 *
 * @author inven
 */
public class Firmador {
    
    private static Firmador firmador = null;
    
    private Firmador(){
        
    }
    
    public static Firmador obtenerFirmador(){
        if(firmador==null)
            firmador = new Firmador();
        return firmador;
    }
    
    public String firmarXML(String origen,String rutaCertificado,String tipoCertificado,String passCertificado) throws Exception {
        StringReader fuenteDatos = new StringReader(origen);
        Document doc = DocumentBuilderFactory
                .newInstance()
                .newDocumentBuilder()
                .parse(new InputSource(fuenteDatos));
        Element elem = doc.getDocumentElement();
        DOMHelper.useIdAsXmlId(elem);
        
        //Define he signing key/certificate
        KeyingDataProvider kp = FileSystemKeyStoreKeyingDataProvider
                .builder(tipoCertificado, rutaCertificado, new FirstCertificateSelector())
                .storePassword(new DirectPasswordProvider(passCertificado))
                .entryPassword(new DirectPasswordProvider(passCertificado))
                .fullChain(false)
                .build();
        
        //Define the signed object
        DataObjectDesc obj = new DataObjectReference("")
                .withTransform(new EnvelopedSignatureTransform())
                .withDataObjectFormat(new DataObjectFormatProperty("text/xml"));
        //Create the signature
        XadesSigner signer = new XadesBesSigningProfile(kp).newSigner();
        signer.sign(new SignedDataObjects(obj), doc.getDocumentElement());
        
        DOMImplementation domImpl = doc.getImplementation();
        DOMImplementationLS domImplLS = (DOMImplementationLS)domImpl.getFeature("LS", "3.0");
        LSSerializer serializer = domImplLS.createLSSerializer();
        serializer.getDomConfig().setParameter("xml-declaration", Boolean.valueOf(false));
        LSOutput lsOutput = domImplLS.createLSOutput();
        StringWriter sw = new StringWriter();
        lsOutput.setCharacterStream(sw);
        serializer.write(doc, lsOutput);        
        return sw.toString();
    }
    
    public File firmarXML(File ficheroAFirmar,String rutaCertificado,String tipoCertificado,String passCertificado) 
            throws Exception{
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(ficheroAFirmar);
        Element elem = doc.getDocumentElement();
        DOMHelper.useIdAsXmlId(elem);
        
        //Define he signing key/certificate
        KeyingDataProvider kp = FileSystemKeyStoreKeyingDataProvider
                .builder(tipoCertificado, rutaCertificado, new FirstCertificateSelector())
                .storePassword(new DirectPasswordProvider(passCertificado))
                .entryPassword(new DirectPasswordProvider(passCertificado))
                .fullChain(false)
                .build();
        
        //Define the signed object
        DataObjectDesc obj = new DataObjectReference("")
                .withTransform(new EnvelopedSignatureTransform())
                .withDataObjectFormat(new DataObjectFormatProperty("text/xml"));
        
        //Create the signature
        XadesSigner signer = new XadesBesSigningProfile(kp).newSigner();
        signer.sign(new SignedDataObjects(obj), doc.getDocumentElement());
        
        DOMImplementation domImpl = doc.getImplementation();
        DOMImplementationLS domImplLS = (DOMImplementationLS)domImpl.getFeature("LS", "3.0");
        LSSerializer serializer = domImplLS.createLSSerializer();
        serializer.getDomConfig().setParameter("xml-declaration", Boolean.valueOf(Boolean.FALSE));
        LSOutput lsOutput = domImplLS.createLSOutput();
        String rutaFicheroSalida = ficheroAFirmar.getPath().replace(".xml", "_firmado.xml");
        File ficheroSalida = new File(rutaFicheroSalida);
        FileWriter fw = new FileWriter(ficheroSalida);
        BufferedWriter writer = new BufferedWriter(fw);
        lsOutput.setCharacterStream(writer);
        serializer.write(doc, lsOutput);
        return ficheroSalida;
    }
}
