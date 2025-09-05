/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.vistas;

import com.jnr15.logs.Log;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author jesus
 */
public class MostrarMensajes {
    
    public static void mensajeInformativo(String mensaje){
        TextArea textArea = new TextArea(20, 40);
        textArea.setText(mensaje);
        textArea.setEditable(false);
        JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void mensajeExcepcion(Exception ex) {
        String mensaje = ((ex.getMessage()==null || ex.getMessage().length()==0)?"Error inesperado. Revisar contenido del fichero Log":ex.getMessage());
        JOptionPane.showMessageDialog(null, mensaje, "EXCEPCIÓN", JOptionPane.ERROR_MESSAGE);
        try {
            Log.registrarExcepcion(ex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String mensajeSolicitudUELN(){
        return JOptionPane.showInputDialog("Por favor, indique el UELN del animal");
    }
    
    public static File rutaFichero(String nombreFicheroPropuesto){
        File fichero = null;
        JFileChooser fc = new JFileChooser();
        if(nombreFicheroPropuesto!=null)
            fc.setSelectedFile(fichero=new File(nombreFicheroPropuesto));
        int respuesta = fc.showSaveDialog(null);
        if(respuesta==JFileChooser.APPROVE_OPTION){
            fichero = fc.getSelectedFile();
        }
        return fichero;
    }
    
}
