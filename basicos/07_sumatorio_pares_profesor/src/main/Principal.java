
package main;


public class Principal {


    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=24;
        int b= 6;
        int i=b;
        int aux=0;
        
        for(;i<=a;i++){
            if(i%2==0){
                aux+=1;
            }
        }
        System.out.println("Suma de números pares comprendidos entre "+b+ " y "+a+ " = "+ aux);

        for(int j=Math.min(a, b);j<=Math.max(a, b);j++){
            if(j%2==0){
                aux+=1;
            }
        }
        System.out.println("Suma de números pares comprendidos entre "+Math.min(a, b)+ " y "+a+ " = "+ Math.max(a, b));
        
    }
    
}
