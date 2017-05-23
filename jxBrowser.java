/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jxbrowserversion01;

import com.teamdev.jxbrowser.chromium.LoadHTMLParams;
import com.teamdev.jxbrowser.chromium.LoggerProvider;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author asortega
 */
public class jxBrowser extends JFrame {

    //OBJETOS BASICOS PARA CREAR EL BROWSER
    com.teamdev.jxbrowser.chromium.Browser browser = new com.teamdev.jxbrowser.chromium.Browser();
    com.teamdev.jxbrowser.chromium.swing.BrowserView vista = new com.teamdev.jxbrowser.chromium.swing.BrowserView(browser);

    public jxBrowser(String contenidoACargar) {
        //PROPIEDADES DE LA VENTANA
        this.add(vista);
        vista.setVisible(true);
        this.setSize(800, 500);
        this.setVisible(true);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //OCULTA INFO EN LA CONSOLA
        LoggerProvider.getChromiumProcessLogger().setLevel(Level.OFF);
        LoggerProvider.getIPCLogger().setLevel(Level.OFF);
        LoggerProvider.getBrowserLogger().setLevel(Level.OFF);

        browser.addLoadListener(new LoadAdapter() {
            @Override
            public void onFinishLoadingFrame(FinishLoadingEvent event) {
                if (event.isMainFrame()) {
                    System.out.println("El contenido se ha cargado");
                    System.out.println(contenidoACargar);
                }
            }

        });
        browser.loadHTML(new LoadHTMLParams(contenidoACargar,
                "UTF-8",
                "http://prueba.com"));

    }

}
