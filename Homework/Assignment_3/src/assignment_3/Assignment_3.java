package assignment_3;

/**
 * File:    Assignment_3.java
 * Author:  Aamir Khan
 * Date:    6-28-2022 @ 12 PM
 * Purpose: Assignment 3
 */
public class Assignment_3 {
    
    public static void main(String[] args) {
        //Declare Variables:
        int days=0;      //Number of days.
        float pay=0.01f; //We begin with one cent.
        //Prompt the user for the # of days (In between 1 and 45.):
        while(days<1||days>45){
            System.out.print("For how many days will the pay double (1-45)? ");
            //Create an anonymous scanner object to read input:
            days=new java.util.Scanner(System.in).nextInt();
        }
        //Start our Table:
        System.out.println(); //Print a new line.
        System.out.println("Day             Total Pay        ");
        System.out.println("---------------------------------");
        for(int i=1;i<=days;i++){
            System.out.printf("%-15d $%15.2f",i,pay);
            System.out.println(); //Print a new line.
            pay*=2;               //Double our Pay.
        }
        System.out.println("---------------------------------");
        System.out.printf("Total           $%15.2f",pay);
        System.out.println();     //Print a new line.
    }
    
}
