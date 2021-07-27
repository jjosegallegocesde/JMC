/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Juan
 */
public class BaseDatos {
    
    private static final String url="jdbc:mysql://localhost/aeropuertois";
    private static final String usuario="root";
    private static final String password="";
    
    
    public Connection conectarConBD(){
        Connection conexion=null;
        
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexion=DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexión exitosa con BD");
            return conexion;
            
            
        }catch(Exception e){
            System.out.println("Tenemos un error: "+e);
            return null;
        }    
    }
    
}
