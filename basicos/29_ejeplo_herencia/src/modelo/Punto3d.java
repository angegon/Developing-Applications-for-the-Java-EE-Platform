package modelo;

public class Punto3d extends Punto{
    
    private int z;
    
    public Punto3d(int z, int x, int y){
        super(x,y);//la única manera de pasarselo es a través del constructor, no se podría hacer un this.x = x; porque es private.        
        this.z = z; 
    }
    public Punto3d(int z){
        super();
        this.z = z;
    }
    /*@Override
    public void dibujar(){
        System.out.println("z: "+getX()+" y: "+getY()+" z: "+ z); //getX y gety son métodos heredados, y se pueden invocar sin nada, 
        //también se podría usar super.getX, y this.getX, cualquier método.
    }*/

    @Override
    public void dibujar() {
        super.dibujar(); //To change body of generated methods, choose Tools | Templates.
        System.out.print(" z: "+z); //en este caso te ahorras volver a escribir lo que ya tenias.
    }
    
    
}
