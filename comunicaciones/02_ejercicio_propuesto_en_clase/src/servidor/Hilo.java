/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javabeans.Pedido;

/**
 *
 * @author tarde
 */
public class Hilo extends Thread{
    
    private Socket sc;

    public Hilo(Socket sc) {
        this.sc = sc;
    }

    //este codigo se ejecutara tantas veces como el cliente llegue.
    @Override
    public void run() {
        
            InputStream is=null;
             ObjectInputStream ois=null;
        try {
            is = sc.getInputStream();
            ois=new ObjectInputStream(sc.getInputStream());
            Pedido p= (Pedido) ois.readObject();
            System.out.println("producto: " + p.getProducto()+ "unidades: " + p.getUnidades());
  
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ois.close();
                sc.close();                 
                is.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
            
    }
    
    
    
}
