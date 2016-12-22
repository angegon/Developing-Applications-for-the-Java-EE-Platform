package javabeans;

public class Producto {
	private String nombre;
	private Double precio;
	private String Categoria;
	public Producto(String nombre, Double precio, String categoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		Categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	
	
}
