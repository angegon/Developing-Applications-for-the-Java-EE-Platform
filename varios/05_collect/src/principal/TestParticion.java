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
public class TestParticion {

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
        
        //devuelve un map, de objetos empleados, con clave true si superan los 30 años y false en caso contrario
        Map<Boolean,List<Empleado>> particion = resultado.collect(Collectors.partitioningBy(e-> e.getEdad()>30));
        
        
        
        
    }
    
}
