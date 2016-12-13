
package principal;


class Padre{
    public void m(){
        System.out.println("M de padre.");
    }
}

class Hijo extends Padre{
    public void m(){
        System.out.println("M de hijo.");
    }    
    public void v(){
        System.out.println("V de hijo.");
    }
}
public class Test {

    public static void main(String[] args) {
        // TODO code application logic here
        Padre p= new Hijo();//En una variable de tipo Padre, hay una variable de tipo hijo.
                            //el objeto es una instancia de Hijo, y tendrás sus metodos
        p.m();//Saldra M de hijo.
        p.v();//no se puede porque el tipo padre no tiene ese método. error de compilación
        
        
        
    }
    
}
