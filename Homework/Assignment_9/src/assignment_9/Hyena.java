package assignment_9;

/**
 * File: Hyena.java
 * Author: Aamir Khan
 * Date: 7-12-2022 @ 10:20 AM
 * Purpose: Assignment 9
 */
public class Hyena extends Animal implements Predator{
    //Constructor:
    Hyena(String name, float weight) {
        super(name, weight);
    }
    @Override
    public void eat() {
       move();
       hunt();
       kill();
    }
    @Override
    public void move() {
        System.out.println(this.getName()+" moves towards prey.");
    }
    @Override
    public void kill() {
        System.out.println(this.getName()+" kills its prey.");
    }
    @Override
    public void hunt() {
        System.out.println(this.getName()+" hunts its prey.");
    }
    @Override
    public void isApex() {
        System.out.println(this.getName()+" is an apex predator.");
    }
    
}
