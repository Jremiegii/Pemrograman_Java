package Parkir;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DataTabel extends javax.swing.JFrame {
    
    KoneksiData p = new KoneksiData();
    
    public DataTabel() {
        initComponents();
        Data();
    }
    
    public void Data(){
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        int Jumlah = 0;
        
        conn = p.getConnection();
        
         try {
            st = conn.createStatement();
            rs = st.executeQuery("select count(*) As Data from parkir");
            while(rs.next()){
                Jumlah = Integer.parseInt(rs.getString("Data"));
            }
            Kuantitas.setText("Total Data = " + Jumlah);
        } catch (SQLException ex) {
            Logger.getLogger(DataTabel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from parkir");

            while (rs.next()) {
                String NoKendaraan = rs.getString(1);
                String Kendaraan = rs.getString(2);
                String Status = rs.getString(3);
                int Biaya = rs.getInt(4);
                int Bayar = rs.getInt(5);
                double Kembalian = rs.getDouble(6);
                DefaultTableModel Data = (DefaultTableModel) DataTabel.getModel();
                Data.addRow(new Object[]{NoKendaraan, Kendaraan, Status, Biaya, Bayar, Kembalian});
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DataTabel = new javax.swing.JTable();
        Kuantitas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TombolKeluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Kendaraan Parkir");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DataTabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DataTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Kendaraan", "Kendaraan", "Status", "Biaya", "Pembayaran", "Kembalian"
            }
        ));
        jScrollPane1.setViewportView(DataTabel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 470, 220));

        Kuantitas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(Kuantitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 142, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data Informasi Kendaraan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 40, 470, -1));

        TombolKeluar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TombolKeluar.setText("Keluar");
        TombolKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(TombolKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 394, 81, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -70, 330, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TombolKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolKeluarActionPerformed
        // Tombol Keluar Berfungsi Untuk Keluar Dari Form
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_TombolKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(DataTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataTabel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DataTabel;
    private javax.swing.JLabel Kuantitas;
    private javax.swing.JButton TombolKeluar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
