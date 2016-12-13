
package principal;


public class ComprobarEmail {


    public static void main(String[] args) {
        // TODO code application logic here
        
        String email="angegon@gmail.com";
        int posarroba=0;
        int pospunto=0;
        if(email.contains("@") && email.contains(".")){
            for(int i=0; i<email.length()-1; i++){
                if(email.charAt(i)=='@') posarroba=i;
                if(email.charAt(i)=='.') pospunto=i;
            }            
        }
        if (posarroba<pospunto){
            System.out.println("El email es valido.");            
        }else{
            System.out.println("El email es invalido.");
        }
        
        //otra forma
        int p_punto = email.indexOf(".");
        int p_arroba = email.indexOf("@");
        if(p_punto!=-1 && p_arroba!=-1 && p_arroba< p_punto){
            System.out.println("Dirección válida");
        } else {
            System.out.println("Dirección invalida");
        }
        
        ///Starswith
        
        
    }
    
}
