
package principal;


public class Contador {
    private int valor;
    
    public Contador(){
        valor=0;        
    }
    
    public Contador(int v){
        valor = v;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }         
}
