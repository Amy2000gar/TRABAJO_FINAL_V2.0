package Vista;

import javax.swing.table.DefaultTableModel;
import Controlador.*;
import Entidad.*;
import java.util.Calendar;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class BusquedasPresupuestos extends javax.swing.JFrame {

    //Objeto para poder acceder a la tabla
    DefaultTableModel modeloResultados = new DefaultTableModel();
    
    private void inicializarTabla(){
        //ASIGNAMOS TITULOS A LAS TABLAS
        modeloResultados.addColumn("Nombre");
        modeloResultados.addColumn("Apellido");
        modeloResultados.addColumn("Nomb Servicio");
        modeloResultados.addColumn("Precio");
        modeloResultados.addColumn("Fecha");
        modeloResultados.addColumn("Descripcion");
        //ASIGNAMOS LOS NOMBRES DE LAS COLUMNAS A LA TABLA
        tblBusquedas.setModel(modeloResultados);       
        
        }
    
    private void llenarDatosTabla(){
        //LLAMA AL CONTROLADOR
        IControlador<Presupuesto> PresupuestoControlador = new PresupuestoImpl();
        //DEVUELVE LISTA DE ENTIDADES PRESUPUESTO
        List<Presupuesto> listaPresupuestos = PresupuestoControlador.consultarTodos(); 
        
        //COPIAMOS LOS OBJETOS A LA TABLA
        for(Presupuesto iterador : listaPresupuestos){
            Object fila[]= { iterador.getNombreC(),iterador.getApellidoC(),iterador.getNombreS(),
                             iterador.getPrecioS(),iterador.getFechaI(),iterador.getDescripcionS()};
            modeloResultados.addRow(fila);
            }
    }
  
    
    
    public BusquedasPresupuestos() {
        initComponents();
    }
    
    public void BuscarPorNombre(String nombreBuscado){
        //LLAMA AL CONTROLADOR
        IControlador<Presupuesto> PresupuestoControlador = new PresupuestoImpl();
        //DEVUELVE LISTA DE ENTIDADES PRESUPUESTO
        List<Presupuesto> listaPresupuestos = PresupuestoControlador.consultarTodos();
        for(Presupuesto iterador : listaPresupuestos){
            if(iterador.getNombreC().equals(nombreBuscado) == true)
            {
                Object fila[]= { iterador.getNombreC(),iterador.getApellidoC(),iterador.getNombreS(),
                             iterador.getPrecioS(),iterador.getFechaI(),iterador.getDescripcionS()};
            modeloResultados.addRow(fila);
            }
            else
                JOptionPane.showMessageDialog(null, "El nombre "+nombreBuscado+" no se encuentra registrado!");
        }
    }
    
    public void BuscarPorApellido(String apellidoBuscado){
        //LLAMA AL CONTROLADOR
        IControlador<Presupuesto> PresupuestoControlador = new PresupuestoImpl();
        //DEVUELVE LISTA DE ENTIDADES PRESUPUESTO
        List<Presupuesto> listaPresupuestos = PresupuestoControlador.consultarTodos();
        for(Presupuesto iterador : listaPresupuestos){
            if(iterador.getApellidoC().equals(apellidoBuscado) == true)
            {
                Object fila[]= { iterador.getNombreC(),iterador.getApellidoC(),iterador.getNombreS(),
                             iterador.getPrecioS(),iterador.getFechaI(),iterador.getDescripcionS()};
            modeloResultados.addRow(fila);
            }
            else
                JOptionPane.showMessageDialog(null, "El apellido "+apellidoBuscado+" no se encuentra registrado!");
        }
    }
    
    
    
    public void BuscarPorFecha(){
        int dia,mes,año;
        int dia2,mes2,año2;
        String fecha1, fecha2;
        
        dia= txtFechaI.getCalendar().get(Calendar.DAY_OF_MONTH);
        mes= txtFechaI.getCalendar().get(Calendar.MONTH)+1;
        año= txtFechaI.getCalendar().get(Calendar.YEAR);
        fecha1 = "0"+dia+"/"+"0"+mes+"/"+año;
        dia2= txtFechaF.getCalendar().get(Calendar.DAY_OF_MONTH);
        mes2= txtFechaF.getCalendar().get(Calendar.MONTH)+1;
        año2= txtFechaF.getCalendar().get(Calendar.YEAR);
        fecha2 = dia2+"/"+"0"+mes2+"/"+año2;
        
        //LLAMA AL CONTROLADOR
        IControlador<Presupuesto> PresupuestoControlador = new PresupuestoImpl();
        //DEVUELVE LISTA DE ENTIDADES PRESUPUESTO
        List<Presupuesto> listaPresupuestos = PresupuestoControlador.buscarFechas(fecha1, fecha2);
        for(Presupuesto iterador : listaPresupuestos){
            Object fila[]= { iterador.getNombreC(),iterador.getApellidoC(),iterador.getNombreS(),
                             iterador.getPrecioS(),iterador.getFechaI(),iterador.getDescripcionS()};
            modeloResultados.addRow(fila);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusquedas = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFechaI = new com.toedter.calendar.JDateChooser();
        txtFechaF = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSQUEDAS");

        tblBusquedas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tblBusquedas);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Inicio:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha Fin:");

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(26, 26, 26)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addComponent(txtFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.inicializarTabla();
        //GUARDAMOS LOS VALORES DE LOS CONTROLES
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String fecha = txtFechaI.getDateFormatString();
        double total=0;
        if(!txtNombre.getText().isEmpty())
            this.BuscarPorNombre(nombre);
        else if(!txtApellido.getText().isEmpty())
            this.BuscarPorApellido(apellido);
        else if(!txtFechaI.getDateFormatString().isEmpty())
            this.BuscarPorFecha();
        
        for (int i = 0; i < modeloResultados.getRowCount(); i++) {
            total+=(double)modeloResultados.getValueAt(i,3);
        }
        txtTotal.setText(""+total);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BusquedasPresupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedasPresupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedasPresupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedasPresupuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedasPresupuestos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBusquedas;
    private javax.swing.JTextField txtApellido;
    private com.toedter.calendar.JDateChooser txtFechaF;
    private com.toedter.calendar.JDateChooser txtFechaI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
