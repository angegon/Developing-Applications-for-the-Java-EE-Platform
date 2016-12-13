
package principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class TestFecha {

    public static void main(String[] args) {
        // TODO code application logic here
        
        LocalDate ld=LocalDate.of(2015, Month.MARCH,25);
        System.out.println(ld);
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfYear());
        System.out.println(ld.getMonthValue());
        ld.plusMonths(3);
        ld=ld.minus(19, ChronoUnit.DAYS);//Si le resto segundos daria excepción
        System.out.println(ld);
        
        ///localtime
        LocalTime lt=LocalTime.of(12,30,20);
        System.out.println(lt);
    }
    
}
