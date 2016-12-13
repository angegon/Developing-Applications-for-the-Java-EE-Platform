
package principal;


public class Test {

    static String s;
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println(s.length());//Null pointer Exception, llamada a un método con una variable que está a null.      
        
        //arithmetic exception
        //int a = 10;
        //int b= 0;
        //int s= a/b; 
        
        //Number format Exception, candidata a captura de excepcions.
        //String s2= "8r";
        //int k=Integer.parseInt(s);
        
        
        //ClassCastException
        Object ob="hola";
        String s = (String)ob; // el casting tb se puede usar para pasar de padre a hijo 
        Integer i=(Integer)ob;//en un object puedes meter cualquier polimorfismo, pero si el hijo no es del tipo del padre, dara un classcastException
    }
    
}
