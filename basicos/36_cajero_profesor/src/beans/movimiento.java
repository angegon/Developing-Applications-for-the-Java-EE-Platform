
package beans;

public class movimiento {
    
    private String tipo;
    private double cantidad;

    public movimiento(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "movimiento{" + "tipo=" + tipo + ", cantidad=" + cantidad + '}';
    }
    
    
}
