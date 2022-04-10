/**
 * @description: class Fruit is defined with its attributes and its methods.
 * @author: coronadoapps
 * @date: april-2022
 */

package com.sofka;
import java.util.ArrayList;

public class Fruit {
    /**
     * Attributes defined for class Fruit
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors = new ArrayList<>();

    /**
     * Constructor
     */
    public Fruit(String name, float averageWeight, String color) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors.add(color);
    }

    /**
     * Setter method is defined
     *
     * @param name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter method is defined
     *
     * @param averageWeight
     * @return void
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Setter method is defined
     *
     * @param name - args to set
     * @return void
     */
    public void setColor(String name) {
        this.colors.add(name);
    }

    /**
     * Getter method is defined
     *
     * @param void
     * @return name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter method is defined
     *
     * @param void
     * @return averageWeight value
     */
    public float getAverageWeight() {
        return this.averageWeight;
    }

    /**
     * Getter method is defined
     *
     * @param void
     * @return ArrayList of colors
     */
    public ArrayList<String> getColors() {
        return this.colors;
    }
}