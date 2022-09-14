package Parkir;

public class Home extends javax.swing.JFrame {
    
    public Home() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TombolOwener = new javax.swing.JButton();
        TombolJukir = new javax.swing.JButton();
        Ucapan = new javax.swing.JLabel();
        TombolKeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WS Parking");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TombolOwener.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TombolOwener.setText("Owener");
        TombolOwener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolOwenerActionPerformed(evt);
            }
        });
        jPanel1.add(TombolOwener, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 120, 50));

        TombolJukir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TombolJukir.setText("Juru Parkir");
        TombolJukir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolJukirActionPerformed(evt);
            }
        });
        jPanel1.add(TombolJukir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 120, 50));

        Ucapan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Ucapan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ucapan.setText("WIBIE SUMANTO PARKING AREA");
        jPanel1.add(Ucapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 470, 62));

        TombolKeluar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TombolKeluar.setText("Keluar");
        TombolKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(TombolKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\gasss.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 450, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TombolKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolKeluarActionPerformed
        // Tombol Keluar Berfungsi Untuk Keluar Dari Form
        TombolKeluar.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_TombolKeluarActionPerformed

    private void TombolOwenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolOwenerActionPerformed
        // TODO add your handling code here:
        TombolOwener.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_TombolOwenerActionPerformed

    private void TombolJukirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolJukirActionPerformed
        // TODO add your handling code here:
        TombolJukir.setVisible(false);
        new ParkirInterface().setVisible(true);
    }//GEN-LAST:event_TombolJukirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TombolJukir;
    private javax.swing.JButton TombolKeluar;
    private javax.swing.JButton TombolOwener;
    private javax.swing.JLabel Ucapan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
