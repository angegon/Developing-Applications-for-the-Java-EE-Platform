
package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


//forma tradicional de definir una clase que implemente una interface de escucha.

//Este listener no se usa...
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
        this("Primera Ventana", 100, 100, 600, 400);
        
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
        JButton jb1=new JButton("Sumar");
        //Le damos propiedades como a la ventana, tb hereda el método setbounds
        jb1.setBounds(50, 200, 100, 40);//La posicion es con respecto a la ventana.
        
        JButton jb2=new JButton("Restar");
        jb2.setBounds(150, 200, 100, 40);
        
        JButton jb3=new JButton("Multiplicar");
        jb3.setBounds(250, 200, 100, 40);
        
        JButton jb4=new JButton("Dividir");
        jb4.setBounds(350, 200, 100, 40);  
        
        JLabel jlb1 = new JLabel("Número 1:");
        jlb1.setBounds(50, 50, 100, 40);
        JLabel jlb2 = new JLabel("Número 2:");
        jlb2.setBounds(50, 100, 100, 40);
        
        JTextField jtf1= new JTextField();
        jtf1.setBounds(150, 50, 180, 40);
        
        JTextField jtf2= new JTextField();
        jtf2.setBounds(150, 100, 180, 40);     
        
        JLabel resultado= new JLabel("Aqui aparecera el resultado");
        resultado.setBounds(150, 250, 180, 40);   
        
        /*
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
                //jb1.setText("ha pulsado");
                JButton b = (JButton)e.getSource();
                     
                if(b==jb1){
                     
                     Double reslt= Double.parseDouble(jtf1.getText()) + Double.parseDouble(jtf2.getText());
                     String r = String.valueOf(reslt);
                     resultado.setText("Suma:" + r);
                } else if(b==jb2){
                     
                     Double reslt= Double.parseDouble(jtf1.getText()) - Double.parseDouble(jtf2.getText());
                     String r = String.valueOf(reslt);
                     resultado.setText("Resta:" + r);                    
                    
                } else if (b==jb3){
                    
                     Double reslt= Double.parseDouble(jtf1.getText()) * Double.parseDouble(jtf2.getText());
                     String r = String.valueOf(reslt);
                     resultado.setText("Multiplicación:" + r);                    
                    
                } else if (b==jb4) {
                   
                     Double reslt= Double.parseDouble(jtf1.getText()) / Double.parseDouble(jtf2.getText());
                     String r = String.valueOf(reslt);
                     resultado.setText("División:" + r);                    
                    
                }
            }
        };
        */
        
        //Lo de arriba con expresión lambda
        ActionListener l = (ActionEvent e) -> {
            //si ponemos this, accedemos al objeto de la clase anonima
            //Si quiero acceder al de la clase contenedora,
            //sería poniendo el nombre del componente superior.this.lo quesea....
            //JVentana.this.dispose();
            //Hay una serie de métodos setText que estan en casi todos los componentes.
            //jb1.setText("ha pulsado");
            JButton b = (JButton)e.getSource();
            
            if(b==jb1){
                
                Double reslt= Double.parseDouble(jtf1.getText()) + Double.parseDouble(jtf2.getText());
                String r = String.valueOf(reslt);
                resultado.setText("Suma:" + r);
            } else if(b==jb2){
                
                Double reslt= Double.parseDouble(jtf1.getText()) - Double.parseDouble(jtf2.getText());
                String r = String.valueOf(reslt);
                resultado.setText("Resta:" + r);
                
            } else if (b==jb3){
                
                Double reslt= Double.parseDouble(jtf1.getText()) * Double.parseDouble(jtf2.getText());
                String r = String.valueOf(reslt);
                resultado.setText("Multiplicación:" + r);
                
            } else if (b==jb4) {
                
                Double reslt= Double.parseDouble(jtf1.getText()) / Double.parseDouble(jtf2.getText());
                String r = String.valueOf(reslt);
                resultado.setText("División:" + r);
                
            }
        } //no se implementa un objeto de la interface, sino un objeto de una clase(anonima) que implrementa esa interface...
        //y se guarda en la variable l
        //Porque se usa esto, porque al estar la implentación dentro de la propia clase, podemos acceder a sus atributos..
        ;        
        
        FocusListener f = new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                JTextField jt=(JTextField) e.getSource();
                jt.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {
                
            }
        
        };
        //Fin de clase anonima.
        
        //Asociar evento especifico del control del componente, con el escuchador...
        //Falta ahora establecer la relación entre el evento del boton, y el listener
        jb1.addActionListener(l);//ahora ya cerrara
        jb2.addActionListener(l);
        jb3.addActionListener(l);
        jb4.addActionListener(l);
        
        jtf1.addFocusListener(f);
        jtf2.addFocusListener(f);
        
        //Como se le añade al contenedor, heredado de container, tenemos un método que se llama add que
        //gracias al polimorfismo, le podemos añadir cuaquier componente a la ventana, sino habría 
        //que tener un método por cada tipo de componente
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);
        this.add(jlb1);
        this.add(jlb2);
        this.add(jtf1);
        this.add(jtf2);
        this.add(resultado);
        //todos los componentes tienen un gestor de organización, que añade los componentes al layaout pasandose por alto 
        //los tamaños que antes le has dado. Para evitarlo en la primera línea de inicializarcomponentes
        //hay que decirle a la ventana que anule este gestor, this.setLayout(null);
        
        

    }
}
