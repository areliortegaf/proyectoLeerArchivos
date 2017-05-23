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
public interface MapaMarcadores {
    
    public String cabezaMarcadores(String pRuta, String pInicio, String pFin);

    public String cuerpoMarcadores(String pRuta, String pInicio, String pFin);

    public String cargarMapaMarcadores(String pRuta, String pInicioCuerpo, String pFinCuerpo, String pInicioCabeza, String pFinCabeza);
    
}
