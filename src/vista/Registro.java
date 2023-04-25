package vista;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Aplicacion;

public class Registro extends javax.swing.JFrame {

    ArrayList<Aplicacion> aplicaciones;
    DefaultTableModel modelo;

    public Registro() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);

        aplicaciones = new ArrayList();
        modelo = new DefaultTableModel();

        modelo.addColumn("APLICACION");
        modelo.addColumn("VERSION");
        modelo.addColumn("NOMBRE PRUEBA");
        modelo.addColumn("Pruebas Ejecutadas");
        modelo.addColumn("Pruebas Exitosas");
        modelo.addColumn("Pruebas Fallidas");
        modelo.addColumn("% Casos Exitosos");
        modelo.addColumn("% Casos Fallidos");

        mostrarDatos();
    }

    public void mostrarDatos() {
        modelo.setNumRows(aplicaciones.size());
        for (int i = 0; i < aplicaciones.size(); i++) {
            modelo.setValueAt(aplicaciones.get(i).getNombreAplicacion(), i, 0);
            modelo.setValueAt(aplicaciones.get(i).getVersionAplicacion(), i, 1);
            modelo.setValueAt(aplicaciones.get(i).getNombrePrueba(), i, 2);
            modelo.setValueAt(aplicaciones.get(i).getPruebaEjecutada(), i, 3);
            modelo.setValueAt(aplicaciones.get(i).getPruebaExitosa(), i, 4);
            modelo.setValueAt(aplicaciones.get(i).getPruebaFallida(), i, 5);
            modelo.setValueAt(aplicaciones.get(i).getPorcentajeCasoExito(), i, 6);
            modelo.setValueAt(aplicaciones.get(i).getPorcentajeCasoFallido(), i, 7);

        }
        tabla1.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        J = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcNombreApp = new javax.swing.JComboBox<>();
        jcVersion = new javax.swing.JComboBox<>();
        jfNombrePrueba = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jfPruebaEj = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jfPruebaExi = new javax.swing.JTextField();
        jfPruebaFall = new javax.swing.JTextField();
        jfPorcentajeCF = new javax.swing.JTextField();
        jfPorcentajeCE = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE APLICACION");

        J.setText("VERSION");

        jLabel3.setText("NOMBRE PRUEBA");

        jcNombreApp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre", "Aplicacion1", "Aplicacion2", "Aplicacion3" }));
        jcNombreApp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcNombreAppItemStateChanged(evt);
            }
        });
        jcNombreApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNombreAppActionPerformed(evt);
            }
        });

        jcVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcVersionActionPerformed(evt);
            }
        });

        jLabel5.setText("Pruebas ejecutadas");

        jLabel6.setText("Pruebas exitosas");

        jLabel7.setText("Pruebas fallidas");

        jLabel8.setText("% casos fallidos");

        jLabel9.setText("% casos exitosos");

        jfPorcentajeCF.setEnabled(false);

        jfPorcentajeCE.setEnabled(false);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("INGRESO MÉTRICAS PRUEBAS DE SOFTWARE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(J)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcNombreApp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfNombrePrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jfPruebaExi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfPruebaEj, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfPruebaFall, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfPorcentajeCF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfPorcentajeCE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jfPruebaEj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jfPruebaExi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnModificar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jfPruebaFall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jfPorcentajeCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcNombreApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J))
                                .addGap(18, 18, 18)
                                .addComponent(jfNombrePrueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jfPorcentajeCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String [] getVersiones(String nombreAplicacion){
        String [] versiones = new String[6];
        if(nombreAplicacion.equalsIgnoreCase("Aplicacion1")){
            
            versiones[0] = "V1.0.0";
            versiones[1] = "V1.0.1";
            versiones[2] = "V2.0.0";
            versiones[3] = "V2.0.1";
            versiones[4] = "V3.0.0";
            versiones[5] = "V3.0.1";
        }
        if(nombreAplicacion.equalsIgnoreCase("Aplicacion2")){
            
            versiones[0] = "V1.0.2";
            versiones[1] = "V1.0.3";
            versiones[2] = "V1.0.4";
            versiones[3] = "V1.0.5";
            versiones[4] = "V1.0.6";
            versiones[5] = "V1.0.7";
        }
        if(nombreAplicacion.equalsIgnoreCase("Aplicacion3")){
            
            versiones[0] = "V1.0";
            versiones[1] = "V2.0";
            versiones[2] = "V3.0";
            versiones[3] = "V4.0";
            versiones[4] = "";
            versiones[5] = "";
        }
        return versiones;
    }
    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!jfNombrePrueba.getText().equals("")) {
            Aplicacion a = new Aplicacion();
            a.setNombreAplicacion((String) jcNombreApp.getSelectedItem());
            a.setVersionAplicacion((String) jcVersion.getSelectedItem());
            a.setNombrePrueba(jfNombrePrueba.getText());
            a.setPruebaEjecutada(Integer.parseInt(jfPruebaEj.getText()));
            a.setPruebaExitosa(Integer.parseInt(jfPruebaExi.getText()));
            a.setPruebaFallida(Integer.parseInt(jfPruebaFall.getText()));

            int pruebaEj = Integer.parseInt(jfPruebaEj.getText());
            int pruebaExit = Integer.parseInt(jfPruebaExi.getText());
            int pruebaFall = Integer.parseInt(jfPruebaFall.getText());

            if (pruebaEj > 0 && pruebaExit > 0 && pruebaFall > 0) {

                int porcentajeCasoExito = (pruebaExit * 100) / pruebaEj;
                int porcentajeCasoFallido = (pruebaFall * 100) / pruebaEj;

                jfPorcentajeCE.setText(String.valueOf(porcentajeCasoExito));
                jfPorcentajeCF.setText(String.valueOf(porcentajeCasoFallido));

            } else {
                JOptionPane.showMessageDialog(null, "FALTAN PRUEBAS POR INGRESAR");

            }
            a.setPorcentajeCasoExito(Integer.parseInt(jfPorcentajeCE.getText()));
            a.setPorcentajeCasoFallido(Integer.parseInt(jfPorcentajeCF.getText()));

            aplicaciones.add(a);
            jcNombreApp.setSelectedItem("");
            jcVersion.setSelectedItem("");
            jfNombrePrueba.setText("");
            jfPruebaEj.setText("");
            jfPruebaExi.setText("");
            jfPruebaFall.setText("");
            jfPorcentajeCE.setText("");
            jfPorcentajeCF.setText("");

            mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESAR EL NOMBRE DE LA PRUEBA");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if (tabla1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL REGISTRO A MODIFICAR");
        } else {
            Modificar m = new Modificar (aplicaciones.get(tabla1.getSelectedRow()), this);
            m.setVisible(true);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (tabla1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONE EL REGISTRO A ELIMINAR");
        } else {
            aplicaciones.remove(tabla1.getSelectedRow());
            mostrarDatos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jcNombreAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNombreAppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcNombreAppActionPerformed

    private void jcVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcVersionActionPerformed
        
    }//GEN-LAST:event_jcVersionActionPerformed

    private void jcNombreAppItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcNombreAppItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            
            if(this.jcNombreApp.getSelectedIndex()> 0){
                this.jcVersion.setModel(new DefaultComboBoxModel(this.getVersiones(this.jcNombreApp.getSelectedItem().toString())));
            }       
    }
    }//GEN-LAST:event_jcNombreAppItemStateChanged

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel J;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcNombreApp;
    private javax.swing.JComboBox<String> jcVersion;
    private javax.swing.JTextField jfNombrePrueba;
    private javax.swing.JTextField jfPorcentajeCE;
    private javax.swing.JTextField jfPorcentajeCF;
    private javax.swing.JTextField jfPruebaEj;
    private javax.swing.JTextField jfPruebaExi;
    private javax.swing.JTextField jfPruebaFall;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
