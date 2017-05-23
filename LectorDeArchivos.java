/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxbrowserversion01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author asortega
 */
public class LectorDeArchivos {

    

    private String tipoArchivo(String pRutaArchivo) {
        File validador = new File(pRutaArchivo);
        String fileName = validador.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            System.out.println();
        }
        String tipoDeArchivo = fileName.substring(fileName.lastIndexOf(".") + 1);
        return tipoDeArchivo;
    }

    //
    //METODOS QUE SE USAN PARA LEER EL TEXTO SEGUN SUS ETIQUETAS
    //
    private int lineasTotales(String archivoRuta) {
        int lineas = 0;

        //LEER EL TIPO DE ARCHIVO
        String validarTipoArchivo = tipoArchivo(archivoRuta);
        if (validarTipoArchivo.equalsIgnoreCase("txt")) {
            try {

                File archivo = new File(archivoRuta);
                LineNumberReader leectorDeLineas = new LineNumberReader(new FileReader(archivo));
                leectorDeLineas.skip(Long.MAX_VALUE);
                lineas = leectorDeLineas.getLineNumber();
                leectorDeLineas.close();

            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            }
            //System.out.println("El archivo es de tipo txt");
            return lineas;
        } else if (validarTipoArchivo.equalsIgnoreCase("html")) {
            try {

                File archivo = new File(archivoRuta);
                LineNumberReader leectorDeLineas = new LineNumberReader(new FileReader(archivo));
                leectorDeLineas.skip(Long.MAX_VALUE);
                lineas = leectorDeLineas.getLineNumber();
                leectorDeLineas.close();

            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            }
            //System.out.println("El archivo es de tipo html");
            return lineas;
        } else if (validarTipoArchivo.equalsIgnoreCase("js")) {
            try {

                File archivo = new File(archivoRuta);
                LineNumberReader leectorDeLineas = new LineNumberReader(new FileReader(archivo));
                leectorDeLineas.skip(Long.MAX_VALUE);
                lineas = leectorDeLineas.getLineNumber();
                leectorDeLineas.close();

            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            }
            //System.out.println("El archivo es de tipo js");
            return lineas;
        } else {
            System.out.println("El Archivo no se puede leer, por favor ingrese un archivo de tipo txt, js o html");
            return 0;
        }

    }

    public String leerArchivo(String RutaArchivo, String elInicio, String elFinal) {

        int numeroDeLineaInicio = 0;
        int numeroDeLineaFinal = 0;

        String htmlAEjecutar = "";
        int contadorLineal = 0;
        String txtoDeLinea;
        ////////////////////////
        int finDelArchivo = lineasTotales(RutaArchivo);

        ///////////////////////
        while (contadorLineal <= finDelArchivo) {
            //se inicializa el lector de las lineas

            try {

                txtoDeLinea = Files.readAllLines(Paths.get(RutaArchivo)).get(contadorLineal);

                //ESTOS NOMAS SIRVEN PARA EL CONTADOR
                if (txtoDeLinea.equals(elInicio)) {
                    numeroDeLineaInicio = contadorLineal;//numero menor

                }
                if (txtoDeLinea.equals(elFinal)) {
                    numeroDeLineaFinal = contadorLineal;//numero mayor

                }

                contadorLineal = contadorLineal + 1;

            } catch (IOException e) {
                System.out.println(e);
            }

        }
        try {

            for (int i = (numeroDeLineaInicio + 1); i <= (numeroDeLineaFinal - 1); ++i) {
                txtoDeLinea = Files.readAllLines(Paths.get(RutaArchivo)).get(i);
                htmlAEjecutar = htmlAEjecutar + " " + txtoDeLinea;
            }
            //System.out.println(htmlAEjecutar);
        } catch (IOException e) {
            System.out.println(e);
        }

        //agregar aqui o antes la validacion de tipo archivo
        return htmlAEjecutar;
    }

}
