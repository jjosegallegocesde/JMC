/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmc;
import controladores.ControladorPropietario;
import java.util.Scanner;
import modelos.Propietario;
import vistas.VistaPropietario;

/**
 *
 * @author Juan
 */
public class JMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VistaPropietario vistaPropietario= new VistaPropietario();
        Propietario propetario=vistaPropietario.activarVista();
        
        ControladorPropietario controladorPropietario = new ControladorPropietario();
        controladorPropietario.registrarPropietario(propetario);
        
        
            
    }
    
}
