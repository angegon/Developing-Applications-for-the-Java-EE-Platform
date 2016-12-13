
package principal;

import java.util.Random;

public class Loteria {

    public static void main(String[] args) {
        // TODO code application logic here
        int [] primitiva = new int[6];
        int cont=0;
        int aux;
        Random aleatorio= new Random();
        do{
            //aux= aleatorio.nextInt(48)+1;
            aux=(int)(Math.random()*49+1);
            if(!existe(primitiva, aux, cont)){
                primitiva[cont]=aux;
                cont ++;
            }
        } while (cont<6);
        ordenar(primitiva);
        imprimir(primitiva);
    }
    public static boolean existe(int [] nums, int n, int total){
        for(int i=0; i<total;i++){
            if(n==nums[i]){
                return true;
            }
        }
        return false;
    }
    
    public static void ordenar(int [] nums){
        int aux;
        for (int i= 0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1;j++){
            if(nums[j]>nums[i]) {
                aux=nums[i];
                nums[i]=nums[j];  
                nums[j]=aux;
            }                                         
            }   
        }           
    }
    
    public static void imprimir(int [] nums){
        for(int n:nums){
            System.out.print(" "+n);
        }
    }
    
}
