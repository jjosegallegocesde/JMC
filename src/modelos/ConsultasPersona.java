/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Juan
 */
public class ConsultasPersona extends BaseDatos {
    
    private PreparedStatement sentenciaSQL;
    
    public void insertarPropietario(Propietario propietario){
        
       Connection conexion = conectarConBD();
       
       try{
            String consulta="INSERT INTO propietarios(cedula,nombres,metodo_pago)"
                    + "VALUES(?,?,?)";
            
            sentenciaSQL=conexion.prepareStatement(consulta);
            
            sentenciaSQL.setString(1, propietario.getCedula());
            sentenciaSQL.setString(2, propietario.getNombres());
            sentenciaSQL.setInt(3, propietario.getMetodoPago());
            
            int resultado=sentenciaSQL.executeUpdate();
            
            if(resultado>0){
                System.out.println("Agregado con exito"); 
            }else{
                System.out.println("Error al agregar");
            }
            
        }catch(Exception e){
            System.out.println("Tenemos un error: "+e);
            
        }finally{
           
            try{
                conexion.close();
            }catch(Exception e){
                System.out.println("Tenemos un error: "+e);
            }
            
        }  
        
    }
    
    
}
