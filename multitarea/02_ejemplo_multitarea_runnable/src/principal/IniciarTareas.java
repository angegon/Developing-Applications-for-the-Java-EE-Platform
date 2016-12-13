package principal;

import java.util.logging.Level;
import java.util.logging.Logger;

public class IniciarTareas {

    public static void main(String[] args) {
        /*// TODO code application logic here
        //Paso 2: crear los hilos, los hilos son objetos.
        TareaAscendente hilo1 = new TareaAscendente();
        
        TareaDescendente hilo2 = new TareaDescendente();
        
        Thread t1=new Thread(hilo1); 
        Thread t2=new Thread(hilo2);
        
        //Paso 3 poner a ejecutar los hilos.        
        t1.start(); //Polimorfismo
        t2.start();*/

        //Lo mismo de antes con expresiones lambda
        Runnable hilo1 = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TareaAscendente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        Runnable hilo2 = () -> {
            for (int i = 100; i >= 1; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TareaAscendente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        new Thread(hilo1).start();
        new Thread(hilo2).start();
        
        //Lo siguiente lo ejecutaría a la vez que los otros hilos
        for(int i=0; i<=100;i++){
            System.out.println("Esperando");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(IniciarTareas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //si metemos otro for, se ejecutaría secuencialmente, es decir cuando terminara el anterior. no a la vez...
        
    }

}
