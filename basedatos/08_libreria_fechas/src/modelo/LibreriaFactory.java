/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tarde
 */
public class LibreriaFactory {
    
    
    public static GestionClientes getGestionClientes(){
        return new GestionClientesImpl();
    }   
    
    public static GestionLibros getGestionLibros(){
        return new GestionLibrosImpl();
    }
            
    public static GestionTemas getGestionTemas(){
        return new GestionTemasImpl();        
    }
    
}
