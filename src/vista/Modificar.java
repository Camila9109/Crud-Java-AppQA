package vista;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Aplicacion;

public class Modificar extends javax.swing.JFrame {

    Aplicacion a;
    Registro r;

    public Modificar(Aplicacion a, Registro r) {

        initComponents();
        //this.setLocationRelativeTo(null);
        this.a = a;
        this.r = r;
        r.setVisible(false);
        jcNombreApp2.setSelectedItem(a.getNombreAplicacion());
        jcVersion2.setSelectedItem(a.getVersionAplicacion());
        jfNombrePrueba2.setText(a.getNombrePrueba());
        jfPruebaEj.setText(String.valueOf(a.getPruebaEjecutada()));
        jfPruebaExi.setText(String.valueOf(a.getPruebaExitosa()));
        jfPruebaFall.setText(String.valueOf(a.getPruebaFallida()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jcNombreApp = new javax.swing.JComboBox<>();
        J = new javax.swing.JLabel();
        jcVersion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jfNombrePrueba = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcNombreApp1 = new javax.swing.JComboBox<>();
        J1 = new javax.swing.JLabel();
        jcVersion1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jfNombrePrueba1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcNombreApp2 = new javax.swing.JComboBox<>();
        J2 = new javax.swing.JLabel();
        jcVersion2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jfNombrePrueba2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jfPruebaEj = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jfPruebaExi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jfPruebaFall = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jfPorcentajeCF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jfPorcentajeCE = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jLabel2.setText("NOMBRE APLICACION");

        jcNombreApp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aplicacion 1", "Aplicacion 2", "Aplicacion 3", "Aplicacion 4", " " }));
        jcNombreApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNombreAppActionPerformed(evt);
            }
        });

        J.setText("VERSION");

        jcVersion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V 1.0.0", "V 2.0.5", "V 4.0.7", "V 5.6.1" }));

        jLabel3.setText("NOMBRE PRUEBA");

        jLabel4.setText("NOMBRE APLICACION");

        jcNombreApp1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aplicacion 1", "Aplicacion 2", "Aplicacion 3", "Aplicacion 4", " " }));
        jcNombreApp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNombreApp1ActionPerformed(evt);
            }
        });

        J1.setText("VERSION");

        jcVersion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V 1.0.0", "V 2.0.5", "V 4.0.7", "V 5.6.1" }));

        jLabel5.setText("NOMBRE PRUEBA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MODIFICAR DATOS");

        jLabel6.setText("NOMBRE APLICACION");

        jcNombreApp2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre", "Aplicacion 1", "Aplicacion 2", "Aplicacion 3", " ", " " }));
        jcNombreApp2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcNombreApp2ItemStateChanged(evt);
            }
        });
        jcNombreApp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNombreApp2ActionPerformed(evt);
            }
        });

        J2.setText("VERSION");

        jcVersion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V1.0.0", "V2.0.1", "V3.0.1", "V4.0.1" }));

        jLabel7.setText("NOMBRE PRUEBA");

        jLabel8.setText("Pruebas ejecutadas");

        jLabel9.setText("Pruebas exitosas");

        jLabel10.setText("Pruebas fallidas");

        jLabel11.setText("% casos fallidos");

        jfPorcentajeCF.setEnabled(false);

        jLabel12.setText("% casos exitosos");

        jfPorcentajeCE.setEnabled(false);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jfNombrePrueba2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(J2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcVersion2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGuardar)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcNombreApp2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnCancelar)
                                        .addGap(34, 34, 34)))))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jfPruebaExi, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfPruebaEj, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfPruebaFall, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfPorcentajeCF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfPorcentajeCE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcNombreApp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(J2)
                            .addComponent(jcVersion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jfNombrePrueba2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jfPruebaEj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jfPruebaExi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jfPruebaFall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jfPorcentajeCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jfPorcentajeCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String[] getVersiones(String nombreAplicacion) {
        String[] versiones = new String[6];
        if (nombreAplicacion.equalsIgnoreCase("Aplicacion1")) {

            versiones[0] = "V1.0.0";
            versiones[1] = "V1.0.1";
            versiones[2] = "V2.0.0";
            versiones[3] = "V2.0.1";
            versiones[4] = "V3.0.0";
            versiones[5] = "V3.0.1";
        }
        if (nombreAplicacion.equalsIgnoreCase("Aplicacion2")) {

            versiones[0] = "V1.0.2";
            versiones[1] = "V1.0.3";
            versiones[2] = "V1.0.4";
            versiones[3] = "V1.0.5";
            versiones[4] = "V1.0.6";
            versiones[5] = "V1.0.7";
        }
        if (nombreAplicacion.equalsIgnoreCase("Aplicacion3")) {

            versiones[0] = "V1.0";
            versiones[1] = "V2.0";
            versiones[2] = "V3.0";
            versiones[3] = "V4.0";
            versiones[4] = "";
            versiones[5] = "";
        }
        return versiones;
    }
    private void jcNombreAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNombreAppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcNombreAppActionPerformed

    private void jcNombreApp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNombreApp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcNombreApp1ActionPerformed

    private void jcNombreApp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNombreApp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcNombreApp2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (!jfNombrePrueba2.getText().equals("")) {
            a.setNombreAplicacion((String) jcNombreApp2.getSelectedItem());
            a.setVersionAplicacion((String) jcVersion2.getSelectedItem());
            a.setNombrePrueba(jfNombrePrueba2.getText());
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

            this.dispose();
            r.setVisible(true);
            r.mostrarDatos();

        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        this.r.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jcNombreApp2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcNombreApp2ItemStateChanged
      
    }//GEN-LAST:event_jcNombreApp2ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel J;
    private javax.swing.JLabel J1;
    private javax.swing.JLabel J2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcNombreApp;
    private javax.swing.JComboBox<String> jcNombreApp1;
    private javax.swing.JComboBox<String> jcNombreApp2;
    private javax.swing.JComboBox<String> jcVersion;
    private javax.swing.JComboBox<String> jcVersion1;
    private javax.swing.JComboBox<String> jcVersion2;
    private javax.swing.JTextField jfNombrePrueba;
    private javax.swing.JTextField jfNombrePrueba1;
    private javax.swing.JTextField jfNombrePrueba2;
    private javax.swing.JTextField jfPorcentajeCE;
    private javax.swing.JTextField jfPorcentajeCF;
    private javax.swing.JTextField jfPruebaEj;
    private javax.swing.JTextField jfPruebaExi;
    private javax.swing.JTextField jfPruebaFall;
    // End of variables declaration//GEN-END:variables
}
