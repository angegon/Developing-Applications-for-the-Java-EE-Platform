
package calculos;

public class calculadora {
    private int x,y;
    
    public calculadora(){
        
    }
    
    public calculadora(int x, int y){
        //te ahorra el guardarX y guardar y, setters
        //ejercicio 21
        this.x=x;
        this.y=y;
    }
    public double sumar (){
       return x+y;        
    }
    public double restar(){
        return x-y;
    }
    public double multiplicar(){
        return x*y;
    }
    public double dividir(){
        return x/y;
    }
    public void guardarX(int x){
        this.x=x; //X de la clase, le metes la x del parametro
    }
    public void guardarY(int y){
        this.y=y;
    }
    
    public static int factorial(int n){
        
        
        //int f= this.x;//al ser estatico, no deja usar atributos no static, ni se puede usar this
        //int c= x;
        int r=1;
        for(int i = 1; i<=n;i++){
            r*=i;
        }
        return r;
    }
}
