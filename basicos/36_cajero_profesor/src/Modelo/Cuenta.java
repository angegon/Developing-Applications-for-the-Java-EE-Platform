
package Modelo;

public class Cuenta {
    private double saldo;
    
    public Cuenta(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void ingresar(double cantidad){
        saldo+=cantidad;        
    }
    
    public void extraer(double cantidad){
        saldo-=cantidad;
    }
}
