package assignment_6;

/**
 * File: Assignment_6.java
 * Author: Aamir Khan
 * Date: July 5th, 2022 @ 10:00 AM
 * Purpose: Assignment 6 - MonthDays
 */

public class MonthDays {
    //Attributes:
    private int month;
    private int year;
    //Methods:
    //Constructor:
    public MonthDays(int month, int year){
        setMonth(month);
        setYear(year);
    }
    //Getters:
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    //Setters:
    public void setMonth(int month){
        if(month<1||month>12){
            System.out.println("Month must be between 1 and 12. Terminating...");
            System.exit(1);
        }
        else{
            this.month=month;
        }
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getNumberOfDays(){
        int numDays=0;
        //Determine whether we have a leap year:
        boolean isLeapYear;
        if(year%100==0&&year%400==0)
            isLeapYear=true;
        else if(year%100!=0&&year%4==0)
            isLeapYear=true;
        else
            isLeapYear=false;
        //Determine the number of days in a month:
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: numDays=31; //These months have 31 days.
                     break;
            case 2: {
                if(isLeapYear)   //In a leap year, February has 29 days.
                    numDays=29;
                else 
                    numDays=28;  //Otherwise, it'll have 28 days.
                break;
            }
            default: numDays=30; //The rest of the months have 30 days.
        }
        //Return the number of days:
        return numDays;
    }
    
}
