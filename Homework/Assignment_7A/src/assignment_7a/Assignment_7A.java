package assignment_7a;

/**
 * File:    Assignment_7A.java
 * Author:  Aamir Khan
 * Date:    July 5th, 2022 @ 12:20 PM
 * Purpose: Assignment 7A - enum type.
 */

enum TrafficSignal{
    //Our enum constants:
    RED(5),GREEN(10),YELLOW(15),WALK(20),DONT_WALK(25);
    //Variable to hold the duration of the constant in seconds:
    private int duration;
    //Constructor: (Called for each constant.)
    private TrafficSignal(int duration){
        this.duration=duration;
    }
    //Getter method to return the duration in seconds:
    public int getDuration(){
        return duration;
    }
}

public class Assignment_7A {

    public static void main(String[] args) {
        //Store all enum constants in an array:
        //values() returns all enum constants.
        TrafficSignal[] signals=TrafficSignal.values();
        //Output all enum constants:
        System.out.println("Traffic Signal Enum Constants:");
        System.out.println("------------------------------");
        for(TrafficSignal signal:signals){
            System.out.printf("%-10s: ",signal);
            System.out.printf("%d seconds.%n",signal.getDuration());
        }
    }
    
}
