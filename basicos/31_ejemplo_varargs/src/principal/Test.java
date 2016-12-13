
package principal;

class Variable{
    public void imprimir(int a, String... args){
        
        System.out.println(a);    
        for(String s:args){
            System.out.println(s);
        }
    }
    //Si se llamará a imprimir, primero buscaría las coincidencias exactas en parametros.
    void imprimir(int b){
        
    }
    void imprimir(int b, String s){
        
    }
    
    void imprimir(long a, String s){//Para llamarlo habría que llamar con un tipo long
        
    }
    
    int imprimir(){
        return 1;
    }
    
    void imprimir(int a, String [] c){ // Es igual al primero.
        
    }
    public void mostar(int... nums){
        
    }
    
}


class Variable2{
    public void imprimir(int a, String... args, int f){//No es correcto, el número variable de argumentos, ha de ser el ultimo
        
        
    }
}

class VariableN extends Variable{
    //Sobreescritura, se le pone public por que no se puede reducir, el ambito, igual o menos restrictiva
    //en este caso si es aceptado el que antes no, ya que anula el anterior.
    public void imprimir(int a, String [] c){ // Es igual al primero.
        
    }
}

public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        Variable v = new Variable();
        v.imprimir(0, "hola");
        v.imprimir(3, "hola", "adios");
        v.imprimir(6);
        v.imprimir(0, new String[]{"er", "uj","9i"});//el argumento variable es compatible con un array 
        
    }
    
}
