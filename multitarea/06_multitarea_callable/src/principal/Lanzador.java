
package principal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lanzador {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ExecutorService es=Executors.newFixedThreadPool(5);
        Future<Integer> f1= es.submit(()->{
            int s=0;
            for(int i=1;i<=100;i++){
                s+=i;
            }
            return s;
        });
        
        Future<Integer> f2= es.submit(()->{
            int s=0;
            for(int i=-1;i>=-100;i--){
                s+=i;
            }
            return s;
        });     
        
        try {
            //Lo bueno que tiene el submit que tiene un control de la tarea, devuelve un objeto Future
            //podemos si ha terminado la tarea, sino, incluso podemos saber el resultado, a través de métodos de future.

            System.out.println("La suma es: "+f1.get()); //coje el resultado de la tarea. Si no ha terminado la tarea, se bloquea hasta que termine
            System.out.println("La suma es: "+f2.get());
        } catch (InterruptedException ex) {
            Logger.getLogger(Lanzador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(Lanzador.class.getName()).log(Level.SEVERE, null, ex);
        }

        es.shutdown();
    }
    
}
