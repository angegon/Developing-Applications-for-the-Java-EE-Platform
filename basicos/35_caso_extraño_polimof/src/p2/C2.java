
package p2;

import p1.C1;

public class C2 extends C1{
    //No estoy sobreescribiendo, este es un método propio de C2,
    //y no sería accesible desde el otro.Ojo, no es sobrescritura..
    void m(){
    //public void m()//Si lo ponemos public, si ejecuta este...en realidad no, me falla por algo
    //mirar el del jefe
        System.out.println("m de c2");
    }
}
