/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javabeans.Contacto;


/**
 *
 * @author Profesor_tarde
 */
public class GestorAgenda {
    String ruta="jdbc:mysql://localhost:3307/agenda";
    public GestorAgenda(){
        
    }
    public void agregar(int telefono, String nombre, String email){

        Connection cn=null;
        try {
            //Paso1: Establecimiento conexión
            
            //1.b. Crear conexión
            cn=DriverManager.getConnection(ruta, "root", "root");
            
            //Paso 2: Envio SQL
            String sql="Insert into contactos (nombre,email,telefono) values('"+nombre+"','"+email+"',"+telefono+")";
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
    public void agregar(Contacto con){
        Connection cn=null;
        try {
            //Paso1: Establecimiento conexión
            
            //1.b. Crear conexión
            cn=DriverManager.getConnection(ruta, "root", "root");
            
            //Paso 2: Envio SQL
            String sql="Insert into contactos (nombre,email,telefono) values('"+con.getNombre()+"','"+con.getEmail()+"',"+con.getTelefono()+")";
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
    
    public void eliminar(String email){
        Connection cn=null;
        try {
            //Paso1: Establecimiento conexión
            
            //1.b. Crear conexión
            cn=DriverManager.getConnection(ruta, "root", "root");
            
            //Paso 2: Envio SQL
            String sql="delete from conctactos ";
            sql += "where email='"+email+"'";
            
            Statement st=cn.createStatement();
            st.execute(sql);            
            System.out.println("Fila eliminada!");
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
    

    public Contacto recuperar(String email){
        
        
        Contacto con= new Contacto();
        con =null;
        
        //Versión reducida//Paso1: Establecimiento conexión
        try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root")) {
            
            

            //Paso 2: Envio SQL
            String sql="select * from contactos where ";
                    sql+= "email='" +email+"'";
                    
            Statement st=cn.createStatement();
            
            ResultSet rs= st.executeQuery(sql);
            //st.execute(sql);      
            
            while(rs.next()){
                con.setNombre(rs.getString("nombre"));
                con.setTelefono(rs.getInt("telefono"));
                con.setEmail(rs.getString("email"));
                //System.out.println("nombre: "+rs.getString("nombre") );
            }
            
            cn.close();
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }
        
         return con;
    }
    public List<Contacto> recuperarTodos(){ 
        
        List<Contacto> todos = new ArrayList<Contacto>();
        Contacto con= new Contacto();
        //Versión reducida//Paso1: Establecimiento conexión
        try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root")) {
            
            

            //Paso 2: Envio SQL
            String sql="select * from contactos";
            Statement st=cn.createStatement();
            
            ResultSet rs= st.executeQuery(sql);
            //st.execute(sql);      
            
            while(rs.next()){
                con.setNombre(rs.getString("nombre"));
                con.setTelefono(rs.getInt("telefono"));
                con.setEmail(rs.getString("email"));
                todos.add(con);
                //System.out.println("nombre: "+rs.getString("nombre") );
            }
            
            cn.close();
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }
                
        
         return todos;
                
    }   
}
