
package patron;


public class Single {
    private static Single sin;//modificador static ya que solo va a haber uno.
    
    //en que momento creo el objeto de la clase.
    //no ponemos constructores y ponemos un método statico getSingle(){
   
    //como hacemos para que solo se cree uno
    //
    static {
        sin=new Single();
    }
    private Single(){
       //Al tener constructor privado impido que pueda crear objetos con el mio.         
    
    }
    public static Single getSingle(){
        sin=new Single();   //no es patrón single,porque tiene un constructor.
        return sin;
    }
    
    
    
    
}
