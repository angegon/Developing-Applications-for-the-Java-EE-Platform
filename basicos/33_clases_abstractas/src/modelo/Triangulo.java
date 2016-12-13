
package modelo;


public class Triangulo extends Figura implements Operaciones, Data{//Si implementa de dos, y tienen
    //el mismo método como no tienen código da igual
    private double base, altura;

    //Insertar Constructor
    public Triangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    


    @Override
    public double area() {
        return base*altura/2;
    }

    @Override
    public void girar(int grados) {
        
    }

    @Override
    public int mover(String dir) {
         return 0;
    }


    
}
