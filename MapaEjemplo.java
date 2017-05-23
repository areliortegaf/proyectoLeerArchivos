/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxbrowserversion01;

/**
 *
 * @author asortega
 */
public class MapaEjemplo implements MapaMarcadores, MapaBuscador, MapaSimple {

    //
    //DECLARACION DE VARIABLES
    //
    String vCuerpoBuscador;
    String vCabezaBuscador;
    String vCuerpoMarcadores;
    String vCabezaMarcadores;

    String vCargaCuerpoBuscador;
    String vCargaCabezaBuscador;

    String vCargaCuerpoMarcadores;
    String vCargaCabezaMarcadores;

    String vCargarMapaBuscador;
    String vCargarMapaMarcadores;

    String vCabezaSimple;
    String vCuerpoSimple;
    String vCargaCuerpoSimple;
    String vCargaCabezaSimple;
    String vCargarMapaSimple;

    //
    //METODOS CREADOS ESPECIFICAMENTE PARA LEER UNA PARTE DEL ARCHIVO SEGUN ETIQUETAS
    //
    @Override
    public String cuerpoBuscador(String pRuta, String pInicio, String pFin) {
        LectorDeArchivos leerCuerpo = new LectorDeArchivos();
        
        vCuerpoBuscador = leerCuerpo.leerArchivo(pRuta, pInicio, pFin);
        return vCuerpoBuscador;
    }

    @Override
    public String cabezaBuscador(String pRuta, String pInicio, String pFin) {
        LectorDeArchivos htmlMapalBuscador = new LectorDeArchivos();
        //htmlMapalBuscador.getCabecero();
        vCabezaBuscador = htmlMapalBuscador.leerArchivo(pRuta, pInicio, pFin);
        return vCabezaBuscador;
    }

    @Override
    public String cabezaMarcadores(String pRuta, String pInicio, String pFin) {
        LectorDeArchivos leerCabeza = new LectorDeArchivos();
        vCabezaMarcadores = leerCabeza.leerArchivo(pRuta, pInicio, pFin);
        return vCabezaMarcadores;
    }

    @Override
    public String cuerpoMarcadores(String pRuta, String pInicio, String pFin) {
        LectorDeArchivos leerCuerpo = new LectorDeArchivos();
        vCuerpoMarcadores = leerCuerpo.leerArchivo(pRuta, pInicio, pFin);
        return vCuerpoMarcadores;
    }

    @Override
    public String cargarMapaBuscador(String pRuta, String pInicioCuerpo, String pFinCuerpo, String pInicioCabeza, String pFinCabeza) {
        vCargaCuerpoBuscador = cuerpoBuscador(pRuta, pInicioCuerpo, pFinCuerpo);
        vCargaCabezaBuscador = cabezaBuscador(pRuta, pInicioCabeza, pFinCabeza);

        vCargarMapaBuscador = "<html> <head>" + vCargaCabezaBuscador + "</head> <body> " + vCargaCuerpoBuscador + "</body></html>";
        return vCargarMapaBuscador;
    }

    @Override
    public String cargarMapaMarcadores(String pRuta, String pInicioCuerpo, String pFinCuerpo, String pInicioCabeza, String pFinCabeza) {
        vCargaCuerpoMarcadores = cuerpoMarcadores(pRuta, pInicioCuerpo, pFinCuerpo);
        vCargaCabezaMarcadores = cabezaMarcadores(pRuta, pInicioCabeza, pFinCabeza);

        vCargarMapaMarcadores = "<html> <head>" + vCargaCabezaMarcadores + "</head> <body> " + vCargaCuerpoMarcadores + "</body></html>";
        return vCargarMapaMarcadores;
    }

    @Override
    public String cabezaSimple(String pRuta, String pInicio, String pFin) {
        LectorDeArchivos leerCabeza = new LectorDeArchivos();
        vCabezaSimple = leerCabeza.leerArchivo(pRuta, pInicio, pFin);
        return vCabezaSimple;
    }

    @Override
    public String cuerpoSimple(String pRuta, String pInicio, String pFin) {
        LectorDeArchivos leerCuerpo = new LectorDeArchivos();
        vCuerpoSimple = leerCuerpo.leerArchivo(pRuta, pInicio, pFin);
        return vCuerpoSimple;
    }

    @Override
    public String cargarMapaSimple(String pRuta, String pInicioCuerpo, String pFinCuerpo, String pInicioCabeza, String pFinCabeza) {
        vCargaCuerpoSimple = cuerpoMarcadores(pRuta, pInicioCuerpo, pFinCuerpo);
        vCargaCabezaSimple = cabezaMarcadores(pRuta, pInicioCabeza, pFinCabeza);

        vCargarMapaSimple = "<html> <head>" + vCargaCabezaSimple + "</head> <body> " + vCargaCuerpoSimple + "</body></html>";
        return vCargarMapaSimple;
    }

}
