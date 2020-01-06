/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoestudio_03022020;

import gui.principal;
import logica.Controller;

/**
 *
 * @author sfsuarez
 */
public class CasoEstudio_03022020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
        
        //Controller control = new Controller();
    }
    
}
