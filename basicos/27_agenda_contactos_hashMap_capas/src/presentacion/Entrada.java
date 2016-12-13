package presentacion;

import java.util.Collection;
import java.util.Scanner;
import modelo.GestionContactos;

public class Entrada {

    public static void main(String[] args) {
        // TODO code application logic here
        GestionContactos gc = new GestionContactos();
        menu(gc);
    }

    public static void menu(GestionContactos gc) {
        Scanner entrada = new Scanner(System.in);
        int continuar;
        int dni;
        String contacto;
        do {
            System.out.println("Que operación desea realizar: ");
            System.out.println("1. Añadir contacto.");
            System.out.println("2. Eliminar contacto.");
            System.out.println("3. Buscar contacto.");
            System.out.println("4. Mostrar contactos.");
            System.out.println("5. salir.");
            continuar = Integer.parseInt(entrada.nextLine());

            switch (continuar) {
                case 1:
                    System.out.println("Escriba el dni del contacto a agregar: ");
                    dni = Integer.parseInt(entrada.nextLine());
                    System.out.println("Escriba el nombre del contacto a agregar: ");
                    contacto = entrada.nextLine();
                    gc.añadirContacto(dni, contacto);
                    break;
                case 2:
                    System.out.println("Escriba el dni del contacto a eliminar: ");
                    dni = Integer.parseInt(entrada.nextLine());
                    gc.eliminarContacto(dni);
                    break;
                case 3:
                    System.out.println("¿Cual es el dni del contacto que desea buscar?");
                    dni = Integer.parseInt(entrada.nextLine());
                    System.out.println("El contacto buscado: " + gc.buscarContactos(dni));
                    break;
                case 4:
                    Collection<String> contactos = gc.mostrarContactos();
                    System.out.println("Los contactos son:");
                    for (String con : contactos) {
                        System.out.println(con);
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("La opción introducida no es válida.");
                    break;
            }
        } while (continuar != 5);
    }
}
