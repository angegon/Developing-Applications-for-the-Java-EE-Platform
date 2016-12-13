
package principal;

public class Main {
    static int []x;
    public static void main(String[] args) {
        // TODO code application logic here
        int[]y;
        //System.out.println(y);//error de compilacion
        y=new int[5];
        System.out.println(y);
        //System.out.println(y[5]); //Excepción
        System.out.println(x);
        System.out.println(x[5]); //error de compilación, excepción null pointer exception, no esta permitido acceder a un array que esta a null
    }
    
}
