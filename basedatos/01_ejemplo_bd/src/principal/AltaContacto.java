
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AltaContacto {


    public static void main(String[] args) {
        Connection cn = null ;
        
        //Para evitar tanta excepción se puede hacer el try con recursos
        try {
            // TODO code application logic here
            
            //Paso1: establecimiento de conexión:
            //1a: Carga del driver, que es una clase y hay que crear un objeto de la misma.
            //tiene un método llamado forname, para crear objetos a partir del nombre de la clase
            //Hay que meterlo en bloque try catch porque genera excepción checked
            Class.forName("com.mysql.jdbc.Driver");
            
            //1B. Crear la conexión, las conexiónes son objetos de la interface connection, 
            //la llamada al método devuelve un objeto de una clase, probablemente anoniima que implementa esa interface...
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/agenda", "root", "root");
            
            //Paso 2: envio de la instrucción sql, se envia como cadena de caracteres.            
            
            //inser into, update y delete...
            String sql="Insert into contactos (nombre, email, telefono) values('Angel', 'angegon@gmail.com', 682595731)";
            Statement st = cn.createStatement();
            st.execute(sql);//devuelve un bollean, 
            //executeUpdate devuelve un entero que es el número de filas afectadsa por la operación.
            
    
            
            
        } catch (ClassNotFoundException ex ) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            if(cn!=null){
                try {
                    //Paso 4, cierre de la conexion
                    cn.close();//No se debería olvidar nunca.                     
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
               

        }
       
       
    }
    
}
