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
public class PruebaMapaMarcadores extends MapaEjemplo {

    public PruebaMapaMarcadores() {
        cargarMapaMarcadores();
    }

    public void cargarMapaMarcadores() {
        MapaEjemplo mapaMarcador = new MapaEjemplo();
        String cargaMarcadores = mapaMarcador.cargarMapaMarcadores("C:\\Users\\asortega\\Desktop\\mapa.txt", "<!--INICIOBODY-->", "<!--FINBODY-->", "<!--INICIOHEAD-->", "<!--FINHEAD-->");
        MapaGenerico instanciaMarcadores = new MapaGenerico(cargaMarcadores);

    }

    public static void main(String... args) {
        new PruebaMapaMarcadores();
    }
}
