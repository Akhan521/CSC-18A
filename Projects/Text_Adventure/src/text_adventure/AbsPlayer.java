//package text_adventure;

/**
 * File:   Text_Adventure.java
 * Author: Aamir Khan
 * Date:   7-19-2022 @ 9:00 AM
 */
public abstract class AbsPlayer { //Abstract class.
    //Attributes:
    private String name;
    private int health;
    public int strtHealth; //To hold the starting health value.
    //Methods (7 methods):
    AbsPlayer(String name, int health){
        this.name=name;
        this.health=health;
        this.strtHealth=health;
    }
    //Abstract Methods:
    public abstract void attack(); //To attack.
    public abstract void heal();   //To heal up. 
    public abstract void boost();  //To boost attack power.
    //Setters:
    public void setHealth(int health){
        this.health=health;
    }
    //Getters:
    public String getName(){
        return this.name;
    }
    public int getHealth(){
        return this.health;
    }
}
