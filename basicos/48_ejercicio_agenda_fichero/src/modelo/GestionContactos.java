
package modelo;

import beans.Contacto;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;


public class GestionContactos  implements InterfaceGestionRecursos{

    String Ruta="d:\\temporal\\contactos.txt";
    
    @Override
    public void altaContacto(Contacto con) {
        try(FileOutputStream fos=new FileOutputStream(Ruta,true);
            PrintStream out= new PrintStream(fos)) {  
            //para escribir en modo append         

            out.println(con.getNombre()+"|"+con.getApellidos()+"|"+con.getEmail()+"|"+con.getTelefono());
      
        } catch (IOException ex) {
            ex.printStackTrace();
        }          
    }

    @Override
    public Contacto buscarContacto(String email) {
        
        Contacto con = new Contacto();
        con = null;
        
        //Versión reducida (BufferedReader bf= new BufferedReader(new fileReader(Ruta)),){    
        try (FileInputStream fis= new FileInputStream(Ruta);
             BufferedReader bf=new BufferedReader(new InputStreamReader(fis))){            
            String s;
            String [] partes;
            while((s=bf.readLine())!=null){
                partes= s.split("\\|");
                if(partes[2].equals(email)){
                    con.setNombre(partes[0]);
                    con.setApellidos(partes[1]);
                    con.setEmail(email);
                    con.setTelefono(partes[3]);
                    //Otra forma de meter en el JavaBean
                    //cn = new Contracto(partes[0], partes[1], partes[2], partes[3]);
                    break;
                }
                
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }  
        
        return con;
    }

    @Override
    //Devolver un List para si acaso algún día la quieres cambiar.
    //Apuntes importantes cuaderno
    public ArrayList<Contacto> mostrarContactos() {
        
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        Contacto con = new Contacto();
        
        //con = null;
        listaContactos = null;
        
        
        
        try (FileInputStream fis= new FileInputStream(Ruta);
             BufferedReader bf=new BufferedReader(new InputStreamReader(fis))){            
            String s;
            String [] partes;
            while((s=bf.readLine())!=null){
                partes= s.split("\\|");
 
                con.setNombre(partes[0]);
                con.setApellidos(partes[1]);
                con.setEmail(partes[2]);
                con.setTelefono(partes[3]);
                
                listaContactos.add(con);

                
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }  
        
        return listaContactos;
    }
    
}
