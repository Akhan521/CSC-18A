//package text_adventure;

/**
 * File:   Text_Adventure.java
 * Author: Aamir Khan
 * Date:   7-19-2022 @ 9:00 AM
 */
public class Player extends AbsPlayer { //Parent class.
    public boolean isBoosted;
    Player(String name, int health){
        super(name, health);
    }
    @Override
    public void attack() {
        if(isBoosted){
            System.out.println(getName()+" attacks and deals 20 damage.");
            this.isBoosted=false; //Resetting it to false.
        }
        else{
        System.out.println(getName()+" attacks and deals 15 damage.");
        }
    }
    @Override
    public void heal() {
        if(getHealth()+10<=strtHealth){ //Making sure we don't exceed our starting health.
            System.out.println(getName()+" heals up and gets 10 HP points.");
            setHealth(getHealth()+10);  //Adding 10 hp points (Arithmetic).
        }
        else{
            System.out.println(getName()+" used heal but it had no effect.");
        }
    }
    @Override
    public void boost() {
        System.out.println(getName()+" boosts and will deal 5 more damage on the next turn.");
        this.isBoosted=true;
    }
    //To return whether we are boosted.
    public boolean isBoosted(){
        return this.isBoosted;
    }
    
}
