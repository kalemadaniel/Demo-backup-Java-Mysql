/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import classes.clsBackup;

/**
 *
 * @author Ulb-Kalema
 */
public class formPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form formPrincipal
     */
    public formPrincipal() {
        initComponents(); 
        // centrer le formulaire
        this.setLocationRelativeTo(null);
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
        jLabel9 = new javax.swing.JLabel();
        lblicon = new javax.swing.JLabel();
        lblmessage = new javax.swing.JLabel();
        lblemplacement = new javax.swing.JLabel();
        lblduree = new javax.swing.JLabel();
        lblfin = new javax.swing.JLabel();
        lbldebut = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(82, 72, 145));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BACKUP");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 440, 60));

        lblicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pic_success.png"))); // NOI18N
        jPanel1.add(lblicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 100, 90));

        lblmessage.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblmessage.setForeground(new java.awt.Color(0, 212, 89));
        lblmessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 890, 50));

        lblemplacement.setForeground(new java.awt.Color(0, 204, 204));
        lblemplacement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblemplacement, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 470, 30));

        lblduree.setForeground(new java.awt.Color(255, 97, 19));
        lblduree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblduree, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 470, 30));

        lblfin.setForeground(new java.awt.Color(255, 97, 19));
        lblfin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblfin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 470, 30));

        lbldebut.setForeground(new java.awt.Color(255, 97, 19));
        lbldebut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbldebut, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 470, 30));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("");
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sauvegarde");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 150, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 220, 40));

        jPanel3.setBackground(new java.awt.Color(0, 90, 151));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 60));

        jPanel4.setBackground(new java.awt.Color(53, 47, 93));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        clsBackup bac=new clsBackup();
        bac.backup(lbldebut, lblfin, lblduree, lblicon, lblmessage, lblemplacement);
    }//GEN-LAST:event_jPanel2MouseClicked

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
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbldebut;
    private javax.swing.JLabel lblduree;
    private javax.swing.JLabel lblemplacement;
    private javax.swing.JLabel lblfin;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblmessage;
    // End of variables declaration//GEN-END:variables
}
