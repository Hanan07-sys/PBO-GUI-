/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author User
 */
public class FrameInformasi extends javax.swing.JFrame {

    /**
     * Creates new form FrameInformasi
     */
    public FrameInformasi() {
        initComponents();
        setTitle("ZAKAT PRO 3.0");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Kembali = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_ZakatProfesi = new javax.swing.JButton();
        btn_Zakat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(23, 101, 56));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Baznas kecil.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/k.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 13, -1, -1));

        Btn_Kembali.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Kembali.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        Btn_Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_undo_30px.png"))); // NOI18N
        Btn_Kembali.setText("KEMBALI");
        Btn_Kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_KembaliMouseClicked(evt);
            }
        });
        jPanel3.add(Btn_Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 550, 150, 47));

        jPanel1.setBackground(new java.awt.Color(187, 223, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 36)); // NOI18N
        jLabel1.setText("INFORMASI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(375, 375, 375))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 990, -1));

        btn_ZakatProfesi.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        btn_ZakatProfesi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_community_grants_35px.png"))); // NOI18N
        btn_ZakatProfesi.setText("Zakat Profesi");
        btn_ZakatProfesi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ZakatProfesiMouseClicked(evt);
            }
        });
        jPanel3.add(btn_ZakatProfesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 180, 50));

        btn_Zakat.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btn_Zakat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_donate_35px_2.png"))); // NOI18N
        btn_Zakat.setText("Zakat");
        btn_Zakat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ZakatMouseClicked(evt);
            }
        });
        jPanel3.add(btn_Zakat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 180, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/green-blue-combination-inside-wallpaper-preview222.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setPreferredSize(new java.awt.Dimension(985, 649));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 649));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_KembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_KembaliMouseClicked
        // TODO add your handling code here:
        FrameMenu menu = new FrameMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_KembaliMouseClicked

    private void btn_ZakatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ZakatMouseClicked
        // TODO add your handling code here:
        FrameZakat zakat = new FrameZakat();
        zakat.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ZakatMouseClicked

    private void btn_ZakatProfesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ZakatProfesiMouseClicked
        // TODO add your handling code here:
        FrameZakatProfesi zakatProfesi = new FrameZakatProfesi();
        zakatProfesi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ZakatProfesiMouseClicked

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
            java.util.logging.Logger.getLogger(FrameInformasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInformasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInformasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInformasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInformasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Kembali;
    private javax.swing.JButton btn_Zakat;
    private javax.swing.JButton btn_ZakatProfesi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
