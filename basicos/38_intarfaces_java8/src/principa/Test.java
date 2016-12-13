
package principa;

import Modelo.MisOperaciones;
import Modelo.OperacionesMat;


public class Test {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        MisOperaciones mop= new MisOperaciones();
        System.out.println(mop.dividir(12, 3));
        
        //Llamada a métodos estáticos de la interface
        System.out.println(OperacionesMat.cuadrado(3));
        
    }
    
}
