/**
 * @description: class Vehicle is defined with its attributes and its methods.
 * @author: coronadoapps
 * @date: april-2022
 */

package com.sofka;

public class Vehicle {
    /**
     * Attributes defined for class Vehicle
     */
    private int passengers;
    private float fuel;
    private String plate;

    /**
     * Constructor
     */
    public Vehicle(int passengers, float fuel, String plate) {
        this.passengers = passengers;
        this.fuel = fuel;
        this.plate = plate;
    }

    /**
     * Setter method is defined
     * @param passengers
     * @return void
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /**
     * Setter method is defined
     * @param fuel
     * @return void
     */
    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    /**
     * Setter method is defined
     * @param plate
     * @return void
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * Getter method is defined
     * @param void
     * @return fuel value
     */
    public float getFuel() {
        return fuel;
    }

    /**
     * Getter method is defined
     * @param void
     * @return plate value
     */
    public String getPlate() {
        return plate;
    }
}
