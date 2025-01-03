/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import model.AdminManagement.AdminProfile;
import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;

/**
 *
 * @author nikha
 */
public class ManageCustomersJPanel extends javax.swing.JPanel {
    
    JPanel cardSequencePanel;
    CustomerDirectory customerDirectory;
    Business business;
    JButton btnLogin;
    AdminProfile admin;

    /**
     * Creates new form ManageCustomersJPanel
     */
    public ManageCustomersJPanel(JPanel cardSequencePanel, Business business, AdminProfile admin, 
            JButton btnLogin) {
        initComponents();
        
        this.cardSequencePanel = cardSequencePanel;
        this.business = business;
        customerDirectory = business.getCustomerDirectory();
        this.btnLogin = btnLogin;
        this.admin = admin;

        Border border = new LineBorder(Color.GRAY,2,true);
        lblTitle.setBorder(border);

       populateOrderHistoryTable();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderHistory = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CUSTOMER ORDER HISTORY");
        lblTitle.setOpaque(true);

        tblOrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CUSTOMER NAME", "TOTAL NUMBER OF ORDERS PLACED"
            }
        ));
        jScrollPane1.setViewportView(tblOrderHistory);

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnBack)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        AdminWorkAreaJPanel panel = new AdminWorkAreaJPanel(business, admin, cardSequencePanel, btnLogin);
        cardSequencePanel.add("AdminWorkAreaJPanel", panel);
        CardLayout cardLayout = new CardLayout();
        cardSequencePanel.setLayout(cardLayout);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.next(cardSequencePanel);
        
        

    }//GEN-LAST:event_btnBackActionPerformed
    private void populateOrderHistoryTable() {
        
      DefaultTableModel model = (DefaultTableModel) tblOrderHistory.getModel();
      model.setRowCount(0);

      // Assuming you have access to the customerDirectory object
      for (CustomerProfile customerProfile : customerDirectory.getCustomerlist()) {
          String customerName = customerProfile.getPerson().getPersonId();
          int totalOrders = customerProfile.getTotalNumberOfOrders(); // Using the new method to get total orders

          model.addRow(new Object[]{customerName, totalOrders});
            }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrderHistory;
    // End of variables declaration//GEN-END:variables
}
