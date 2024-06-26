/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package stoktakip;

import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author veranur
 */
public class frm_int_personelEkle extends javax.swing.JInternalFrame {

    /**
     * Creates new form frm_personelEkleYönetici
     */
    DefaultListModel<String> personelListModel;
    baglanti b = new baglanti();

    public frm_int_personelEkle() {
        initComponents();
        personelListModel = new DefaultListModel<>();
        jList1.setModel(personelListModel);
        String ozellikler[] = {"Id", "KullaniciAd", "Sifre", "Ad", "Soyad", "Maas", "Cinsiyet"};
        for (String string : ozellikler) {
            jComboBox1.addItem(string);
        }
        b.listele("SELECT kullaniciAd FROM stok_sistemi.personel ", "kullaniciAd", personelListModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        silButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        newText = new javax.swing.JTextField();
        chanceButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        maasText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kaydetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adText = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        soyadText = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        kullaniciAdText = new javax.swing.JTextField();
        sifreText = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Personel Ekleme");

        jScrollPane1.setViewportView(jList1);

        silButton.setText("Sil");
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Değiştirilecek Özellik:");

        jLabel8.setText("Yeni Özellik:");

        chanceButton.setText("Değiştir");
        chanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chanceButtonActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Değiştirmek İstiyorum");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, 126, Short.MAX_VALUE)
                                    .addComponent(newText))
                                .addGap(15, 15, 15))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newText, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addGap(22, 22, 22)
                        .addComponent(chanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Personel Listele", jPanel2);

        jLabel6.setText("Cinsiyet:");

        kaydetButton.setText("Kaydet");
        kaydetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Soyad:");

        jLabel2.setText("Ad:");

        jLabel3.setText("Maaş:");

        jLabel4.setText("Kullanıcı Ad:");

        jLabel5.setText("Şifre");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Kadın");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Erkek");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kullaniciAdText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maasText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(kaydetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciAdText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maasText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(33, 33, 33)
                .addComponent(kaydetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Personel Ekle", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Bu metot, "Kaydet" butonuna tıklandığında çalışır ve yeni bir personel
     * kaydı ekler. Kullanıcı tarafından girilen bilgileri alır,
     * geçerliliklerini kontrol eder ve geçerliyse veritabanına yeni bir
     * personel kaydı ekler. Herhangi bir hata durumunda kullanıcıya hata mesajı
     * gösterir.
     */
    private void kaydetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetButtonActionPerformed
        PreparedStatement s;
        String adregex = "^[a-zA-ZğüşöçıIİĞÜŞÖÇ]{1,50}$";
        String soyadRegex = "^[a-zA-ZğüşöçıIİĞÜŞÖÇ]{1,50}$";
        String sifreRegex = "^[0-9]{1,8}$";
        String kullaniciAdRegex = "^[a-zA-Z0-9ğüşöçıIİĞÜŞÖÇ]{3,20}$";
        String maasRegex = "^[0-9]{1,10}$";

        String cinsiyetString = "";
        if (jRadioButton1.isSelected()) {
            cinsiyetString = jRadioButton1.getText();
        } else if (jRadioButton2.isSelected()) {
            cinsiyetString = jRadioButton2.getText();
        }
        String q = "INSERT INTO stok_sistemi.personel (kullaniciAd,sifre,ad,soyad,maas,cinsiyet) VALUES (?,?,?,?,?,?)";
        s = b.preparedStatement(q);
        try {
            if (!adText.getText().matches(adregex)) {
                throw new Exception("Geçersiz ad girişi. Ad sadece harflerden oluşabilir");
            }
            if (!soyadText.getText().matches(soyadRegex)) {
                throw new Exception("Geçersiz soyad girişi. Soyad sadece harflerden oluşabilir");
            }
            if (!sifreText.getText().matches(sifreRegex)) {
                throw new Exception("Geçersiz şifre girişi. Şifre sadece rakamlardan oluşabilir ve en fazla sekiz haneli olmalıdır.");
            }
            if (!kullaniciAdText.getText().matches(kullaniciAdRegex)) {
                throw new Exception("Geçersiz kullanıcı adı. Kullanıcı adı 3-20 karakter uzunluğunda olmalı ve sadece harfler ve rakamlardan oluşmalıdır.");
            }
            if (!maasText.getText().matches(maasRegex)) {
                throw new Exception("Geçersiz maaş girişi. Maaş sadece rakamlardan oluşabilir.");
            }
            if (adText.getText().isEmpty() || soyadText.getText().isEmpty() || sifreText.getText().isEmpty() || kullaniciAdText.getText().isEmpty() || maasText.getText().isEmpty()) {
                throw new Exception("Giriş kısımları boş bırakılamaz.");
            }

            s.setString(1, kullaniciAdText.getText());
            s.setString(2, sifreText.getText());
            s.setString(3, adText.getText());
            s.setString(4, soyadText.getText());
            s.setInt(5, Integer.parseInt(maasText.getText()));
            s.setString(6, cinsiyetString);

            int update = s.executeUpdate();

            if (update > 0) {
                JOptionPane.showMessageDialog(this, "Personel Başarıyla Eklendi");
            } else {
                JOptionPane.showMessageDialog(this, "Personel Eklenirken Bir Sorun Oluştu", "sonuc", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        adText.setText("");
        soyadText.setText("");
        kullaniciAdText.setText("");
        sifreText.setText("");
        maasText.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        personelListModel.clear();
        b.listele("SELECT kullaniciAd FROM stok_sistemi.personel ", "kullaniciAd", personelListModel);
        
    }//GEN-LAST:event_kaydetButtonActionPerformed
    /**
     * Bu metot, "Değiştir" butonuna tıklandığında çalışır ve seçili personelin
     * bir özelliğini günceller. Kullanıcı tarafından seçilen özellik, yeni
     * değer ve listeden seçilen personel alınır. Girdi verilerini kontrol eder
     * ve geçerli ise veritabanında personelin özelliğini günceller.
     */
    private void chanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chanceButtonActionPerformed
        String changeOzellik = jComboBox1.getSelectedItem().toString();
        String secilen = jList1.getSelectedValue();

        String newRegex = "^[a-zA-Z0-9ğüşöçıIİĞÜŞÖÇ]{3,20}$";
        try {
            if (!newText.getText().matches(newRegex)) {
                throw new Exception("Geçersiz Özellik girdiniz.Lütfen tekrar deneyiniz.");
            }
            if (newText.getText().isEmpty()) {
                throw new Exception("Yeni özellik kısmı boş bırakılamaz");
            }
            if (!jCheckBox1.isSelected()) {
                throw new Exception("Lütfen değiştirmek istiyorum kutucuğunu işaretleyiniz.");
            }
            if (secilen == null) {
                throw new Exception("Lütfen Listeden personel Seçiniz");
            }

            int update = b.executeUpdate("UPDATE personel SET " + changeOzellik + "='" + newText.getText() + "'" + "WHERE kullaniciAd='" + secilen + "'");

            if (update == 1) {
                JOptionPane.showMessageDialog(this, "Personel Başarıyla Değiştirildi");
            } else {
                throw new Exception("Bi şeyler ters gitti. Lütfen tekrar deneyiniz");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        jComboBox1.setSelectedIndex(0);
        newText.setText("");
        jCheckBox1.setSelected(false);
        personelListModel.clear();
        b.listele("SELECT kullaniciAd FROM stok_sistemi.personel ", "kullaniciAd", personelListModel);
    }//GEN-LAST:event_chanceButtonActionPerformed
    /**
     * Bu metot, "Sil" butonuna tıklandığında çalışır ve seçili personeli
     * veritabanından siler. Kullanıcı, listeden bir personel seçer ve
     * personelin kullanıcı adını kullanarak silme işlemi gerçekleştirilir.
     */

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed

        try {

            if (jList1.getSelectedIndex() == -1) {
                throw new Exception("Lütfen silmek için bir satır seçiniz.");
            }

            int selectedIndex = jList1.getSelectedIndex();
            String idString = jList1.getSelectedValue();

            personelListModel.remove(selectedIndex);

            String sorgu = "DELETE FROM stok_sistemi.personel WHERE kullaniciAd=?";

            PreparedStatement ps = new baglanti().preparedStatement(sorgu);
            ps.setString(1, idString);

            int yanit = ps.executeUpdate();

            if (yanit > 0) {
                JOptionPane.showMessageDialog(this, "Personel başarıyla silindi.");
            } else {
                throw new Exception("Ürün silinemedi, tekrar deneyiniz.");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_silButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chanceButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kaydetButton;
    private javax.swing.JTextField kullaniciAdText;
    private javax.swing.JTextField maasText;
    private javax.swing.JTextField newText;
    private javax.swing.JTextField sifreText;
    private javax.swing.JButton silButton;
    private javax.swing.JTextField soyadText;
    // End of variables declaration//GEN-END:variables
}
