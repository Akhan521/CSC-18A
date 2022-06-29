//package assignment_4;

/**
 * File: Assignment_4.java
 * Author: Aamir Khan
 * Date: 6-28-2022 @ 2:30 PM
 * Purpose: Assignment 4 - Perfect Numbers
 * 
 * "We consider an integer number a perfect number if its factors
 * (excluding itself) total up to the number. For example, 6 is a 
 * perfect number because its factors (excluding 6) are: 1, 2, and 3, 
 * which total to 6."
 */
public class Assignment_4 {
    
    public static void main(String[] args) {
        //Declare our Variables:
        int max; //To hold the max value of our range.
        //Prompt the User for Input:
        System.out.print("Enter the largest number to try to display: ");
        //Create an anonymous scanner object to read input:
        max=new java.util.Scanner(System.in).nextInt();
        //Output all perfect #'s between 2-Max:
        for(int i=2;i<=max;i++){
            //Output only perfect numbers:
            if(isPerfect(i)!=null)
                System.out.println(isPerfect(i));
        }
    }
    
    //isPerfect Method:
    static String isPerfect(int num){
        //Declare our variables:
        int sum=0;        //To hold the sum of our factors.
        String result=""; //To hold our factors.
        //Find all factors and add them to the sum variable:
        //We have to exclude the number itself, so we stop before num.
        for(int i=1;i<num;i++){
            if(num%i==0){ //If we have a factor...
                sum+=i;   //We add it to our sum.
            }
        }
        //Check to see if the sum is = to the number:
        if(sum==num){ //If we have a perfect number...
            result+=num+" is perfect.\n\tFactors: ";
            //Add all of our factors to our result:
            for(int i=1;i<num;i++){
                if(num%i==0){      //If we have a factor...
                    result+=i+" "; //Add the factor to our string.
                }
            }
        }
        else{ //If we don't have a perfect number...
            return null;
        }
        //Return our factors:
        return result;
    }
    
}
