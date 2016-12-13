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

/**
 *
 * @author Profesortarde
 */
 class GestionClientesImpl implements GestionClientes {
    private String url="jdbc:mysql://localhost:3306/libros";
    private String user="root";
    private String pwd="root";
    @Override
    public boolean autenticar(String usuario, String password){
        boolean res=false;
        try(Connection cn=DriverManager.getConnection(url, user, pwd);) {                       
           
            String sql="Select * from clientes where ";
            sql+="usuario=? and password=?";
            //creamos consulta preparada:
            PreparedStatement ps=cn.prepareStatement(sql);
               //Sustituimos parametros por valores
               ps.setString(1, usuario);
               ps.setString(2, password);
               
               //ejecutamos
              ResultSet rs= ps.executeQuery();
              res=rs.next();
            
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }  
        return res;
    }
}
