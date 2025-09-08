package Views.Consultas;

import Controllers.Producto;
import Models.ProductosModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

public class ConsultaPrecio extends javax.swing.JInternalFrame{

    private DefaultTableModel modelo = new DefaultTableModel(
      new String[]{"Código", "Descripción", "Precio", "Categoria", "Stock"}, 0
    );

    private Timer debounceTimer;

    public ConsultaPrecio(){
        initComponents();
        this.setSize(500, 550);

        debounceTimer = new Timer(700, e -> buscarPorRangoPrecio());

        // ✅ Asignar modelo a la tabla
        jTable1.setModel(modelo);

        // Cargar todos al inicio
        actualizarTabla();

        // ✅ DocumentListener para búsqueda en tiempo real
        minInput.getDocument().addDocumentListener(new javax.swing.event.DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e){
                debounceTimer.restart();
            }

            @Override
            public void removeUpdate(DocumentEvent e){
                debounceTimer.restart();
            }

            @Override
            public void changedUpdate(DocumentEvent e){
                debounceTimer.restart();
            }
        });

        maxInput.getDocument().addDocumentListener(new javax.swing.event.DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e){
                debounceTimer.restart();
            }

            @Override
            public void removeUpdate(DocumentEvent e){
                debounceTimer.restart();
            }

            @Override
            public void changedUpdate(DocumentEvent e){
                debounceTimer.restart();
            }
        });
    }

    private void actualizarTabla(){
        modelo.setRowCount(0);
        for(Producto p : ProductosModel.getInstance().getProductos()){
            modelo.addRow(new Object[]{
                p.getCodigo(),
                p.getDescripcion(),
                p.getPrecio(),
                p.getCategoria(),
                p.getStock()
            });
        }
    }

    private void buscarPorRangoPrecio(){
        Double precioMin = parsearPrecio(minInput.getText());
        Double precioMax = parsearPrecio(maxInput.getText());

        if(precioMin != null && precioMax != null && precioMin > precioMax){
            JOptionPane.showMessageDialog(this, "El precio mínimo no puede ser mayor al máximo.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        List<Producto> resultados = ProductosModel.getInstance().buscarPorRangoPrecio(precioMin, precioMax);

        modelo.setRowCount(0);
        for(Producto p : resultados){
            modelo.addRow(new Object[]{
                p.getCodigo(),
                p.getDescripcion(),
                p.getPrecio(),
                p.getCategoria(),
                p.getStock()
            });
        }
    }

    private Double parsearPrecio(String texto){
        if(texto == null || texto.trim().isEmpty()){
            return null;
        }
        try{
            double valor = Double.parseDouble(texto.trim());
            return valor < 0 ? null : valor;
        } catch(NumberFormatException e){
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        minInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        maxInput = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(500, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Listado por precio:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Entre: $");

        minInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minInputActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("y");

        maxInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxInputActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minInput)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(maxInput)))
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(minInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minInputActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_minInputActionPerformed

    private void maxInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxInputActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_maxInputActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField maxInput;
    private javax.swing.JTextField minInput;
    // End of variables declaration//GEN-END:variables

}
