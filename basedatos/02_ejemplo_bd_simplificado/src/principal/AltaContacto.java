/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AltaContacto {

   
    public static void main(String[] args) {
        Connection cn=null;
        try {
            //Paso1: Establecimiento conexión
            
            //1.b. Crear conexión
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root");
            
            //Paso 2: Envio SQL
            String sql="Insert into contactos (nombre,email,telefono) values('prueba1','ep1@gmail.com',123)";
            Statement st=cn.createStatement();
            st.execute(sql);            
            System.out.println("Fila añadida!");
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            if(cn!=null){
                try {
                    //Paso 4: cierre de la conexión
                    cn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }           
        }
        
        
    }
    
}
