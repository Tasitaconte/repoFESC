package vista;

import env.datosPruebas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setDate();
        setPrincipal();
    }

    public void setDate() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        fecha.setText("Hoy es " + dia + " de " + datosPruebas.MESES[month - 1] + " de " + year);
    }

    public void setIcon() {
        iconHome.setIcon(new ImageIcon(getClass().getResource("/resources/home.png")));
        iconExit.setIcon(new ImageIcon(getClass().getResource("/resources/exit.png")));
        iconTareas1.setIcon(new ImageIcon(getClass().getResource("/resources/lista-de-tareas (1).png")));
        iconTareas.setIcon(new ImageIcon(getClass().getResource("/resources/portapapeles.png")));
    }

    public void setPrincipal() {
        setColor(btn_prin);
        resetColor(btn_tareas);
        resetColor(btn_logout);
        resetColor(btn_logout);
        /*   Principal p1 = new Principal();
        p1.setSize(530, 470);
        p1.setLocation(0, 0);
        content1.removeAll();
        content1.add(p1, BorderLayout.CENTER);
        content1.revalidate();
        content1.repaint();*/
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        NameUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btn_prin = new javax.swing.JPanel();
        iconHome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JPanel();
        iconExit = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_tareas = new javax.swing.JPanel();
        iconTareas = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        app_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_maketareas = new javax.swing.JPanel();
        iconTareas1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Header1 = new javax.swing.JPanel();
        fecha1 = new javax.swing.JLabel();
        NameUser1 = new javax.swing.JLabel();
        content1 = new javax.swing.JPanel();

        Header.setBackground(new java.awt.Color(25, 118, 210));

        fecha.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Hoy es Sábado 28 de Abril de 2018");

        NameUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NameUser.setForeground(new java.awt.Color(255, 255, 255));
        NameUser.setText("YULIANA  ESTEFANIA CASTELLANO ANAYA");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NameUser)
                    .addComponent(fecha))
                .addGap(65, 65, 65))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameUser)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(13, 71, 161));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_prin.setBackground(new java.awt.Color(21, 101, 192));
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_prin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_prinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_prinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_prinMousePressed(evt);
            }
        });
        btn_prin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_prin.add(iconHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HOME");
        btn_prin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_prin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 50));

        btn_logout.setBackground(new java.awt.Color(18, 90, 173));
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
        });
        btn_logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_logout.add(iconExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SALIR");
        btn_logout.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        btn_tareas.setBackground(new java.awt.Color(18, 90, 173));
        btn_tareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tareas.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_tareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tareasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tareasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_tareasMousePressed(evt);
            }
        });
        btn_tareas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconTareas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_tareas.add(iconTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TAREAS");
        btn_tareas.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_tareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setText("CHEORL");
        Menu.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 20));

        btn_maketareas.setBackground(new java.awt.Color(18, 90, 173));
        btn_maketareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_maketareas.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_maketareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_maketareasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_maketareasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_maketareasMousePressed(evt);
            }
        });
        btn_maketareas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconTareas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_maketareas.add(iconTareas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CREAR TAREA");
        btn_maketareas.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_maketareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, -1));

        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Header1.setBackground(new java.awt.Color(25, 118, 210));

        fecha1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        fecha1.setForeground(new java.awt.Color(255, 255, 255));
        fecha1.setText("Hoy es Sábado 28 de Abril de 2018");

        NameUser1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NameUser1.setForeground(new java.awt.Color(255, 255, 255));
        NameUser1.setText("YULIANA  ESTEFANIA CASTELLANO ANAYA");

        javax.swing.GroupLayout Header1Layout = new javax.swing.GroupLayout(Header1);
        Header1.setLayout(Header1Layout);
        Header1Layout.setHorizontalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Header1Layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addGroup(Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NameUser1)
                    .addComponent(fecha1))
                .addGap(65, 65, 65))
        );
        Header1Layout.setVerticalGroup(
            Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(fecha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameUser1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(Header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 730, 130));

        content1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout content1Layout = new javax.swing.GroupLayout(content1);
        content1.setLayout(content1Layout);
        content1Layout.setHorizontalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        content1Layout.setVerticalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(content1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 730, 470));

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

    private void btn_prinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseEntered
        if (btn_prin.getBackground().getRGB() == -15574355)
            setColor(btn_prin);
    }//GEN-LAST:event_btn_prinMouseEntered

    private void btn_prinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseExited
        if (btn_tareas.getBackground().getRGB() != -15574355 || btn_logout.getBackground().getRGB() != -15574355)
            resetColor(btn_prin);
    }//GEN-LAST:event_btn_prinMouseExited

    private void btn_prinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMousePressed
        setColor(btn_prin);
        resetColor(btn_tareas);
        resetColor(btn_logout);
        resetColor(btn_maketareas);
        //    Abrir sección
        /*   Principal p1 = new Principal();
        p1.setSize(530, 470);
        p1.setLocation(0, 0);
        content1.removeAll();
        content1.add(p1, BorderLayout.CENTER);
        content1.revalidate();
        content1.repaint();*/
    }//GEN-LAST:event_btn_prinMousePressed

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        controladores.ControladorIntermedio.cerrar();

        setPrincipal();
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        if (btn_logout.getBackground().getRGB() == -15574355)
            setColor(btn_logout);
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        if (btn_tareas.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
                || btn_maketareas.getBackground().getRGB() != -15574355)
            resetColor(btn_logout);
    }//GEN-LAST:event_btn_logoutMouseExited

    private void btn_tareasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tareasMouseEntered
        if (btn_tareas.getBackground().getRGB() == -15574355)
            setColor(btn_tareas);
    }//GEN-LAST:event_btn_tareasMouseEntered

    private void btn_tareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tareasMouseExited
        if (btn_prin.getBackground().getRGB() != -15574355 || btn_logout.getBackground().getRGB() != -15574355
                || btn_maketareas.getBackground().getRGB() != -15574355)
            resetColor(btn_tareas);
    }//GEN-LAST:event_btn_tareasMouseExited

    private void btn_tareasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tareasMousePressed
        resetColor(btn_prin);
        setColor(btn_tareas);
        resetColor(btn_logout);
        resetColor(btn_maketareas);
        /*VerTareas p1 = new VerTareas();
        p1.setSize(530, 470);
        p1.setLocation(0, 0);
        content1.removeAll();
        content1.add(p1, BorderLayout.CENTER);
        content1.revalidate();
        content1.repaint();*/
    }//GEN-LAST:event_btn_tareasMousePressed

    private void btn_maketareasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maketareasMouseEntered
        if (btn_maketareas.getBackground().getRGB() == -15574355)
            setColor(btn_maketareas);
    }//GEN-LAST:event_btn_maketareasMouseEntered

    private void btn_maketareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maketareasMouseExited
        if (btn_prin.getBackground().getRGB() != -15574355 || btn_logout.getBackground().getRGB() != -15574355
                || btn_tareas.getBackground().getRGB() != -15574355)
            resetColor(btn_maketareas);
    }//GEN-LAST:event_btn_maketareasMouseExited

    private void btn_maketareasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maketareasMousePressed
        resetColor(btn_tareas);
        setColor(btn_maketareas);
        resetColor(btn_logout);
        resetColor(btn_prin);

        Carga p = new Carga();
        //[730, 470]
        p.setSize(730, 470);
        p.setLocation(0, 0);
        content1.removeAll();
        content1.add(p, BorderLayout.CENTER);
        content1.revalidate();
        content1.repaint();
    }//GEN-LAST:event_btn_maketareasMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Header1;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel NameUser;
    private javax.swing.JLabel NameUser1;
    private javax.swing.JLabel app_name;
    private javax.swing.JPanel btn_logout;
    private javax.swing.JPanel btn_maketareas;
    private javax.swing.JPanel btn_prin;
    private javax.swing.JPanel btn_tareas;
    public static javax.swing.JPanel content1;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fecha1;
    private javax.swing.JLabel iconExit;
    private javax.swing.JLabel iconHome;
    private javax.swing.JLabel iconTareas;
    private javax.swing.JLabel iconTareas1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
