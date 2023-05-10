package Vistas;

import Clases.*;
import java.util.ArrayList;
import java.util.List;

public class VPersonaRegistrar extends javax.swing.JPanel {

 public List<Persona> personas = new ArrayList<>();
 
 private final String PATH_FILE_PERSONAS = "C:\\Users\\USER\\Documents\\NetBeansProjects\\ServicioBiblioteca\\personasGuardados.bin";
 
    public VPersonaRegistrar(List<Persona> personas) {
        this.personas= personas;
        initComponents();
    }
    
    
  private void guardarArchivos(){
         GeneradorArchivos genA = new GeneradorArchivos();
        if(genA.GuardarPersonas(this.personas, PATH_FILE_PERSONAS)) {
            this.Notificacion.setText("Las Personas se ha registrado con Exito");
            
        } else {
            this.Notificacion.setText("Error al Registrar Personas");
        }


        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCentral = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextEditorial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextAutor = new javax.swing.JTextField();
        jTextEdicion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Notificacion = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextEditorial1 = new javax.swing.JTextField();

        PanelCentral.setBackground(new java.awt.Color(0, 153, 255));
        PanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Biografia:");

        jTextEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEditorialActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setText("Usuario:");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        Notificacion.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        jButtonRegistrar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel5.setText("Fecha:");

        jTextEditorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEditorial1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCentralLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButtonRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Notificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEditorial1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextEditorial1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Notificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonRegistrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void jTextEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEditorialActionPerformed

    private void jTextAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAutorActionPerformed

    private void jTextEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEdicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEdicionActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        try{
          
            
            Persona nuevaPersonas = new Persona(this.jTextEditorial.getText(),this.jTextAutor.getText(),this.jTextEdicion.getText(),true,this.jTextEditorial1.getText());
            this.personas.add(nuevaPersonas);
            guardarArchivos();
            
        }
        catch(Exception e){
            this.Notificacion.setText("Error al Registrar Personas");
            
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTextEditorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEditorial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEditorial1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Notificacion;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextEdicion;
    private javax.swing.JTextField jTextEditorial;
    private javax.swing.JTextField jTextEditorial1;
    // End of variables declaration//GEN-END:variables
}
