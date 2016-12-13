
package principal;

import java.util.HashSet;


public class Test {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*HashSet<String> dias = new HashSet<>();
        dias.add("lunes");
        dias.add("martes");
        dias.add("miercoles");
        dias.add("martes");//como ya esta, no lo mete.
        for(String s:dias){
            System.out.println(s);
        }*/
        
        HashSet<Dia> diass = new HashSet<>();
        diass.add(new Dia(1, "lunes"));
        diass.add(new Dia(2, "martes"));
        diass.add(new Dia(3, "miercoles"));
        diass.add(new Dia(2, "martes"));//sino definimos equals y hashcode, tendría dos martes.
        //diass.add(null); //Si es posible pero da excepción
        
        for(Dia s:diass){//Dará null pointer exception.
            System.out.println(s.getDia());
        }
    }
    
}
