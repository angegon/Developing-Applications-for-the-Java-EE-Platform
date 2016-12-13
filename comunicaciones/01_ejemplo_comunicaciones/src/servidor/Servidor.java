
package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Servidor {


    public static void main(String[] args) {
        try {

            ServerSocket server=new ServerSocket(4000);//crea un serversocket escuchando por el puerto 4000
            
            System.out.println("Esperando llamada....");
            
            Socket sc=server.accept(); //devuelve un socket para comunicarme con el cliente que me llame.           
            
            InputStream is=sc.getInputStream();
            BufferedReader bf=new BufferedReader(new InputStreamReader(is));
            String n=bf.readLine();
            System.out.println("Me ha llamado "+n);
            bf.close();
            sc.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
