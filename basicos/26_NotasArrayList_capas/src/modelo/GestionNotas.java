
package modelo;

import java.util.ArrayList;
import java.util.Scanner;


public class GestionNotas {
    ArrayList<Integer> notas;

    
    //No se le pasan datos a los métodos ni son estaticos.
    public double media(){
        double media=0.0;
        for(Integer n:notas){
            media+=n;
        }
        return media/notas.size();
    }
    
    public void añadir(int num){
           
        notas.add(num);
    }
    public int Aprobados(){
        int aprobados=0;
        for(Integer n:notas){
            if(n>=5) aprobados++;
        }      
        return aprobados;
    }            

    public GestionNotas() {
        notas =  new ArrayList<>();
    }
    
    public Integer[] obtenerNotas(){
        Integer[] nts;
        nts= notas.toArray(new Integer[0]);
        /*for(int i=0; i<notas.size();i++){
            nts[i]=notas.get(i);
        }*/
        return nts;
    }
}


