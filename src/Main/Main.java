package Main;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
        this.setSize(750, 550);
        
        
    }

    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane = new javax.swing.JDesktopPane(

            getClass().getResource("/img/imgFondo").toString()

        );
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuAdministracion = new javax.swing.JMenu();
        jGestionProductos = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jConsultaNombre = new javax.swing.JMenuItem();
        jConsultaPrecio = new javax.swing.JMenuItem();
        jConsultaRubro = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        JMenuAdministracion.setText("Administracion");

        jGestionProductos.setText("Gestion De Productos");
        jGestionProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionProductosActionPerformed(evt);
            }
        });
        JMenuAdministracion.add(jGestionProductos);

        jMenuBar1.add(JMenuAdministracion);

        jMenuConsultas.setText("Consultas");

        jConsultaNombre.setText("Consulta Por Nombre");
        jConsultaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaNombreActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jConsultaNombre);

        jConsultaPrecio.setText("Consulta Por Precio");
        jConsultaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaPrecioActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jConsultaPrecio);

        jConsultaRubro.setText("Consulta Por Rubro");
        jConsultaRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaRubroActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jConsultaRubro);

        jMenuBar1.add(jMenuConsultas);

        jMenuSalir.setText("Salir");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGestionProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGestionProductosActionPerformed

    private void jConsultaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultaNombreActionPerformed

    private void jConsultaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultaPrecioActionPerformed

    private void jConsultaRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaRubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultaRubroActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSalirMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() ) {
                if( "Nimbus".equals(info.getName()) ) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch( ClassNotFoundException ex ) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch( InstantiationException ex ) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch( IllegalAccessException ex ) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch( javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                JOptionPane.showMessageDialog(null, "El pepee");
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuAdministracion;
    private javax.swing.JMenuItem jConsultaNombre;
    private javax.swing.JMenuItem jConsultaPrecio;
    private javax.swing.JMenuItem jConsultaRubro;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenuItem jGestionProductos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables


    
}
