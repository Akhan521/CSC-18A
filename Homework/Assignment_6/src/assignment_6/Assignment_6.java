package assignment_6;

/**
 * File: Assignment_6.java
 * Author: Aamir Khan
 * Date: July 5th, 2022 @ 10:00 AM
 * Purpose: Assignment 6 - MonthDays
 */

public class Assignment_6 {
    
    public static void main(String[] args) {
        //Declare variables:
        int month,
            year;
        //Ask the user for input:
        System.out.print("Enter the month (1=January, 2=February, ..., 12=Decemeber): ");
        //Create an anonymous scanner object to read in the month:
        month=new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the year: ");
        //Create an anonymous scanner object to read in the year:
        year=new java.util.Scanner(System.in).nextInt();
        //Create a MonthDays Object:
        MonthDays date = new MonthDays(month,year); 
        //Output the number of days for the given date:
        System.out.println(date.getMonth()+"/"+date.getYear()+" has "+date.getNumberOfDays()+" days.");
    }
    
}
