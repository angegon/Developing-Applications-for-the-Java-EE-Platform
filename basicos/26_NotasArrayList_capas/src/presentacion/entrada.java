package presentacion;

import java.util.Scanner;
import modelo.GestionNotas;

public class entrada {

    public static void main(String[] args) {
        // TODO code application logic here
        GestionNotas gc = new GestionNotas();
        menu(gc);
    }

    public static void menu(GestionNotas gc) {
        Scanner entrada = new Scanner(System.in);
        int continuar;
        do {
            System.out.println("Que operación desea realizar: ");
            System.out.println("1. Añadir nota.");
            System.out.println("2. Media.");
            System.out.println("3. Aprobados.");
            System.out.println("4. Obtener notas.");
            System.out.println("5. salir.");
            continuar = Integer.parseInt(entrada.nextLine());

            switch (continuar) {
                case 1:
                    System.out.println("Escriba la nota que desea introducir: ");                                            
                    gc.añadir(Integer.parseInt(entrada.nextLine()));
                    break;
                case 2:
                    System.out.println("La media es : " + gc.media());
                    break;
                case 3:
                    System.out.println("El número de aprobados es: " + gc.Aprobados());
                    break;
                case 4:
                    Integer [] notes=gc.obtenerNotas();
                    System.out.println("Las notas introducidas son: ");
                    for(Integer n: notes){
                        System.out.println(n);
                    }
                    break;
                case 5:                     
                    break;                    
                default:
                    System.out.println("La opción introducida no es válida.");
                    break;
            }
        } while (continuar != 5);

    }

}
