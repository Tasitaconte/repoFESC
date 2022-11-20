package vista;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VistaRegistro extends javax.swing.JFrame {

    public VistaRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("REGISTRO");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tpass = new javax.swing.JPasswordField();
        Rname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Remail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        RApellido = new javax.swing.JTextField();
        Bregister = new javax.swing.JButton();
        Bback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(188, 238, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        Tpass.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Tpass.setToolTipText("");
        Tpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(Tpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 370, -1));

        Rname.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Rname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(Rname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 370, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("INGRESE APELLIDO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("INGRESE NOMBRE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("INGRESE CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        Remail.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Remail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(Remail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 370, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("INGRESE CORREO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        RApellido.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        RApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(RApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 370, -1));

        Bregister.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bregister.setText("REGISTRAR");
        Bregister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Bregister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BregisterActionPerformed(evt);
            }
        });
        jPanel1.add(Bregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 200, 50));

        Bback.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Bback.setText("VOLVER");
        Bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackActionPerformed(evt);
            }
        });
        jPanel1.add(Bback, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRegistro().setVisible(true);
            }
        });
    }
    private void BbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbackActionPerformed
        controladores.ControladorRegistro.btn_back();
    }//GEN-LAST:event_BbackActionPerformed

    private void BregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BregisterActionPerformed
        controladores.ControladorRegistro.btn_registrar();
    }//GEN-LAST:event_BregisterActionPerformed

    public JTextField getRApellido() {
        return RApellido;
    }

    public JTextField getRemail() {
        return Remail;
    }

    public JTextField getRname() {
        return Rname;
    }

    public JPasswordField getTpass() {
        return Tpass;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bback;
    private javax.swing.JButton Bregister;
    private javax.swing.JTextField RApellido;
    private javax.swing.JTextField Remail;
    private javax.swing.JTextField Rname;
    private javax.swing.JPasswordField Tpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
