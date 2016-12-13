
package principal;


public class Prueba {
    public void operacion() throws Exception{//la transmitimos/propagamos a la superior que le llama.
        
        int k=10;
        int m=0;
        
        if(m==0){//Provocamos excepción. Creamos un objeto del tipo de expeción que voy a provocar
            throw new Exception();//Da error sino la capturas, pero la provoco para que el que me llame la capture el,
                                  //provocar una excepción, indica propagar una excepción.
        }
    }
}
