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
public final class PruebaMapaBuscador extends MapaEjemplo {

    public PruebaMapaBuscador() {
        cargarMapaBuscador();
    }

    public void cargarMapaBuscador() {
        MapaEjemplo cargaBuscador = new MapaEjemplo();
        String cargar = cargaBuscador.cargarMapaBuscador("C:\\Users\\asortega\\Desktop\\mapa.txt", "<!--INICIOBODY-->", "<!--FINBODY-->", "<!--INICIOHEAD-->", "<!--FINHEAD-->");
        MapaGenerico nuevaInstancia = new MapaGenerico(cargar);
    }

    public static void main(String... args) {

        new PruebaMapaBuscador();
    }

}
