/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.text.DateFormat;
import java.util.List;
import java.util.Locale;
import javabeans.Venta;
import modelo.GestionLibros;
import modelo.LibreriaFactory;

/**
 *
 * @author Profesortarde
 */
public class TestFechas {

    
    public static void main(String[] args) {
        GestionLibros glibros=LibreriaFactory.getGestionLibros();
        /*Venta v=new Venta(0, 2, 900, new Date());
        glibros.altaVenta(v);*/
        List<Venta> ventas=glibros.ventasCliente(1);
        DateFormat df=DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.FULL, new Locale("es"));
        for(Venta v:ventas){
            System.out.println(v.getIdLibro()+" - "+df.format(v.getFecha()));
        }
    }
    
}
