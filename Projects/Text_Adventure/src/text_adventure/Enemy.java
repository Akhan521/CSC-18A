//package text_adventure;

/**
 * File:   Text_Adventure.java
 * Author: Aamir Khan
 * Date:   7-19-2022 @ 9:00 AM
 */
public class Enemy extends Player { //First child class.
    //Constructor:
    public Enemy(String name, int health) {
        super(name, health);
    }
    @Override
    public void attack() {
        if(isBoosted){
            System.out.println(getName()+" attacks and deals 15 damage.");
            this.isBoosted=false; //Resetting it to false.
        }
        else{
        System.out.println(getName()+" attacks and deals 10 damage.");
        }
    }
    @Override
    public void heal() {
        if(getHealth()+5<=strtHealth){ //Making sure we don't exceed our starting health.
            System.out.println(getName()+" heals up and gets 5 HP points.");
            setHealth(getHealth()+5);  //Adding 5 hp points.
        }
        else{
            System.out.println(getName()+" used heal but it had no effect.");
        }
    }
}
