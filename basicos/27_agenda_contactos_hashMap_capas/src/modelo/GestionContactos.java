
package modelo;

import java.util.Collection;
import java.util.HashMap;


public class GestionContactos {
    HashMap<Integer,String> contactos;

    public GestionContactos() {
        this.contactos = contactos;
        contactos = new HashMap<>();
    }

    
    //No se le pasan datos a los métodos ni son estaticos.
    public void añadirContacto(Integer dni, String nombre){
        contactos.put(dni, nombre);
    }
    
    public void eliminarContacto(Integer dni){
        contactos.remove(dni);
    }
    public String buscarContactos(Integer dni){
        boolean esta = contactos.containsKey(dni);
        if(esta){
            return contactos.get(dni);
        }else{
            return "No esta";
        }        
    }
    
    public Collection<String> mostrarContactos(){        
        //Se podria convertir la coleccion a array de string con toArray
       return contactos.values();
    }

}
