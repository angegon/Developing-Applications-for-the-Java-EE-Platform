
package principal;

public class Switch {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10, b=5;
        int r = a*b;
        switch(r){
            case 10:
                System.out.println("Es 10.");
                break;
            case 50:
                System.out.println("Es 50.");
                break;
            default:
                System.out.println("No válido.");
        }        
    }    
}
