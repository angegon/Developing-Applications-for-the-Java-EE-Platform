
package principa;

class ClaseA{
    /*void met(){
        System.out.println("met de A");
    }*/
    
    private void met(){
        System.out.println("met de A");
    }
    public void met2(){
        System.out.println("Met 2 de A");
    }
}

class ClaseB extends ClaseA{
    //@Override //Error de compilación, si es privado, no lo estás sobrescribiendo.
    private void met(){
        System.out.println("met de B");
    }
}
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseA ca=new ClaseB();
        ca.met2();
        ca.met();//Error de compilación, no se puede llamar al método privado de B, ni al de A, porque estamos creando el objeto en otra clase distinta.
        //si fuera default, si se podría hacer, se estaría haciendo uso de polimorfismo
        /*void met(){
            System.out.println("met de A");
        }*/
        
        //Si el main, estuviera en clase, A, y el método met privado, si funcionaria..
        //class ClaseA{
        /*void met(){
        System.out.println("met de A");
        }*/
    
        /*private void met(){
            System.out.println("met de A");
         }*/
        //public static void main(String[] args) {
        //0....
    }
        
  }
    

