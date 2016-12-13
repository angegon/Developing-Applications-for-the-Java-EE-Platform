
package modelo;

import excepciones.OperacioNoRealizableException;


public class Prueba {
    public int operacion() throws OperacioNoRealizableException{//al ser de tipo runtime
        
        int k=10;
        int m=0;
        int d=0;
        try{
            d=k/m;          
        }
        catch(ArithmeticException ex){
            System.out.println("No se puede dividir por 0.");
            //throw ex;//al ser de tipo runtime, se propaga automaticamente, no estamos obligados a poner el throw.
            throw new OperacioNoRealizableException();
        }
        return d;
        
    }
}
