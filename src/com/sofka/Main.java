package com.sofka;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person1, person2;
        person1 = new Person("Stiven", "Coronado", "Borja", 1.80f);
        System.out.println(person1.getFullName());

        Date date = new Date();
        person2 = new Person("Juan", "Coronado", "Borja", 1.50f, date);
        System.out.println(person2.getName());
    }

}
