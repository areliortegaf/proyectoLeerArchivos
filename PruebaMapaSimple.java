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
public class PruebaMapaSimple {

    public PruebaMapaSimple() {
        cargarMapaSimple();
    }

    public void cargarMapaSimple() {
        MapaEjemplo mapaSimple = new MapaEjemplo();
        String cargaSimple = mapaSimple.cargarMapaMarcadores("C:\\Users\\asortega\\Desktop\\mapa.txt", "<!--INICIOBODY-->", "<!--FINBODY-->", "<!--INICIOHEAD-->", "<!--FINHEAD-->");
        MapaGenerico instanciaSimple = new MapaGenerico(cargaSimple);

    }

    public static void main(String... args) {
        new PruebaMapaSimple();
    }
}
