package Vistas;

import Clases.*;
import java.util.ArrayList;
import java.util.List;


public class VUsuariosRegistrar extends javax.swing.JPanel {
    
    public List<Usuario> usuarios = new ArrayList<>();
    
    private final String PATH_FILE_USUARIOS = "C:\\Users\\USER\\Documents\\NetBeansProjects\\ServicioBiblioteca\\usuariosGuardadas.bin";
    
    public VUsuariosRegistrar(List<Usuario> usuarios) {
        this.usuarios = usuarios;
        
        
        initComponents();
        
    }
    

  private void guardarArchivos(){
         GeneradorArchivos genA = new GeneradorArchivos();
        if(genA.GuardarUsuarios(this.usuarios, PATH_FILE_USUARIOS)) {
            this.Notificacion.setText("El Usuario se ha registrado con Exito");
            
        } else {
            this.Notificacion.setText("Error al Registrar Usuario");
        }


        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCentral = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jTextNombre = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jCheckEstudiante = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Notificacion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckEstudiante1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jTextDireccion1 = new javax.swing.JTextField();

        PanelCentral.setBackground(new java.awt.Color(0, 153, 255));
        PanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setText("Moderador");

        jButtonRegistrar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Correo");

        Notificacion.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel5.setText("Espectador");

        jCheckEstudiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckEstudiante1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel6.setText("Matricula");

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jButtonRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Notificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(22, 22, 22))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)))
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckEstudiante)
                    .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextDireccion)
                        .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextDireccion1))
                    .addComponent(jCheckEstudiante1))
                .addGap(109, 109, 109))
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jCheckEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Notificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrar))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        try{
           
            
            Usuario nuevoUsuario = new Usuario(Integer.parseInt(this.jTextDireccion1.getText()),this.jTextNombre.getText(),this.jTextDireccion.getText(),this.jCheckEstudiante.isSelected(),this.jCheckEstudiante1.isSelected());
            this.usuarios.add(nuevoUsuario);
            guardarArchivos();
            
            
        }
        catch(Exception e){
            this.Notificacion.setText("Error al Registrar Usuario");
        }
        
        

    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jCheckEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckEstudianteActionPerformed

    private void jCheckEstudiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckEstudiante1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckEstudiante1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Notificacion;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JCheckBox jCheckEstudiante;
    private javax.swing.JCheckBox jCheckEstudiante1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextDireccion1;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
