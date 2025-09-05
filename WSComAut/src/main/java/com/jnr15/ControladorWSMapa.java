/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15;

import com.jnr15.wsmapa.ws.DatosBasicos;
import com.jnr15.wsmapa.ws.DatosBasicosCompleto;
import com.jnr15.wsmapa.ws.PIDA_WS;
import com.jnr15.wsmapa.ws.PIDA_WSLocator;
import com.jnr15.wsmapa.ws.PIDA_WSSoapStub;
import com.jnr15.wsmapa.ws.UbicacionEquido;
import jakarta.xml.bind.DatatypeConverter;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import javax.xml.soap.SOAPElement;
import org.apache.axis.client.Stub;
import org.apache.axis.message.PrefixedQName;
import org.apache.axis.message.SOAPHeaderElement;

/**
 *
 * @author jesus
 */
public class ControladorWSMapa {
    
    private static ControladorWSMapa controlador = null;
    private final ControladorBase controladorBase;
    private final PIDA_WSSoapStub pidaWSSoapStub;

    private ControladorWSMapa() throws Exception {
        controladorBase = ControladorBase.obtenerControlador();
        pidaWSSoapStub = obtenerStub();
    }

    public static ControladorWSMapa obtenerControlador() throws Exception {
        if (controlador == null) {
            controlador = new ControladorWSMapa();
        }
        return controlador;
    }
    
    private PIDA_WSSoapStub obtenerStub()throws Exception {
        PIDA_WS servicio = new PIDA_WSLocator() ;
        PIDA_WSSoapStub stub = new PIDA_WSSoapStub(new URL(servicio.getPIDA_WSSoapAddress()),servicio);
        Stub st = (Stub)stub;
        addWsSecurityHeader(st, "EQ724018", "EQ724018");
        return stub;
    }
    
    private static void addWsSecurityHeader(Stub binding, String usernameStr, String passwordStr) throws Exception { 
        SOAPHeaderElement wsseSecurity = new SOAPHeaderElement(new PrefixedQName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd","Security", "wsse"));
        wsseSecurity.setMustUnderstand(false);
        wsseSecurity.setAttribute("xmlns:wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
        wsseSecurity.setActor(null);
        
        //set userNameToken
        SOAPElement userNameToken = wsseSecurity.addChildElement("UsernameToken","wsse");
        userNameToken.setAttribute("wsu:Id", "UsernameToken-1");
        
        //set username
        SOAPElement userName = userNameToken.addChildElement("Username","wsse");
        userName.setValue(usernameStr);
        
        //set password
        SOAPElement password = userNameToken.addChildElement("Password", "wsse");
        password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
        password.setValue(passwordStr);
        
        //set created
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        String timestamp = DatatypeConverter.printDateTime(c);
        timestamp = timestamp.substring(0,19);
        timestamp = timestamp+"Z";
        SOAPElement created = userNameToken.addChildElement("Created","wsse");
        created.setValue(timestamp);
        binding.setHeader(wsseSecurity);
        binding.setUsername(usernameStr);
        binding.setPassword(passwordStr);
    }
    
    public String[] obtenerCodigoUbicacionPorUeln(String ueln)throws Exception {
        String[] result = null;
        UbicacionEquido ubicacion = pidaWSSoapStub.dameUbicacionEquido(ueln);
        if(ubicacion!=null)
            result = new String[]{ubicacion.getCodigoUbicacion(),ubicacion.getDescripcionUbicacion()};
        return result;
    }
    
    public String[] obtenerCodigoOrganismoEmisor(String ueln) throws Exception {
        String[] result = null;
        DatosBasicos dB = pidaWSSoapStub.dameDatosBasicosEquido(ueln);
        DatosBasicosCompleto dBC = null;
        if(dB instanceof DatosBasicosCompleto){
            dBC = (DatosBasicosCompleto)dB;
        }
        if(dBC!=null){
            result=new String[]{dBC.getCodigoOrganismoEmisor(),dBC.getOrganismoEmisor()};
        }
        else if(dB!=null){
            result=new String[]{dB.getCodigoOrganismoEmisor(),dB.getOrganismoEmisor()};
        }
        return result;
    }
    
}
