
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection cn=null;
        try {
            //Paso1: Establecimiento conexión                       

            //Si queremos hacer las dos en una opción hay que desactivar la opción autocommit, que se hace a nivel de conexion.
            cn.setAutoCommit(false);
            
            //1.b. Crear conexión
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root");
            
            //Paso 2: Envio SQL
            String sql="Insert into contactos (nombre,email,telefono) values('prueba1','ep1@gmail.com',123)";
            Statement st=cn.createStatement();
            st.execute(sql);            
            sql="Insert into contactos (nombre,email,telefono) values('txt2','txt2@gmail.com',123)";
            st=cn.createStatement();
            st.execute(sql);                        
            
            cn.commit();//se confirma la transacción.
            
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
