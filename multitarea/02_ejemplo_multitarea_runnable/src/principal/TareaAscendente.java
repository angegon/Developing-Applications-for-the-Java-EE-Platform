
package principal;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TareaAscendente implements Runnable{
    //Paso 1
    @Override
    public void run() {        
        for(int i=1;i<=100;i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(TareaAscendente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
