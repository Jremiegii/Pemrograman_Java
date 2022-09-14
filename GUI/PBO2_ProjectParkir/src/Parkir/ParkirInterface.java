package Parkir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ParkirInterface extends javax.swing.JFrame {
    
    KoneksiData p = new KoneksiData();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    
    public ParkirInterface() {
        initComponents();
        
        // Membuat JComboBox Tidak Terlihat Sebelum Dipilih
        DataJenisKendaraan.setSelectedItem(null);
        DataStatus.setSelectedItem(null);
        DataBiayaParkir.setText(null);
        //BackUp();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DataNoKendaraan = new javax.swing.JTextField();
        DataJenisKendaraan = new javax.swing.JComboBox<>();
        DataStatus = new javax.swing.JComboBox<>();
        DataBiayaParkir = new javax.swing.JTextField();
        DataPembayaran = new javax.swing.JTextField();
        DataKembalian = new javax.swing.JTextField();
        NoKendaraan = new javax.swing.JLabel();
        JenisKendaraan = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        BiayaParkir = new javax.swing.JLabel();
        Pembayaran = new javax.swing.JLabel();
        Kembalian = new javax.swing.JLabel();
        Simpan = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        Bayar = new javax.swing.JButton();
        TombolData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parkir");

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DataNoKendaraan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DataNoKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataNoKendaraanActionPerformed(evt);
            }
        });
        jPanel1.add(DataNoKendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 58, 308, 30));

        DataJenisKendaraan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DataJenisKendaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motor", "Mobil" }));
        DataJenisKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataJenisKendaraanActionPerformed(evt);
            }
        });
        jPanel1.add(DataJenisKendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 106, 308, 32));

        DataStatus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DataStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masuk", "Keluar" }));
        DataStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataStatusActionPerformed(evt);
            }
        });
        jPanel1.add(DataStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 156, 308, 32));

        DataBiayaParkir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DataBiayaParkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataBiayaParkirActionPerformed(evt);
            }
        });
        jPanel1.add(DataBiayaParkir, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 206, 308, 30));

        DataPembayaran.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DataPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPembayaranActionPerformed(evt);
            }
        });
        jPanel1.add(DataPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 243, 308, 30));

        DataKembalian.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DataKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataKembalianActionPerformed(evt);
            }
        });
        jPanel1.add(DataKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 291, 308, 30));

        NoKendaraan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        NoKendaraan.setText("No Kendaraan");
        jPanel1.add(NoKendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 66, 104, -1));

        JenisKendaraan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JenisKendaraan.setText("Jenis Kendaraan");
        jPanel1.add(JenisKendaraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 115, 104, -1));

        Status.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Status.setText("Status");
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 165, 104, -1));

        BiayaParkir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BiayaParkir.setText("Biaya Parkir");
        jPanel1.add(BiayaParkir, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 214, 104, -1));

        Pembayaran.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Pembayaran.setText("Pembayaran");
        jPanel1.add(Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 249, 104, 18));

        Kembalian.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Kembalian.setText("Kembalian");
        jPanel1.add(Kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 299, -1, -1));

        Simpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 350, -1, -1));

        Hapus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 350, 74, -1));

        Keluar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 350, -1, -1));

        Bayar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Bayar.setText("Bayar");
        Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayarActionPerformed(evt);
            }
        });
        jPanel1.add(Bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 350, 75, -1));

        TombolData.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TombolData.setText("Data");
        TombolData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolDataActionPerformed(evt);
            }
        });
        jPanel1.add(TombolData, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 350, 75, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\gasss.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 510, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataJenisKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataJenisKendaraanActionPerformed
        /* Berfungsi Untuk Memilih Jenis Kendaraan Sehingga Ketika Memilih Kendaraan Dapat Menampilkan
           Tarif Secara Otomatis Pada Biaya Parkir Kendaraan
        */
        if (DataJenisKendaraan.getSelectedIndex() == 0) {
            String Tampung = "2000";
            DataBiayaParkir.setText(Tampung);
        } else {
            String Tampung = "5000";
            DataBiayaParkir.setText(Tampung);
        }
    }//GEN-LAST:event_DataJenisKendaraanActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // Tombol Keluar Berfungsi Untuk Keluar Dari Form
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_KeluarActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // Tombol Hapus Berfungsi Untuk Menghapus Data Yang DiInputkan Sebelumnya
        DataNoKendaraan.setText("");
        DataJenisKendaraan.setSelectedItem(null);
        DataStatus.setSelectedItem(null);
        DataBiayaParkir.setText("");
        DataPembayaran.setText("");
        DataKembalian.setText("");
    }//GEN-LAST:event_HapusActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // Form Yang Digunakan Untuk Memasukan Data
        int Exit = DataStatus.getSelectedIndex();

        if (Exit == 0) {
            Connection conn = null;
            PreparedStatement ps = null;

            conn = p.getConnection();

            String NoKendaraan = DataNoKendaraan.getText();
            String Kendaraan = (String) DataJenisKendaraan.getSelectedItem();
            String Status = (String) DataStatus.getSelectedItem();
            int Biaya = Integer.parseInt(DataBiayaParkir.getText());
            int Bayar = Integer.parseInt(DataPembayaran.getText());
            double Kembalian = Double.parseDouble(DataKembalian.getText());

            try {
                ps = conn.prepareStatement("insert into parkir values(?,?,?,?,?,?)");
                ps.setString(1, NoKendaraan);
                ps.setString(2, Kendaraan);
                ps.setString(3, Status);
                ps.setInt(4, Biaya);
                ps.setInt(5, Bayar);
                ps.setDouble(6, Kembalian);
                ps.executeUpdate();
                conn.commit();
                JOptionPane.showMessageDialog(null, "Data sudah ditambahkan");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } finally {
                try {
                    ps.close();
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } else if (Exit == 1) {
            try {

                conn = p.getConnection();

                String NoKendaraan = DataNoKendaraan.getText();
                Object JenisKendaraan = DataJenisKendaraan.getSelectedItem();
                st = conn.createStatement();
                rs = st.executeQuery("select * from parkir where no_kendaraan ='" + NoKendaraan + "'" + " and jenis_kendaraan ='" 
                        + JenisKendaraan + "'");
                if (rs.next()) {
                    ps = conn.prepareStatement("delete from parkir where no_kendaraan = ? and jenis_kendaraan = ? ");
                    ps.setString(1, NoKendaraan);
                    ps.setObject(2, JenisKendaraan);
                    ps.executeUpdate();
                    conn.commit();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Tidak Ditemukan");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ParkirInterface.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    st.close();
                    rs.close();
                    //ps.close();
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_SimpanActionPerformed

    private void DataBiayaParkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataBiayaParkirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataBiayaParkirActionPerformed

    private void DataStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataStatusActionPerformed
        /* Berfungsi Untuk Memilih Status Sehingga Ketika Memilih Status Dapat Menampilkan
           Tarif Secara Otomatis Pada Biaya Parkir Kendaraan
        */
        if (DataStatus.getSelectedIndex() == 1) {
            String Tampung = "0";
            DataBiayaParkir.setText(Tampung);
            DataPembayaran.setEnabled(false);
            DataKembalian.setEnabled(false);
        } else {
            DataPembayaran.setEnabled(true);
            DataKembalian.setEnabled(true);
            if (DataJenisKendaraan.getSelectedIndex() == 0) {
                String Tampung = "2000";
                DataBiayaParkir.setText(Tampung);
            } else {
                String Tampung = "5000";
                DataBiayaParkir.setText(Tampung);
            }
        }
    }//GEN-LAST:event_DataStatusActionPerformed

    private void DataPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataPembayaranActionPerformed

    private void DataKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataKembalianActionPerformed

    private void BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarActionPerformed
        // Berfungsi Untuk Melakukan Perhitungan Pembayaran
        try{
            int Biaya = Integer.valueOf(this.DataBiayaParkir.getText());
            int Bayar = Integer.valueOf(this.DataPembayaran.getText());
            if(Bayar > Biaya || Bayar == Biaya){
                int Kembali = Bayar - Biaya;
                DataKembalian.setText(Integer.toString(Kembali));
            } else {
                JOptionPane.showMessageDialog(null,"Maaf, Uang Anda Tidak Mencukupi!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Maaf, Terjadi Kesalahan!");
        }
    }//GEN-LAST:event_BayarActionPerformed

    private void DataNoKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataNoKendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataNoKendaraanActionPerformed

    private void TombolDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolDataActionPerformed
        // TODO add your handling code here:
        TombolData.setVisible(false);
        new DataTabel().setVisible(true);
    }//GEN-LAST:event_TombolDataActionPerformed

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
            java.util.logging.Logger.getLogger(ParkirInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParkirInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParkirInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParkirInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParkirInterface().setVisible(true);
            }
        });
    }
    
    public void BackUp(){
        
        if (DataJenisKendaraan.equals("Motor") && DataStatus.equals("Masuk")) {
            String Tampung = "2000";
            DataBiayaParkir.setText(Tampung);
        } else if(DataJenisKendaraan.equals("Mobil") && DataStatus.equals("Masuk")) {
            String Tampung = "5000";
            DataBiayaParkir.setText(Tampung);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bayar;
    private javax.swing.JLabel BiayaParkir;
    private javax.swing.JTextField DataBiayaParkir;
    private javax.swing.JComboBox<String> DataJenisKendaraan;
    private javax.swing.JTextField DataKembalian;
    private javax.swing.JTextField DataNoKendaraan;
    private javax.swing.JTextField DataPembayaran;
    private javax.swing.JComboBox<String> DataStatus;
    private javax.swing.JButton Hapus;
    private javax.swing.JLabel JenisKendaraan;
    private javax.swing.JButton Keluar;
    private javax.swing.JLabel Kembalian;
    private javax.swing.JLabel NoKendaraan;
    private javax.swing.JLabel Pembayaran;
    private javax.swing.JButton Simpan;
    private javax.swing.JLabel Status;
    private javax.swing.JButton TombolData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
