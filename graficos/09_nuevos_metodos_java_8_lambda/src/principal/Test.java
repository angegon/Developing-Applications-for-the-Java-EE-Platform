
package principal;

import java.util.ArrayList;


public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> dias = new ArrayList<>();
        dias.add("lunes");
        dias.add("martes");
        dias.add("miércoles");
        dias.add("jueves");
        //dias.forEach(e->System.err.println(e);); como es un parametro que s ele pasa a un método no lleva ;
        dias.forEach(e->System.err.println(e));
        
        //eliminar todos los que empiezen por m
        /*for(String s: dias){
            if(s.startsWith("m")){
                dias.remove(s);//da error porque se descolocan
            }
        }*/
        //Para filtrar con métodos...
        
        dias.removeIf(s->s.startsWith("m"));
        
        dias.forEach(e->System.err.println(e));
        
        //replaceAll//Se queda con todos los caracteres menos 1
        dias.replaceAll(s->s.substring(0, s.length()-1));
        
        dias.forEach(e->System.err.println(e));
    }
    
}
