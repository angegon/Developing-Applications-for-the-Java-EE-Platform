
package paquete2;

import paquete1.ClaseA;

public class ClaseB extends ClaseA{
    private int x;
    public void m3(){
        int x;
        x=2;
        super.m2();
        super.m1();// no porque es ambito default.
        ClaseA ca=new ClaseA();
        ca.m2();//Error
        ClaseB cb=new ClaseB();
        cb.m2();//Esto si porque lo hereda
        cb.m1
        super.x=2; // la de la superclase. Cada una tiene su ambito.
        this.x = 2; // la de la clase.
    }
    
}
