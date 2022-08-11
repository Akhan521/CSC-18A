package assignment_10;

/**
 * File: Assignment_10.java
 * Author: Aamir Khan
 * Date: July 12th, 2022 @ 12:30 PM
 * Purpose: Assignment 10 - Exceptions
 */
public class Assignment_10 {
    
    public static void main(String[] args) {
        //Declare variables:
        int month,
            year;
        //Try Block.
        try{
            //Ask the user for month input:
            System.out.print("Enter the month (1=January, 2=February, ..., 12=Decemeber): ");
            //Create an anonymous scanner object to read in the month:
            month=new java.util.Scanner(System.in).nextInt();
            System.out.print("Enter the year: ");
            //Create an anonymous scanner object to read in the year:
            year=new java.util.Scanner(System.in).nextInt();
            //Create a MonthDays object:
            MonthDays date=new MonthDays(month,year);
            //Output the number of days for the given date:
            System.out.println(date.getMonth()+"/"+date.getYear()+" has "+date.getNumberOfDays()+" days.");
        }
        //Catch Block.
        catch(IllegalArgumentException e){
            System.out.println("An illegal argument was entered!");
            System.out.println(e.toString());
        }
    }
    
}
