
package principal;

import java.util.stream.IntStream;


public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        IntStream nums=IntStream.of(8,9,3,1);
        
        //nums.forEach(n->System.out.println(n));
        nums.forEach(System.out::println); //el objeto ya va implicito.
        
    }
    
}
