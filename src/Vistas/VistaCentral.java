package Vistas;



public class VistaCentral extends javax.swing.JPanel {

  
    
    public VistaCentral() {
        
      
        initComponents();
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCentral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        PanelCentral.setBackground(new java.awt.Color(0, 153, 255));
        PanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("DialogInput", 2, 18)); // NOI18N
        jLabel1.setText("Prototipo programa v 0.5");

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        jLabel2.setText("Ingenieria de Software");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Seleccione la opcion que busque en el Menu Superior");
        jLabel3.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Para Guardar Cambios Exportar Archivo");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCentralLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCentralLayout.createSequentialGroup()
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCentralLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(17, 17, 17))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(125, 125, 125))))
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(118, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
