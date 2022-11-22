package vista;

import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VistaRegistro extends javax.swing.JFrame {

    public VistaRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("REGISTRO");
        setIcon();
    }
    
    public void setIcon(){
        Bback.setIcon(new ImageIcon(getClass().getResource("/resources/arrow-left-solid.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Bback = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Bregister = new javax.swing.JButton();
        Rname = new javax.swing.JTextField();
        RApellido = new javax.swing.JTextField();
        Remail = new javax.swing.JTextField();
        Tpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        Bback.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Bback.setBorder(null);
        Bback.setContentAreaFilled(false);
        Bback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackActionPerformed(evt);
            }
        });
        jPanel1.add(Bback, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Bregister.setBackground(new java.awt.Color(0, 0, 0));
        Bregister.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Bregister.setForeground(new java.awt.Color(255, 255, 255));
        Bregister.setText("REGISTRAR");
        Bregister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Bregister.setBorderPainted(false);
        Bregister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bregister.setFocusPainted(false);
        Bregister.setFocusable(false);
        Bregister.setOpaque(false);
        Bregister.setRequestFocusEnabled(false);
        Bregister.setRolloverEnabled(false);
        Bregister.setVerifyInputWhenFocusTarget(false);
        Bregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BregisterActionPerformed(evt);
            }
        });

        Rname.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Rname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        RApellido.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        RApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        Remail.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Remail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        Tpass.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Tpass.setToolTipText("");
        Tpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("INGRESE NOMBRE");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("INGRESE APELLIDO");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("INGRESE CORREO");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("INGRESE CONTRASEÑA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Tpass, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Remail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rname, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(Bregister, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(Rname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(RApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Remail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bregister, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 320, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
