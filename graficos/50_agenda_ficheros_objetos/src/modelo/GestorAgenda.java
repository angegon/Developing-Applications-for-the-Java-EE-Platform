/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javabeans.Contacto;


/**
 *
 * @author Profesor_tarde
 */
public class GestorAgenda {
    String ruta="d:\\temporal\\datos.xyz";
    public GestorAgenda(){
        
    }
    public void agregar(int telefono, String nombre, String email){
        ArrayList<Contacto> todos=(ArrayList<Contacto>)recuperarTodos();
        if(todos==null){
            todos=new ArrayList<Contacto>();
        }
        todos.add(new Contacto(nombre,telefono,email));
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(ruta,false))){
            out.writeObject(todos);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }       
    }
    public void agregar(Contacto con){
        agregar(con.getTelefono(),con.getNombre(),con.getEmail());
    }   
    public Contacto recuperar(String email){
        
        ArrayList<Contacto> todos=(ArrayList<Contacto>)recuperarTodos();
        for(Contacto c:todos){
            if(c.getEmail().equals(email)){
                return c;
            }
        }       
        return null;
    }
    public List<Contacto> recuperarTodos(){        
        ArrayList<Contacto> contactos=null;
        File f=new File(ruta);
        if(f.exists()){
            try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(ruta));){
                contactos=(ArrayList<Contacto>)ois.readObject();
            }
            catch (ClassNotFoundException|IOException ex) {
               // ex.printStackTrace();
            }  
        }
        
        return contactos;//convertimos ArraList en array
                
    }   
}
