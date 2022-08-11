package assignment_5;

/**
 * File:    Assignment_5.java
 * Author:  Aamir Khan
 * Date:    July 5th, 2022 @ 12:30 AM
 * Purpose: Assignment 5 - Array Stats.
 */

public class Assignment_5 {
    
    public static void main(String[] args) {
        //Prompt the User for Input:
        System.out.print("How many type double values do you want to store in your array? ");
        //Create an anonymous scanner object to read in the size:
        int size=new java.util.Scanner(System.in).nextInt();
        //Create a double array:
        double[] array=new double[size];
        //Read in values:
        for(int i=0;i<size;i++){
            System.out.print("Enter Value #"+(i+1)+": ");
            //Create an anonymous scanner object to read in values:
            array[i]=new java.util.Scanner(System.in).nextDouble();
        }
        //Finding the min and max values:
        double min=array[0], //Initializing both with the 1st value.
               max=array[0];
        for(double val:array){ //Enhanced for-loop.
            if(val>max)
                max=val;
            else if(val<min)
                min=val;
        }
        //Finding the average of the array:
        double avg=0.0f;
        for(double val:array){
            avg+=val; //Adding the values before we divide by the size.
        }
        avg/=size;    //Dividing the total by the size to get the average.
        //Finding the population standard deviation:
        double popStdDev=popStdDev(array);
        //Finding the sample standard deviation:
        double sampStdDev=sampStdDev(array);
        //Output the stats:
        System.out.println();
        System.out.println("The statistics for your user-entered array are:");
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.printf("\t\t\tMinimum: %10.3f%n",min);
        System.out.printf("\t\t\tMaximum: %10.3f%n",max);
        System.out.printf("\t\t\tAverage: %10.3f%n",avg);
        System.out.printf("Standard Deviation (Population): %10.3f%n",popStdDev);
        System.out.printf("    Standard Deviation (Sample): %10.3f%n",sampStdDev);
    }
    
    private static double popStdDev(double... v){
        double popStdDev=0.0f; //The population standard deviation.
        //Step 1 - Find the mean:
        double mean=0.0f;
        int size=0;
        for(double val:v){
            mean+=val; //Adding the values before we divide by the size.
            size++;    //We have a value, so we increment our size.
        }
        mean/=size;    //Dividing the total by the size to get the average.
        //Steps 2 & 3 - For each data point, find the square of its distance 
        //to the mean. Then, add these values together.
        double sum=0.0f;
        for(double val:v){
            sum+=(val-mean)*(val-mean); //(Value - Mean)^2.
        }
        //Step 4 - Divide by the number of data points:
        sum/=size;
        //Step 5 - Take the square root.
        popStdDev=Math.sqrt(sum);
        return popStdDev;
    }
    
    private static double sampStdDev(double... v){
        double sampStdDev=0.0f;
        //Step 1 - Find the mean:
        double mean=0.0f;
        int size=0;
        for(double val:v){
            mean+=val; //Adding the values before we divide by the size.
            size++;    //We have a value, so we increment our size.
        }
        mean/=size;    //Dividing the total by the size to get the average.
        //Steps 2 & 3 - For each data point, find the square of its distance 
        //to the mean. Then, add these values together.
        double sum=0.0f;
        for(double val:v){
            sum+=(val-mean)*(val-mean); //(Value - Mean)^2.
        }
        //Step 4 - Divide by the number of data points - 1:
        sum/=(size-1);
        //Step 5 - Take the square root.
        sampStdDev=Math.sqrt(sum);
        return sampStdDev;
    }
    
}
