package Views.Consultas;

import Controllers.Producto;
import Models.ProductosModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultaRubro extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public ConsultaRubro() {
        initComponents();
        this.setSize(600, 450);
        jTable.setModel(modelo);
        armarCabecera();
        cargarCombo() ;
        
        
        jComboRubro.addActionListener(e -> {
            String rubroSeleccionado = (String) jComboRubro.getSelectedItem();
            cargarProductosPorRubro(rubroSeleccionado);
        });
        
        // ESTE SELECCIONA EL PRIMERO DEL COMBO BOX
         if (jComboRubro.getItemCount() > 1) { 
            jComboRubro.setSelectedIndex(1);
            cargarProductosPorRubro((String) jComboRubro.getSelectedItem());
        }
         // ESTE SELECCIONA EL PRIMERO DEL COMBO BOX
        
    }
    private void cargarCombo() {
        jComboRubro.removeAllItems();
        jComboRubro.addItem(null);
        java.util.Set<String> categorias = new java.util.HashSet<>();
        for (Producto p : ProductosModel.getInstance().getProductos()) {
            categorias.add(p.getCategoria());
        }
        for (String cat : categorias) {
            jComboRubro.addItem(cat);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Listado por Rubro:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Rubro :");

        jComboRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Categoria.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2)
                        .addGap(55, 55, 55)
                        .addComponent(jComboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables


    private void armarCabecera() {
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        modelo.addColumn("Stock");
    }
    
    private void cargarProductosPorRubro(String rubro) {
        
        modelo.setRowCount(0);
        if (rubro == null || rubro.trim().isEmpty()) return;

        for (Producto p : ProductosModel.getInstance().getProductos()) {
            if (p.getCategoria().equalsIgnoreCase(rubro)) {
                modelo.addRow(new Object[]{
                    p.getCodigo(),
                    p.getDescripcion(),
                    p.getPrecio(),
                    p.getCategoria(),
                    p.getStock()
                });
            }
        }
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this,
                "No se encontraron productos en la categoría: " + rubro,
                "Sin resultados",
                JOptionPane.INFORMATION_MESSAGE);
        }
}
    
    
/*
             /\_/\           ___
            = o_o =_______    \ \
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
 */

}
