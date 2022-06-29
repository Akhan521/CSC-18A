package assignment_2;

/**
 *  File:    Assignment_2.java
 *  Author:  Aamir Khan
 *  Date:    6-28-2022 @ 12:20 AM
 *  Purpose: Assignment 2
 */
public class Assignment_2 {
    
    public static void main(String[] args) {
        //Declare Variables:
        int num1,
            num2,
            num3,
            num4;
        //Prompt User for the 1st Value:
        System.out.print("Enter the first value:  ");
        //Create an Anonymous Scanner Object to Read in Input:
        num1=new java.util.Scanner(System.in).nextInt();
        //Prompt User for the 2nd Value:
        System.out.print("Enter the second value: ");
        //Create an Anonymous Scanner Object to Read in Input:
        num2=new java.util.Scanner(System.in).nextInt();
        //Prompt User for the 3rd Value:
        System.out.print("Enter the third value:  ");
        //Create an Anonymous Scanner Object to Read in Input:
        num3=new java.util.Scanner(System.in).nextInt();
        //Prompt User for the 4th Value:
        System.out.print("Enter the fourth value: ");
        //Create an Anonymous Scanner Object to Read in Input:
        num4=new java.util.Scanner(System.in).nextInt();
        //Determine the Max & Min (Initialize Both With num1.):
        int max=num1,
            min=num1;
        //Compare Max & Min Against num2.
        if(num2>max)
            max=num2;
        else if(num2<min)
            min=num2;
        //Compare Max & Min Against num3.
        if(num3>max)
            max=num3;
        else if(num3<min)
            min=num3;
        //Compare Max & Min Against num4.
        if(num4>max)
            max=num4;
        else if(num4<min)
            min=num4;
        //Output Our Values:
        System.out.print("The values entered: "+num1+", "+num2+", ");
        System.out.print(num3+", and "+num4+"\nhave a minimun value of ");
        System.out.println(min+" and a maximum value of "+max+".");
    }
    
}
