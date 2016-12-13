
package beans;


public class Contacto {
    
    String nombre;
    String Email;
    String Apellidos;
    String Telefono;

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    public Contacto() {
    }

    public Contacto(String nombre, String Email, String Apellidos, String Telefono) {
        this.nombre = nombre;
        this.Email = Email;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
    
    
}
