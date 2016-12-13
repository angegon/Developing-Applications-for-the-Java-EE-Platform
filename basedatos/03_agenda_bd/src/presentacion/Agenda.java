

package presentacion;

import java.util.List;
import java.util.Scanner;
import javabeans.Contacto;
import modelo.GestorAgenda;


public class Agenda {

    
    public static void main(String[] args) {
        
        
        
        Scanner sc=new Scanner(System.in);
        GestorAgenda gestor=new GestorAgenda();
        
        System.out.println(gestor);
        int op;//opcion elegida
        do{
           System.out.println("1.- A�adir contacto");
           
           System.out.println("2.- Buscar contacto");
           System.out.println("3.- Mostra contactos");
           System.out.println("4.- Salir");
           String nombre;
           int telefono;
           String email;
           op=Integer.parseInt(sc.nextLine());
           switch(op){
               case 1:
                   System.out.println("Nombre:");
                   nombre=sc.nextLine();
                   System.out.println("Telefono: ");
                   telefono=Integer.parseInt(sc.nextLine());
                   System.out.println("Email:");
                   email=sc.nextLine();
                   
                   gestor.agregar(telefono, nombre, email);
                   
                   break;
               
               case 2:
                   System.out.println("Email: ");
                   email=sc.nextLine();
                   Contacto c=gestor.recuperar(email);
                   if(c==null){
                      System.out.println("No se encontró");  
                   }
                   else{
                      System.out.println(c.getNombre()+"-"+c.getEmail()+"-"+c.getTelefono());   
                   }
                   break;
               
               case 3:
                   List<Contacto> contactos=gestor.recuperarTodos();
                   mostrarTodos(contactos);
               case 4:
                   break;
               default:
                   System.out.println("debes escribir una opci�n v�lida");
           }
        }while(op!=4);
    }
    
    private static void mostrarTodos(List<Contacto> todos){
        
        for(Contacto c:todos){
            System.out.println(c.getNombre()+"-"+c.getEmail()+"-"+c.getTelefono());
        }
    }

}
