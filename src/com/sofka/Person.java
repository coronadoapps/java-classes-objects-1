package com.sofka;
import java.util.Date;

/**
 * @description: class Person is defined with its attributes and its methods.
 * @author: coronadoapps
 */

public class Person {
    /**
     * Attributes defined for class Person
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /**
     * Setter method is defined
     * @param _name
     * @return void
     */
    public void setName(String _name){
        this.name = _name;
    }

    /**
     * Getter method is defined
     * @param void
     * @return this.name
     */
    public String getName(){ return this.name; }
}
