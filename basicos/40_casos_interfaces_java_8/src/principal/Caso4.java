
package principal;

interface I7{
    static void m(){
        System.out.println("metodo m de I5");
    }
}

class C4 {
    public void m(){//Si sobreescribo aunque haya herencia multiple es correcto, 
        
    }
}    

class ZZ extends C4 implements I7{
    //Los métodos estáticos de las interfaces no se heredan, no daría problema..
}
public class Caso4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
