
package principal;


public class ComprobarTexto {


    public static void main(String[] args) {
        // TODO code application logic here
        String telefonos="9512873,963566559,98543454,5454898754,54464445,64644556445,564564546,91219802";
        String [] aux=telefonos.split(",");
        int contador=0;
        
        for (String aux1 : aux) {
            if (aux1.startsWith("91")) {
                contador++;
            }
        }
        
        System.out.println("El número de teléfonos fijos de Madrid es de : "+ contador);
    }
    
}
