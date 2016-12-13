
package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;



public class TestAppend {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        PrintStream out=null;
        FileOutputStream fout=null;
        
        try(fout=new FileOutputStream("d:\\temporal\\pruebas.txt", true)) {
            
           
            out=new PrintStream(fout);
           
            out.println("jueves");
            out.println("viernes");
    
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        finally{
            if(fout!=null)
                try {
                    fout.close();//la propia llamada close, puede provocar una excepción, hay que encerrarlo en un try catch
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            if(out!=null)
            //Despues del ultimo uso de printstream hay que cerrarlo.
            out.close();//son las tipicas instrucciones que se deben poner en un finally
        }
    }
    
}
