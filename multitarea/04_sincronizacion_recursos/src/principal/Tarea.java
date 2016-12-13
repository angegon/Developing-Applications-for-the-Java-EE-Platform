/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tarde
 */
public class Tarea implements Runnable {

        
    private Contador conta;

    public Tarea(Contador conta) {
        this.conta = conta;
    }
    
    @Override
    public void run() {
      //esta tarea recupera el contador, le suma uno y lo vuelve a asignar  
      int v=conta.getValor();
      v++;
        try {
            Thread.sleep(200);//como se pone a dormir no acaba la tarea, y el siguiente hilo, conta tendra valor 0 de nuevo.
        } catch (InterruptedException ex) {
            Logger.getLogger(Tarea.class.getName()).log(Level.SEVERE, null, ex);
        }
      conta.setValor(v);
      
    }
    
}
