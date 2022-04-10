package com.sofka;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person1;
        person1 = new Person("Stiven", "Coronado", "Borja", 1.80f);
        System.out.println(person1.getFullName());

        Date date = new Date();
        System.out.println(date);
    }

}
