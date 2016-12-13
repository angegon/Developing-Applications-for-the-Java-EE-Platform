
package principal;

import java.util.ArrayList;


public class Listas {


    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        //lista que es una variable objeto, contiene la referencia al objeto arrayList, que contiene una agrupación de referencias al hacia los objetos String
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miercoles");
        
        
        for (String s:lista){
            System.out.println(s);
        }
        
        lista.remove(2);
        
    }
    
}
