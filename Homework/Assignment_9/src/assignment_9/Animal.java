package assignment_9;

/**
 * File: Animal.java
 * Author: Aamir Khan
 * Date: 7-12-2022 @ 10:20 AM
 * Purpose: Assignment 9
 */
public abstract class Animal {  //Abstract class.
    //Attributes:
    private String name;
    private float weight;
    //Methods:
    Animal(String name, float weight){ //Constructor.
        this.name=name;
        this.weight=weight;
    }
    public abstract void eat();  //An abstract method.
    public abstract void move(); //An abstract method.
    public String getName(){     //A getter method.
        return this.name;
    }
    public float getWeight(){
        return this.weight;      //A getter method.
    }
}
