package Vistas;

import Clases.*;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;


public class ServicioBibliotecaGrafico extends javax.swing.JFrame {
    
    public List<Usuario> usuarios = new ArrayList<>();
    public List<Persona> personas = new ArrayList<>();

    
    private final String PATH_FILE_USUARIOS = "C:\\Users\\USER\\Documents\\NetBeansProjects\\ServicioBiblioteca\\usuariosGuardadas.bin";
    private final String PATH_FILE_PERSONAS = "C:\\Users\\USER\\Documents\\NetBeansProjects\\ServicioBiblioteca\\personasGuardadas.bin";
    
    private CardLayout cardLayout = new CardLayout();
    private VistaCentral vistaCentral;

    private VUsuariosVisualizar vUsuariosVisualizar;
    private VUsuariosRegistrar vUsuariosRegistrar;
    private VUsuariosBorrar vUsuariosBorrar;
    private VPersonasVisualizar vPersonasVisualizar;
    private VPersonaRegistrar vPersonaRegistrar;
    private VPersonaBorrar vPersonaBorrar;
    
    
         
    public ServicioBibliotecaGrafico(List<Usuario> usuarios, List<Persona> personas) {
        this.usuarios= usuarios;
        this.personas = personas;
        
    
        
        initComponents();
        
        this.vistaCentral = new VistaCentral();
        this.vUsuariosVisualizar = new VUsuariosVisualizar(this.usuarios);
        this.vUsuariosRegistrar = new VUsuariosRegistrar(this.usuarios);
        this.vUsuariosBorrar = new VUsuariosBorrar(this.usuarios);
        this.vPersonasVisualizar = new VPersonasVisualizar(this.personas);
        this.vPersonaRegistrar = new VPersonaRegistrar(this.personas);
        this.vPersonaBorrar = new VPersonaBorrar(this.personas);
        
        
        
        this.getContentPane().setLayout(this.cardLayout);
        this.getContentPane().removeAll();
        this.getContentPane().add(vistaCentral,"vistaCentral");
        this.revalidate();
        
        
    }
    
    private void guardarArchivos(){
         GeneradorArchivos genA = new GeneradorArchivos();
        if(genA.GuardarUsuarios(this.usuarios, PATH_FILE_USUARIOS)) {
            System.out.println("Se guardaron correctamente los Usuarios");
            
        } else {
            System.out.println("No se guardaron correctamente los Usuarios");
        }

        if(genA.GuardarPersonas(this.personas, PATH_FILE_PERSONAS)) {
            System.out.println("Se guardo correctamente las personas");
            
        } else {
            System.out.println("No se guardaron correctamente las personas");
        }
        

        
    }
    
    private void cargarArchivos(){
        GeneradorArchivos genA = new GeneradorArchivos();
        this.usuarios = genA.CargarUsuarios(PATH_FILE_USUARIOS);
        this.personas = genA.CargarPersonas(PATH_FILE_PERSONAS);
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        PanelCentral = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuUVisualizar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuURegistrar = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuUBorrar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuLVisualizar = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuLRegistrar = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuLBorrar = new javax.swing.JMenuItem();
        jMenuCargar = new javax.swing.JMenu();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuExportar = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCentral.setBackground(new java.awt.Color(0, 153, 255));
        PanelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelCentral.setAutoscrolls(true);

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        jMenu2.setText("Usuarios");

        jMenuUVisualizar.setText("Visualizar");
        jMenuUVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUVisualizarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuUVisualizar);
        jMenu2.add(jSeparator3);

        jMenuURegistrar.setText("Registrar");
        jMenuURegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuURegistrarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuURegistrar);
        jMenu2.add(jSeparator4);

        jMenuUBorrar.setText("Borrar");
        jMenuUBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUBorrarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuUBorrar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Personas");

        jMenuLVisualizar.setText("Visualizar");
        jMenuLVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLVisualizarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuLVisualizar);
        jMenu3.add(jSeparator5);

        jMenuLRegistrar.setText("Registrar");
        jMenuLRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLRegistrarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuLRegistrar);
        jMenu3.add(jSeparator6);

        jMenuLBorrar.setText("Borrar");
        jMenuLBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLBorrarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuLBorrar);

        jMenuBar1.add(jMenu3);

        jMenuCargar.setText("Archivos");
        jMenuCargar.add(jSeparator7);

        jMenuExportar.setText("Exportar");
        jMenuExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExportarActionPerformed(evt);
            }
        });
        jMenuCargar.add(jMenuExportar);

        jMenuBar1.add(jMenuCargar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLBorrarActionPerformed
     
        this.getContentPane().removeAll();
        this.getContentPane().add(vPersonaBorrar,"");
        this.revalidate();
    }//GEN-LAST:event_jMenuLBorrarActionPerformed

    private void jMenuUVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUVisualizarActionPerformed
        
        
        this.getContentPane().removeAll();
        this.getContentPane().add(vUsuariosVisualizar,"");
        this.revalidate();
    }//GEN-LAST:event_jMenuUVisualizarActionPerformed

    private void jMenuURegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuURegistrarActionPerformed
       
        
        this.getContentPane().removeAll();
        this.getContentPane().add(vUsuariosRegistrar,"");
        this.revalidate();
    }//GEN-LAST:event_jMenuURegistrarActionPerformed

    private void jMenuUBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUBorrarActionPerformed
       
        
        this.getContentPane().removeAll();
        this.getContentPane().add(vUsuariosBorrar,"");
        this.revalidate();
    }//GEN-LAST:event_jMenuUBorrarActionPerformed

    private void jMenuLVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLVisualizarActionPerformed
       
       
        this.getContentPane().removeAll();
        this.getContentPane().add(vPersonasVisualizar,"");
        this.revalidate();
    }//GEN-LAST:event_jMenuLVisualizarActionPerformed

    private void jMenuLRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLRegistrarActionPerformed
      
       ;
        this.getContentPane().removeAll();
        this.getContentPane().add(vPersonaRegistrar,"");
        this.revalidate();
    }//GEN-LAST:event_jMenuLRegistrarActionPerformed

    private void jMenuExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExportarActionPerformed
        guardarArchivos();
    }//GEN-LAST:event_jMenuExportarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuCargar;
    private javax.swing.JMenuItem jMenuExportar;
    private javax.swing.JMenuItem jMenuLBorrar;
    private javax.swing.JMenuItem jMenuLRegistrar;
    private javax.swing.JMenuItem jMenuLVisualizar;
    private javax.swing.JMenuItem jMenuUBorrar;
    private javax.swing.JMenuItem jMenuURegistrar;
    private javax.swing.JMenuItem jMenuUVisualizar;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
