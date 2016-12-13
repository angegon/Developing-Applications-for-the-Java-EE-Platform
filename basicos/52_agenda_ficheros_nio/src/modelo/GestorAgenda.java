/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import javabeans.Contacto;


/**
 *
 * @author Profesor_tarde
 */
public class GestorAgenda {
    String ruta="d:\\temporal\\contactos.txt";
    Path p;
    public GestorAgenda(){
        p=Paths.get(ruta);
    }
    public void agregar(int telefono, String nombre, String email){
        try(PrintStream out=new PrintStream(Files.newOutputStream(p, StandardOpenOption.CREATE,StandardOpenOption.APPEND))){
            out.println(telefono+"|"+nombre+"|"+email);            
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }       
    }
    public void agregar(Contacto con){
        agregar(con.getTelefono(),con.getNombre(),con.getEmail());
    }   
    public Contacto recuperar(String email){
        Contacto cn=null;
        try(BufferedReader bf=Files.newBufferedReader(p,Charset.forName("ISO-8859-1"));){
            String s;
            while((s=bf.readLine())!=null){
                String[] datos=s.split("[|]");
                if(datos[2].equals(email)){
                    cn=new Contacto(datos[1],Integer.parseInt(datos[0]),email);
                    break;
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return cn;
    }
    public List<Contacto> recuperarTodos(){        
        ArrayList<Contacto> contactos=new ArrayList<>();
        try(BufferedReader bf=Files.newBufferedReader(p,Charset.forName("ISO-8859-1"));){
            String s;
            while((s=bf.readLine())!=null){
                String[] datos=s.split("[|]");
                contactos.add(new Contacto(datos[1],Integer.parseInt(datos[0]),datos[2]));          
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return contactos;//convertimos ArraList en array
                
    }   
}
