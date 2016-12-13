
package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class NotasArrayList {


    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> notas= new ArrayList<>();
        menu(notas);
    }
    
    public static void menu(ArrayList<Integer> notas){
        Scanner entrada = new Scanner(System.in);
        int continuar;
        do{
            System.out.println("Que operación desea realizar: ");
            System.out.println("1. Añadir nota.");
            System.out.println("2. Media.");
            System.out.println("3. Aprobados.");
            System.out.println("4. salir.");
            continuar= Integer.parseInt(entrada.nextLine());
            
            switch (continuar){
                case 1:
                    añadir(notas);
                    break;
                case 2:
                    System.out.println("La media es : "+ media(notas));
                    break;                    
                case 3:
                    System.out.println("El número de aprobados es: "+Aprobados(notas));
                    break;                    
                case 4: 
                    break;                    
            }
        } while (continuar!=4);
        
        
    }
    
    public static double media(ArrayList<Integer> notas){
        double media=0.0;
        for(Integer n:notas){
            media+=n;
        }
        return media/notas.size();
    }
    
    public static void añadir(ArrayList<Integer> notas){
        System.out.println("Escriba la nota que desea introducir: ");
        Scanner entrada = new Scanner(System.in);               
        notas.add(Integer.parseInt(entrada.nextLine()));
    }
    public static int Aprobados(ArrayList<Integer> notas){
        int aprobados=0;
        for(Integer n:notas){
            if(n>=5) aprobados++;
        }      
        return aprobados;
    }
}
