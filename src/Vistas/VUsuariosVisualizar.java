package Vistas;

import Clases.*;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class VUsuariosVisualizar extends javax.swing.JPanel {
    
    public List<Usuario> usuarios = new ArrayList<>();
    
    private CardLayout cardLayout = new CardLayout();
    

    public VUsuariosVisualizar(List<Usuario> usuarios) {
        this.usuarios = usuarios;
        
        
        
        initComponents();
        generadorBotones();
        
        this.PanelCentral.setLayout(this.cardLayout);
        this.PanelCentral.removeAll();
    }
    
  private void generadorBotones(){
      int i=1;
      
      
      GridLayout grid = new GridLayout(100,1);
      this.ContenedorUsuarios.setLayout(grid);
      
      for(Usuario usuario: this.usuarios){
            javax.swing.JButton nuevo = new javax.swing.JButton();
            nuevo.setText("User: "+ i++);
            nuevo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelCentral.removeAll();
                PanelCentral.add(new VUsuarioV(usuario),"");
                cardLayout.show(PanelCentral, "");
                PanelCentral.revalidate();
                }
            });
            
            this.ContenedorUsuarios.add(nuevo);
      }
      
  }

  
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCentral = new javax.swing.JPanel();
        ContenedorUsuarios = new javax.swing.JPanel();

        PanelCentral.setBackground(new java.awt.Color(0, 153, 255));
        PanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContenedorUsuariosLayout = new javax.swing.GroupLayout(ContenedorUsuarios);
        ContenedorUsuarios.setLayout(ContenedorUsuariosLayout);
        ContenedorUsuariosLayout.setHorizontalGroup(
            ContenedorUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ContenedorUsuariosLayout.setVerticalGroup(
            ContenedorUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ContenedorUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContenedorUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorUsuarios;
    private javax.swing.JPanel PanelCentral;
    // End of variables declaration//GEN-END:variables
}
