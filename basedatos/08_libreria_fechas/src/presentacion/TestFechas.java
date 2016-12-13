
package presentacion;


import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javabeans.Venta;
import modelo.GestionLibros;
import modelo.LibreriaFactory;

public class TestFechas {


    public static void main(String[] args) {
        // TODO code application logic here
        
        GestionLibros glibros = LibreriaFactory.getGestionLibros();
        
        
       /* Venta v = new Venta(0,1,900, new Date());
        
        glibros.altaVenta(v);*/
       
       List<Venta> ventas=glibros.ventasCliente(1);
       
       //Por ejemplo para dar formato a las fechas, 
        DateFormat df=DateFormat.getDateTimeInstance(DateFormat.FULL , DateFormat.MEDIUM , Locale.FRANCE);
        DateFormat des=DateFormat.getDateTimeInstance(DateFormat.FULL , DateFormat.MEDIUM , new Locale("es"));
       //Una vez creado el dateformat, existe un método para aplicar a una fecha, recibe un java.util.Date 
       ///Fin formato fechas.
       
       for(Venta v: ventas){
           System.out.println(v.getIdLibro()+ "///"+des.format(v.getFecha()));          
                   
       }
    }
    
}
