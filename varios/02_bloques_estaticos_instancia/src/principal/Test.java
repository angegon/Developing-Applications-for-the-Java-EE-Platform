
package principal;


 class Prueba {
    
    static{
        System.out.println("bloque estático");
    }
    
    {//Bloque de instancia, como método pero sin nombre, que se ejecuta cada vez que se crea la instancia, 
        //es como el constructor pero se ejecuta antes del constructor
        System.out.println("bloque instancia");
    }
    
    public Prueba(){
        System.out.println("constructor");
    }
    
}

public class Test{
    public static void main(String[] args){
        new Test();
        new Test();
    }
}