
package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


//forma tradicional de definir una clase que implemente una interface de escucha.

//
class manejador implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hola");
    }    
}




public class JVentana extends JFrame{ //Heredar Jframe, ya es suficiente para que se comporte como una ventana.

    //En el constructor de la ventana se aprovecha para establecer esas propiedades basicas de la ventana
    public JVentana(){
        /*
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
        */
        //En vez de poner todo lo anterior, lo generamos en el constructor...
        this("Primera Ventana", 100, 100, 800, 600);
        
    }
    
    //Ofrecer al exterior otra manera de fijar esos parametros desde el exterior
    public JVentana(String titulo, int x, int y, int w, int h){
        super(titulo);
        this.setBounds(x,y,w,h);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        //Hacer justo antes de hacer visibles.
        inicializarcomponentes();
        
        this.setVisible(true);
    }
    
    private void inicializarcomponentes(){
        this.setLayout(null);//Si lo quitamos el boton ocupa toda la ventana, y pasa de las propiedades que nosotros ponemos
        
        //A este método habrá que llamrlo desde el constructor, pero antes de hacer visible la ventana.
        //Crear componente, con parametro del constructor
        JButton jb1=new JButton("Pulsar");
        //Le damos propiedades como a la ventana, tb hereda el método setbounds
        jb1.setBounds(100, 100, 120, 40);//La posicion es con respecto a la ventana.
        
        //clase anonima para manejar el evento
        ActionListener l = new ActionListener() {//no se implementa un objeto de la interface, sino un objeto de una clase(anonima) que implrementa esa interface...
            //y se guarda en la variable l
            //Porque se usa esto, porque al estar la implentación dentro de la propia clase, podemos acceder a sus atributos..
            
            @Override
            public void actionPerformed(ActionEvent e) {
                //si ponemos this, accedemos al objeto de la clase anonima
                //Si quiero acceder al de la clase contenedora, 
                //sería poniendo el nombre del componente superior.this.lo quesea....
                //JVentana.this.dispose();
                //Hay una serie de métodos setText que estan en casi todos los componentes.
                jb1.setText("ha pulsado");
            }
        };
        //Fin de clase anonima.
        
        //Asociar evento especifico del control del componente, con el escuchador...
        //Falta ahora establecer la relación entre el evento del boton, y el listener
        jb1.addActionListener(l);//ahora ya cerrara
        
        //Como se le añade al contenedor, heredado de container, tenemos un método que se llama add que
        //gracias al polimorfismo, le podemos añadir cuaquier componente a la ventana, sino habría 
        //que tener un método por cada tipo de componente
        this.add(jb1);
        
        //todos los componentes tienen un gestor de organización, que añade los componentes al layaout pasandose por alto 
        //los tamaños que antes le has dado. Para evitarlo en la primera línea de inicializarcomponentes
        //hay que decirle a la ventana que anule este gestor, this.setLayout(null);
        
        

    }
}
