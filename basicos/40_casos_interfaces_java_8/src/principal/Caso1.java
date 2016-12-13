
package principal;

interface I1{
    default void m(){
        System.out.println("metodo m de I1");
    }
}

interface I2{
    default void m(){
        System.out.println("metodo m de I2");
    }
}

//error de compilacion, herencia multiple, 
class C1 implements I1, I2{
    
}
public class Caso1 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
