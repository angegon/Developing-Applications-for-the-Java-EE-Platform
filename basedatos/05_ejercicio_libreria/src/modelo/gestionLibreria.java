
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javabeans.libro;
import javabeans.tema;


public class gestionLibreria implements gestionLibreriaInterface{
    
    @Override
    public List<tema> verTemas(){
       List<tema> temas=null;
       temas = new ArrayList<tema>();
       tema tm=null;
       
        try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/libros", "root", "root");) {                       
            //Paso 2: Envio SQL
            String sql="select * from temas";
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);   
            
            while(rs.next()){
                tm= new tema();
                tm.setIdTema(rs.getInt("idTema"));
                tm.setTema(rs.getString("tema"));
                temas.add(tm);
            }
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }        
       
       return temas;
    }
    
    @Override
    public List<libro> recuperarLibrosPorTema(int idTema){

       List<libro> libros=new ArrayList<libro>();
       libro lb=null;
       String sql;
        try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/libros", "root", "root");) {                       
            //Paso 2: Envio SQL
            if(idTema==0){ //Esto debería ir en la capa de presentación, ya que podría haber más de una aplicación que tiren de la misma.
                sql="select * from libros";                
            }else{
                sql="select * from libros where idTema="+idTema+"";
            }

            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);   
            
            while(rs.next()){
                lb=new libro();
                lb.setIsbn(rs.getInt("isbn"));
                lb.setTitulo(rs.getString("titulo"));
                lb.setAutor(rs.getString("autor"));
                lb.setPrecio(rs.getDouble("precio"));
                lb.setPaginas(rs.getInt("paginas"));
                lb.setIdTema(rs.getInt("idTema"));            
                libros.add(lb);
            }
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }                
        
        return libros;
        
    }
    
    @Override
    public boolean loginUsuario(String usuario, String password){
        boolean usuarioExiste = false;
        try(Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/libros", "root", "root");) {                       
            //Paso 2: Envio SQL
            String sql="select * from clientes where usuario='"+usuario+"' and password='"+password+"'";
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);   
            
            while(rs.next()){
                usuarioExiste=true;
            }
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }             
        
        return usuarioExiste;
    }
    
}
