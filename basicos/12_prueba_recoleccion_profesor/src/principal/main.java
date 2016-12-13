
package principal;

public class main {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] a = new int[0]; //existe, pero no tiene posiciones
        int [] b = new int[5];
        mostrar(a);
        b= a;//el objeto b pasa a recoleccion en la 13, mientras que el a al terminar las lineas.
    }
    
    public static void mostrar(int[]c){
        c= null;
    }
}
