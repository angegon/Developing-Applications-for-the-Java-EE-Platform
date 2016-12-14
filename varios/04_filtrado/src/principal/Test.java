
package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
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
        
        
        Stream<Empleado> resultado = empleados.stream(); 			//convert list to stream
	//resultado.filter(em-> em.getEdad()>30)	//filters the line, equals to "mkyong"
	//.map(emp -> {emp.setSalario(emp.getSalario()*1.1);return emp;})			//collect the output and convert streams to a List
        //.forEach(emp->System.out.println(emp.getNombre()+"-"+emp.getSalario()));

        
        //Método sorted. Todas las clases que tienen un orden natural implementan un interface que se llama comparable
        //lo siguiente daría excepción de conversión de empleado a comparable, porque no la implementa.
        //resultado.sorted().forEach(emp->System.out.println(emp.getNombre())); //da excepción
        
        //ordenar los nombres de los empleados por edad, de menor a mayor
        //con comparator que devuelve un entero, -1 el primero es más pequeño, 0 son iguales, 1 el primero es mayor
        //con a.getEdad()-b.getEdad() lo ordeno..
        //resultado.sorted((a,b)->a.getEdad()-b.getEdad()).forEach(a->System.out.println(a.getNombre()));
        
        //Muestra nombre de la persona con mayor salario.
        //Optional<empleado> res = resultado.max((a,b) -> a.getSalario()-b.getSalario());//da error porque al comparar devuelve un int, y el salario es double
        //Optional<Empleado> res = resultado.max((a,b) -> (int)a.getSalario()-(int)b.getSalario());
        //System.out.println(res.get().getNombre());
        
        //hay casos en los que el resultado que se almacena en un optional es nulo.
        
        //indica si hay algun empleado que gane más de 6000
        
        //System.out.println(resultado.anyMatch(e-> e.getSalario()>6000));
        
        //devuelve un empleado con menos de 35 años, que gane más de 1000
        Optional<Empleado> op= resultado.filter(e-> e.getSalario()>1000 && e.getEdad()<35).findAny();
        System.out.println(op.orElse(new Empleado("nulo", 0, 0)).getNombre());//orElse en caso de que el optional devuelva nulo, devuelve otra cosa.
    }
    
}
