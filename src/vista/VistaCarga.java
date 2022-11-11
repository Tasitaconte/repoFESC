package vista;

import javax.swing.JComboBox;

public class VistaCarga extends javax.swing.JFrame {

    public VistaCarga() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCarga = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pruebaProgramas = new javax.swing.JComboBox<>();
        pruebaSeleccion1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCarga.setText("jButton1");
        btCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargaActionPerformed(evt);
            }
        });
        getContentPane().add(btCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        jLabel1.setText("CARGAR ARCHIVO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pruebaProgramas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(pruebaProgramas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        pruebaSeleccion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(pruebaSeleccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

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
        return pruebaProgramas;
    }

    public void setPruebaSeleccion(JComboBox<String> pruebaSeleccion) {
        this.pruebaProgramas = pruebaSeleccion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> pruebaProgramas;
    private javax.swing.JComboBox<String> pruebaSeleccion1;
    // End of variables declaration//GEN-END:variables
}
