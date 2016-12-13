
package principal;

public class IniciarTareas {

    public static void main(String[] args) {
        // TODO code application logic here
        //Paso 2: crear los hilos, los hilos son objetos.
        TareaAscendente hilo1 = new TareaAscendente();
        TareaDescendente hilo2 = new TareaDescendente();
        
        //Paso 3 poner a ejecutar los hilos.
        
        hilo1.start();
        hilo2.start();
    }
    
}
