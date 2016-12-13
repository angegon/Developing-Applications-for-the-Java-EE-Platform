package modelo;

public abstract class Figura {//hay que poner tb aqui abstract

    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*tb puede ser defaul o protected nunca privated*/
    public abstract double area();//Definición de método abstracto
    
    private void mimetodo(){
        
    }
}
