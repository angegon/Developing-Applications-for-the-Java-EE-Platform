
package principal;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        Scanner entradas= new Scanner(System.in);        
        int num;
        String continuar="";

        do{
            System.out.println("Introduzca el número del que desea calcular el factorial: ");
            num=Integer.parseInt(entrada.nextLine());//num = entrada.nextInt();            
            System.out.println("El factorial de " + num + " es: " + factorial(num));
            System.out.println("Desea continuar?");
            entrada.nextLine();//solución poco elegante para no tener que utilizar dos sc, ni hacer una nueva instanciación          
            // para evitar esto es mejor usar nextLine en todo y hacerle un parseInt a lo leído.
            continuar = entrada.nextLine();
        } while (!continuar.equals("N"));
        
    }
    private static int factorial(int a){
        int aux=1;
        for(int i=1;i<=a;i++){
            aux*=i;
        }
        return aux;
    }
    
}
