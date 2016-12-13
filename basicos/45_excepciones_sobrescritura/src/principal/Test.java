
package principal;

import java.io.IOException;

class Clase1{
    public Object metodo1() throws RuntimeException{
    
    }
    public Object metodo2() throws IOException{
        
    }
}

class Clase2 extends Clase1{
    //Error de compilación
    //public void metodo1() throws ArithmeticException{//regla de la sobrescritura, importa tipo de devolución..
        
    //Posible método que estaría bien:
    //public Object metodo1()throws ArithmeticException{
    
    //Otro que tb estaría bien, porque es hija de runtime
    public Integer metodo1() throws ArithmeticException{
    
    }
    
    public Object metodo2() throws NullPointerException{
        
    }
}

public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
