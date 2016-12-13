
package javabeans;

import java.io.Serializable;


public class Pedido implements Serializable{
    private String producto;
    private Integer unidades;

    public Pedido(String producto, Integer unidades) {
        this.producto = producto;
        this.unidades = unidades;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }
    
    
}
