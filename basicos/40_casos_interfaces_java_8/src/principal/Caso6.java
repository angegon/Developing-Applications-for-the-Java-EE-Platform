
package principal;

interface I11{
    default void m(){//Si fuera default, y la otra static, si habria problema
        System.out.println("metodo m de I5");
    }
}

//No habría problema, lo statico no se hereda
interface I12 extends I11{
    default void m(){
        System.out.println("metodo m de I5");
    }
}


public class Caso6 {


    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
