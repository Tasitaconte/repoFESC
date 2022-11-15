package vista;

import javax.swing.JComboBox;
import javax.swing.JTable;

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
        jPanel2 = new javax.swing.JPanel();
        FiltroPrueba = new javax.swing.JComboBox<>();
        FiltroPrograma = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btngetResultados = new javax.swing.JButton();
        FiltroPrograma1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 35));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("CARGAR ARCHIVO");

        pruebaPrograma.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pruebaPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        pruebaSeleccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pruebaSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btCarga.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btCarga.setText("CARGAR");
        btCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pruebaPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pruebaSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCarga)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(pruebaPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(pruebaSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btCarga))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "p1", "p2", "p3", "p4", "p5", "p6", "Ningles", "GRAFICA"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 770, 350));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FiltroPrueba.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        FiltroPrueba.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(FiltroPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        FiltroPrograma.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        FiltroPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(FiltroPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 204, 204)));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("FILTRAR");
        jPanel3.add(jLabel2);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        btngetResultados.setText("BUSCAR");
        btngetResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetResultadosActionPerformed(evt);
            }
        });
        jPanel2.add(btngetResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        FiltroPrograma1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        FiltroPrograma1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(FiltroPrograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 770, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCargaActionPerformed
       controladores.ControladorIntermedio.btnCargar();
    }//GEN-LAST:event_btCargaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controladores.ControladorIntermedio.btn_limpiarRows();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btngetResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetResultadosActionPerformed
        controladores.ControladorIntermedio.btn_buscar();
    }//GEN-LAST:event_btngetResultadosActionPerformed
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

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JComboBox<String> getFiltroPrograma() {
        return FiltroPrograma;
    }

    public void setFiltroPrograma(JComboBox<String> FiltroPrograma) {
        this.FiltroPrograma = FiltroPrograma;
    }

    public JComboBox<String> getFiltroPrueba() {
        return FiltroPrueba;
    }

    public void setFiltroPrueba(JComboBox<String> FiltroPrueba) {
        this.FiltroPrueba = FiltroPrueba;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FiltroPrograma;
    private javax.swing.JComboBox<String> FiltroPrograma1;
    private javax.swing.JComboBox<String> FiltroPrueba;
    private javax.swing.JButton btCarga;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btngetResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> pruebaPrograma;
    private javax.swing.JComboBox<String> pruebaSeleccion;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
