package principal;

public class Test {
   
        private static void manipula (StringBuilder sb){
            sb.append("Adios");  //Variable Stringbuilder es mutable, se le añade a la misma, no se crea un nuevo objeto.
        }
        
        public static void main(String[] args){
            
            StringBuilder cad=new StringBuilder("Hola"); //Variable CadApunta a un objeto
            manipula(cad);
            System.out.println("cad");
        }
        
}
