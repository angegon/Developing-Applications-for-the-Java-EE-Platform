
package javabeans;


public class clientes {
    
    private int idCliente, telefono;
    private String usuario, password, email;

    public clientes(int idCliente, int telefono, String usuario, String password, String email) {
        this.idCliente = idCliente;
        this.telefono = telefono;
        this.usuario = usuario;
        this.password = password;
        this.email = email;
    }

    public clientes() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
