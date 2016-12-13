/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javabeans.Libro;
import javabeans.Venta;

/**
 *
 * @author tarde
 */
public interface GestionLibros {

    List<Libro> recuperarLibros();

    List<Libro> recuperarLibros(int idTema);
    
    List<Venta> ventasCliente(int idCliente);
    
    void altaVenta(Venta v);//recibe objeto venta y hay que darlo de alta en la bbdd
}
