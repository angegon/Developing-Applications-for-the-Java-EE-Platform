
package principal;

import java.util.Scanner;


public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada= new Scanner(System.in);
        String nombre;
        
        System.out.println("Introduzca su nombre: ");
        nombre=entrada.nextLine();
        
        System.out.println("Tu nombre es: "+nombre);
    }
    
}
