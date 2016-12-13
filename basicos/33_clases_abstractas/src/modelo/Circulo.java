
package modelo;

import static java.lang.Math.PI;

public class Circulo extends Figura{
    private double radio;
    
    //Insertar constructor
    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double area() {
        return PI*radio*radio;
    }

    
}
