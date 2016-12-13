
package modelo;

import beans.Contacto;
import java.util.Collection;
import java.util.HashMap;


public class GestionContactos {
    HashMap<Integer,Contacto> contactos;

    public GestionContactos() {
        this.contactos = contactos;
        contactos = new HashMap<>();
    }

    
    //No se le pasan datos a los métodos ni son estaticos.
    public void añadirContacto(Integer dni, String nombre, String email, int tel){
        Contacto conta=new Contacto(dni, nombre, email, tel);
        contactos.put(dni, conta);
    }
    
    public void añadirContacto(Contacto conta){//Método sobrecargado, pasandole el objeto.       
        contactos.put(conta.getDni(), conta);
    }    
    
    public void eliminarContacto(Integer dni){        
        contactos.remove(dni);
    }
    public Contacto buscarContactos(Integer dni){
        boolean esta = contactos.containsKey(dni);
        Contacto conta=null;
        if(esta){
            return conta= contactos.get(dni);
        }else{
            return conta;
        }        
    }
    
    public Collection<Contacto> mostrarContactos(){        
        //Se podria convertir la coleccion a array de string con toArray
       return contactos.values();
    }

}
