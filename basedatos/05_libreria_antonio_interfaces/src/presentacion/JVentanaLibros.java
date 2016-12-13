/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.List;
import javabeans.Libro;
import javabeans.Tema;
import modelo.GestionLibros;
import modelo.GestionTemas;
import modelo.LibreriaFactory;


/**
 *
 * @author Profesortarde
 */
public class JVentanaLibros extends javax.swing.JFrame {

    /**
     * Creates new form JVentanaLibros
     */
    public JVentanaLibros() {
        super("Ventana de libros");
        this.setBounds(100,100,600,400);
        initComponents();
        GestionTemas gtemas= LibreriaFactory.getGestionTemas();
        
        //GestionTemasImpl gtemas=new GestionTemasImpl();
        List<Tema> lista=gtemas.obtenerTemas();
        jcTemas.addItem(new Tema(0,"-Todos-"));
        for(Tema t:lista){
            jcTemas.addItem(t);
        }
        this.setVisible(true);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcTemas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlLibros = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione tema:");

        jcTemas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcTemasItemStateChanged(evt);
            }
        });

        jButton1.setText("Ver libros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jlLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tema t=(Tema)jcTemas.getSelectedItem();
         GestionLibros glibros= LibreriaFactory.getGestionLibros();
        //GestionLibrosImpl glibros=new GestionLibrosImpl();
        List<Libro> libros;
        if(t.getIdTema()==0){
            libros=glibros.recuperarLibros();
        }else{
            libros=glibros.recuperarLibros(t.getIdTema());
        }
        jlLibros.setListData(libros.toArray(new Libro[0]));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcTemasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcTemasItemStateChanged
        Tema t=(Tema)jcTemas.getSelectedItem();
        
        GestionLibros glibros= LibreriaFactory.getGestionLibros();
        //GestionLibrosImpl glibros=new GestionLibrosImpl();
        List<Libro> libros;
        if(t.getIdTema()==0){
            libros=glibros.recuperarLibros();
        }else{
            libros=glibros.recuperarLibros(t.getIdTema());
        }
        jlLibros.setListData(libros.toArray(new Libro[0]));
    }//GEN-LAST:event_jcTemasItemStateChanged

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Tema> jcTemas;
    private javax.swing.JList<Libro> jlLibros;
    // End of variables declaration//GEN-END:variables
}