/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javabeans.Pedido;


/**
 *
 * @author tarde
 */
public interface GestionTienda {
    
    void altaPedido(Pedido p);//recibe objeto venta y hay que darlo de alta en la bbdd
}
