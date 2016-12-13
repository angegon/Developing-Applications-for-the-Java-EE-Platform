
package principal;

public class Invertir {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String texto="Esto es una cadena";
        
        String invertido="";
        
        for(int i=texto.length()-1; i>=0;i--){
            invertido+=texto.charAt(i); //Cada vez que lo invocas crea un objeto.
        }
        System.out.println(invertido);
        
        StringBuilder invertidosb=new StringBuilder("");
       
        
        for(int i=texto.length()-1; i>=0;i--){
            invertidosb.append(texto.charAt(i)); //Cada vez que lo invocas crea un objeto.
        }        
        
        System.out.println(invertidosb);
    }
    
}
