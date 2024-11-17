/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.AdminManagement.AdminDirectory;
import model.AdminManagement.AdminProfile;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {
 
  public static Business initialize() {
    Business business = new Business("Xerox");
    SupplierDirectory supplierDirectory = business.getSupplierDirectory();
    
    // Creating supplier
    Supplier supplier1 = supplierDirectory.newSupplier("Lenovo");
   
    ProductCatalog productCatalog = supplier1.getProductCatalog();
    Product product11 = productCatalog.newProduct("Scanner300", 10000, 17000, 13000);
    Product product12 = productCatalog.newProduct("ScannerA4", 8000, 17000, 13000);
    Product product13 = productCatalog.newProduct("Color Printer M13", 8000, 15000, 12000);
    Product product14 = productCatalog.newProduct("PhotoCopier S12",10000, 17000, 13000);
    Product product15 = productCatalog.newProduct("Color Printer Z10",9500, 18000, 13500);
    Product product16 = productCatalog.newProduct("3D Printer Ultra",11000, 21000, 17000);
    Product product17 = productCatalog.newProduct("Scanner450",9000, 13500, 11500);
    Product product18 = productCatalog.newProduct("Scanner X25",12000, 17000, 13500);
    Product product19 = productCatalog.newProduct("Photo Copier S17",8500, 16000, 12000);
    Product product20 = productCatalog.newProduct("Inkjet Printer Pro", 9500, 19000, 14500);

    
    Supplier supplier2 = supplierDirectory.newSupplier("Epson");
    productCatalog = supplier2.getProductCatalog();
    Product product23 = productCatalog.newProduct("Inkjet Printer Plus", 9000, 18000, 13500);
    Product product24 = productCatalog.newProduct("Laser Printer Pro", 11000, 20000, 15500);
    Product product25 = productCatalog.newProduct("Document Scanner X1", 7500, 16000, 12000);
    Product product26 = productCatalog.newProduct("Inkjet Printer Basic", 6000, 14000, 10000);
    Product product27 = productCatalog.newProduct("Laser Copier 1000", 8500, 17000, 12500);
    Product product28 = productCatalog.newProduct("Fax Machine F10", 5000, 12000, 9000);
    Product product29 = productCatalog.newProduct("Multifunction Printer M20", 9500, 19000, 14500);
    Product product30 = productCatalog.newProduct("Color Laser Printer L1", 12000, 22000, 17000);
    Product product31 = productCatalog.newProduct("Document Scanner A3", 8000, 18000, 13500);
    Product product32 = productCatalog.newProduct("Inkjet Photo Printer P50", 7000, 15000, 11000);


    Supplier supplier3 = supplierDirectory.newSupplier("Toshiba"); 
    productCatalog = supplier3.getProductCatalog();
    Product product33 = productCatalog.newProduct("Color Printer X", 12000, 19000, 16000);
    Product product34 = productCatalog.newProduct("Black and White Copier B2", 10000, 17000, 14000);
    Product product35 = productCatalog.newProduct("Portable Printer P20", 8000, 16000, 12000);
    Product product36 = productCatalog.newProduct("Document Scanner S30", 9000, 18000, 13500);
    Product product37 = productCatalog.newProduct("Label Printer L10", 6000, 14000, 10000);
    Product product38 = productCatalog.newProduct("Photocopier A5", 11000, 20000, 15500);
    Product product39 = productCatalog.newProduct("Dot Matrix Printer D5", 7500, 15000, 11000);
    Product product40 = productCatalog.newProduct("Color Laser Copier C2", 12500, 22000, 17000);
    Product product41 = productCatalog.newProduct("Large Format Printer L30", 14000, 25000, 19000);
    Product product42 = productCatalog.newProduct("Barcode Scanner B5", 8500, 16000, 12000);
    
    Supplier supplier4 = supplierDirectory.newSupplier("HP");
    productCatalog = supplier4.getProductCatalog();
    Product product43 = productCatalog.newProduct("Inkjet Printer I15", 6000, 12000, 9000);
    Product product44 = productCatalog.newProduct("Laser Printer L20", 8000, 15000, 11000);
    Product product45 = productCatalog.newProduct("Multifunction Printer M25", 10000, 18000, 13500);
    Product product46 = productCatalog.newProduct("OfficeJet Pro P40", 12000, 20000, 16000);
    Product product47 = productCatalog.newProduct("Color LaserJet C35", 15000, 25000, 20000);
    Product product48 = productCatalog.newProduct("DesignJet D50", 20000, 30000, 25000);
    Product product49 = productCatalog.newProduct("PageWide Printer P60", 18000, 28000, 22000);
    Product product50 = productCatalog.newProduct("DeskJet D30", 4000, 10000, 8000);
    Product product51 = productCatalog.newProduct("Envy Printer E10", 7000, 14000, 11000);
    Product product52 = productCatalog.newProduct("Sprocket Printer S5", 2000, 6000, 4000);

    Supplier printerProSupplier = supplierDirectory.newSupplier("PrinterPro");
    productCatalog = printerProSupplier.getProductCatalog();
    Product product53 = productCatalog.newProduct("PrinterPro HL-L2390DW", 9000, 16000, 12000);
    Product product54 = productCatalog.newProduct("PrinterPro MFC-L2750DW", 10000, 18000, 14000);
    Product product55 = productCatalog.newProduct("PrinterPro DCP-L2550DW", 8000, 15000, 11000);
    Product product56 = productCatalog.newProduct("PrinterPro HL-L2350DW", 7500, 14000, 10000);
    Product product57 = productCatalog.newProduct("PrinterPro MFC-J995DW", 11000, 20000, 15000);
    Product product58 = productCatalog.newProduct("PrinterPro HL-L3210CW", 8500, 16000, 12000);
    Product product59 = productCatalog.newProduct("PrinterPro MFC-L8900CDW", 12000, 22000, 17000);
    Product product60 = productCatalog.newProduct("PrinterPro HL-L3270CDW", 9500, 18000, 13500);
    Product product61 = productCatalog.newProduct("PrinterPro MFC-J6935DW", 13000, 23000, 18000);
    Product product62 = productCatalog.newProduct("PrinterPro HL-L6200DW", 14000, 24000, 19000);

    
    // Creating Persons
    PersonDirectory personDirectory = business.getPersonDirectory();
    
    Person xeroxSalesPerson = personDirectory.newPerson("Xerox Sales");
    Person xeroxMarketinPerson = personDirectory.newPerson("Xerox Marketing");
    Person xeroxAdminPerson = personDirectory.newPerson("Xerox Admin");
    
    // Creating Person objects to represent organizations
    Person customer1 = personDirectory.newPerson("Dell");
    Person customer2 = personDirectory.newPerson("Google");
    Person customer3 = personDirectory.newPerson("Acer");
    Person customer4 = personDirectory.newPerson("Facebook");
    
    // Creating customer profiles
    CustomerDirectory customerDirectory = business.getCustomerDirectory();
    CustomerProfile customerProfile1 = customerDirectory.newCustomerProfile(customer1);
    CustomerProfile customerProfile2 = customerDirectory.newCustomerProfile(customer2);
    CustomerProfile customerProfile3 = customerDirectory.newCustomerProfile(customer3);
    CustomerProfile customerProfile4 = customerDirectory.newCustomerProfile(customer4);
    
    // Creating Sales Profile for person
    SalesPersonDirectory salesPersonDirectory = business.getSalesPersonDirectory();
    SalesPersonProfile salesPersonProfile = salesPersonDirectory.newSalesPersonProfile(xeroxSalesPerson);
    
     AdminDirectory adminDirectory = business.getAdminDirectory();
     AdminProfile adminProfile = adminDirectory.newAdminProfile(xeroxAdminPerson);
    
    //Creating user accounts to link to specific
    UserAccountDirectory userAccDir = business.getUserAccountDirectory();
    UserAccount userAccountSales = userAccDir.newUserAccount(salesPersonProfile, "Sales", "Sales");
    UserAccount userAccountAdmin = userAccDir.newUserAccount(adminProfile, "Admin", "Admin");
    
    MasterOrderList masterOrderList = business.getMasterOrderList();
    Order order1 = masterOrderList.newOrder(customerProfile1, salesPersonProfile);
    order1.newOrderItem(product11, 12000, 2);
    order1.newOrderItem(product12, 13000, 4);
    order1.newOrderItem(product13, 12000, 2);
    order1.newOrderItem(product14, 13000, 4);
    order1.newOrderItem(product15, 13500, 2);
    order1.newOrderItem(product16, 17000, 4);
    order1.newOrderItem(product17, 11500, 2);
    order1.newOrderItem(product18, 13500, 4);
    order1.newOrderItem(product19, 12000, 2);
    order1.newOrderItem(product20, 14500, 4);
    
    Order order2 = masterOrderList.newOrder(customerProfile1, salesPersonProfile);
    order2.newOrderItem(product23, 13500, 4);
    order2.newOrderItem(product24, 15500, 1);
    order2.newOrderItem(product25, 12000, 4);
    order2.newOrderItem(product26, 10000, 1);
    order2.newOrderItem(product27, 12500, 4);
    order2.newOrderItem(product28, 9000, 1);
    order2.newOrderItem(product29, 14500, 4);
    order2.newOrderItem(product30, 17000, 1);
    order2.newOrderItem(product31, 13500, 4);
    order2.newOrderItem(product32, 11000, 1);
    
    OrderItem orderItem13 = order1.newOrderItem(product11, 10500, 4);
    OrderItem orderItem2 = order1.newOrderItem(product12, 10000, 4);
    OrderItem orderItem21 = order1.newOrderItem(product12, 8000, 1);
    OrderItem orderItem3 = order1.newOrderItem(product13, 8000, 3);
    OrderItem orderItem4 = order1.newOrderItem(product14, 15000, 3);
    
    OrderItem orderItem31 = order1.newOrderItem(product13, 10000, 2);
    OrderItem orderItem32 = order1.newOrderItem(product13, 8500, 3);
    OrderItem orderItem33 = order1.newOrderItem(product13, 9000, 1);

    OrderItem orderItem41 = order1.newOrderItem(product14, 16000, 2);
    OrderItem orderItem42 = order1.newOrderItem(product14, 17000, 1);

    OrderItem orderItem51 = order1.newOrderItem(product15, 16000, 3);
    OrderItem orderItem52 = order1.newOrderItem(product15, 17000, 2);

    OrderItem orderItem61 = order1.newOrderItem(product16, 14000, 2);
    OrderItem orderItem62 = order1.newOrderItem(product16, 13000, 1);

    OrderItem orderItem71 = order1.newOrderItem(product17, 12000, 4);
    OrderItem orderItem72 = order1.newOrderItem(product17, 13000, 2);

    OrderItem orderItem81 = order1.newOrderItem(product18, 14000, 3);
    OrderItem orderItem82 = order1.newOrderItem(product18, 15000, 1);

    OrderItem orderItem91 = order1.newOrderItem(product19, 11000, 2);
    OrderItem orderItem92 = order1.newOrderItem(product19, 12000, 1);

    return business;
  }
}
