package assignment_8;

/**
 * File:    Assignment_8.java
 * Author:  Aamir Khan
 * Date:    July 12, 2022 @ 12:20 AM
 * Purpose: Assignment 8
 */
public class Assignment_8 {

    public static void main(String[] args) {
        //Create a Derived Object:
        Nintendo system=new Nintendo("Nintendo Switch",2020);
        //Set the Account Info:
        system.setAcct("AamirKhan@nintendo.com");
        //Set the Membership to true:
        system.setMS(true);
        //Output all of our data:
        System.out.println("System:  "+system.getSystem());
        System.out.println("Year:    "+system.getYear());
        System.out.println("Account: "+system.getAcct());
        System.out.println("Member?  "+system.getMS());
        
    }
    
}
