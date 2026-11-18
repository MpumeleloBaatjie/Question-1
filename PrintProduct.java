/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {
    public void printTotalProductSales(Product p){
        System.out.print("TOTAL PRODUCT SALES: " + p.GetTotalProductSold());
    }
        public void printAverageProductSales(Product p){
        System.out.print("Average PRODUCT SALES: " + p.GetAverageProducttSold());
        }
        
            public void printMostPopularProduct(Product p){
        System.out.print("MOST POPULAR PRODUCT: " + p.GetMostPopularProduct());
            }
    
}
