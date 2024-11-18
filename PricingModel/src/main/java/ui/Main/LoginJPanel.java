/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.main;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import model.AdminManagement.AdminProfile;
import model.Business.Business;
import model.MarketingManagement.MarketingPersonProfile;
import model.Personnel.Profile;
import model.SalesManagement.SalesPersonProfile;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;
import ui.Admin.AdminWorkAreaJPanel;
import ui.Sales.SalesWorkAreaJPanel;

/**
 *
 * @author Swara
 */
public class LoginJPanel extends javax.swing.JPanel {

    Business business;
    JPanel cardSequencePanel;
    JButton btnLogin;

    LoginJPanel(JPanel cardSequencePanel, JButton btnLogin, Business business) {
        initComponents();
        
        lblError.setVisible(false);
        
        this.cardSequencePanel = cardSequencePanel;
        this.btnLogin = btnLogin;
        btnLogin.setVisible(false);
        
        lblTitle.setBackground(new Color(153, 153, 255));
        lblTitle.setOpaque(true);
        Border border = new LineBorder(Color.GRAY,2,true);
        lblTitle.setBorder(border);
        
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnLoginUser = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("LOGIN");

        lblUsername.setText("Username:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPassword.setText("Password:");

        btnLoginUser.setBackground(new java.awt.Color(153, 153, 255));
        btnLoginUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLoginUser.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginUser.setText("LOGIN");
        btnLoginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginUserActionPerformed(evt);
            }
        });

        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText("Invalid Credentials!");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblError))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnLoginUser)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError))
                .addGap(36, 36, 36)
                .addComponent(btnLoginUser)
                .addGap(0, 155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginUserActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
        if(validateCredentials(username, password)){
            if(business != null){
                UserAccountDirectory userAccDir = business.getUserAccountDirectory();
                UserAccount userAccount = userAccDir.AuthenticateUser(username, password);
                
                if(userAccount != null){
                    String userRole = userAccount.getRole();
                    Profile profile = userAccount.getAssociatedPersonProfile();
                    if(profile instanceof SalesPersonProfile){
                        
                        SalesPersonProfile spp = (SalesPersonProfile) profile;
                        SalesWorkAreaJPanel panel = new SalesWorkAreaJPanel(business, spp, cardSequencePanel,
                        btnLogin);
                        cardSequencePanel.add("SalesWorkAreaPanel", panel);
                        CardLayout cardLayout = new CardLayout();
                        cardSequencePanel.setLayout(cardLayout);
                        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
                        layout.next(cardSequencePanel);
                    }
                    
                    else if(profile instanceof MarketingPersonProfile) {
                        
                    }
                    
                    else if(profile instanceof AdminProfile){
                        AdminProfile ap = (AdminProfile) profile;
                        AdminWorkAreaJPanel panel = new AdminWorkAreaJPanel(business, ap, cardSequencePanel,
                        btnLogin);
                        cardSequencePanel.add("SalesWorkAreaPanel", panel);
                        CardLayout cardLayout = new CardLayout();
                        cardSequencePanel.setLayout(cardLayout);
                        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
                        layout.next(cardSequencePanel);
                    }
                    
                } else {
                    lblError.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnLoginUserActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPasswordActionPerformed

    private boolean validateCredentials(String userName, String password) {
        if (userName.trim().isEmpty()) {
            this.lblError.setVisible(true);
            this.lblError.setText("");
            this.lblError.setText("Please enter Username !");
            return false;
        }
        if (password.trim().isEmpty()) {
            this.lblError.setVisible(true);
            this.lblError.setText("");
            this.lblError.setText("Please enter Password !");
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginUser;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
