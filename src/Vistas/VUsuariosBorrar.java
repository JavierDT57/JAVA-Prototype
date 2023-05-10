package Vistas;

import Clases.*;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JCheckBox;

public class VUsuariosBorrar extends javax.swing.JPanel {
    
     public List<Usuario> usuarios = new ArrayList<>();
     private List<HashMap<Usuario, JCheckBox>> usuarioCheck = new ArrayList<HashMap<Usuario, JCheckBox>> ();


 
    public VUsuariosBorrar(List<Usuario> usuarios) {
        this.usuarios= usuarios;
        initComponents();
        GeneraLista();
    }
    
     private void GeneraLista(){
        GridLayout grid = new GridLayout(100,1);

        this.PanelCentral.setLayout(grid);
        int i = 0;
        for(Usuario u : this.usuarios){
            HashMap<Usuario, JCheckBox> aux = new HashMap<>();
            i++;
            int auxi=i;
            aux.put(u, new JCheckBox("User:"+auxi));
            usuarioCheck.add(aux);
        }


        for(HashMap<Usuario, JCheckBox> u : this.usuarioCheck){
            ArrayList<JCheckBox> obj = new ArrayList<>(u.values());
            this.PanelCentral.add(obj.get(0));
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCentral = new javax.swing.JPanel();
        jButtonBorrar = new javax.swing.JButton();

        PanelCentral.setBackground(new java.awt.Color(0, 153, 255));
        PanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonBorrar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCentralLayout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(jButtonBorrar)
                .addGap(209, 209, 209))
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCentralLayout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(jButtonBorrar)
                .addGap(27, 27, 27))
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

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        int i = 0;
        
        
        try{
           for(HashMap<Usuario, JCheckBox> u : this.usuarioCheck){
            JCheckBox actualBox = new ArrayList<>(u.values()).get(0);
            if(actualBox.isSelected()){
                this.usuarios.remove(i);
            }
            i++;
        }
        }
        catch(Exception e){
            
        }

       
    }//GEN-LAST:event_jButtonBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JButton jButtonBorrar;
    // End of variables declaration//GEN-END:variables
}
