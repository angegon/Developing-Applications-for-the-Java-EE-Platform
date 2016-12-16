
package principal;

class Externa3{
    int i;
    
    public void metodo(){
        int k=1;
        
        class Interna3{ //no puede ser private ni publico, como cualquier
            //cosa que defines dentro de un metodo y evidentemente solo se
            //puede usar dentro del metodo, crear objetos dentro del metodo.
            int p=2;
            public void met(){
                System.out.println("local "+i+" - "+k);
            }
        }
        
        //no se puede usar sino se ha declarado antes.
        Interna3 in = new Interna3();
        in.met();
        //fuera del método no se puede usar ese tipo, ni devolver objetos
        //de tipo interna3, si se podria hacer que heradara de ArrayList
        //y devolver un arraylist, pero no tendriamos acceso a sus metodos 
    }
    
}

public class TestLocation {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Externa3 ex=new Externa3();
        ex.metodo();
    }
    
}
