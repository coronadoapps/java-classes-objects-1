package com.sofka;

/**
 * @description: class bankAccount is defined with its attributes and its methods.
 * @author: coronadoapps
 */

public class bankAccount {
    /**
     * Attributes defined for class Person
     */
    private int accountNumber;
    protected boolean activated;

    /**
     * Setter method is defined
     * @param _activated
     * @return void
     */
    public void setActivated(boolean _activated){
        this.activated = _activated;
    }

    /**
     * Getter method is defined
     * @param void
     * @return this.activated
     */
    public boolean getActivated(){
        return this.activated;
    }
}
