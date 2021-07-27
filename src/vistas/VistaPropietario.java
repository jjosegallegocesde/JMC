/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.Scanner;
import modelos.Propietario;

/**
 *
 * @author Juan
 */
public class VistaPropietario {
    
   
    public Propietario activarVista(){
        
        Scanner entrada = new Scanner(System.in);
        Propietario propietario= new Propietario();
        
        System.out.println("Bienvenido");
        
        System.out.println("Digite la cedula del propietario: ");
        propietario.setCedula(entrada.next());
        
        System.out.println("Digite el nombre del propietario: ");
        propietario.setNombres(entrada.next());
        
        System.out.println("Digite el metodo de pago (0-1): ");
        propietario.setMetodoPago(entrada.nextInt());
        
        return propietario;
        
    }
    
}
