package com.tanya.bdd.oop;


public class Cow extends Animal {
    private int amountOfMilk;

    public int getAmountOfMilk() {
        return amountOfMilk;
    }

    public void setAmountOfMilk(int amountOfMilk) {
        this.amountOfMilk = amountOfMilk;
    }

    public void milk() {
        System.out.println("I gave " + amountOfMilk + " litters of milk");
    }
}
