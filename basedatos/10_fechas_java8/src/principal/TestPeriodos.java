package principal;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;

public class TestPeriodos {

    public static void main(String[] args) {

        Period pd = Period.of(10, 30, 40);
        pd=pd.normalized();
        System.out.println(pd);
        Duration d=Duration.ofNanos(2);
        System.out.println(d);
        Instant in=Instant.now();
        System.out.println(in);
        
    }

}
