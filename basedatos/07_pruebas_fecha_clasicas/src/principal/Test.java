
package principal;

import java.sql.Timestamp;
import java.util.Date;


public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Date d=new Date();
        
        //transformar JAVA.UTIL.DATE en JAVA.UTIL.SQL
        
        java.sql.Date f= new java.sql.Date(d.getTime());
        
        java.sql.Timestamp t= new Timestamp(d.getTime());
        
        //transformasr sql.Date en util.Date , heredan, un objeto de la hija es un objeto de la padre.
        //un objeto de la hija, es un objeto de la padre
        
        Date fecha= f;
        Date fecha2 = t;
        
        
        
    }
    
}
