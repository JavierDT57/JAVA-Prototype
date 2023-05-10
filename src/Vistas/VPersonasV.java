package Vistas;

import Clases.*;

public class VPersonasV extends javax.swing.JPanel {
    
    private Persona persona;

   
    public VPersonasV(Persona persona) {
        
        this.persona = persona;
        initComponents();
        
        this.jTextAutor.setText(this.persona.Nombre);
        this.jTextEdicion.setText(this.persona.Biografia);
        this.jTextEditorial.setText(this.persona.Usuario);
        this.jCheckEstatus.setSelected(persona.Estatus);
        this.jTextEditorial1.setText(this.persona.Fecha);
        this.revalidate();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCentral = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextAutor = new javax.swing.JTextField();
        jTextEdicion = new javax.swing.JTextField();
        jTextEditorial = new javax.swing.JTextField();
        jCheckEstatus = new javax.swing.JCheckBox();
        jButtonActualizar = new javax.swing.JButton();
        Notificacion = new javax.swing.JLabel();
        jTextEditorial1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        PanelCentral.setBackground(new java.awt.Color(0, 153, 255));
        PanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Persona:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Biografia:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel5.setText("Estatus:");

        jTextAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAutorActionPerformed(evt);
            }
        });

        jTextEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEdicionActionPerformed(evt);
            }
        });

        jTextEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEditorialActionPerformed(evt);
            }
        });

        jCheckEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckEstatusActionPerformed(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        Notificacion.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jTextEditorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEditorial1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel6.setText("Fecha:");

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addComponent(jButtonActualizar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Notificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckEstatus))
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEditorial1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextEditorial1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jCheckEstatus))
                .addGap(14, 14, 14)
                .addComponent(jButtonActualizar)
                .addGap(108, 108, 108)
                .addComponent(Notificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAutorActionPerformed

    private void jTextEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEdicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEdicionActionPerformed

    private void jTextEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEditorialActionPerformed

    private void jCheckEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckEstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckEstatusActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        try{
            this.persona.Nombre= this.jTextAutor.getText();
            this.persona.Biografia= this.jTextEdicion.getText();
            this.persona.Usuario= this.jTextEditorial.getText();
            this.persona.Estatus= this.jCheckEstatus.isSelected();
            this.persona.Fecha= this.jTextEditorial1.getText();
            
            this.Notificacion.setText("Los Datos de la Persona se han Actualizado");
            
        }
        catch(Exception e){
            this.Notificacion.setText("Error al Actualizar Datos");
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jTextEditorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEditorial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEditorial1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Notificacion;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JCheckBox jCheckEstatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextEdicion;
    private javax.swing.JTextField jTextEditorial;
    private javax.swing.JTextField jTextEditorial1;
    // End of variables declaration//GEN-END:variables
}
