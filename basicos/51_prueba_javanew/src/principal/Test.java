
package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test {


    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Path p = Paths.get("d:\\temporal\\pruebas.txt");
            List <String> lineas = Files.readAllLines(p);//Devuelve un líst con todas las líneas que hay en el fichero.
            
            for(String l:lineas){
                System.out.println(l);
            }
            
            try (BufferedReader bf=Files.newBufferedReader(p)){//try sin catch, para aprovechar la capacidad del try de cerrar el objeto...
                String s;
                
                while((s=bf.readLine())!=null){
                    System.out.println(s);
                }
            }
            
            //escritura en un fichero usando el Files, es más eficiente el output Stream creado de está manera que a través de las clases clásicas.
            try(PrintStream out=new PrintStream(Files.newOutputStream(p, StandardOpenOption.APPEND))){
                out.println("Sabado");
                out.println("Domingo");                
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }    
}
