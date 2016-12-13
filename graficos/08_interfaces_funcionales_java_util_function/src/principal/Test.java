
package principal;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Consumer<Integer> con= i->System.out.println(i*i);
        con.accept(25);
        
        //Function<String, Integer> fun= n->{return Integer.parseInt(n);};
        Function<String, Integer> fun= n->Integer.parseInt(n);//No hace falta poner return, porque devuelve solo un resultado
        System.out.println(fun.apply("12349"));
        
        //Recibe un dato y devuelve un boolean, se utiliza para definir criterios.
        Predicate<String> pre=s->s.startsWith("a");
        System.out.println(pre.test("aaa"));
        
        //sino hay parametros, a la izda de la flecha hay que poner ()
        Supplier<Integer> sp= ()->(int)(Math.random()*10+1);
        System.out.println(sp.get());
        
        //UnaryOperator<Integer> uo = i->System.out.println(i*i);
        
    }
    
}
