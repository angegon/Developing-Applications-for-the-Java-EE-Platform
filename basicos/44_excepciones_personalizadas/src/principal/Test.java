
package principal;

import excepciones.OperacioNoRealizableException;
import modelo.Prueba;


public class Test {

    public static void main(String[] args) throws OperacioNoRealizableException {
        // TODO code application logic here
        
        Prueba p=new Prueba();
        p.operacion();//Obliga a capturar..
    }    
}
