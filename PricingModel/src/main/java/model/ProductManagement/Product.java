/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

import java.util.ArrayList;

import model.OrderManagement.OrderItem;

/**
 *
 * @author kal bugrara
 */
public class Product {
    private String name;
    private int floorPrice;
    private int ceilingPrice;
    private int targetPrice;
    private int totalTargetSalesRevenue;
    public ArrayList<OrderItem> orderitems;
    
    
        public Product( int fp, int cp, int tp) {

        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        totalTargetSalesRevenue = 0;
        orderitems = new ArrayList();
    }
    public Product(String n, int fp, int cp, int tp) {
        name = n;
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList();
    }
    
        public Product updateProduct(int fp, int cp, int tp) {
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        return this; //returns itself
    }
        
        public double calculateRevenueChangePercentage(int newTargetPrice) {
        int oldRevenue = getTotalTargetSalesRevenue();
        int newRevenue = 0;
        for (OrderItem oi : orderitems) {
            newRevenue += oi.getQuantity() * newTargetPrice;
        }
        double revenueChangePercentage = 0.0;
        if (oldRevenue != 0) {
            revenueChangePercentage = ((double)(newRevenue - oldRevenue) / oldRevenue) * 100;
        }
        return revenueChangePercentage;
    }
        
    public int getTargetPrice() {return targetPrice;}
    
    public void addOrderItem(OrderItem oi){     
        orderitems.add(oi);
        totalTargetSalesRevenue += oi.getOrderItemTargetTotal();
    }
    
    public int getTargetSalesRevenue(){
        int total = 0;
        for(OrderItem oi : orderitems){
            total += oi.getOrderItemTargetTotal();
        }
        
        return total;
    }
    
    public void updateTargetPrice(int newTargetPrice) {
        // Calculate the difference between old and new target prices
        int priceDifference = newTargetPrice - targetPrice;
        // Update the target price
        targetPrice = newTargetPrice;
        // Update the cumulative total target sales revenue by adding the price difference for each order item
        for (OrderItem oi : orderitems) {
            totalTargetSalesRevenue += priceDifference * oi.getQuantity();
        }
    }
    
    public int getTotalTargetSalesRevenue() {
        return totalTargetSalesRevenue;
    }
    
    //Number of item sales above target 
    public int getNumberOfProductSalesAboveTarget(){
        int sum = 0;
        for (OrderItem oi: orderitems){
            if(oi.isActualAboveTarget()==true) sum = sum +1;
        }
        return sum;
    }
    public int getNumberOfProductSalesBelowTarget(){
        int sum = 0;
        for (OrderItem oi: orderitems){
            if(oi.isActualBelowTarget()==true) sum = sum +1;
        }
        return sum;
    }    
    
        public boolean isProductAlwaysAboveTarget(){
        
        for (OrderItem oi: orderitems){
            if(oi.isActualAboveTarget()==false) return false; //
        }
        return true;
    }
        
    public ArrayList<Integer> getAllActualPrices(){
        ArrayList<Integer> actualPrices = new ArrayList<>();
        
        for(OrderItem oi : orderitems){
            actualPrices.add(oi.getActualPrice());
        }
        
        return actualPrices;
    }
        
    //calculates the revenues gained or lost (in relation to the target)
    //For example, if target is at $2000 and actual is $2500 then revenue gained
    // is $500 above the expected target. If the actual is $1800 then the lose will be $200
    // Add all these difference to get the total including wins and loses
    
        public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
        }
        return sum;
    }
        public int getSalesVolume() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTotal();     //positive and negative values       
        }
        return sum;
    }
    public void setName(String n){
        name = n;
    }
    @Override
    public String toString(){
        return name;
    }
    public int getFloorPrice(){
        return floorPrice;
    }
    public int getCeilingPrice(){
        return ceilingPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public String getName() {
        return name;
    }
    
}
