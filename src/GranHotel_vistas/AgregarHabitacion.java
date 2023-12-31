/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GranHotel_vistas;


import GranHotel_AccesoADatos.HabitacionData;
import GranHotel_AccesoADatos.TipoHabitacionData;
import GranHotel_Entidades.Habitacion;
import GranHotel_Entidades.TipoHabitacion;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class AgregarHabitacion extends javax.swing.JInternalFrame {
    FondoPanel fondo=new FondoPanel();
    

    /**
     * Creates new form AgregarHabitacion
     */
    public AgregarHabitacion() {
        this.setContentPane(fondo);
        initComponents();
        rellenarcombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        agregar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ocupada(true/false)");

        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });
        estado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                estadoKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo De Habitacion");

        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        agregar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        agregar.setText("Agregar");
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        Limpiar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Limpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(Limpiar))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void estadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estadoKeyReleased
        
        validacion(evt);
        
       

    

    }//GEN-LAST:event_estadoKeyReleased

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        HabitacionData habi = new HabitacionData();
        Habitacion hab = new Habitacion();
        String s=estado.getText();
        
           if ("FALSE".equals(s) || "false".equals(s)||"true".equals(s)||"TRUE".equals(s)) {
            estado.setEnabled(false);
            estado.setEditable(false);
            agregar.setEnabled(true);
            hab.setOcupada(Boolean.valueOf(estado.getText()));
            hab.setTipoHabitacion((TipoHabitacion) combo.getSelectedItem());
            habi.guardarHabitacion(hab);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR TRUE O FALSE");
            estado.setText("");
            agregar.setEnabled(false);
            limpiar();
        }
    

 
    }//GEN-LAST:event_agregarActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox<TipoHabitacion> combo;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

 
 class FondoPanel extends JPanel{
    private Image imagen;
    @Override
    public void paint(Graphics g){
        imagen=new ImageIcon(getClass().getResource("/Imagenes/habitaciones.jpg")).getImage();
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}
 
 public void limpiar(){
     estado.setText("");
     estado.setEnabled(true);
     estado.setEditable(true);
     agregar.setEnabled(true);
     
 }
 
 public void validacion(java.awt.event.KeyEvent evento){
    
//codigo para verificar caracteres 
    if(evento.getKeyChar()>=33 && evento.getKeyChar()<=64 
            || evento.getKeyChar()>=91 && evento.getKeyChar()<=96
            || evento.getKeyChar()>=123 && evento.getKeyChar()<=208){
        
        evento.consume();
        JOptionPane.showMessageDialog(this, "NO SE PERMITEN CARACTERES ESPECIALES");
        limpiar();
        
    }
      
    }
 public void rellenarcombo(){
     TipoHabitacionData tip=new TipoHabitacionData();
     Habitacion hab=new Habitacion();
     
     
     for(TipoHabitacion tipo:tip.listarTiposDeHabitaciones()){
         combo.addItem(tipo);
     
     }
 }
 public void esta(){
     if(estado.getText().length()==5){
        String s=estado.getText();
        if("ELSE".equals(s)||"else".equals(s)){
            estado.setEnabled(false);
            estado.setEditable(false);
            agregar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR TRUE O FALSE");
            estado.setText("");
            agregar.setEnabled(false);
        }
    }
    
     if (estado.getText().length() == 4) {
            String a = estado.getText();
            if ("true".equals(a) || "TRUE".equals(a)) {
                estado.setEnabled(false);
                estado.setEditable(false);
                agregar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "DEBE INGRESAR TRUE O FALSE");
                estado.setText("");
                agregar.setEnabled(false);
            }   
        }

    }                             
 
}

   
           
 
 
 
 



