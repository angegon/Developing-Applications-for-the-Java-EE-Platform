
package principal;

interface I5{
    default void m(){
        System.out.println("metodo m de I5");
    }
}

class C3 {
    public void m(){//Si sobreescribo aunque haya herencia multiple es correcto, 
        
    }
}    

//Al heredar ya está implementando m, no daría error, ni necesita implentar el método de la interface
class XY extends C3 implements I5{
    
}
public class Caso3 {



    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
