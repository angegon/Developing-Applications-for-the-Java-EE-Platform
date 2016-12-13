
package mail;


public class Breakcontinue {


    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 10; i++) {
            if(i==5) continue; //al llegar a 5 vuelve empezar al for
            if(i==7) break;
            System.out.println(i);

        }
        
        int k=2;
        etq1:for(int i=1;i<=10;i++){
            continue etq2;// no puede salir de donde no esta.
            etq2: while(k<5){
                k+=1;
                if(k==4){
                    break etq1;
                }
                System.out.println("esperando");
            }
            k=2;
            System.out.println(i);
        }
    }
    
}
