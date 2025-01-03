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
import model.CustomerManagement.CustomerProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;

/**
 *
 * @author nikha
 */
public class ProcessOrderJPanel extends javax.swing.JPanel {

    JPanel cardSequencePanel;
    Business business;
    CustomerProfile customerProfile;
    SalesPersonProfile salesPerson;
    Supplier selectedSupplier;
    Product selectedProduct;
    Order currentOrder;

    /**
     * Creates new form BookCustomerOrder
     */
    public ProcessOrderJPanel(JPanel cardSequencePanel, Business business, CustomerProfile selectedCustomer, SalesPersonProfile spp) {
        initComponents();
        this.cardSequencePanel = cardSequencePanel;
        this.business = business;
        customerProfile = selectedCustomer;
        salesPerson = spp;

       // lblTitle.setBackground(new Color(153, 153, 255));
        lblTitle.setOpaque(true);
        Border border = new LineBorder(Color.GRAY, 2, true);
        lblTitle.setBorder(border);

        lblProductAdd.setVisible(false);
        txtQuantity.setVisible(false);
        lblActualPrice.setVisible(false);
        txtActualPrice.setVisible(false);
        btnAddItem.setVisible(false);

        txtCustomer.setText(customerProfile.getCustomerId());
        txtSalesPerson.setText(salesPerson.getPerson().toString());

        MasterOrderList masterOrderList = business.getMasterOrderList();
        currentOrder = masterOrderList.newOrder(customerProfile, salesPerson);

        initializeTable();
        cleanUpItemsTable();

    }

    private void suggestOptimizedActualPrice(Product selectedProduct) {

        ArrayList<Integer> actualPrices = selectedProduct.getAllActualPrices();
        int sumActualPrices = actualPrices.stream().mapToInt(Integer::intValue).sum();
        int averageActualPrice = actualPrices.size() > 0 ? sumActualPrices / actualPrices.size() : 0;

        double targetPrice = selectedProduct.getTargetPrice();

        double priceDifference = targetPrice - averageActualPrice;
        double suggestedPrice = 0;
        if (averageActualPrice != 0) {

            System.out.println("Average Actual Price: " + averageActualPrice);

            if (averageActualPrice == selectedProduct.getCeilingPrice()) {
                suggestedPrice = selectedProduct.getCeilingPrice();
            } else {
                suggestedPrice = averageActualPrice + ((averageActualPrice + priceDifference) * 0.05);
                if (suggestedPrice > selectedProduct.getCeilingPrice()) {
                    suggestedPrice = selectedProduct.getCeilingPrice();
                }
            }
        } else {
            suggestedPrice = targetPrice * 0.05;
        }
        // Display the suggested actual price to the salesperson
        lblSuggestedPrice.setText("Suggested Actual Price: $" + String.format("%.2f", suggestedPrice));
        lblSuggestedPrice.setBackground(Color.black);
        lblSuggestedPrice.setOpaque(true);
        lblSuggestedPrice.setForeground(Color.orange);
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
        lblSuppliersList = new javax.swing.JLabel();
        suppliersComboBox = new javax.swing.JComboBox<>();
        lblCustomer = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JTextField();
        lblSalesPerson = new javax.swing.JLabel();
        txtSalesPerson = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        supplierCatalogTable = new javax.swing.JTable();
        lblProduct = new javax.swing.JLabel();
        lblOrderItems = new javax.swing.JLabel();
        businessIntelligencePanel = new javax.swing.JPanel();
        lblBusinessIntelligence = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblFrequencyAbove = new javax.swing.JLabel();
        lblFrequencyBelow = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtFreqAbove = new javax.swing.JTextField();
        txtFreqBelow = new javax.swing.JTextField();
        lblSalesRev = new javax.swing.JLabel();
        txtSalesRev = new javax.swing.JTextField();
        lblMargAroTarget = new javax.swing.JLabel();
        txtMargAroundTarget = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        scrollPaneOrderItems = new javax.swing.JScrollPane();
        orderItemsTable = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblProductAdd = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblActualPrice = new javax.swing.JLabel();
        txtActualPrice = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblSuggestedPrice = new javax.swing.JLabel();

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ORDER AREA");

        lblSuppliersList.setText("Suppliers:");

        suppliersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        suppliersComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersComboBoxActionPerformed(evt);
            }
        });

        lblCustomer.setText("Customer:");

        lblSalesPerson.setText("Sales Person:");

        supplierCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAME", "FLOOR", "CEILING", "TARGET"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        supplierCatalogTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                supplierCatalogTableMousePressed(evt);
            }
        });
        scrollPane.setViewportView(supplierCatalogTable);

        lblProduct.setText("Products:");

        lblOrderItems.setText("Order Items:");

        businessIntelligencePanel.setBackground(new java.awt.Color(0, 0, 0));
        businessIntelligencePanel.setForeground(new java.awt.Color(255, 255, 255));

        lblBusinessIntelligence.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBusinessIntelligence.setForeground(new java.awt.Color(255, 255, 255));
        lblBusinessIntelligence.setText("Business Product Intelligence");

        lblProductName.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName.setText("Product Name:");

        lblFrequencyAbove.setForeground(new java.awt.Color(255, 255, 255));
        lblFrequencyAbove.setText("Frequency Above Target:");

        lblFrequencyBelow.setForeground(new java.awt.Color(255, 255, 255));
        lblFrequencyBelow.setText("Frequency Below Target:");

        lblSalesRev.setForeground(new java.awt.Color(255, 255, 255));
        lblSalesRev.setText("Sales Revenue:");

        lblMargAroTarget.setForeground(new java.awt.Color(255, 255, 255));
        lblMargAroTarget.setText("Margin Around Target:");

        javax.swing.GroupLayout businessIntelligencePanelLayout = new javax.swing.GroupLayout(businessIntelligencePanel);
        businessIntelligencePanel.setLayout(businessIntelligencePanelLayout);
        businessIntelligencePanelLayout.setHorizontalGroup(
            businessIntelligencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(businessIntelligencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBusinessIntelligence)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(businessIntelligencePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(businessIntelligencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(businessIntelligencePanelLayout.createSequentialGroup()
                        .addComponent(lblSalesRev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMargAroTarget)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, businessIntelligencePanelLayout.createSequentialGroup()
                        .addGroup(businessIntelligencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, businessIntelligencePanelLayout.createSequentialGroup()
                                .addComponent(txtSalesRev, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(txtMargAroundTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(businessIntelligencePanelLayout.createSequentialGroup()
                                .addGroup(businessIntelligencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProductName)
                                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(businessIntelligencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFreqAbove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFrequencyAbove, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(35, 35, 35)
                        .addGroup(businessIntelligencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFrequencyBelow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFreqBelow))
                        .addGap(32, 32, 32))))
        );
        businessIntelligencePanelLayout.setVerticalGroup(
            businessIntelligencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(businessIntelligencePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBusinessIntelligence)
                .addGap(18, 18, 18)
                .addGroup(businessIntelligencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(lblFrequencyAbove)
                    .addComponent(lblFrequencyBelow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(businessIntelligencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFreqAbove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFreqBelow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(businessIntelligencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalesRev)
                    .addComponent(lblMargAroTarget))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(businessIntelligencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalesRev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMargAroundTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnAddItem.setBackground(new java.awt.Color(0, 0, 0));
        btnAddItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddItem.setForeground(new java.awt.Color(255, 255, 255));
        btnAddItem.setText("ADD");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        orderItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCT", "ACTUAL PRICE", "QUANTITY", "ITEM TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneOrderItems.setViewportView(orderItemsTable);

        btnSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblProductAdd.setText("Quantity:");

        lblActualPrice.setText("Actual Price:");

        btnSelect.setBackground(new java.awt.Color(0, 0, 0));
        btnSelect.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect.setText("SELECT");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSuggestedPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(lblOrderItems)
                    .addComponent(lblProduct)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSuppliersList)
                            .addComponent(suppliersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomer)
                            .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalesPerson)
                            .addComponent(txtSalesPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblActualPrice)
                                        .addComponent(lblProductAdd))
                                    .addComponent(btnSelect))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtQuantity)
                                        .addComponent(txtActualPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                    .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblSuggestedPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSubmit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel))
                        .addComponent(businessIntelligencePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPaneOrderItems, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuppliersList)
                    .addComponent(lblCustomer)
                    .addComponent(lblSalesPerson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suppliersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalesPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSuggestedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddItem)
                            .addComponent(btnSelect))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductAdd)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblActualPrice)
                            .addComponent(txtActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOrderItems)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneOrderItems, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(businessIntelligencePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnCancel))
                .addGap(0, 67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void suppliersComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersComboBoxActionPerformed
        // TODO add your handling code here:
        refreshSupplierProductCatalogTable();

    }//GEN-LAST:event_suppliersComboBoxActionPerformed

    private void supplierCatalogTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierCatalogTableMousePressed
        // TODO add your handling code here:
        int supplierTableSize = supplierCatalogTable.getRowCount();
        int selectedRow = supplierCatalogTable.getSelectionModel().getLeadSelectionIndex();

        if (selectedRow < 0 || selectedRow > supplierTableSize - 1) {
            return;
        }

        selectedProduct = (Product) supplierCatalogTable.getValueAt(selectedRow, 0);
        if (selectedProduct == null) {
            return;
        }

        ArrayList<Integer> actualPrices = selectedProduct.getAllActualPrices();

        System.out.println("Actual prices for Product: ");
        for (Integer price : actualPrices) {
            System.out.println(price);
        }

        ProductSummary productSummary = new ProductSummary(selectedProduct);

        txtProductName.setText(selectedProduct.toString());
        String revenues = String.valueOf(productSummary.getSalesRevenues());
        txtSalesRev.setText(revenues);
        txtFreqAbove.setText(String.valueOf(productSummary.getNumberAboveTarget()));
        txtFreqBelow.setText(String.valueOf(productSummary.getNumberBelowTarget()));
        txtMargAroundTarget.setText(String.valueOf(productSummary.getProductPricePerformance()));

        cleanUpItemsTable();
    }//GEN-LAST:event_supplierCatalogTableMousePressed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        if (selectedProduct == null) {
            JOptionPane.showMessageDialog(this, "PLEASE SELECT A PRODUCT FIRST!");
            return;
        }

        int quantity = Integer.parseInt(txtQuantity.getText());
        int actualPrice = Integer.parseInt(txtActualPrice.getText());

        OrderItem item = currentOrder.newOrderItem(selectedProduct, actualPrice, quantity);

        Object[] row = new Object[4];
        row[0] = String.valueOf(item.getSelectedProduct());
        row[1] = String.valueOf(item.getActualPrice());
        row[2] = String.valueOf(item.getQuantity());
        row[3] = String.valueOf(item.getOrderItemTotal());

        ((DefaultTableModel) orderItemsTable.getModel()).addRow(row);

        lblProductAdd.setVisible(false);
        txtQuantity.setVisible(false);
        lblActualPrice.setVisible(false);
        txtActualPrice.setVisible(false);
        btnAddItem.setVisible(false);
        btnSelect.setEnabled(true);

        txtQuantity.setText("");
        txtActualPrice.setText("");

        txtProductName.setText("");
        txtFreqAbove.setText("");
        txtFreqBelow.setText("");
        txtSalesRev.setText("");
        txtMargAroundTarget.setText("");
        lblSuggestedPrice.setVisible(false);

    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        currentOrder.Submit();
        JOptionPane.showMessageDialog(this, "ORDER SUBMITTED!");
        cleanUpItemsTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        currentOrder.CancelOrder();
        JOptionPane.showMessageDialog(this, "ORDER CANCELLED!");
        cleanUpItemsTable();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        int supplierTableSize = supplierCatalogTable.getRowCount();

        int selectedRow = supplierCatalogTable.getSelectionModel().getLeadSelectionIndex();

        if (selectedRow < 0 || selectedRow > supplierTableSize - 1) {
            return;
        }

        selectedProduct = (Product) supplierCatalogTable.getValueAt(selectedRow, 0);
        if (selectedProduct == null) {
            return;
        }

        lblProductAdd.setVisible(true);
        txtQuantity.setVisible(true);
        lblActualPrice.setVisible(true);
        txtActualPrice.setVisible(true);
        btnAddItem.setVisible(true);
        lblSuggestedPrice.setVisible(true);
        suggestOptimizedActualPrice(selectedProduct);

    }//GEN-LAST:event_btnSelectActionPerformed

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
    public void refreshSupplierProductCatalogTable() {

        int rowCount = supplierCatalogTable.getRowCount();
        int i;

        for (i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) supplierCatalogTable.getModel()).removeRow(i);
        }

        String supplierName = (String) suppliersComboBox.getSelectedItem();

        selectedSupplier = business.getSupplierDirectory().findSupplier(supplierName);

        if (selectedSupplier == null) {
            return;
        }

        ProductCatalog productCatalog = selectedSupplier.getProductCatalog();

        for (Product product : productCatalog.getProductList()) {
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getFloorPrice();
            row[2] = product.getCeilingPrice();
            row[3] = product.getTargetPrice();

            ((DefaultTableModel) supplierCatalogTable.getModel()).addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel businessIntelligencePanel;
    private javax.swing.JLabel lblActualPrice;
    private javax.swing.JLabel lblBusinessIntelligence;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblFrequencyAbove;
    private javax.swing.JLabel lblFrequencyBelow;
    private javax.swing.JLabel lblMargAroTarget;
    private javax.swing.JLabel lblOrderItems;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblProductAdd;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblSalesPerson;
    private javax.swing.JLabel lblSalesRev;
    private javax.swing.JLabel lblSuggestedPrice;
    private javax.swing.JLabel lblSuppliersList;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable orderItemsTable;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JScrollPane scrollPaneOrderItems;
    private javax.swing.JTable supplierCatalogTable;
    private javax.swing.JComboBox<String> suppliersComboBox;
    private javax.swing.JTextField txtActualPrice;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtFreqAbove;
    private javax.swing.JTextField txtFreqBelow;
    private javax.swing.JTextField txtMargAroundTarget;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSalesPerson;
    private javax.swing.JTextField txtSalesRev;
    // End of variables declaration//GEN-END:variables

    private void initializeTable() {
        cleanUpCombobox();
        cleanUpTable();

        ArrayList<Supplier> supplierList = business.getSupplierDirectory().getSuplierList();

        if (supplierList.isEmpty()) {
            return;
        }

        for (Supplier supplier : supplierList) {
            suppliersComboBox.addItem(supplier.toString());
            suppliersComboBox.setSelectedIndex(0);

            String supplierName = (String) suppliersComboBox.getSelectedItem();
            selectedSupplier = business.getSupplierDirectory().findSupplier(supplierName);

            ProductCatalog productCatalog = selectedSupplier.getProductCatalog();
        }
    }

    private void cleanUpItemsTable() {
        int rowCount = orderItemsTable.getRowCount();
        int i;
        for (i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) orderItemsTable.getModel()).removeRow(i);
        }
    }

    private void cleanUpCombobox() {
        suppliersComboBox.removeAllItems();
    }

    private void cleanUpTable() {

        int row = supplierCatalogTable.getRowCount();
        int i;
        for (i = row - 1; i >= 0; i--) {
            ((DefaultTableModel) supplierCatalogTable.getModel()).removeRow(i);
        }
    }
}
