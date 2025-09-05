/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnr15;

/**
 *
 * @author Jesús Nieto Rodríguez jesusnieto@invengenio.com
 */
public enum ConstantesComunes {
    
    MOTIVO_INSCRIPCION(0),
    MOTIVO_CAMBIO_TITULAR(1),
    MOTIVO_MODIFICACION_PROPIETARIO(2),
    DIRECTORIO_LOGS("./logs/"),
    CODIGO_UBICACION_ANDALUCIA("001"),
    CODIGO_UBICACION_CASTILLAYLEON("008"),
    CODIGO_UBICACION_EXTREMADURA("010"),
    CODIGO_UBICACION_C_VALENCIANA("017"),
    CODIGO_UBICACION_PAIS_VASCO("015"),
    CODIGO_UBICACION_CASTILLA_LA_MANCHA("007"),
    CODIGO_UBICACION_MADRID("012"),
    CODIGO_UBICACION_MURCIA("013"),
    CODIGO_UBICACION_BALEARES("004"),
    CODIGO_UBICACION_GALICIA("011"),
    CODIGO_MODIFICACION_FICHA_PRODUCTO_O_GANADERIA("0.0"),
    CODIGO_MINISTERIO_SIN_CCAA("0.1"),
    CODIGO_EXCEPCION_INTERNA("0.2"),
    MENSAJE_MODIFICACION_FICHA_PRODUCTO_O_GANADERIA("Modificación en la ficha de propietario o ficha de ganadería.\n"
                            + "Revisar para posible envío manual"),
    MENSAJE_MINISTERIO_SIN_CCAA("El Ministerio no puede determinar la CCAA competente.\n"
                                + "Revisar para posible envío manual"),
    TITULO_VENTANA_BALEARES_ACTUALIZAR_EQUIDO("ACTUALIZAR EQUIDO - BALEARES");
    
    private Integer entero;
    private String cadena;

    private ConstantesComunes(Integer entero) {
        this.entero=entero;
    }
    
    private ConstantesComunes(String cadena){
        this.cadena=cadena;
    }
    
    public Integer getInteger(){
        return entero;
    }
    
    public String getString(){
        return cadena;
    }
}
