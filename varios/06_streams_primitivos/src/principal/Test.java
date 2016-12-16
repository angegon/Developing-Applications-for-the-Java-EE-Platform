
package principal;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javabean.Empleado;


public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Empleado> empleados=new ArrayList<>();
        empleados.add(new Empleado("Juan", 3000, 50));
        empleados.add(new Empleado("Ana", 4000, 34));
        empleados.add(new Empleado("Luis", 300, 20));
        empleados.add(new Empleado("Felipe", 2500, 30));
        empleados.add(new Empleado("Juan", 3000, 35));
        
        
        Stream<Empleado> resultado = empleados.stream();      
        //crear un intStream solo con las edades.
        //IntStream edades = resultado.mapToInt(e->e.getEdad());
        
        //Referencias a métodos
        IntStream edades = resultado.mapToInt(Empleado::getEdad);
        
        //Ya se ha consumido el Stream al llamar a mapToInt,
        //si actuamos de nuevo sobre el Stream  daria ejecución en la línea siguiente
        //DoubleStream salarios=resultado.mapToDouble(e->e.getSalario());
        
        System.out.println(edades.average().getAsDouble());
        
        //Average, max y min te devuelven un optional, no el tipo en si... 
        //hay que ponerles un getAs...
        //sum() te lo devuelve como entero
        
        
    }
    
}
