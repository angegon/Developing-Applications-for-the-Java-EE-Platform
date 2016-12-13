
package principal;

import java.util.ArrayList;
import java.util.Collections;


public class TestOrdenacion {


    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> dias = new ArrayList<>();
        dias.add("lunes");
        dias.add("martes");
        dias.add("miércoles");
        dias.add("jueves");
        //Orden natural
        Collections.sort(dias);
        //Orden especifico por tamaño, de menos a más caracteres
        Collections.sort(dias, (a,b)->a.length()-b.length());
        
        dias.forEach(e->System.err.println(e));
        
        
        
    }
    
}
