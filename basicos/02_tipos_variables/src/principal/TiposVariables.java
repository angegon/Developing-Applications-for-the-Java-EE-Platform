package principal;
public class TiposVariables {
    //Variables Atributo, tienen un valor implicito que es cero.
    int p ; //tienen valor implicito por defecto. Enteras 0, decimales, 0.0, char '\u0000' representa el caracter nulo o ''
    public static void main(String[] args) {
        // Declaración. Las variables se tienen que declarar para poder ser utilizadas.
        //Declaración tipo nombre de variable, 
        //Los nombres de las variables no pueden contener cualquier combinación de caracteres, 
        //No pueden ser palabras reservadas.
        //No pueden contener signos de puntuación o especiales(, . @), los únicos que podríamos utilizar, serían el $ y el _
        //no pueden comenzar por un número
        int a;
        //int 1bool;
        int $_void;
        //int class
        int class1;
        //Declarar varias variables del mismo tipo.
        int x,y,z;
        int t=5,pepe;
        z = 3;
        //Declaración implicita de variablesw        
        System.out.println(z);
        System.out.println("la variable z vale: " + z);
        //Las variables no se pueden utilizar sin inicializar
        System.out.println(y);
        //Las que estan dentro de los métodos son varibales locales, no se pueden usar sin asignar no tienen ningún valor.
        System.out.println(y); //Error de compilación
 
        
        
    }
    
}
