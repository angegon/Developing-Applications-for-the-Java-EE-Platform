package modelo;

import beans.Contacto;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestionContactos implements InterfaceGestionRecursos {

    String Ruta = "d:\\temporal\\contactosObjetos.txt";

    @Override
    public void altaContacto(Contacto con) {
        ArrayList<Contacto> aux = null;
        File f = new File(Ruta);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Ruta, false))) {  //No utilizamos true porque, para evitar problemas con los append

            if (f.exists()) {//Sino existe el fichero, no hacemos nada de lo siguiente                    
                //guardamos el objeto en la colección de objetos que haya ya en el fichero, porque no se puede hacer el append.
                aux = (ArrayList<Contacto>) recuperarTodos();
            }
            //Si devuelve un nulo lo inicializamos, para que no de error.
            if (aux == null) {
                aux = new ArrayList<Contacto>();
            }
            //Añadimos el nuevo
            aux.add(con);
            //Guardamos toda  la lista.
            oos.writeObject(aux);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public Contacto buscarContacto(String email) {

        Contacto con = new Contacto();
        con = null;
        ArrayList<Contacto> aux = new ArrayList<>();
        File f = new File(Ruta);

        if (f.exists()) {//Sino existe el fichero, no hacemos nada de lo siguiente   
            //Versión reducida (BufferedReader bf= new BufferedReader(new fileReader(Ruta)),){    
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Ruta))) {

                //Recuperamos todos.
                aux = (ArrayList<Contacto>) recuperarTodos();

                //Si devuelve un nulo lo inicializamos, para que no de error.
                if (aux == null) {
                    aux = new ArrayList<Contacto>();
                }
                //
                //Recorremos la lista
                for (Contacto c : aux) {
                    if (c.getEmail().equals(email)) {
                        con.setNombre(c.getNombre());
                        con.setApellidos(c.getApellidos());
                        con.setEmail(c.getEmail());
                        con.setTelefono(c.getTelefono());
                    }

                }

            } catch (IOException ex) {
                ex.printStackTrace();

            }
        }

        return con;
    }

    @Override
    //Devolver un List para si acaso algún día la quieres cambiar.
    //Apuntes importantes cuaderno
    public ArrayList<Contacto> mostrarContactos() {

        return recuperarTodos();
    }

    @Override
    public ArrayList<Contacto> recuperarTodos() {
        ArrayList<Contacto> todos = null;
        File f = new File(Ruta);

        if (f.exists()) {//Sino existe el fichero, no hacemos nada de lo siguiente
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Ruta))) {  //No utilizamos true porque, para evitar problemas con los append
                //guardamos el objeto en la colección de objetos que haya ya en el fichero, porque no se puede hacer el append.

                todos = (ArrayList<Contacto>) ois.readObject();

            } catch (ClassNotFoundException | IOException ex) {  //Sino hay relación de jerarquía entre excepciones, se pueden poner juntas.
                ex.printStackTrace();
            }
        }

        return todos;
    }

}
