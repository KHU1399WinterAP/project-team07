/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author rayan gostar
 */
public class ScoreBoard extends javax.swing.JFrame {

    /**
     * Creates new form ScoreBoard
     */
    public ScoreBoard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        totalScoreLabel = new javax.swing.JLabel();
        remainingTime = new javax.swing.JLabel();
        remainingBullets = new javax.swing.JLabel();
        defusedBombs = new javax.swing.JLabel();
        rightShoot = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(null);

        totalScoreLabel.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        totalScoreLabel.setForeground(new java.awt.Color(255, 0, 0));
        totalScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalScoreLabel.setText("44");
        mainPanel.add(totalScoreLabel);
        totalScoreLabel.setBounds(10, 350, 250, 40);

        remainingTime.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        remainingTime.setText("11");
        mainPanel.add(remainingTime);
        remainingTime.setBounds(190, 310, 50, 40);

        remainingBullets.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        remainingBullets.setText("11");
        mainPanel.add(remainingBullets);
        remainingBullets.setBounds(220, 250, 50, 40);

        defusedBombs.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        defusedBombs.setText("11");
        mainPanel.add(defusedBombs);
        defusedBombs.setBounds(200, 200, 70, 40);

        rightShoot.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        rightShoot.setText("11");
        mainPanel.add(rightShoot);
        rightShoot.setBounds(170, 150, 90, 40);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/scoreBanner.jpg"))); // NOI18N
        mainPanel.add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 276, 401);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreBoard().setVisible(true);
            }
        });
    }
    
    public void showPanel(){
        this.setResizable(false);
        this.setVisible(true);
        setCenter();
    }
    
    public void setCenter() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dimension.width / 2 - this.getSize().width / 2, dimension.height / 2 - this.getSize().height / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel defusedBombs;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel remainingBullets;
    private javax.swing.JLabel remainingTime;
    private javax.swing.JLabel rightShoot;
    private javax.swing.JLabel totalScoreLabel;
    // End of variables declaration//GEN-END:variables
}
