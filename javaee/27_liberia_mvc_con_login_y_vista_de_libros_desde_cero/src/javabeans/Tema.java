package javabeans;

public class Tema {
	Integer idTema;
	String tema;
	
	
	
	public Tema() {
		super();
	}
	public Tema(Integer idTema, String tema) {
		super();
		this.idTema = idTema;
		this.tema = tema;
	}
	public Integer getIdTema() {
		return idTema;
	}
	public void setIdTema(Integer idTema) {
		this.idTema = idTema;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
	
}
