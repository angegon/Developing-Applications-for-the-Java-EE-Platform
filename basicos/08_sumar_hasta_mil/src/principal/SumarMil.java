
package principal;


public class SumarMil {

  
    public static void main(String[] args) {
        // TODO code application logic here
        int sumamil=0;
        int i=0;
        while(sumamil<1000){
            sumamil+=++i;
        }
        System.out.println(i);
        
        sumamil=0;
        for(int c=0;c<=i;c++){
            sumamil+=c;
        }
        System.out.println(sumamil);
    }
    
}
