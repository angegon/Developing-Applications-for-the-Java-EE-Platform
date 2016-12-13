
package principal;

interface I1{
    static void metodoI() {
        System.out.println("estatico en interfaz.");
    }
}

class C1 {
    static void metodoC() {
        System.out.println("estatico en Clase.");
    }    
}

class C2 extends C1 implements I1{
    //Esto suguiente no es sobreescritura es ocultación, cuando es static, se le llama asi. Y se puede acceder a los dos.
    public static void metodoC() {//No se puede sobreescribir un método estático, si se le quita static dara error.
        System.out.println("estatico en Clase hija.");
    }      
}

public class Test {


    public static void main(String[] args) {
        // TODO code application logic here
        
        //C1.metodoC(); //ok
        //I1.metodoI(); //ok, al metodo static de la interface, solo se le llama con el nombre de la interface..no con el nombre de la clase.
        
        //Puedo llamr a metodoC, no porque lo herede, porque no esta en tu clase, pero si lo puedes llamar, porque es una relacion de es un(c2 es un c1)        
       // C2.metodoC();        
        //error de compilación, habría que llamarlo con la interface.
       // C2.metodoI();
        
        //Estas son las diferencias, entre haber definido un static en una clase y en una interface.
        
        
        
        //A los estaticos de la clase, se les puede llamar con instancias.
        //C1 c1= new C1();
        ///C1.metodoC();
        //C2 c2 =new C2();
        //c2.metodoC();
        //c2.metodoI();//no, solo se le puede llamar con el nombre de la interfaz..
        
        //A que método C estoy llamando..
        //Se llama al de C1, el compilador, asocia lo estático al tipo, no al objeto, lo no estático a instancia del objeto, en este caso cojera el de C1..
        //No es sobreescritura, es ocultación..estas llamando a la versión del padre no del hijo..
        C1 x = new C2();
        x.metodoC(); 
        
        //En lo estatico lo que importa es el tipo, en lo no estatico, la instancia
        
        C2 y = new C2();
        y.metodoC();  //Se refiere al de C1...
        
    }
    
}
