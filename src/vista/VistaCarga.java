package vista;

import javax.swing.JComboBox;

public class VistaCarga extends javax.swing.JFrame {

    public VistaCarga() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        pruebaPrograma = new javax.swing.JComboBox<>();
        pruebaSeleccion = new javax.swing.JComboBox<>();
        btCarga = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 35));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.add(jSeparator1);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("CARGAR ARCHIVO");
        jPanel1.add(jLabel1);

        pruebaPrograma.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pruebaPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(pruebaPrograma);

        pruebaSeleccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pruebaSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(pruebaSeleccion);

        btCarga.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btCarga.setText("CARGAR CSV");
        btCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargaActionPerformed(evt);
            }
        });
        jPanel1.add(btCarga);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 770, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargaActionPerformed
        controladores.ControladorIntermedio.btnCargar();
    }//GEN-LAST:event_btCargaActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCarga().setVisible(true);
            }
        });
    }

    public JComboBox<String> getPruebaSeleccion() {
        return pruebaSeleccion;
    }

    public void setPruebaSeleccion(JComboBox<String> pruebaSeleccion) {
        this.pruebaSeleccion = pruebaSeleccion;
    }

    public JComboBox<String> getPruebaPrograma() {
        return pruebaPrograma;
    }

    public void setPruebaPrograma(JComboBox<String> pruebaPrograma) {
        this.pruebaPrograma = pruebaPrograma;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> pruebaPrograma;
    private javax.swing.JComboBox<String> pruebaSeleccion;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
