
package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;


public class TestAppend {


    public static void main(String[] args) {
        // TODO code application logic here
        
        PrintStream out=null;
        
        try {
            out=new PrintStream("d:\\temporal\\pruebas.txt");//Si no existe lo crea, y sino lo machaca, sino existe el directorio, salta la excepción..
            //usaremos otro constructor, fileOutputStream, que permite añadir o sobreescribir.

           
            out.println("lunes");
            out.println("martes");
            out.println("miercoles");      
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        finally{
            if(out!=null)
            //Despues del ultimo uso de printstream hay que cerrarlo.
            out.close();//son las tipicas instrucciones que se deben poner en un finally
        }
        
    }
    
}
