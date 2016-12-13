
package graficos;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JVentana extends JFrame{ //Heredar Jframe, ya es suficiente para que se comporte como una ventana.

    //En el constructor de la ventana se aprovecha para establecer esas propiedades basicas de la ventana
    public JVentana(){
        //Llamamos al constructor de Jframe, que acepta como parametro el titulo de la ventana
        super("Primera Ventana");
        //Establecer el tamaño y posicion de la ventana.Hereda de Methods inherited from class java.awt.Windows
        this.setBounds(100, 100, 800, 600);
        //Hacer visible, heredaddo de window
        this.setVisible(true);
        //Cuando le damos al boton de cierre, solo oculta, con lo siguiente le decimos cual es por defecto la operacion de ese boton
        //
        //this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //como JFrame implementa la interfaz WindowConstants, se podría poner asi
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }
    
    //Ofrecer al exterior otra manera de fijar esos parametros desde el exterior
    public JVentana(String titulo, int x, int y, int w, int h){
        super(titulo);
        this.setBounds(x,y,w,h);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
}
