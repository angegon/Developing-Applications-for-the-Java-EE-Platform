
package Modelo;

import java.util.ArrayList;
import java.util.HashMap;
import beans.movimiento;

public class Movimientos extends Cuenta{

    
    private ArrayList<movimiento> mov;

    public Movimientos(double saldo) {
        super(saldo);
        this.mov = new ArrayList<>();
    }

    public ArrayList<movimiento> getMov() {
        
        return mov;
    }

    //No hay set, porque los movimientos no se establecen desde la vista,solo se le pasan.
    
    @Override
    public void extraer(double cantidad) {
        super.extraer(cantidad); //To change body of generated methods, choose Tools | Templates.
        movimiento m=new movimiento("Extraccion", cantidad);
        mov.add(m);
    }

    @Override
    public void ingresar(double cantidad) {
        super.ingresar(cantidad); //To change body of generated methods, choose Tools | Templates.
        movimiento m=new movimiento("Extraccion", cantidad);
        mov.add(m);
    }  
    
}
