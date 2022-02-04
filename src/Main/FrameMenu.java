/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenu
     */
    FramePanduan panduan = new FramePanduan();
    FrameLihatData lihatData = new FrameLihatData();
    FrameInformasi informasi = new FrameInformasi();
    FrameAbout about = new FrameAbout();
    FramePendataan pendataan = new FramePendataan();

    public FrameMenu() {
        initComponents();
        setTitle("Zakat Pro 3.0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Panduan = new javax.swing.JButton();
        Btn_Pendataan = new javax.swing.JButton();
        Btn_Informasi = new javax.swing.JButton();
        Btn_About = new javax.swing.JButton();
        Btn_LihatData = new javax.swing.JButton();
        Btn_Keluar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(23, 101, 56));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Baznas kecil.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 138, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/k.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        Btn_Panduan.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Panduan.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        Btn_Panduan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_user_manual_35px.png"))); // NOI18N
        Btn_Panduan.setText("PANDUAN");
        Btn_Panduan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_PanduanMouseClicked(evt);
            }
        });
        jPanel3.add(Btn_Panduan, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 272, 150, 47));

        Btn_Pendataan.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Pendataan.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        Btn_Pendataan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_registration_35px.png"))); // NOI18N
        Btn_Pendataan.setText("PENDATAAN");
        Btn_Pendataan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_PendataanMouseClicked(evt);
            }
        });
        jPanel3.add(Btn_Pendataan, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 332, 150, 47));

        Btn_Informasi.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Informasi.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        Btn_Informasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_information_35px.png"))); // NOI18N
        Btn_Informasi.setText("INFORMASI");
        Btn_Informasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_InformasiMouseClicked(evt);
            }
        });
        jPanel3.add(Btn_Informasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 392, 150, 47));

        Btn_About.setBackground(new java.awt.Color(255, 255, 255));
        Btn_About.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        Btn_About.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_help_35px.png"))); // NOI18N
        Btn_About.setText("TENTANG");
        Btn_About.setHideActionText(true);
        Btn_About.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Btn_About.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_AboutMouseClicked(evt);
            }
        });
        jPanel3.add(Btn_About, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 512, 150, 47));

        Btn_LihatData.setBackground(new java.awt.Color(255, 255, 255));
        Btn_LihatData.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        Btn_LihatData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_folder_35px.png"))); // NOI18N
        Btn_LihatData.setText("LIHAT DATA");
        Btn_LihatData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_LihatDataMouseClicked(evt);
            }
        });
        jPanel3.add(Btn_LihatData, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 452, 150, 47));

        Btn_Keluar.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Keluar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        Btn_Keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_shutdown_35px.png"))); // NOI18N
        Btn_Keluar.setText("KELUAR");
        Btn_Keluar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Btn_Keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_KeluarMouseClicked(evt);
            }
        });
        jPanel3.add(Btn_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 572, 150, 47));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel5.setText("SUPPORT BY ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 680, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/muikecilfix.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 703, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/MLIkecil.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 703, -1, -1));

        jPanel4.setBackground(new java.awt.Color(187, 223, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel1.setText("MENU");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 164, 760, 70));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/green-blue-combination-inside-wallpaper-preview222.jpg"))); // NOI18N
        jPanel3.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 760, 780));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 762, 794));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_KeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_KeluarMouseClicked
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Keluar ? ", "EXIT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_Btn_KeluarMouseClicked

    private void Btn_LihatDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_LihatDataMouseClicked
        // TODO add your handling code here:
        lihatData.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_LihatDataMouseClicked

    private void Btn_AboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_AboutMouseClicked
        // TODO add your handling code here:
        about.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_AboutMouseClicked

    private void Btn_InformasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_InformasiMouseClicked
        // TODO add your handling code here:
        informasi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_InformasiMouseClicked

    private void Btn_PanduanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_PanduanMouseClicked
        // TODO add your handling code here:
        panduan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_PanduanMouseClicked

    private void Btn_PendataanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_PendataanMouseClicked
        // TODO add your handling code here:
        pendataan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_PendataanMouseClicked

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
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_About;
    private javax.swing.JButton Btn_Informasi;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_LihatData;
    private javax.swing.JButton Btn_Panduan;
    private javax.swing.JButton Btn_Pendataan;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
