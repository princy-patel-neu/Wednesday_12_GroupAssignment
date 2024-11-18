/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Sales;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;

/**
 *
 * @author Swara
 */
public class UpdateProductPrices extends javax.swing.JPanel {

    Business business;
    Product product;
    JPanel cardSequencePanel;
    SalesPersonProfile salesPerson;

    /**
     * Creates new form BrowseProductCatalog
     */
    public UpdateProductPrices(JPanel cardSequencePanel, Business business, SalesPersonProfile salesPerson) {
        initComponents();

        this.cardSequencePanel = cardSequencePanel;
        this.business = business;
        this.salesPerson = salesPerson;
        Border border = new LineBorder(Color.GRAY, 2, true);
        lblTitle.setBorder(border);
        disableFields();
        initializeProductSummarytable();
        btnUpdate.setVisible(false);
        btnSave.setVisible(false);
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
        cmbSupplier = new javax.swing.JComboBox<>();
        lblSupplierName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSummary = new javax.swing.JTable();
        btnViewProduct = new javax.swing.JButton();
        txtProdName = new javax.swing.JTextField();
        txtFloor = new javax.swing.JTextField();
        txtCeiling = new javax.swing.JTextField();
        lblProductName = new javax.swing.JLabel();
        txtTarget = new javax.swing.JTextField();
        lblFloor = new javax.swing.JLabel();
        lblCeiling = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblTarget = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        lblTitle.setBackground(new java.awt.Color(153, 153, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("PRODUCT SUMMARY");
        lblTitle.setOpaque(true);

        cmbSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });

        lblSupplierName.setText("Select Supplier:");

        tblSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCT NAME ", "FLOOR", "CEILING", "TARGET"
            }
        ));
        jScrollPane1.setViewportView(tblSummary);

        btnViewProduct.setBackground(new java.awt.Color(153, 153, 255));
        btnViewProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProduct.setText("View Product");
        btnViewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductActionPerformed(evt);
            }
        });

        txtProdName.setEnabled(false);

        txtFloor.setEnabled(false);

        txtCeiling.setEnabled(false);

        lblProductName.setText("Product Name:");

        txtTarget.setEnabled(false);

        lblFloor.setText("Floor:");

        lblCeiling.setText("Ceiling:");

        btnUpdate.setBackground(new java.awt.Color(153, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(153, 153, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTarget.setText("Target:");

        btnBack.setBackground(new java.awt.Color(153, 153, 255));
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
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnViewProduct)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSupplierName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnBack)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblProductName)
                                .addComponent(lblFloor, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFloor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCeiling, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTarget, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(58, 58, 58)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCeiling, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSupplierName))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewProduct)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProductName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFloor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCeiling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCeiling))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTarget))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addGap(0, 70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed
        // TODO add your handling code here:
        populateProductSummarytable();
    }//GEN-LAST:event_cmbSupplierActionPerformed

    private void btnViewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductActionPerformed
        btnUpdate.setVisible(true);
        btnSave.setVisible(true);
        enableFields();

        txtFloor.setEnabled(false);
        txtCeiling.setEnabled(false);
        txtTarget.setEnabled(false);

        int selectedRow = tblSummary.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a product from the table first!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel dtm = (DefaultTableModel) tblSummary.getModel();
        product = (Product) dtm.getValueAt(selectedRow, 0);

        txtProdName.setText(product.toString());
        txtFloor.setText(String.valueOf(product.getFloorPrice()));
        txtCeiling.setText(String.valueOf(product.getCeilingPrice()));
        txtTarget.setText(String.valueOf(product.getTargetPrice()));

    }//GEN-LAST:event_btnViewProductActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtFloor.setEnabled(true);
        txtCeiling.setEnabled(true);
        txtTarget.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String floorPriceText = txtFloor.getText();
        int floorPrice = Integer.parseInt(floorPriceText);
        product.setFloorPrice(floorPrice);

        String CeilingPriceText = txtCeiling.getText();
        int CeilingPrice = Integer.parseInt(CeilingPriceText);
        product.setCeilingPrice(CeilingPrice);

        String TargetPriceText = txtTarget.getText();
        int TargetPrice = Integer.parseInt(TargetPriceText);
        product.setTargetPrice(TargetPrice);

        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

        JOptionPane.showMessageDialog(null, "Product successfully updated!");

        disableFields();
        btnUpdate.setVisible(false);
        btnSave.setVisible(false);
        populateProductSummarytable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SalesWorkAreaJPanel panel = new SalesWorkAreaJPanel(business, salesPerson,
                cardSequencePanel, btnBack);
        cardSequencePanel.add("SalesWorkAreaJPanel", panel);
        CardLayout cardLayout = new CardLayout();
        cardSequencePanel.setLayout(cardLayout);
        CardLayout layout = (CardLayout) cardSequencePanel.getLayout();
        layout.next(cardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewProduct;
    private javax.swing.JComboBox<String> cmbSupplier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCeiling;
    private javax.swing.JLabel lblFloor;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JLabel lblTarget;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblSummary;
    private javax.swing.JTextField txtCeiling;
    private javax.swing.JTextField txtFloor;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtTarget;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {

        int rowCount = tblSummary.getRowCount();
        int i;

        for (i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) tblSummary.getModel()).removeRow(i);
        }

        String supplierName = (String) cmbSupplier.getSelectedItem();

        Supplier supplier = business.getSupplierDirectory().findSupplier(supplierName);

        if (supplier == null) {
            return;
        }

        ProductCatalog productCatalog = supplier.getProductCatalog();

        for (Product product : productCatalog.getProductList()) {
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getFloorPrice();
            row[2] = product.getCeilingPrice();
            row[3] = product.getTargetPrice();

            ((DefaultTableModel) tblSummary.getModel()).addRow(row);
        }
    }

    private void disableFields() {
        lblProductName.setVisible(false);
        lblFloor.setVisible(false);
        lblTarget.setVisible(false);
        lblCeiling.setVisible(false);

        txtProdName.setVisible(false);
        txtFloor.setVisible(false);
        txtCeiling.setVisible(false);
        txtTarget.setVisible(false);
    }

    private void initializeProductSummarytable() {
        cleanUpCombobox();
        cleanUpTable();

        ArrayList<Supplier> supplierList = business.getSupplierDirectory().getSuplierList();

        if (supplierList.isEmpty()) {
            return;
        }

        for (Supplier supplier : supplierList) {
            cmbSupplier.addItem(supplier.toString());
            cmbSupplier.setSelectedIndex(0);

            String supplierName = (String) cmbSupplier.getSelectedItem();
            supplier = business.getSupplierDirectory().findSupplier(supplierName);

            ProductCatalog productCatalog = supplier.getProductCatalog();
        }
    }

    private void populateProductSummarytable() {
        int rowCount = tblSummary.getRowCount();
        int i;

        for (i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) tblSummary.getModel()).removeRow(i);
        }

        String supplierName = (String) cmbSupplier.getSelectedItem();

        Supplier supplier = business.getSupplierDirectory().findSupplier(supplierName);

        if (supplier == null) {
            return;
        }

        ProductCatalog productCatalog = supplier.getProductCatalog();

        for (Product product : productCatalog.getProductList()) {
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getFloorPrice();
            row[2] = product.getCeilingPrice();
            row[3] = product.getTargetPrice();

            ((DefaultTableModel) tblSummary.getModel()).addRow(row);
        }
    }

    private void enableFields() {
        lblProductName.setVisible(true);
        lblFloor.setVisible(true);
        lblTarget.setVisible(true);
        lblCeiling.setVisible(true);

        txtProdName.setVisible(true);
        txtFloor.setVisible(true);
        txtCeiling.setVisible(true);
        txtTarget.setVisible(true);
    }

    private void cleanUpCombobox() {
        cmbSupplier.removeAllItems();
    }

    private void cleanUpTable() {
        int row = tblSummary.getRowCount();
        int i;
        for (i = row - 1; i >= 0; i--) {
            ((DefaultTableModel) tblSummary.getModel()).removeRow(i);
        }
    }
}
