/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javabeans.Libro;
import javabeans.Tema;
import javabeans.Venta;

/**
 *
 * @author Profesortarde
 */
 class GestionLibrosImpl implements GestionLibros {
    private String url="jdbc:mysql://localhost:3306/libros";
    private String user="root";
    private String pwd="root";
    @Override
    public List<Libro> recuperarLibros(){
       String sql="select * from libros" ;
       return libros(sql);
    }
    @Override
    public List<Libro> recuperarLibros(int idTema){
       String sql="select * from libros where idTema="+idTema ; 
       return libros(sql);
    }
    private List<Libro> libros(String sql){
       List<Libro> lista=new ArrayList<> ();
           
        try(Connection cn=DriverManager.getConnection(url,user, pwd);) {                       
            //Paso 2: Envio SQL
           
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);            
            while(rs.next()){
                lista.add(new Libro(rs.getInt("isbn"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getDouble("precio"),
                        rs.getInt("paginas"),
                        rs.getInt("idTema")));
            }
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }   
        return lista; 
    }

    @Override
    public List<Venta> ventasCliente(int idCliente) {
      List<Venta> lista=new ArrayList<> ();
         String sql="select * from ventas where idCliente="+idCliente;  
        try(Connection cn=DriverManager.getConnection(url,user, pwd);) {                       
            //Paso 2: Envio SQL
           
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);            
            while(rs.next()){
                lista.add(new Venta(rs.getInt("idVenta"),
                        idCliente,              
                        rs.getInt("idLibro"),
                        rs.getTimestamp("fecha")));//polimorfismo
            }
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }   
        return lista;   
    }

    @Override
    public void altaVenta(Venta v) {
       try(Connection cn=DriverManager.getConnection(url, user, pwd);) {                       
            
            String sql="Insert into ventas (idCliente,idLibro,fecha) ";
            sql+="values(?,?,?)";
            //creamos consulta preparada:
            PreparedStatement ps=cn.prepareStatement(sql);
               //Sustituimos parametros por valores
               ps.setInt(1, v.getIdCliente());
               ps.setInt(2, v.getIdLibro());
               ps.setTimestamp(3, new java.sql.Timestamp(v.getFecha().getTime()));
               //ejecutamos
               ps.execute();
            
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }      
    }
    
    
    
}
