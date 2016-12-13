
package principal;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Inicio {


    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creacion de los 4 hilos, y puesta en ejecución
        
        Contador c= new Contador();
        new Thread(new Tarea(c)).start();
        new Thread(new Tarea(c)).start();
        new Thread(new Tarea(c)).start();
        new Thread(new Tarea(c)).start();
        
        //dormimos la tarea principal un segundo..
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El contador vale: " +c.getValor());
    }
    
}
