/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.concurrent.locks.Lock;
import javabeans.Contador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tarde
 */
public class Tarea implements Runnable {

    private Contador conta;
    private Lock lc;

    public Tarea(Contador conta, Lock lc) {
        this.conta = conta;
        this.lc = lc;
    }

    @Override
    public void run() {

            lc.lock();//cuando otro llega aquí ve que esta bloqueado.. y no sigue..
            try{
                int v = conta.getValor();
                v++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tarea.class.getName()).log(Level.SEVERE, null, ex);
                }
                conta.setValor(v);
            }
            finally{
                lc.unlock();//Para si hay una excepción metiendolo en el finally se asegura de que se cierre el hilo.
            }
            

    }

}
