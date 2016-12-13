
package modelo;

import beans.Contacto;
import java.util.ArrayList;


public interface InterfaceGestionRecursos {
    void altaContacto(Contacto con);
    Contacto buscarContacto(String email);
    ArrayList<Contacto> mostrarContactos();
    ArrayList<Contacto> recuperarTodos();
}

