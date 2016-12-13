
package principal;

interface I3{
    default void m(){
        System.out.println("metodo m de I3");
    }
}

interface I4{
    default void m(){
        System.out.println("metodo m de I4");
    }
}

//En el siguiente caso no daria error. 
class D implements I3, I4{
    public void m(){//Si sobreescribo aunque haya herencia multiple es correcto, 
        
    }
    
    //public abstract void m();//si pongo la clase como abstracta tambien seria correcta.
}

public class Caso2 {


    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
