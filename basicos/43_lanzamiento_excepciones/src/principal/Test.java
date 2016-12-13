
package principal;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Test {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
        Prueba p = new Prueba();
        try {
            p.operacion();
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
