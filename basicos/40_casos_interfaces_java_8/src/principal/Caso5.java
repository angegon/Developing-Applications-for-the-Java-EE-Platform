
package principal;

interface I9{
    default void m(){
        System.out.println("metodo m de I5");
    }
}

class C5 {
    public static void m(){//Si sobreescribo aunque haya herencia multiple es correcto, 
        
    }
}    
//Error de compilacion, ambiguedad al intetnar llamar con un objeto de la clase pp a mbos metodos.
class PP extends C5 implements I9{

}

public class Caso5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
