
package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Servidor {


    public static void main(String[] args) {
        try {

            ServerSocket server=new ServerSocket(4000);//crea un serversocket escuchando por el puerto 4000
            
            System.out.println("Esperando llamada....");
            
            
            //el servidor tendrá que hacer llamadas accept de manera indefinida...para eso lo metemos en un bucle infinito
            while(true){
                Socket sc=server.accept(); //devuelve un socket para comunicarme con el cliente que me llame.           
                System.out.println("Conexión recibida desde...."+sc.getInetAddress().getHostAddress());//Da la dirección ip de quien ha llamado.
                new Hilo(sc).start();
            }
            
            

            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
