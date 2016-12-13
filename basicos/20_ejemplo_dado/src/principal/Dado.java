
package principal;


public class Dado {


    public static void main(String[] args) {
        // TODO code application logic here
        int num;        
        //num = (int)(Math.random()*6)+1;        
        //System.out.println(num);
        int [] porcentaje = new int [6];
        for (int i=0; i<=1000000;i++){
            num = (int)(Math.random()*6)+1;
            porcentaje[num-1]++;  
        }
        for(int j=0; j<porcentaje.length;j++){
            System.out.println("Cara "+(j+1)+" : "+ porcentaje[j]*100/1000000);
        }
            
    }
    
}
