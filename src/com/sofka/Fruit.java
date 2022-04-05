package com.sofka;
import java.util.ArrayList;

/**
 * @description: class Fruit is defined with its attributes and its methods.
 * @author: coronadoapps
 */

public class Fruit {
    /**
     * Attributes defined for class Fruit
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /**
     * Setter method is defined
     * @param _name
     * @return void
     */
    public void setColor(String _name){
        this.name = _name;
    }

    /**
     * Getter method is defined
     * @param void
     * @return this.colors
     */
    public ArrayList<String> getColors(){
        return this.colors;
    }
}
