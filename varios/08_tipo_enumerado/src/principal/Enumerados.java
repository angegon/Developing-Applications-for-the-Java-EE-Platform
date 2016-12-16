package principal;

enum Orientacion {
    Norte, Sur, Este, Oeste;
}

public class Enumerados {

    public static void main(String[] args) {
        // TODO code application logic here

        //Orientacion.Norte;
        
        for(Orientacion o:Orientacion.values()){
            System.out.println(o);                   
        }
        
    }

    private void cambiar(Orientacion or) {
        System.out.println(or);
    }

}
