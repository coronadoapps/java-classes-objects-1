/**
 * @description: class Person is defined with its attributes and its methods.
 * @author: coronadoapps
 * @date: april-2022
 */

package com.sofka;
import java.util.Date;

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
     * Constructor
     */
    public Person(String name, String lastName1, String lastName2) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.height = height;
    }

    /**
     * Overloaded constructor
     */
    public Person(String name, String lastName1, String lastName2, float height){
        this(name, lastName1, lastName2);
        this.height = height;
    }

    /**
     * Another overloaded constructor
     */
    public Person(String name, String lastName1, String lastName2, float height, Date dateBirth){
        this(name, lastName1, lastName2, height);
        this.dateBirth = dateBirth;
    }

    /**
     * Setter method is defined
     * @param name
     * @return void
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Getter method is defined
     * @param void
     * @return this.name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Getter method is defined
     * @param void
     * @return name + lastName1 + lastName2
     */
    public String getFullName(){
        return this.name + ' ' + this.lastName1 + ' ' + this.lastName2;
    }
}
