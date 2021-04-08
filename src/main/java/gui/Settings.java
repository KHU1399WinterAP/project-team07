/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.Database;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;

/**
 * @author adel
 */
public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */

    public Settings() {

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
        seasonChoice = new java.awt.Choice();
        difficultyChoice = new java.awt.Choice();
        seasonLabel = new javax.swing.JLabel();
        difficultyLabel = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        springPreview = new javax.swing.JLabel();
        summerPreview = new javax.swing.JLabel();
        fallPreview = new javax.swing.JLabel();
        winterPreview = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(51, 102, 0));

        seasonChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        seasonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other/season.png"))); // NOI18N

        difficultyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other/difficulty.png"))); // NOI18N

        settingsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other/settingst.png"))); // NOI18N

        springPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/minispringmap.jpg"))); // NOI18N

        summerPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/minisummermap.jpg"))); // NOI18N

        fallPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/minifallmap.jpg"))); // NOI18N

        winterPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/miniwintermap.jpg"))); // NOI18N

        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/returntodash.jpg"))); // NOI18N
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(springPreview)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(summerPreview)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fallPreview)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(winterPreview))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(difficultyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(difficultyChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(seasonLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seasonChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(settingsLabel)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(settingsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seasonLabel)
                    .addComponent(seasonChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(winterPreview)
                    .addComponent(springPreview)
                    .addComponent(summerPreview)
                    .addComponent(fallPreview))
                .addGap(26, 26, 26)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(difficultyLabel)
                    .addComponent(difficultyChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dashboard dashboard = new Dashboard();
        dashboard.showpanel();
    }//GEN-LAST:event_returnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    public void showpanel() {
        setResizable(false);
        setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        addItemC1();
        addItemC2();
    }

    public void addItemC1() {
        seasonChoice.add("spring");
        seasonChoice.add("summer");
        seasonChoice.add("fall");
        seasonChoice.add("winter");
    }

    public static String getTheme() {
        String theme = seasonChoice.getItem(seasonChoice.getSelectedIndex());
        return theme;
    }

    public void addItemC2() {
        difficultyChoice.add("easy");
        difficultyChoice.add("hard");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static java.awt.Choice difficultyChoice;
    private javax.swing.JLabel difficultyLabel;
    private javax.swing.JLabel fallPreview;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton returnButton;
    public static java.awt.Choice seasonChoice;
    private javax.swing.JLabel seasonLabel;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JLabel springPreview;
    private javax.swing.JLabel summerPreview;
    private javax.swing.JLabel winterPreview;
    // End of variables declaration//GEN-END:variables
}
