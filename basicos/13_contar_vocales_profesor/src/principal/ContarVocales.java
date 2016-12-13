
package principal;


public class ContarVocales {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s="esto es una cadena de caracteres";
        int contador=0;
        s=s.toLowerCase();
        for(int i=0; i<=s.length()-1;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                contador++;
            }
        }
        
        System.out.println("El número de vocales es: " + contador);
    }
    
}
