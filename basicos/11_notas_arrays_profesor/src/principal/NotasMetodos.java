
package principal;

import java.util.Scanner;


public class NotasMetodos {


    public static void main(String[] args) {
       
        // TODO code application logic here
        
        int [] notas= new int[10];
        leernota(notas);
        //System.out.println("La nota más baja es: " + nota_mas_baja);
        System.out.println("La nota más alta es: " + mayor(notas));
        System.out.println("La nota media es: " + media(notas));
        System.out.println("El número de aprobdos es: " + aprobados(notas));
        ordenar(notas);
        imprimir(notas);
      
        
    }
    
    public static double media(int [] valores ){
        double r=0; 
        for (int i= 0;i<valores.length;i++){
            r+=valores[i];
        }
        
        return r/valores.length;
    }
    
    public static int [] leernota(int [] valores ){
        Scanner sc = new Scanner(System.in);
        for (int i= 0;i<valores.length;i++){
            System.out.println("Introduzca la "+ i + " nota: ");
            valores[i] = sc.nextInt();          
        }
        return valores;
    }
    
    private static int aprobados (int [] valores){
        int aprobados=0; 
        for (int i= 0;i<valores.length;i++){
            if(valores[i]>=5) aprobados++;            
        }        
        return aprobados;
    }
    
    private static int mayor (int [] valores){
        int m=0; 
        for (int i= 0;i<valores.length;i++){
            if(valores[i]>m) m=valores[i];            
        }        
        return m;    
    }
    
    private static void ordenar (int [] valores){ //No hace falta devolver nada, porque trabajas en el array ya que le pasas la referencia misma del array
        int aux;
        for (int i= 0;i<valores.length-1;i++){
            for(int j=0;j<valores.length-1;j++){
            if(valores[j]>valores[i]) {
                aux=valores[i];
                valores[i]=valores[j];  
                valores[j]=aux;
            }                                         
            }   
        }               
    }
    
    private static void imprimir (int [] valores){
         for (int i= 0;i<valores.length;i++){
             System.out.println("Posicion: "+i+" : " +valores[i]);
         }
    }
    
}
