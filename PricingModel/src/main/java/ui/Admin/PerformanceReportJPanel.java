/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.AdminManagement.AdminProfile;
import model.Business.Business;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.Supplier.Supplier;

/**
 *
 * @author nikha
 */
public class PerformanceReportJPanel extends javax.swing.JPanel {

    private ArrayList<Order> orders;
    JPanel cardSequencePanel;
    Business business;
    AdminProfile admin;
    Supplier selectedSupplier;
     ProductCatalog productCatalog;
     JButton btnLogin;
    /**
     * Creates new form PerformanceReportJPanel
     */
    public PerformanceReportJPanel(JPanel cardSequencePanel,Business business, AdminProfile admin,ArrayList<Order> orders, 
            ProductCatalog productCatalog, JButton btnLogin) {
        initComponents();
        
        this.cardSequencePanel = cardSequencePanel;
        this.business = business;
        this.admin = admin;
        this.orders = orders;
        this.productCatalog = productCatalog;
        this.btnLogin = btnLogin;
        initializeTable();
        populateRevenueFields();
        
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
        lblTargetSalesRevenue = new javax.swing.JLabel();
        lblCompanySalesRevenue = new javax.swing.JLabel();
        txtTargetSalesRevenue = new javax.swing.JTextField();
        txtCompanySalesRevenue = new javax.swing.JTextField();
        SupplierComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductRevenue = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblCompanyRevenueStatus = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("PERFORMANCE REPORT");

        lblTargetSalesRevenue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTargetSalesRevenue.setText("Target Sales Revenue:");

        lblCompanySalesRevenue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCompanySalesRevenue.setText("Company Sales Revenue:");

        SupplierComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SupplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierComboBoxActionPerformed(evt);
            }
        });

        tblProductRevenue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "PRODUCT NAME", "REVENUE %"
            }
        ));
        jScrollPane1.setViewportView(tblProductRevenue);

        btnBack.setBackground(new java.awt.Color(153, 153, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SupplierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTargetSalesRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCompanySalesRevenue))
                                    .addGap(121, 121, 121)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTargetSalesRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCompanySalesRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(lblCompanyRevenueStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(259, 259, 259))
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTargetSalesRevenue)
                    .addComponent(txtTargetSalesRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompanySalesRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompanySalesRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblCompanyRevenueStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(SupplierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SupplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierComboBoxActionPerformed
        // TODO add your handling code here:
        refreshSupplierCatalogTable();

    }//GEN-LAST:event_SupplierComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        AdminWorkAreaJPanel panel = new AdminWorkAreaJPanel(business, admin, cardSequencePanel, btnLogin);
        cardSequencePanel.add("SalesWorkAreaJPanel", panel);
        CardLayout cardLayout = new CardLayout();
        cardSequencePanel.setLayout(cardLayout);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.next(cardSequencePanel);

    }//GEN-LAST:event_btnBackActionPerformed

    private void initializeTable() {
        cleanUpCombobox();
        cleanUpTable();
        
        ArrayList<Supplier> supplierList = business.getSupplierDirectory().getSuplierList();
        
        if(supplierList.isEmpty()){
            return;
        }
        
        for(Supplier supplier : supplierList){
            SupplierComboBox.addItem(supplier.toString());
            SupplierComboBox.setSelectedIndex(0);
            
            String supplierName = (String) SupplierComboBox.getSelectedItem();
            selectedSupplier = business.getSupplierDirectory().findSupplier(supplierName);
            
            ProductCatalog productCatalog = selectedSupplier.getProductCatalog();
            
        }
    }

    private void cleanUpCombobox() {
        SupplierComboBox.removeAllItems();
    }

    private void cleanUpTable() {
        int row = tblProductRevenue.getRowCount();
        int i;
        for (i = row - 1; i >= 0; i--) {
            ((DefaultTableModel) tblProductRevenue.getModel()).removeRow(i);
        }
    }

    private void refreshSupplierCatalogTable() {
         int rowCount = tblProductRevenue.getRowCount();
        int i;
        
        for (i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) tblProductRevenue.getModel()).removeRow(i);
        }
        
        String supplierName = (String) SupplierComboBox.getSelectedItem();
        
        selectedSupplier = business.getSupplierDirectory().findSupplier(supplierName);
        
        if(selectedSupplier == null){
            return;
        }
        
        ProductCatalog productCatalog = selectedSupplier.getProductCatalog();
        
        for(Product product : productCatalog.getProductList()){
                double revenuePercentage = calculateRevenuePercentage(product);
                
                if (Double.isNaN(revenuePercentage)) {
            revenuePercentage = 0.0;
        }
        
            // Format revenue percentage to two decimal places
            String formattedRevenuePercentage = String.format("%.2f", revenuePercentage);
                
                Object[] row = new Object[2];
                row[0] = product;
                row[1] = formattedRevenuePercentage;
                
                
                ((DefaultTableModel) tblProductRevenue.getModel()).addRow(row);
            }
    }

    private void populateRevenueFields() {
    
     int totalTargetSalesRevenue = calculateTotalTargetSalesRevenue();
        int totalSalesRevenue = calculateTotalSalesRevenue();
        
        int profitOrLoss = totalSalesRevenue - totalTargetSalesRevenue;
        
        txtTargetSalesRevenue.setText(String.valueOf(totalTargetSalesRevenue));
        txtCompanySalesRevenue.setText(String.valueOf(totalSalesRevenue));
        
        if(profitOrLoss > 0){
            lblCompanyRevenueStatus.setForeground(Color.green);
            lblCompanyRevenueStatus.setBackground(Color.black);
            lblCompanyRevenueStatus.setOpaque(true);
            lblCompanyRevenueStatus.setText("   PROFIT OF $" +profitOrLoss );
        }
        
        else if(profitOrLoss < 0){
            lblCompanyRevenueStatus.setForeground(Color.red);
            lblCompanyRevenueStatus.setBackground(Color.black);
            lblCompanyRevenueStatus.setOpaque(true);
            lblCompanyRevenueStatus.setText("   LOSS: $" + profitOrLoss);
        }
        
        else{
            
            lblCompanyRevenueStatus.setForeground(Color.orange);
            lblCompanyRevenueStatus.setBackground(Color.black);
            lblCompanyRevenueStatus.setOpaque(true);
            lblCompanyRevenueStatus.setText("   NO PROFIT NO LOSS ");
}
        
    }           

    private int calculateTotalTargetSalesRevenue() {
        int total = 0;
        for (Order order : orders) {
            for (OrderItem oi : order.getOrderitems()) {
                total += oi.getStoredTargetPrice() * oi.getQuantity();
            }
        }
        System.out.println("Total Target Sales Revenue: " + total);
        return total;
    }

    private int calculateTotalSalesRevenue() {
        int total = 0;
      for (Order order : orders) {
           for (OrderItem oi : order.getOrderitems()) {
                total += oi.getOrderItemTotal();
           }
       }
       return total;
    }

    private double calculateRevenuePercentage(Product product) {
         int totalRevenue = calculateRevenueForProduct(product);
    System.out.println("Total revenue:" +totalRevenue);
    int targetSalesRevenue = product.getTargetSalesRevenue();
    System.out.println("Target Sales Revenue: " +targetSalesRevenue);
    
    // Calculate revenue percentage
    double revenuePercentage = ((double) totalRevenue / targetSalesRevenue) * 100;
    System.out.println("Revenue Percentage:" +revenuePercentage);
    
    return revenuePercentage;
           }

    private int calculateRevenueForProduct(Product product) {
         int totalRevenue = 0;
        for (Order order : orders) {
            totalRevenue += order.getSalesRevenueForProduct(product);
        }
        
        return totalRevenue;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SupplierComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompanyRevenueStatus;
    private javax.swing.JLabel lblCompanySalesRevenue;
    private javax.swing.JLabel lblTargetSalesRevenue;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblProductRevenue;
    private javax.swing.JTextField txtCompanySalesRevenue;
    private javax.swing.JTextField txtTargetSalesRevenue;
    // End of variables declaration//GEN-END:variables
}
