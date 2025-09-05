/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.cantabria.test;

import com.jnr15.cantabria.ws.Lote;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.math.BigInteger;

/**
 *
 * @author jesus
 */
public class Test1 {

    public static void main(String[] args) {
        
        int tipoPrueba = 1;
        
        switch (tipoPrueba) {
            case 0:
                microchipHexadecimalPorSalidaEstandar("10010000724060001101711");
                break;
            case 1:
                pruebaGeneracionXML();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    private static void pruebaGeneracionXML() {
        try {
            JAXBContext contexto = JAXBContext.newInstance(Lote.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(new Lote(), System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void microchipHexadecimalPorSalidaEstandar(String microchipDecimal){
        System.out.println(microchipAHexadecimal(microchipDecimal));
    }

    private static String microchipAHexadecimal(String decimal) {
        StringBuilder sb = new StringBuilder();
        String bloque1 = decimal.substring(0, 1);
        String bloque2 = decimal.substring(1, 2);
        String bloque3 = decimal.substring(2, 4);
        String bloque4 = decimal.substring(4, 6);
        String bloque5 = decimal.substring(6, 7);
        String bloque6 = decimal.substring(7, 11);
        String bloque7 = decimal.substring(11);
        Integer b1 = Integer.valueOf(bloque1, 2);
        sb.append(establecerLongitudString(b1.toString(), 1));
        Integer b2 = Integer.valueOf(bloque2, 2);
        sb.append(establecerLongitudString(b2.toString(), 3));
        Integer b3 = Integer.valueOf(bloque3, 2);
        sb.append(establecerLongitudString(b3.toString(), 5));
        Integer b4 = Integer.valueOf(bloque4, 2);
        sb.append(establecerLongitudString(b4.toString(), 6));
        Integer b5 = Integer.valueOf(bloque5, 2);
        sb.append(establecerLongitudString(b5.toString(), 1));
        Integer b6 = Integer.valueOf(bloque6);
        Integer cocienteB6 = b6 / 512;
        Integer restoB6 = b6 % 512;
        sb.append(establecerLongitudString(Integer.toString(cocienteB6, 2), 1));
        sb.append(establecerLongitudString(Integer.toString(restoB6, 2), 9));
        BigInteger b7 = new BigInteger(bloque7);
        BigInteger resto1B7 = b7.divide(BigInteger.valueOf(512L * 512 * 512 * 512)).mod(BigInteger.valueOf(512));
        BigInteger resto2B7 = b7.divide(BigInteger.valueOf(512 * 512 * 512)).mod(BigInteger.valueOf(512));
        BigInteger resto3B7 = b7.divide(BigInteger.valueOf(512 * 512)).mod(BigInteger.valueOf(512));
        BigInteger resto4B7 = b7.divide(BigInteger.valueOf(512)).mod(BigInteger.valueOf(512));
        BigInteger parteB7 = b7.subtract((b7.divide(BigInteger.valueOf(512))).multiply(BigInteger.valueOf(512)));
        sb.append(establecerLongitudString(resto1B7.toString(2), 2));
        sb.append(establecerLongitudString(resto2B7.toString(2), 9));
        sb.append(establecerLongitudString(resto3B7.toString(2), 9));
        sb.append(establecerLongitudString(resto4B7.toString(2), 9));
        sb.append(establecerLongitudString(parteB7.toString(2), 9));
        BigInteger microchipBinario = new BigInteger(sb.toString(), 2);
        return microchipBinario.toString(16).toUpperCase();
    }
    
    private static String establecerLongitudString(String origen, int longStringResultante){
        String resul = origen;
        int longStringOrigen = origen.length();
        if(longStringOrigen<longStringResultante){
            while(longStringOrigen<longStringResultante){
                resul = "0" + resul;
                longStringOrigen = resul.length();
            }
        }
        return resul;
    }

}
