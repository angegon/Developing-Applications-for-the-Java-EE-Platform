
package principal;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class TestFormateado {


    public static void main(String[] args) {
        // TODO code application logic here
        
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/mm/yy"); //minutos
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("dd/MM/yy");//mes
        LocalDateTime ldt=LocalDateTime.of(2015, Month.JUNE, 15, 12, 37);
        System.out.println(ldt.format(format));
        System.out.println(ldt.format(format2));
    }
    
}
