/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javabeans.Pedido;

/**
 *
 * @author tarde
 */
public class GestionTiendaImpl implements GestionTienda{

    @Override
    public void altaPedido(Pedido p) {
        
        PrintStream ps=null;
        ObjectOutputStream os=null;
        try {
            // TODO code application logic here
            //conexión con el servidor, con el puerto que te vas a conectar, el cliente no tiene puertos.
            Socket sc=new Socket("localhost", 5000);//Si ponemos una ip del profe
            
            //Si queremos leer del socket, getInputStream
            
            //Si queremos escribir en el socket, getOutputStream
            os= new ObjectOutputStream(sc.getOutputStream());
            os.writeObject(p);
                    
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        finally{
            ps.close();
            try {
                os.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }        
        
    }
    
}
