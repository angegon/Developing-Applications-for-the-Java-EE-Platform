
package Modelo;


public interface OperacionesMat {
    int sumar(int a, int b);
    int restar(int a, int b);
    int multiplicar(int a, int b);
    default int dividir(int a, int b){
        return a/b;
    }
    static int cuadrado(int a){
        return a*a;
    }
}


