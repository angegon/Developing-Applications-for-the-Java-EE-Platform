
package principal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import tareas.TareaAscendente;
import tareas.TareaDescendente;


public class Lanzador {


    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crea los objetos Thread con la siguiente instrucción, un pool de Thread, tantos como le digo entre parentesis
        ExecutorService es=Executors.newFixedThreadPool(4);//el 4 significa..
        es.execute(new TareaAscendente());//Este código por debajo crea un objeto Thread, y llama a Start
        es.execute(new TareaDescendente());
        

    }
    
}
