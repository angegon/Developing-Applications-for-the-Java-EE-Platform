
package principal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<Integer,String> mapa;
        mapa = new HashMap<>();//Inicialización
        mapa.put(3, "pepe");
        mapa.put(3, "prueba");//sobreescribe el anterior 3 con prueba
        mapa.putIfAbsent(3, "prueba");//solo añade sino exist ela clave
        mapa.put(4, "Antonia");
        
        Collection<String> valores= mapa.values();
        for(String s:valores){
            System.out.println(s);
        }
        
        Set<Integer> claves = mapa.keySet();
        for(Integer z:claves){
            System.out.println(z);
        }        
    }
    
}
