
package principal;

import modelo.Circulo;
import modelo.Figura;
import modelo.Operaciones;
import modelo.Triangulo;

public class Test {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Figura f= new Figura();//No se puede
        //solo llamar al constructor de la superior, o sobreescribir sus métodos.
        
        
        // Parte Polimorfismo
        //Sin poli
        
        Circulo c = new Circulo(3, "circulo");
        Triangulo t= new Triangulo(2,8, "Triangulo");
        
        System.out.println("Nombre figura: "+ c.getNombre());
        System.out.println("Area figura: "+ c.area());
        
        System.out.println("Nombre figura: "+ t.getNombre());
        System.out.println("Area figura: "+ t.area());
        //Si en vez del nombre y el area, fuera, seis o siete datos más habría que repetirlo     
        
        //con poli, ahorras mucho código, y reutilizas.
        muestraDatos(new Circulo(3, "circulo"));
        muestraDatos(new Triangulo(2,9, "Triangulo"));
        
        //Ejemplo de uso de polimorfismo, podría llamar a los distintos métodos,
        Operaciones op=new Triangulo(1,2,"tri");
        op.girar(10);
        //Si en la variable op metiera circulo, podría llamar a girar sobre esa otra clase..
    }
    
    public static void muestraDatos(Figura f){
        System.out.println("Nombre figura: "+f.getNombre());
        System.out.println("Area figura: "+f.area());
        
        //Te da el nombre...de la clase que la está ejecutando.Se ve que son las hijas en la ejecución.
        System.out.println("clase a la que pertenece el objeto:" + f.getClass().getName());
        
        //Para saber si e una instancia de la clase triangulo
        if(f instanceof Triangulo){//devuelve true si pertenece.
            System.out.println("Pertence a la clase triangulo.");
        }
        
        if(f instanceof Circulo){
            System.out.println("Pertence a la clase circulo.");
        }        
        
        //Imaginemos que la clase figura tiene un método privado.
        //Desde fuera no se puede llamar
        //f.mimetodo();
    }
    
}
