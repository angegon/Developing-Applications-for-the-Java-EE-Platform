
package principal;

import java.util.Arrays;
import java.util.stream.Stream;


public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] dias = {"lunes", "martes", "miercoles", "jueves","viernes"};
        Stream<String> st=Arrays.stream(dias);
        
        
        //System.out.println(st.skip(2).count());
        
        //st=st.skip(2);
        
        //System.out.println(st.count());//esto no daría error porque st es otro objeto.
        
        //System.out.println(st.skip(2).limit(2).count());
        
        //forEach
        //st.forEach(s->System.out.println(s));
        
        //st.forEach(s->System.out.println(s)).count();//No devuelve nada, error
        
        st.map(s->s.length()).forEach(n->System.out.println(n));
        
    }
    
}
