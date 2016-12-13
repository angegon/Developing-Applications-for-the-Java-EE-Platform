package principal;

import calculos.calculadora;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        // TODO code application logic here
        //Operaciones de entrada salida.
        int num1, num2, num3;
        Scanner entrada = new Scanner(System.in);
        
        //Creamos el objeto calculadora
        calculadora c = new calculadora();

        System.out.println("Introduce el primer numero:");
        num1 = Integer.parseInt(entrada.nextLine());
        c.guardarX(num1);

        System.out.println("Introduce el primer numero:");
        num2 = Integer.parseInt(entrada.nextLine());
        c.guardarY(num2);
        
        System.out.println("La suma es :"+ c.sumar());
        System.out.println("La resta es :"+ c.restar());
        System.out.println("La multiplicación es :"+ c.multiplicar());
        System.out.println("La division es :"+ c.dividir());
        System.out.println("Otro número más.");
        num3 = entrada.nextInt();
        System.out.println("El factorial es: " + calculadora.factorial(num3));
    }

}
