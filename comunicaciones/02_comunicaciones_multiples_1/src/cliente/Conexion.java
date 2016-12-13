
package cliente;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {


    public static void main(String[] args) {
        PrintStream ps=null;
        OutputStream os=null;
        try {
            // TODO code application logic here
            //conexión con el servidor, con el puerto que te vas a conectar, el cliente no tiene puertos.
            Socket sc=new Socket("10.1.1.100", 4000);//Si ponemos una ip del profe
            
            //Si queremos leer del socket, getInputStream
            
            //Si queremos escribir en el socket, getOutputStream
            os=sc.getOutputStream();
            ps=new PrintStream(os);
            ps.println("Angel");           
            
            
        } catch (IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            ps.close();
            try {
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
