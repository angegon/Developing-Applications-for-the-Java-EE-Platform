/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javabean.Empleado;

/**
 *
 * @author tarde
 */
public class TestAgrupacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                        ArrayList<Empleado> empleados=new ArrayList<>();
        empleados.add(new Empleado("Juan", 3000, 50));
        empleados.add(new Empleado("Ana", 4000, 34));
        empleados.add(new Empleado("Luis", 300, 20));
        empleados.add(new Empleado("Felipe", 2500, 30));
        empleados.add(new Empleado("Juan", 3000, 35));
        empleados.add(new Empleado("Carlos", 1000, 23));        
        empleados.add(new Empleado("Carlos", 2500, 19));        
        
        Stream<Empleado> resultado = empleados.stream(); 
        
        //Agrupa en un map, un list de empleado, con la clave salario..
        //el collect siempre que le agrupas un groupingby devuelve
        //Agrupa los empleados por salario.
        Map<Double,List<Empleado>> grupos = resultado.collect(Collectors.groupingBy(e->e.getSalario()));
        
        //imaginar que queremos sacar el salario y el numero de elementos de cada grupo
        //De cada salario, nos muestra cuantos hay en ese grupo.
        
        grupos.forEach((k,v)->System.out.println(k+":"+v.size()));
    }
    
}
