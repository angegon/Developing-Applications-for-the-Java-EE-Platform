
package Modelo;

public class MisOperaciones2 implements OperacionesMat{

    @Override
    public int sumar(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int restar(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int multiplicar(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Cuando sobreescribimos un métod de una interfaz, por lo tanto son públicos no pueden ser de otra manera,
    //podría en esta versión que estoy escribiendo llamar a la de la interface, si...
    @Override
    public int dividir(int a, int b) {
        
        //Llamada a la versión del método que está definida en la interface..
        return OperacionesMat.super.dividir(a, b); //To change body of generated methods, choose Tools | Templates.
    }
    
}
