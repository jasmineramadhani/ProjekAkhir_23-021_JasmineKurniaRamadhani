 
package projekjsmne;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class dataperpustakaan extends javax.swing.JFrame {

   
    
    public dataperpustakaan() {
        initComponents();
        refresh();
        txtid.setVisible(false);
    }
    
    private void refresh(){
//        txtid.setText("");
        txtnama.setText("");
        txtkodebuku.setText("");
        txtjudulbuku.setText("");
        txtjumlahbuku.setText("");
        cmbstatus.setSelectedItem("-PILIH-");
        
        
        
        ambilData();
    }
    private void ambilData(){
    DefaultTableModel tbl = new DefaultTableModel();
    tbl.addColumn("No");
//    tbl.addColumn("id");
    tbl.addColumn("Nama Peminjam");
    tbl.addColumn("Kode Buku");
    tbl.addColumn("Judul Buku");
    tbl.addColumn("Jumlah Buku");
    tbl.addColumn("Status");
    tabel_data_perpustakaan.setModel(tbl);
    
    try {
        Statement statement = (Statement) koneksi.getConnection().createStatement();
        ResultSet res = statement.executeQuery("select *from tb_perpustakaan ");
        int No = 1;
        while(res.next()){
            tbl.addRow(new Object[]{
            No,
//            res.getString("id"),
            res.getString("nama"),
            res.getString("kode_buku"),
            res.getString("judul_buku"),
            res.getString("jumlah_buku"),
            res.getString("status"),
            
        });///////
            tabel_data_perpustakaan.setModel(tbl);
            No++;
        }
    
    } catch (Exception e){
        JOptionPane.showMessageDialog(rootPane,"Gagal Mengambil Data");
    } 
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtjudulbuku = new javax.swing.JTextField();
        txtjumlahbuku = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_data_perpustakaan = new javax.swing.JTable();
        txtid = new javax.swing.JTextField();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtkodebuku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbstatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonsimpan = new javax.swing.JButton();
        buttonedit = new javax.swing.JButton();
        buttonhapus = new javax.swing.JButton();
        buttonrefresh = new javax.swing.JButton();
        buttonkeluar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA PEMINJAMAN BUKU PERPUSTAKAAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 540, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JUDUL BUKU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("JUMLAH BUKU");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 204, -1));
        getContentPane().add(txtjudulbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 204, -1));

        txtjumlahbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahbukuActionPerformed(evt);
            }
        });
        getContentPane().add(txtjumlahbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 204, -1));

        tabel_data_perpustakaan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabel_data_perpustakaan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Peminjam", "Kode Buku", "Judul Buku", "Jumlah Buku", "Status"
            }
        ));
        tabel_data_perpustakaan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabel_data_perpustakaan.setGridColor(new java.awt.Color(51, 51, 51));
        tabel_data_perpustakaan.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tabel_data_perpustakaan.setSelectionForeground(new java.awt.Color(51, 204, 255));
        tabel_data_perpustakaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_data_perpustakaanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_data_perpustakaan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 380, 170));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 72, -1));

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 250, 30));

        btncari.setBackground(new java.awt.Color(0, 204, 204));
        btncari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-15.png"))); // NOI18N
        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 110, 30));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("KODE BUKU");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        txtkodebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodebukuActionPerformed(evt);
            }
        });
        getContentPane().add(txtkodebuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 204, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STATUS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        cmbstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "Dipinjam", "Dikembalikan" }));
        cmbstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbstatusActionPerformed(evt);
            }
        });
        getContentPane().add(cmbstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 200, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data Peminjam");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        btnhome.setContentAreaFilled(false);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-home-50.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 70));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        buttonsimpan.setBackground(new java.awt.Color(255, 51, 51));
        buttonsimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-save-15.png"))); // NOI18N
        buttonsimpan.setText("SIMPAN");
        buttonsimpan.setContentAreaFilled(false);
        buttonsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(buttonsimpan, new java.awt.GridBagConstraints());

        buttonedit.setBackground(new java.awt.Color(255, 255, 51));
        buttonedit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-edit-15 (3).png"))); // NOI18N
        buttonedit.setText("EDIT");
        buttonedit.setContentAreaFilled(false);
        buttonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneditActionPerformed(evt);
            }
        });
        jPanel1.add(buttonedit, new java.awt.GridBagConstraints());

        buttonhapus.setBackground(new java.awt.Color(102, 255, 102));
        buttonhapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-bin-15.png"))); // NOI18N
        buttonhapus.setText("HAPUS");
        buttonhapus.setContentAreaFilled(false);
        buttonhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhapusActionPerformed(evt);
            }
        });
        jPanel1.add(buttonhapus, new java.awt.GridBagConstraints());

        buttonrefresh.setBackground(new java.awt.Color(153, 153, 255));
        buttonrefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-refresh-15.png"))); // NOI18N
        buttonrefresh.setText("REFRESH");
        buttonrefresh.setContentAreaFilled(false);
        buttonrefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonrefreshActionPerformed(evt);
            }
        });
        jPanel1.add(buttonrefresh, new java.awt.GridBagConstraints());

        buttonkeluar.setBackground(new java.awt.Color(255, 0, 255));
        buttonkeluar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-logout-15.png"))); // NOI18N
        buttonkeluar.setText("KELUAR");
        buttonkeluar.setContentAreaFilled(false);
        buttonkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonkeluar, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 680, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projekjsmne/perpustakaan.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 950, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void buttonsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsimpanActionPerformed
          // TODO add your handling code here:x
        String nama = txtnama.getText(); 
        String kode_buku = txtkodebuku.getText();
        String judul_buku = txtjudulbuku.getText();
        String jumlah_buku = txtjumlahbuku.getText();
        String status =(String) cmbstatus.getSelectedItem();
        
        try {
        Statement statement = (Statement) koneksi.getConnection().createStatement();
        statement.executeUpdate("insert into tb_perpustakaan VALUES (null, '"+nama+"', '"+kode_buku+"', '"+judul_buku+"', '"+jumlah_buku+"', '"+status+"')");
        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        
        refresh();
        } catch (Exception e){
           JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" +e.getMessage()); 
        }
    }//GEN-LAST:event_buttonsimpanActionPerformed

    private void tabel_data_perpustakaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_data_perpustakaanMouseClicked
        // TODO add your handling code here:
        int i = tabel_data_perpustakaan.getSelectedRow();
        if(i==-1){
            return;
        
        }
//        String id = (String) tabel_data_perpustakaan.getValueAt(i,1);
//        txtid.setText(id);
        
        String nama = (String) tabel_data_perpustakaan.getValueAt(i,1);
        txtnama.setText(nama);
        
        String kode_buku = (String) tabel_data_perpustakaan.getValueAt(i,2);
        txtkodebuku.setText(kode_buku);
        
        String judul_buku = (String) tabel_data_perpustakaan.getValueAt(i,3);
        txtjudulbuku.setText(judul_buku);
        
        
        String jumlah_buku = (String)tabel_data_perpustakaan.getValueAt(i,4);
        txtjumlahbuku.setText(jumlah_buku);
        
        String status = (String) tabel_data_perpustakaan.getValueAt(i,5);
        cmbstatus.setSelectedItem(status);
    }//GEN-LAST:event_tabel_data_perpustakaanMouseClicked

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtnamaActionPerformed

    private void buttoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneditActionPerformed
     // TODO add your handling code here:
//        String id = txtid.getText();
        String nama = txtnama.getText(); 
        String kode_buku = txtkodebuku.getText();
        String judul_buku = txtjudulbuku.getText();
        String jumlah_buku = txtjumlahbuku.getText();
        String status =(String) cmbstatus.getSelectedItem();
        
        try {
        Statement statement = (Statement) koneksi.getConnection().createStatement();
        statement.executeUpdate("UPDATE tb_perpustakaan SET kode_buku='"+kode_buku+"',judul_buku='"+judul_buku+"',jumlah_buku='"+jumlah_buku+"', status='"+status+"' WHERE nama='"+nama+"'");
        JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
        
        refresh();
        } catch (Exception e){
           JOptionPane.showMessageDialog(null, "Data Gagal Diedit " +e.getMessage()); 
        }

    }//GEN-LAST:event_buttoneditActionPerformed

    private void buttonhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhapusActionPerformed
        // TODO add your handling code here:
        
        String nm = txtnama.getText();
        
        try {
            Statement statement = (Statement) koneksi.getConnection().createStatement();
            statement.executeUpdate("delete from tb_perpustakaan where nama='"+nm+"'");
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus"); 
            
            refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" +e.getMessage()); 
        }
    }//GEN-LAST:event_buttonhapusActionPerformed

    private void buttonrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonrefreshActionPerformed
        // TODO add your handling code here:
        refresh();
        txtcari.setText("");
    }//GEN-LAST:event_buttonrefreshActionPerformed

    private void buttonkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_buttonkeluarActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
        try  {
            Statement statement = (Statement) koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("select * from tb_perpustakaan where kode_buku like '%"+txtcari.getText()+"%' "+ "or nama like '%"+txtcari.getText()+"%'" +"or judul_buku like '%"+txtcari.getText()+"%'" );
            
     DefaultTableModel tbl = new DefaultTableModel();
    tbl.addColumn("No");
//    tbl.addColumn("id");
    tbl.addColumn("Nama Peminjam");
    tbl.addColumn("Kode Buku");
    tbl.addColumn("Judul Buku");
    tbl.addColumn("Jumlah Buku");
    tbl.addColumn("Status");
    tabel_data_perpustakaan.setModel(tbl);
    
   
        int No = 1;
        while(res.next()){
            tbl.addRow(new Object[]{
            No,
//            res.getString("id"),
            res.getString("nama"),
            res.getString("kode_buku"),
            res.getString("judul_buku"),
            res.getString("jumlah_buku"),
            res.getString("status"),
            
        });
            tabel_data_perpustakaan.setModel(tbl);
            No++;
        }
    
    } catch (Exception e){
        JOptionPane.showMessageDialog(rootPane,"Gagal Mengambil Data");
    } 
    }//GEN-LAST:event_btncariActionPerformed

    private void txtkodebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodebukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodebukuActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        
    }//GEN-LAST:event_formPropertyChange

    private void cmbstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbstatusActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void txtjumlahbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahbukuActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
 new home().show();
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnhomeActionPerformed
    
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
            java.util.logging.Logger.getLogger(dataperpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataperpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataperpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataperpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataperpustakaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton buttonedit;
    private javax.swing.JButton buttonhapus;
    private javax.swing.JButton buttonkeluar;
    private javax.swing.JButton buttonrefresh;
    private javax.swing.JButton buttonsimpan;
    private javax.swing.JComboBox<String> cmbstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_data_perpustakaan;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjudulbuku;
    private javax.swing.JTextField txtjumlahbuku;
    private javax.swing.JTextField txtkodebuku;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
