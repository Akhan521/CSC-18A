package assignment_8;

/**
 * File:    GameSystem.java
 * Author:  Aamir Khan
 * Date:    July 12, 2022 @ 12:20 AM
 * Purpose: Assignment 8
 */
public class GameSystem {  //Game System Class.
    //Attributes:
    private String system; //Type of System. (Nintendo,...)
    private int buildYear; //The year the system was built.
    //Methods:
    GameSystem(String system, int buildYear){
        setYear(buildYear);
        setSystem(system);
    }
    public void setYear(int year){
        this.buildYear=year;
    }
    public void setSystem(String system){
        this.system=system;
    }
    public String getSystem(){
        return this.system;
    }
    public int getYear(){
        return this.buildYear;
    }
}
