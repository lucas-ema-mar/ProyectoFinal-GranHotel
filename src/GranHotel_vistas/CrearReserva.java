/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GranHotel_vistas;

import GranHotel_AccesoADatos.HabitacionData;
import GranHotel_AccesoADatos.HuespedData;
import GranHotel_AccesoADatos.ReservaData;
import GranHotel_Entidades.Habitacion;
import GranHotel_Entidades.Huesped;
import GranHotel_Entidades.Reserva;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marti
 */
public class CrearReserva extends javax.swing.JInternalFrame {
    FondoPanel fondo=new FondoPanel();
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c){
            return false;
        }
    };
    

    /**
     * Creates new form CrearReserva
     */
    public CrearReserva() {
        this.setContentPane(fondo);
        initComponents();
        armarCabecera();
        cargarCombo();
        limpiarCampos();
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
        jLabel2 = new javax.swing.JLabel();
        jcbHuespedes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtCantDias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtHabitaciones = new javax.swing.JTable();
        jbReservar = new javax.swing.JButton();
        jbLimpiarCampos = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtPrecioTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtCantPers = new javax.swing.JTextField();
        jbBuscarHabDisponibles = new javax.swing.JButton();
        jdcFechaIng = new com.toedter.calendar.JDateChooser();
        jdcFechaSal = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Reserva");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Huesped");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de ingreso");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de salida");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad de Dias");

        jtCantDias.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Habitaciones Disponibles");

        jtHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nro", "Tipo", "Cant. Camas", "Tipo Camas", "Precio $ por dia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtHabitaciones);

        jbReservar.setText("Reservar");
        jbReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservarActionPerformed(evt);
            }
        });

        jbLimpiarCampos.setText("Limpiar Campos");
        jbLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCamposActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio Total:  $");

        jtPrecioTotal.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cant. de Personas (4 max.)");

        jbBuscarHabDisponibles.setText("Buscar");
        jbBuscarHabDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarHabDisponiblesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(219, 219, 219))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbReservar)
                                        .addComponent(jLabel7))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbLimpiarCampos))
                                    .addGap(183, 183, 183))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(149, 149, 149)
                                    .addComponent(jcbHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jbBuscarHabDisponibles)
                                        .addComponent(jtCantDias, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtCantPers, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jdcFechaSal, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                        .addComponent(jdcFechaIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbHuespedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jtCantPers, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcFechaIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCantDias, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBuscarHabDisponibles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbReservar)
                    .addComponent(jbLimpiarCampos))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarCamposActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarCamposActionPerformed

    private void jbBuscarHabDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarHabDisponiblesActionPerformed
        // TODO add your handling code here:
        
        try {
            
            if(Integer.parseInt(jtCantPers.getText())<1 || Integer.parseInt(jtCantPers.getText())>4){
                JOptionPane.showMessageDialog(this, "Ingrese cantidad de personas entre 1 como minimo y 4 como maximo");
                jtCantPers.setText("");
                
            }else if(jdcFechaIng.getDate()==null || jdcFechaSal.getDate()==null || jdcFechaIng.getDate().compareTo(jdcFechaSal.getDate()) >= 0 
                    || jdcFechaIng.getDate().compareTo(Date.valueOf(LocalDate.now())) < 0){
                JOptionPane.showMessageDialog(this, "Seleccione una Fecha de Ingreso y otra de Salida correctamente");
                borrarFilas();
                jdcFechaSal.setDate(null);
                jtCantDias.setText("");
                
            }else{
                LocalDate fechaIng = jdcFechaIng.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaSal = jdcFechaSal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                int cantDias = (int) DAYS.between(fechaIng, fechaSal);
                jtCantDias.setText(cantDias + "");
                int cantPers = Integer.parseInt(jtCantPers.getText());
                
                ReservaData rd = new ReservaData();
                HabitacionData hd = new HabitacionData();
                List<Habitacion> habLibres = hd.listarPorCantidadPersonas(cantPers);
                ArrayList<Habitacion> ocupadas = new ArrayList<>();
                
                for (Reserva res : rd.reservasActivas()) {

                    if (res.getHabitacion().getTipoHabitacion().getMaxPersonas() == cantPers) {

                        if (fechaIng.compareTo(res.getFechaIngreso()) >= 0 && fechaIng.compareTo(res.getFechaSalida()) < 0) {

                            ocupadas.add(res.getHabitacion());

                        } else if (fechaIng.compareTo(res.getFechaIngreso()) < 0 && fechaSal.compareTo(res.getFechaIngreso()) > 0) {

                            ocupadas.add(res.getHabitacion());

                        }

                    }

                }
                
                for(Habitacion hab : ocupadas){
                    
                    habLibres.remove(hab);
                    
                }
                
                //ARMAMOS LA TABLA CON LAS HABITACIONES DISPONIBLES
                if (habLibres.isEmpty()) {
                    borrarFilas();
                    JOptionPane.showMessageDialog(this, "No hay habitaciones disponibles");
                } else {
                    borrarFilas();
                    for (Habitacion hab : habLibres) {
                        modelo.addRow(new Object[]{
                            hab.getNum(),
                            (hab.getTipoHabitacion().getMaxPersonas() == 1 ? "Simple" : hab.getTipoHabitacion().getMaxPersonas() == 2 ? "Doble" : hab.getTipoHabitacion().getMaxPersonas() == 3 ? "Triple" : "Suite"),
                            hab.getTipoHabitacion().getCantCamas(),
                            hab.getTipoHabitacion().getTipoDeCama(),
                            hab.getTipoHabitacion().getPrecio()
                        });
                    }
                }
                
            }
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero valido en la cantidad de personas");
            
        }
    }//GEN-LAST:event_jbBuscarHabDisponiblesActionPerformed

    private void jtHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtHabitacionesMouseClicked
        // TODO add your handling code here:
        
        double precioPorDia = Double.valueOf(jtHabitaciones.getValueAt(jtHabitaciones.getSelectedRow(), 4).toString());
        double precioTotal = precioPorDia * Double.valueOf(jtCantDias.getText());
        jtPrecioTotal.setText(precioTotal + "");
        jbReservar.setEnabled(true);
        
    }//GEN-LAST:event_jtHabitacionesMouseClicked

    private void jbReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservarActionPerformed
        // TODO add your handling code here:
        HuespedData huesData = new HuespedData();
        HabitacionData hd = new HabitacionData();
        ReservaData rd = new ReservaData();
        int numHab = Integer.parseInt(jtHabitaciones.getValueAt(jtHabitaciones.getSelectedRow(), 0).toString());
        
        Huesped hues = (Huesped) jcbHuespedes.getSelectedItem();
        if(!hues.isActivo()){
            
            huesData.altaHuesped(hues.getDni());
            
        }
        Habitacion hab = hd.buscarHabitacion(numHab);
        LocalDate fechaIng = jdcFechaIng.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaSal = jdcFechaSal.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int cantPers = Integer.parseInt(jtCantPers.getText());
        boolean estado = true;
        
        Reserva res = new Reserva(hues, hab, fechaIng, fechaSal, cantPers, estado);
        
        rd.crearReserva(res);
        
        limpiarCampos();
        
    }//GEN-LAST:event_jbReservarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBuscarHabDisponibles;
    private javax.swing.JButton jbLimpiarCampos;
    private javax.swing.JButton jbReservar;
    private javax.swing.JComboBox<Huesped> jcbHuespedes;
    private com.toedter.calendar.JDateChooser jdcFechaIng;
    private com.toedter.calendar.JDateChooser jdcFechaSal;
    private javax.swing.JTextField jtCantDias;
    private javax.swing.JTextField jtCantPers;
    private javax.swing.JTable jtHabitaciones;
    private javax.swing.JTextField jtPrecioTotal;
    // End of variables declaration//GEN-END:variables
   
    private void limpiarCampos(){
        
        jcbHuespedes.setSelectedIndex(0);
        jtCantPers.setText("");
        jdcFechaIng.setDate(null);
        jdcFechaSal.setDate(null);
        jtCantDias.setText("");
        borrarFilas();
        jtPrecioTotal.setText("");
        jbReservar.setEnabled(false);
        
    }
    
    private void cargarCombo() {

        HuespedData hd = new HuespedData();
        List<Huesped> huespedes = hd.listarHistorialDeHuespedes();
        jcbHuespedes.addItem(null);
        for (Huesped hues : huespedes) {
            jcbHuespedes.addItem(hues);

        }

    }
    
    private void armarCabecera(){
        
        modelo.addColumn("Nro");
        modelo.addColumn("Tipo");
        modelo.addColumn("Cant. Camas");
        modelo.addColumn("Tipo Camas");
        modelo.addColumn("Precio $ por dia");
        jtHabitaciones.setModel(modelo);
        
    }
    
    private void borrarFilas(){
        
        for(int filas = jtHabitaciones.getRowCount()-1; filas >= 0 ; filas--){
            modelo.removeRow(filas);
        }
        
    }
    
class FondoPanel extends JPanel{
    private Image imagen;
    @Override
    public void paint(Graphics g){
        imagen=new ImageIcon(getClass().getResource("/Imagenes/lobby.jpg")).getImage();
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
 }
}
}
