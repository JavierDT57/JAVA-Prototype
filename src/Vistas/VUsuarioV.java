package Vistas;

import Clases.*;

public class VUsuarioV extends javax.swing.JPanel {
    
  
    private Usuario usuario;

  
    public VUsuarioV(Usuario usuario) {
        this.usuario = usuario;
        
        
        initComponents();
        
       this.jTextIDUsuario.setText(String.valueOf(this.usuario.Matricula));
       this.jTextNombre.setText(this.usuario.Usuario);
       this.jTextDireccion.setText(this.usuario.Correo);
       this.jCheckEstudiante.setSelected(usuario.Moderador);
       this.jCheckEstudiante1.setSelected(usuario.Espectador);
       this.revalidate();
    }

  
    @SuppressWarnings("unchecked")
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Notificacion = new javax.swing.JLabel();
        PanelCentral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();
        jTextIDUsuario = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jCheckEstudiante = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCheckEstudiante1 = new javax.swing.JCheckBox();

        Notificacion.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        PanelCentral.setBackground(new java.awt.Color(0, 153, 255));
        PanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelCentral.setPreferredSize(new java.awt.Dimension(394, 377));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setText("Matricula:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Correo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setText("Moderador:");

        jButtonActualizar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jTextIDUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDUsuarioActionPerformed(evt);
            }
        });

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jCheckEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckEstudianteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel5.setText("Espectador:");

        jCheckEstudiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckEstudiante1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextIDUsuario)
                            .addComponent(jTextDireccion)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonActualizar)
                            .addComponent(jCheckEstudiante)
                            .addComponent(jCheckEstudiante1))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jCheckEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonActualizar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextIDUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDUsuarioActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jCheckEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckEstudianteActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        
         
        try{
            this.usuario.Matricula= Integer.parseInt(this.jTextIDUsuario.getText());
            this.usuario.Usuario = this.jTextNombre.getText();
            this.usuario.Correo= this.jTextDireccion.getText();
            this.usuario.Moderador= this.jCheckEstudiante.isSelected(); 
            this.usuario.Espectador= this.jCheckEstudiante1.isSelected();
            this.Notificacion.setText("Los Datos del Usuario se han Actualizado");
        }
        catch(Exception e){
            this.Notificacion.setText("Error al Actualizar Usuario");
             
        }
        
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jCheckEstudiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckEstudiante1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckEstudiante1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Notificacion;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JCheckBox jCheckEstudiante;
    private javax.swing.JCheckBox jCheckEstudiante1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextIDUsuario;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
