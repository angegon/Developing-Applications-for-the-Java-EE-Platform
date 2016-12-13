package vista;

import beans.Contacto;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.GestionContactos;

public class principal {

    private static Contacto con = new Contacto();
    private static Scanner entrada = new Scanner(System.in);
    private static GestionContactos gc = new GestionContactos();
    private static ArrayList<Contacto> lc = new ArrayList<>();

    public static void main(String[] args) {
        int aux;

        do {
            aux = menuInicial();
            switch (aux) {
                case 1:
                    menuAltaContacto();
                    break;
                case 2:
                    con = buscarContacto();
                    if (con != null) {
                        System.out.println("\n"+"-------------------------"+
                                "Los datos del contacto buscado son:" + "\n"
                                + "Nombre: " + con.getNombre() + "\n"
                                + "Apellidos: " + con.getApellidos() + "\n"
                                + "Email: " + con.getEmail() + "\n"
                                + "Telefono: " + con.getTelefono()+ "\n"
                                + "-------------------------");
                    } else {
                        System.out.println("El contacto buscado no existe en la BBDD.");
                    }
                    break;
                case 3:
                    lc = mostrarContactos();
                    System.out.println("\n"+"La lista de contactos actual es:");
                    if (lc != null) {
                        for (Contacto c : lc) {
                            System.out.println("-------------------------"+"\n"+
                                    "Nombre: " + c.getNombre() + "\n"
                                    + "Apellidos: " + c.getApellidos() + "\n"
                                    + "Email: " + c.getEmail() + "\n"
                                    + "Telefono: " + c.getTelefono()+ "\n"+ 
                                    "-------------------------"+"\n");
                        }
                    } else {
                        System.out.println("No existen contactos en la agenda.");
                    }
                    break;
                case 4:
                    //Finalizar programa
                    System.out.println("Finalizando programa. ");
                    break;
                default:
                    System.out.println("La opción introducida no es correcta.");
                    break;
            }
        } while (aux != 4);

    }

    public static int menuInicial() {
        int op;

        System.out.println("¿Que operación desea realizar?");
        System.out.println("1. Dar de alta un nuevo contacto.");
        System.out.println("2. Buscar Contacto por email.");
        System.out.println("3. Mostrar todos los contactos.");
        System.out.println("4. Salir.");
        op = Integer.parseInt(entrada.nextLine());
        return op;
    }

    public static void menuAltaContacto() {
        String continuar;
        do {
            continuar = "N";

            System.out.println("Introduzca el nombre del contacto");
            con.setNombre(entrada.nextLine());
            System.out.println("Introduzca los apellidos del contacto");
            con.setApellidos(entrada.nextLine());
            System.out.println("Introduzca el email del contacto");
            con.setEmail(entrada.nextLine());
            System.out.println("Introduzca el telefono del contacto");
            con.setTelefono(entrada.nextLine());
            gc.altaContacto(con);

            System.out.println("¿Desea introducir otro contacto?");
            continuar = entrada.nextLine().toUpperCase();

        } while (!continuar.equals("N"));

    }

    private static Contacto buscarContacto() {
        String email;
        Contacto conBuscado = new Contacto();
        //conBuscado = null;
        System.out.println("Introduzca el email del contacto a buscar.");
        email = entrada.nextLine();
        conBuscado = gc.buscarContacto(email);
        return conBuscado;
    }

    private static ArrayList<Contacto> mostrarContactos() {
        return gc.mostrarContactos();
    }

}
