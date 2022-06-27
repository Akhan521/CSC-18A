/*
 * Author: Aamir Khan
 * Date: 6-21-2022 @ 9:20 AM
 * Purpose: Assignment 1 - Monthly Sales Tax
 * 
 * State Sales Tax = 8.75% / County Sales Tax = 2.35% / Total Sales Tax = 11.10%
 * S = T / 1.111 -> T = Total Amount Including Sales Tax & S = Product Sales.
 * T = S + S(.111) = S(1+.111) = 1.111 * S. Then, S = T / 1.111.
 */
//package assignment_1;

import java.util.Scanner;

public class Assignment_1 {

    public static void main(String[] args) {
        //Declare + Initialize Variables:
        String month;   //Month Name.
        int year;       //Year.
        float total,    //Total Amount in Sales.
              prdctSls, //Product Sales Excluding Tax.
              cntySls,  //County Sales Tax.
              stateSls; //State Sales Tax.
        final float stateTax=0.0875f, //The State Tax  (8.75%).
                     cntyTax=0.0235f; //The County Tax (2.35%).
        Scanner scan = new Scanner(System.in);
        //Prompt User for Inputs:
        System.out.println("Enter the Month: ");
        month=scan.nextLine();
        System.out.println("Enter the Year: ");
        year=scan.nextInt();
        System.out.println("Enter the Total Amount Collected: ");
        total=scan.nextFloat();
        //Perform + Store Calculations:
        prdctSls=total/(1+stateTax+cntyTax); //Sales = Total / Total Sales Tax.
        stateSls=prdctSls*stateTax;          //StateSls = Sales * StateTaxRate.
        cntySls =prdctSls*cntyTax;           //CntySls  = Sales * CntyTaxRate.
        //Display Outputs:
        System.out.println();
        System.out.println("Month: "+month+" "+year);
        System.out.println("-------------------------------");
        System.out.printf("Total Collected:     $%9.2f%n",total);
        System.out.printf("Sales:               $%9.2f%n",prdctSls);
        System.out.printf("County Sales Tax:    $%9.2f%n",cntySls);
        System.out.printf("State Sales Tax:     $%9.2f%n",stateSls);
        System.out.printf("Total Sales Tax:     $%9.2f%n",cntySls+stateSls);
        scan.close();
    }
    
}
