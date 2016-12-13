
package principal;

import java.util.Scanner;


public class Evaluacion {


    public static void main(String[] args) {
        // TODO code application logic here
        
        int nota=6;
        System.out.println("Introduzca su nota:");
        Scanner sc = new Scanner(System.in);
        nota = sc.nextInt();
        
        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: 
                System.out.println("Usted ha suspendido.");
                break;
            case 5:
            case 6:
                System.out.println("Usted ha aprobado.");
                break;
            case 7:
            case 8:
                System.out.println("Usted ha obtenido un notable.");
                break;
            case 9:
            case 10:
                System.out.println("Usted ha obtenido un sobresaliente");
                break;
            default:
                System.out.println("Nota leida incorrecta.");
        }
    }
    
}
