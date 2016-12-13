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
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

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
             BufferedReader bf=null;
        try {
            is = sc.getInputStream();
            bf=new BufferedReader(new InputStreamReader(is));
            String n=bf.readLine();
            System.out.println("Me ha llamado "+n);
  
        } catch (IOException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bf.close();
                sc.close();                 
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }
    
    
    
}
