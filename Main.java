/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        PrintProduct printer = new PrintProduct();
        System.out.println("****************************************************");
        System.out.println("PRODUCT SALES REPORT:");
        System.out.println("****************************************************");
        printer.printTotalProductSales(product);
        printer.printAverageProductSales(product);
        printer.printMostPopularProductSales(product);
        
        
    }
}
