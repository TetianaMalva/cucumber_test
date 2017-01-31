package com.tanya.bdd.testpack;

import com.tanya.bdd.classes.Human;

public class HumanProgram {
    public static void main(String[] args) {
        System.out.println("My program has been started");

        Human human1 = new Human();
        human1.setAge(22);
        human1.setName("Ann");

        Integer age1 = human1.getAge();

        System.out.println("Age1: " + age1);
        human1.setAge(23);
        System.out.println("Age2: " + age1);

        System.out.println("My program has been finished");
    }
}
