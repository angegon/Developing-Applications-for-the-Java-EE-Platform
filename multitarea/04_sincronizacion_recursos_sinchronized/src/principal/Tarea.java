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
    String s="cad";

    public Tarea(Contador conta) {
        this.conta = conta;
    }

    @Override
    public void run() {

        //synchronized (conta, cad){//no se puede sincronizar dos, pero si un método.
        synchronized (conta) {//se indica entre parentesis, sobre que habrá sincronización, con esto se arregla el problema del ejercicio anterior
            //esta tarea recupera el contador, le suma uno y lo vuelve a asignar  
            int v = conta.getValor();
            v++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tarea.class.getName()).log(Level.SEVERE, null, ex);
            }
            conta.setValor(v);
        }

    }

}
