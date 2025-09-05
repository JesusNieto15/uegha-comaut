/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jnr15.wsmadrid.test;

import com.jnr15.ControladorBase;
import com.jnr15.keystore.KeyStore;
import configBBDD.Propiedades;
import dao.JDBCDAOInceccaConsultas;
import java.net.URL;
import madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.RiiaWS2Service;
import madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.RiiaWS2ServiceLocator;
import madrid.comunidad.gestiona2.riia_ws.services.riia_ws2.Riia_ws2SoapBindingStub;
import modelo.DatosEquidosComAut;
import riia_ws.veterinarios.beans.AnimalBean;
import riia_ws.veterinarios.beans.EquidoBean;


/**
 *
 * @author jesus
 */
public class Test1 {

    private static final Boolean USO_EXTERNO = Boolean.FALSE;

    public static void main(String[] args) {
        try {
            //test1_1();
            test1_1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test1_1() throws Exception {
        inicializarPropiedades();
        Riia_ws2SoapBindingStub stub = obtenerStub();
        EquidoBean[] equidoBean = stub.consultaEquido("48", "724018000003566", "");
        if (equidoBean != null && equidoBean.length > 0) {
            EquidoBean equido = equidoBean[0];
            System.out.println(equido.getC_codigo_ueln());
        }
    }
    
    private static void test1_2() throws Exception {
        inicializarPropiedades();
        Riia_ws2SoapBindingStub stub = obtenerStub();
        ControladorBase controladorBase = ControladorBase.obtenerControlador();
        DatosEquidosComAut datos = controladorBase.datosEquidosPorUeln("724018000006709");
        AnimalBean animalBean = new AnimalBean();
        
        animalBean.setB_castrado(datos.getCastrado());
        animalBean.setC_apti_cons_id(controladorBase.addCerosDelante(datos.getCodigoAptitud(), 2));
        animalBean.setC_capa_id(controladorBase.addCerosDelante(datos.getCodigoCapa(), 2));
        animalBean.setC_cifnif(datos.getNIFTitular());
        animalBean.setC_codigo_ueln(datos.getCodigoUELN());
        animalBean.setC_especie_id(datos.getCodigoEspecie());
        animalBean.setC_expl_iden(datos.getExplotacionNacimiento());
        animalBean.setC_expl_naci(datos.getExplotacionNacimiento());
        animalBean.setC_fiabilidad(datos.getCodigoFiabilidad());
        animalBean.setC_id_altern_id(datos.getIdAlternativo());
        animalBean.setC_iden_elec(datos.getIdElectronica());
        animalBean.setC_municipio(datos.getCodigoMunicipioTitular());
        animalBean.setC_orie_anim_id(controladorBase.addCerosDelante(datos.getCodigoOrientacion(), 2));
        animalBean.setC_pais_naci(datos.getCodigoLugarNacimiento());
        animalBean.setC_postal(datos.getCodigoPostal());
        animalBean.setC_provincia(datos.getCodigoProvinciaTitular());
        animalBean.setC_raza_id(datos.getCodigoRaza());
        animalBean.setC_sexo_id(controladorBase.addCerosDelante(datos.getCodigoSexo(), 2));
        animalBean.setC_tipo_iden_id(controladorBase.addCerosDelante(datos.getCodigoTipoIdentificacion(), 2));
        animalBean.setC_tipo_lect_id(controladorBase.addCerosDelante(datos.getCodigoSistemaLectura(), 2));
        animalBean.setC_tipo_muer_id(datos.getCodigoTipoMuerte() != null ? controladorBase.addCerosDelante(datos.getCodigoTipoMuerte(), 2) : datos.getCodigoTipoMuerte());
        String[] nombreApellidos = JDBCDAOInceccaConsultas.obtenerDao().nombreApellidosPorNif(datos.getNIFTitular());
        animalBean.setD_apellidos(nombreApellidos[1]);
        animalBean.setD_calle(datos.getLiteralDireccionTitular());
        animalBean.setD_nombre(nombreApellidos[0]);
        animalBean.setD_nombre_com(datos.getLiteralNombreComercial());
        animalBean.setD_nombre_nac(datos.getLiteralNombreNacimiento());
        animalBean.setF_identific(datos.getFechaIdentificacion());
        animalBean.setF_ini_titu(datos.getFechaInicioTitular());
        animalBean.setF_nacimiento(datos.getFechaNacimiento());

        AnimalBean[] listaAnimales = new AnimalBean[1];
        listaAnimales[0] = animalBean;
        AnimalBean animalBeanRespuesta = (AnimalBean)stub.altaAnimal(listaAnimales).firstElement();
        System.out.println(animalBeanRespuesta.getD_error());
    }

    private static Riia_ws2SoapBindingStub obtenerStub() throws Exception {
        RiiaWS2Service servicio = new RiiaWS2ServiceLocator();
        Riia_ws2SoapBindingStub stub = new Riia_ws2SoapBindingStub(new URL(servicio.getriia_ws2Address()), servicio);
        return stub;
    }

    private static void inicializarPropiedades() throws Exception {
        cargarKeyStore();
        String maquina = "192.168.1.35";
        String puerto = "3306";
        if (USO_EXTERNO) {
            maquina = "ansoldes.com";
            puerto = "2224";
        }
        Propiedades.obtenerPropiedades().modificarPropiedadesConexionBBDD(maquina, puerto, "uegha", "jesus", "19811224");
    }

    private static void cargarKeyStore() {
        KeyStore.cargarKeyStore();
    }

}
