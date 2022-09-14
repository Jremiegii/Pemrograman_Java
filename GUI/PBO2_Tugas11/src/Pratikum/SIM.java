package Pratikum;

public class SIM extends javax.swing.JFrame {
    
    public SIM() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        ShowData = new javax.swing.JMenuItem();
        DataInput = new javax.swing.JMenuItem();
        UpdateData = new javax.swing.JMenuItem();
        DeleteData = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Informasi Mahasiswa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        FileMenu.setText("File");

        ShowData.setText("Show Data");
        ShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataActionPerformed(evt);
            }
        });
        FileMenu.add(ShowData);

        DataInput.setText("InputData");
        DataInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataInputActionPerformed(evt);
            }
        });
        FileMenu.add(DataInput);

        UpdateData.setText("Update Data");
        UpdateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDataActionPerformed(evt);
            }
        });
        FileMenu.add(UpdateData);

        DeleteData.setText("Delete Data");
        DeleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDataActionPerformed(evt);
            }
        });
        FileMenu.add(DeleteData);
        FileMenu.add(jSeparator1);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        FileMenu.add(Exit);

        jMenuBar1.add(FileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataInputActionPerformed
        // Untuk Memilih File Bagian InputData Agar Muncul From Yang Dimiliki
        new inputData().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DataInputActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // Untuk Memilih File Bagian Exit Untuk Keluar Dari From
        this.setVisible(false);
        System.exit(0);
        
    }//GEN-LAST:event_ExitActionPerformed

    private void ShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataActionPerformed
        // Untuk Memilih File Bagian ShowData Agar Muncul Tabel Yang Dimiiki
        new showData().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ShowDataActionPerformed

    private void UpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDataActionPerformed
        // Untuk Memilih File Bagian Delete Data Agar Muncul Tabel Yang Dimiliki
        new updateData().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UpdateDataActionPerformed

    private void DeleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDataActionPerformed
        // TODO add your handling code here:
        new deleteData().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DeleteDataActionPerformed

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
            java.util.logging.Logger.getLogger(SIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DataInput;
    private javax.swing.JMenuItem DeleteData;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem ShowData;
    private javax.swing.JMenuItem UpdateData;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
