
package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Manipulacion {


    public static void main(String[] args) {
        // TODO code application logic here
        
        //Versión reducida//Paso1: Establecimiento conexión
        try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root")) {
            
            

            //Paso 2: Envio SQL
            String sql="select nombre from contactos";
            Statement st=cn.createStatement();
            
            ResultSet rs= st.executeQuery(sql);
            //st.execute(sql);      
            
            while(rs.next()){
                System.out.println("nombre: "+rs.getString("nombre") );
            }
            
            cn.close();
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }
        
               
    }
    
}
