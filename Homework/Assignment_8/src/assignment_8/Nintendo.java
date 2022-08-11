package assignment_8;

/**
 * File:    Nintendo.java
 * Author:  Aamir Khan
 * Date:    July 12, 2022 @ 12:20 AM
 * Purpose: Assignment 8
 */
public class Nintendo extends GameSystem {
    //Unique Attributes:
    private String acct;         //Nintendo Account.
    private boolean hasMembrshp; //Premium Membership.
    //Methods:
    public Nintendo(String system, int buildYear) {
        super(system, buildYear);
    }
    public void setAcct(String acct){
        this.acct=acct;
    }
    public void setMS(boolean hasMS){
        this.hasMembrshp=hasMS;
    }
    public String getAcct(){
        return this.acct;
    }
    public boolean getMS(){
        return this.hasMembrshp;
    }
}
