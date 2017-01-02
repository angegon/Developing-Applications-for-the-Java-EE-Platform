package javabeans;

public class Contacto {
	String nombre;
	String email;
	Integer telefono;
	
	
	
	public Contacto() {
		super();
	}
	public Contacto(String nombre, String email, Integer telefono) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
}
