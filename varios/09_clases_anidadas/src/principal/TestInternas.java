
package principal;

class Externa{
    private int i;
    public void metodo(){
        //como está dentro puedo llamar a sus métodos y atributos.
        Interna in = new Interna();
        in.k = 10;
        in.met();
    }
    
    //si fuera private, que si es posible si está dentro de otra, no se podria acceder a ella.
    class Interna{
        //Puede tener variables con el mismo nombre.
        //y podemos hacer referencia a variables de la externa
        private int k;
        private int i;
        public void met(){            
            i=10;
            Externa.this.i=20;//Acceso a variable de la externa
            System.out.println("Método Interno.");
        }
    }
}

public class TestInternas {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Para crear una variable del tipo de la interna,
        //Es decir es necesario crear un objeto de la externa para poder crear 
        //uno de la interna
        Externa.Interna inter=new Externa().new Interna();
        //el recolector de basura se llevaria el externa, 
        
        //Otra manera de hacer lo anterior, el recolector de basura no se lo llevaría
        //ya que hay una variable que lo referencia.
        Externa ex=new Externa();
        Externa.Interna inters=ex.new Interna();
                
        inter.met();
        //inter.k //no es posible
        
        
    }
    
}
