package vista;

import javax.swing.JTextField;

public class VistaCarga extends javax.swing.JFrame {

    public VistaCarga() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cargar = new javax.swing.JMenuBar();
        btnCargar = new javax.swing.JMenu();
        Carga = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCargar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargar.setText("Cargar");
        btnCargar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        Carga.setText("seleccionar");
        Carga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaActionPerformed(evt);
            }
        });
        btnCargar.add(Carga);

        Cargar.add(btnCargar);

        setJMenuBar(Cargar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaActionPerformed
        controladores.ControladorIntermedio.btnCargar();
    }//GEN-LAST:event_CargaActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Carga;
    private javax.swing.JMenuBar Cargar;
    private javax.swing.JMenu btnCargar;
    // End of variables declaration//GEN-END:variables
}
