
package principal;

class Externa2{
    private int i;
    public void metodo(){
        //como está dentro puedo llamar a sus métodos y atributos.
        Interna2 in = new Interna2();
        in.k = 10;
        in.met();
    }
    
    //si fuera private, que si es posible si está dentro de otra, no se podria acceder a ella.
    static class Interna2{
        //Puede tener variables con el mismo nombre.
        //y podemos hacer referencia a variables de la externa
        private int k;
        public void met(){     
            //i=10;//Desde una estatica solo se puede llamar a estaticos de la externa
            System.out.println("Método Interno.");
        }
    }
}

public class TestEstaticas {


    public static void main(String[] args) {
        // TODO code application logic here
        
        //no necesito crear un objeto de la externa para poder crear uno de la interna
        Externa2.Interna2 inter=new Externa2.Interna2();
        
    }
    
}
