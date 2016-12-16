
package principal;

import java.util.function.Consumer;


public class TestLambda {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Consumer<Integer> c = a->Integer.toString(a);
        c.accept(20);
    }
    
}
