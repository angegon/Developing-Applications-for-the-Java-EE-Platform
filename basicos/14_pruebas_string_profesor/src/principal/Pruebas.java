
package principal;


public class Pruebas {


    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1=new String("Hola");
        String s2=new String("Hola");
        
        String s3="Hola"; //la máquina virtual de java, en el pool de objetos reutiliza sin son iguales.
        String s4="Hola";
        
        if(s1.equals(s2)){
            System.out.println("iguales");
        }else{
            System.out.println("distintos");
        }
        
        if(s3==s4){ 
            System.out.println("iguales");
        }else{
            System.out.println("distintos");
        }       
    }
    
}
