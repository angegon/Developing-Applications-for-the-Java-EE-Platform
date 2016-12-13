package principal;

import java.util.Scanner;

public class NotasArrays {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] notas= new int[10];
        int nota_mas_alta=0, nota_mas_baja=Integer.MAX_VALUE,nota_media=0, aprobados=0;
        
        Scanner sc = new Scanner(System.in);
        for (int i= 0;i<notas.length;i++){
            System.out.println("Introduzca la "+ i + " nota: ");
            notas[i] = sc.nextInt();      
            if(notas[i]>nota_mas_alta) nota_mas_alta=notas[i];
            if(notas[i]<nota_mas_baja) nota_mas_baja=notas[i];
            nota_media+=notas[i];
            if(notas[i]>=5) aprobados++;
        }
        System.out.println("La nota más baja es: " + nota_mas_baja);
        System.out.println("La nota más alta es: " + nota_mas_alta);
        System.out.println("La nota media es: " + nota_media/notas.length);
        System.out.println("El número de aprobdos es: " + aprobados);
    }    
    
    
}
