
package principal;

import java.util.HashMap;


public class testMap {


    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<Integer,String> contactos=new HashMap<>();
        contactos.put(111, "Contacto1");
        contactos.put(112, "Contacto2");
        contactos.put(113, "Contacto3");
        
        contactos.forEach((k,v)-> System.out.println(k+"-"+v));
        
        contactos.compute(222, (k,v)->v+k);
        
        contactos.forEach((k,v)-> System.out.println(k+"-"+v));
        
        //sino existe la clave, la crea...
        //mezclar operacion ternario en una expresión lambda.. com si fuera un if
        contactos.compute(33, (k,v)->(v!=null) ? v+k : "xx");
        contactos.forEach((k,v)-> System.out.println(k+"-"+v));
    }
    
}
