
package javabeans;


public class tema {
    
    private int idTema;
    private String tema;

    public tema(int idTema, String tema) {
        this.idTema = idTema;
        this.tema = tema;
    }

    public tema() {
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return tema;
    }
    
    
}
