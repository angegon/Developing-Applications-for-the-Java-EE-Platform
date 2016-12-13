
package Modelo;


public class MisOperaciones implements OperacionesMat{
    //Solo sobreescribe los abstrctos, 
    @Override
    public int sumar(int a, int b) {
       return a+b;
    }

    @Override
    public int restar(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a*b;
    }
    
}
