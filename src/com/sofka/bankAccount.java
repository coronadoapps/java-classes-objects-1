/**
 * @description: class bankAccount is defined with its attributes and its methods.
 * @author: coronadoapps
 */
package com.sofka;

public class bankAccount {
    /**
     * Attributes defined for class bankAccount
     */
    private int accountNumber;
    protected boolean activated;

    /**
     * Constructor
     */
    public bankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Setter method is defined
     * @param activated
     * @return void
     */
    public void setActivated(boolean activated){
        this.activated = activated;
    }

    /**
     * Getter method is defined
     * @param void
     * @return activated value
     */
    public boolean getActivated(){
        return this.activated;
    }
}
