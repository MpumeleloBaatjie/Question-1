/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */

import java.util.Scanner;

public class Product extends IProduct {
    
    
    private String[] products ={"Cozy Nights Monarchs", "Restonic Barbados", "Sealy Phuket"};
    
    
    private int[][] sales = new int[3][3];
    
    
    public Product(){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Enter number of sales for month " + (j+1) " for " + products[i] + " mattress: ");
                sales[i][j]= sc.nextInt();
            }
        }
    }
    
    
     public Product (int [][] testSales){
         this.sales = testSales;
     }
     
     publicString[] getProducts(){return products;}
     public int[][] getSales(){return sales;}
     
     
     @Override
     public double GetTotalProductSold(){
         int total = 0;
         for(int i=0; i<sales.length; i++){
             for(int j=0; sales[i].length; j++){
                 total += sales[i][j];
             }
             return total;
         }
         
         @Override
         public double GetAverageProductSold(){
         return(double) GetTotalProductSold()/9;
     }
         
         @Override
         public String GetMostPopularProduct(){
           int maxTotal = -1;
           String popular = "";
           for(int i=0; i<3; i++){
               int productTotal = 0;
               for(int j=0; j<3; j++){
                   productTotal += sales[i][j];
               }
               if(productTotal>maxTotal){
                   maxTotal = productTotal;
                   popular = products[i];
               }
           }
           return popular;
         
     }
     }
    
    
}
