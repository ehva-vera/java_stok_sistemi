/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stoktakip;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author veranur
 */
public class frm_urunler extends javax.swing.JFrame {

    /**
     * Creates new form ürünlerEkran
     */
    DefaultTableModel model;
    baglanti b = new baglanti();

    public frm_urunler() {
        initComponents();

        model = b.colName("select * from stok_sistemi.ürünler", jTable1);
        b.tabloyaEkle("select * from stok_sistemi.ürünler", jTable1, model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        urunSil = new javax.swing.JButton();
        geri = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        yenileButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        duzenleme = new javax.swing.JMenu();
        urunEkle = new javax.swing.JMenuItem();
        urunDüzenle = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ürünler Ekranı");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün Id", "Ürün Adı", "Marka ", "Kategori", "Fiyat", "Tarih"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        urunSil.setText("Ürünü Sil");
        urunSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunSilActionPerformed(evt);
            }
        });

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setText("Ürün Ara:");
        jLabel2.setSize(new java.awt.Dimension(63, 23));

        yenileButton.setText("Yenile");
        yenileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yenileButtonActionPerformed(evt);
            }
        });

        duzenleme.setText("Düzenlemeler");

        urunEkle.setText("Ürün Ekle");
        urunEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunEkleActionPerformed(evt);
            }
        });
        duzenleme.add(urunEkle);

        urunDüzenle.setText("Ürün Düzenle");
        urunDüzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunDüzenleActionPerformed(evt);
            }
        });
        duzenleme.add(urunDüzenle);

        jMenuBar1.add(duzenleme);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yenileButton)
                        .addGap(45, 45, 45)
                        .addComponent(urunSil, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(urunSil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1)
                        .addComponent(yenileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urunEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunEkleActionPerformed
        new frm_urunEkle().setVisible(true);
    }//GEN-LAST:event_urunEkleActionPerformed

    private void urunDüzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunDüzenleActionPerformed
        new frm_urunDuzenle().setVisible(true);
    }//GEN-LAST:event_urunDüzenleActionPerformed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        personel p = new frm_login().p;
        new frm_stok(p).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_geriActionPerformed
    /**
     * Bu metot, "Ürün Sil" butonuna tıklandığında çalışır ve seçili ürünü
     * veritabanından siler. Ürünü, ilgili stok kayıtlarını ve toplam stok
     * kayıtlarını veritabanından siler. Eğer kullanıcı bir satır seçmemişse
     * hata mesajı gösterir.
     */
    private void urunSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunSilActionPerformed
        String deleteUrunQuery = "DELETE FROM ürünler WHERE id = ?";
        String deleteStoklarQuery = "DELETE FROM stoklar WHERE urunid = ?";
        String deleteToplamStokQuery = "DELETE FROM toplam_stok WHERE urunID = ?";

        try {

            if (jTable1.getSelectedRow() == -1) {
                throw new Exception("Lütfen silmek için bir satır seçiniz.");
            }
            int selectedRowIndex = jTable1.getSelectedRow();
            String idString = jTable1.getValueAt(selectedRowIndex, 0).toString();
            int id = Integer.parseInt(idString);

            model.removeRow(selectedRowIndex);

            PreparedStatement ps1 = b.preparedStatement(deleteUrunQuery);
            PreparedStatement ps2 = b.preparedStatement(deleteStoklarQuery);
            PreparedStatement ps3 = b.preparedStatement(deleteToplamStokQuery);

            ps1.setInt(1, id);
            int yanit = ps1.executeUpdate();

            ps2.setInt(1, id);
             ps2.executeUpdate();

            ps3.setInt(1, id);
             ps3.executeUpdate();

            if (yanit ==1 ) {
                JOptionPane.showMessageDialog(this, "Ürün başarıyla silindi.");
            } else {
                JOptionPane.showMessageDialog(this, "Ürün silinemedi, tekrar deneyiniz.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }


    }//GEN-LAST:event_urunSilActionPerformed
    /**
     * Bu metot, jTextField1 alanına bir tuş basıldığında çalışır ve ürünler
     * tablosunu filtreler. Girilen metni kullanarak ürünler tablosunda arama
     * yapar ve sonuçları JTable'da gösterir.
     */
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        model.setRowCount(0);
        ArrayList list = b.search(jTextField1.getText(), "ad", "ürünler");
        for (Object object : list) {
            if (object instanceof ürünler) {
                model.addRow(new Object[]{((ürünler) object).getId(), ((ürünler) object).getAd(), ((ürünler) object).getMarka(), ((ürünler) object).getKatergori(), ((ürünler) object).getFiyat(), ((ürünler) object).getTarih()});
            }
        }

    }//GEN-LAST:event_jTextField1KeyPressed

    private void yenileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yenileButtonActionPerformed
       model = b.colName("select * from stok_sistemi.ürünler", jTable1);
        b.tabloyaEkle("select * from stok_sistemi.ürünler", jTable1, model);
    }//GEN-LAST:event_yenileButtonActionPerformed

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
            java.util.logging.Logger.getLogger(frm_urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_urunler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu duzenleme;
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem urunDüzenle;
    private javax.swing.JMenuItem urunEkle;
    private javax.swing.JButton urunSil;
    private javax.swing.JButton yenileButton;
    // End of variables declaration//GEN-END:variables
}