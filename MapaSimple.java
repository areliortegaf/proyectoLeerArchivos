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
public interface MapaSimple {

    public String cabezaSimple(String pRuta, String pInicio, String pFin);

    public String cuerpoSimple(String pRuta, String pInicio, String pFin);

    public String cargarMapaSimple(String pRuta, String pInicioCuerpo, String pFinCuerpo, String pInicioCabeza, String pFinCabeza);
}
