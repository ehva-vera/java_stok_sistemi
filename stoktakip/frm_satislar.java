/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stoktakip;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author veranur
 */
public class frm_satislar extends javax.swing.JFrame {

    /**
     * Creates new form satışlarEkran
     */
    baglanti b = new baglanti();
    File file;

    public frm_satislar() {
        initComponents();

        b.comboBox("select * from stok_sistemi.ürünler", "id", idCombo);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        satisYap = new javax.swing.JButton();
        idCombo = new javax.swing.JComboBox<>();
        adet = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Satışlar Ekranı");

        jLabel1.setText("Ürün Id:");

        jLabel3.setText("Kaç Adet:");

        satisYap.setText("Satış Yap");
        satisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satisYapActionPerformed(evt);
            }
        });

        jLabel2.setText("Tarih:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adet)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(satisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(satisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Bu metot, "Satış Yap" butonuna tıklandığında çalışır ve ürün satış
     * işlemini gerçekleştirir. Satış bilgilerini alır, stok durumunu kontrol
     * eder ve veritabanında güncellemeler yapar. Ayrıca, stok seviyesi
     * düşükse bir bildirim mesajı oluşturur ve bir dosyaya yazar.
     */
    private void satisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satisYapActionPerformed
        PreparedStatement ps;
        int id = Integer.parseInt(idCombo.getSelectedItem().toString());
        String date = null;
        if (jDateChooser1.getDate() != null) {
            date = String.valueOf(new java.sql.Date(jDateChooser1.getDate().getTime()));
        }
        file = new File("bildirim.txt");
        String adetRegex = "^[0-9]{1,10}$";

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            LocalDate today = LocalDate.now();
            if (jDateChooser1.getDate() != null) {
                LocalDate selectedLocalDate = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                if (selectedLocalDate.isAfter(today)) {
                    throw new Exception("İleri bir tarih seçemezsiniz. Lütfen bugünün veya geçmiş bir tarihi seçin.");

                }
            }
            if (!adet.getText().matches(adetRegex)) {
                throw new Exception("geçersiz adet girişi. Adet girişi sadece rakamlarla sağlanabilir.");
            }
            if (date == null) {
                throw new Exception("Tarih kısmı boş bırakılamaz. Lütfen tarih seçiniz.");
            }
            int adetInt = Integer.parseInt(adet.getText());
            ResultSet rs = b.executeQuery("SELECT toplamStok FROM stok_sistemi.toplam_stok WHERE urunID =" + id);
            if (rs.next()) {
                int stok = rs.getInt("toplamStok");

                if (stok < adetInt) {
                    throw new Exception("Yeterli stok yok. Mevcut stok: " + stok);
                }

            }

            ps = b.preparedStatement("INSERT INTO stok_sistemi.satislar (urunId,adet,tarih) VALUES (?,?,?)");
            ps.setInt(1, id);
            ps.setInt(2, adetInt);
            ps.setString(3, date);
            ps.executeUpdate();
            satislarclass satis=new satislarclass(id, adetInt);
            satislarclass.add(satis);
            
            int update = b.executeUpdate("UPDATE stok_sistemi.toplam_stok SET toplamStok= toplamStok-" + adetInt + " WHERE urunID = " + id);

            
            if (update == 1) {
                JOptionPane.showMessageDialog(this, "Satış başarıyla Gerçekleştirildi");
            } else {
                JOptionPane.showMessageDialog(this, "Bi şeyler ters gitti. Lütfen tekrar deneyiniz");
            }

            ResultSet rs1 = b.executeQuery("SELECT toplamStok FROM stok_sistemi.toplam_stok WHERE urunID =" + id);
            if (rs1.next()) {
                int stok = rs1.getInt("toplamStok");
                if (stok <= 5) {
                    String message = id + " id'li üründen " + stok + " tane kaldı. Lütfen stok eklemesi yapınız.";
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                        bw.newLine();
                        bw.write(message);
                    }

                }

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        adet.setText("");
        idCombo.setSelectedIndex(0);
        jDateChooser1.setDate(null);


    }//GEN-LAST:event_satisYapActionPerformed

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
            java.util.logging.Logger.getLogger(frm_satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_satislar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adet;
    private javax.swing.JComboBox<String> idCombo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton satisYap;
    // End of variables declaration//GEN-END:variables
}
