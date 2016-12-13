
package modelo;

import java.util.List;
import javabeans.libro;
import javabeans.tema;

public interface gestionLibreriaInterface {
    List<tema> verTemas();
    List<libro> recuperarLibrosPorTema(int idTema);
    boolean loginUsuario(String usuario, String password);
}
