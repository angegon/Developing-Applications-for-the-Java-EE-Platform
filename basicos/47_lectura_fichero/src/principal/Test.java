
package principal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        
        String ruta="d:\\temporal\\pruebas.txt";
        FileInputStream fis=null;
        BufferedReader bf=null;
        try {
            fis = new FileInputStream(ruta);
            bf=new BufferedReader(new InputStreamReader(fis));    
            String s;
            while((s=bf.readLine())!=null){
                System.out.println(s);//lee linea a linea y muestra por pantalla
            }
        } catch (FileNotFoundException ex) {//un multicatch con padre e hija no tiene sentido, file es io.. con poner iovale
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(bf!=null){
                try {
                    bf.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

        
    }
    
}
