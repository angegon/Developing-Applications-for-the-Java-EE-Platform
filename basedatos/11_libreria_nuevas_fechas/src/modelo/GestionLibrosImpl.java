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
import java.sql.Timestamp;
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
    private String url="jdbc:mysql://localhost:3307/libros";
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
           String sql="select * from ventas where idcliente="+idCliente ; 
        try(Connection cn=DriverManager.getConnection(url,user, pwd);) {                       
            //Paso 2: Envio SQL
           
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);            
            while(rs.next()){
                lista.add(new Venta(rs.getInt("idVenta"),
                        rs.getInt("idCliente"),
                        rs.getInt("idLibro"),
                        //rs.getDate("fecha")));
                        rs.getTimestamp("fecha").toLocalDateTime()));
            }
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }   
        return lista;      
                    
    }

    @Override
    public void altaVenta(Venta v) {
        Connection cn=null;
        Timestamp ts = Timestamp.valueOf(v.getFecha());
        try {
            //Paso1: Establecimiento conexión                       

            //Si queremos hacer las dos en una opción hay que desactivar la opción autocommit, que se hace a nivel de conexion.
            cn.setAutoCommit(false);
            
            //1.b. Crear conexión
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/agenda", "root", "root");
            
            //Paso 2: Envio SQL
            java.sql.Date f= new java.sql.Date(ts.getTime());
            
            //Sin prepared Statement String sql="Insert into ventas (idCliente,idLibro,fecha) values("+v.getIdCliente()+","+v.getIdLibro()+","+f+")";
            
            //con preparedStatement
            String sql="Insert into ventas (idCliente,idLibro,fecha)";
                sql+="values(?,?,?)";
                
            PreparedStatement ps= cn.prepareStatement(sql);
            
            ps.setInt(1, v.getIdCliente());
            ps.setInt(2, v.getIdLibro());
            
            ps.setTimestamp(3, ts);//polimorfismo
                    
            ps.execute();
            
            /*Statement st=cn.createStatement();
            st.execute(sql);  */                              
            
            cn.commit();//se confirma la transacción.
            
            System.out.println("venta añadida!");
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
