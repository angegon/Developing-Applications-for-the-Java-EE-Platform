package principal;

import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        // TODO code application logic here

        int a, b, s;
        Scanner sc = new Scanner(System.in);
        try {
            //Posible NumberFormatException
            System.out.println("Introduce un numero: ");
            a = Integer.parseInt(sc.nextLine());

            System.out.println("Introduce otro numero: ");
            b = Integer.parseInt(sc.nextLine());

            //Posible ArithmeticException
            s = a / b;
            System.out.println("La división es: " + s);
        }
        catch (ArithmeticException ex) {
            System.out.println("No se puede dividir entre cero.");
        }
        catch (NumberFormatException|NullPointerException ex ){
            System.out.println("No se puede convertir a número.");
            ex.printStackTrace();
            //return;           
            System.exit(1);
        }
        catch (Exception ex){
            System.out.println("Error inesperado");
        }
        finally {
            System.out.println("Fin de programa.");
        }
    }

}
