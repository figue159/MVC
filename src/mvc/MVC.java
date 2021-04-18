/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.Controlador;
import modelo.Produccion;
import modelo.User;
import vista.Prod;
import vista.Vista;

/**
 *
 * @author 57322
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Produccion p = new Produccion();
       Vista v = new Vista();
       Prod pr = new Prod();
       Controlador c = new Controlador(p,v,pr);
       v.setVisible(true);
        
    }
    
}
