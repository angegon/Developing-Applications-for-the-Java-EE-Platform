/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

//import p2.C2;

import p2.C2;



public class Test {

    public static void main(String[] args) {
        // TODO code application logic here
		C1 x= new C2();
                
                //No
		x.m();//Ambito de paquete, no se podría llamar porque no se ve, pero no da error de compilación porque está en el mismo paquete.
		//Al poner el . si sale ya que están en el mismo paquete, pero da error de ejecución.        
                
                //En realidad no da error de compilación, sino esta el método en C2, 
                //busca el de la padre, y ejecuta ese.
                x.m();
    }
    
}
