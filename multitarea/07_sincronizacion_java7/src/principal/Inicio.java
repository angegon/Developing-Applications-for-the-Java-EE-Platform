
package principal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tareas.Tarea;
import javabeans.Contador;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Inicio {


    public static void main(String[] args) {
        // TODO code application logic here
        Contador c = new Contador();
        Lock cl=new ReentrantLock();
        
        //Creacion de los 4 hilos, y puesta en ejecución
        ExecutorService es= Executors.newFixedThreadPool(4);
        
        es.execute(new Tarea(c, cl));//Si se hubierá implementado con lambda se podria trabajar directamente con cl
        es.execute(new Tarea(c, cl));
        es.execute(new Tarea(c, cl));
        es.execute(new Tarea(c, cl));

        
        //dormimos la tarea principal un segundo..
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El contador vale: " +c.getValor());
        es.shutdown();
        
    }
    
}
