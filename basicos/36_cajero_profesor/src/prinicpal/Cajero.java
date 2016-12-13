
package prinicpal;

import Modelo.Movimientos;
import beans.movimiento;
import java.util.HashMap;

public class Cajero {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear subclase en la capa de negocio a partir de una anterior
       // aux.put("tarjeta", 30.0);
        
        Movimientos m = new Movimientos(300);
        
        m.ingresar(300);
        m.extraer(200);
        
        System.out.println(m.getSaldo());
        
        for(movimiento ms : m.getMov()){
            
            System.out.println("Movimiento realizado con: "+ ms.getTipo());
            
            System.out.println("Movimiento realizado con: "+ ms.getCantidad());
            
        }
        
    }
    
}
