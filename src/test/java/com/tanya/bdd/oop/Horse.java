package com.tanya.bdd.oop;

public class Horse extends Animal {
    private int distancePerDay;

    public int getDistancePerDay() {
        return distancePerDay;
    }

    public void setDistancePerDay(int distancePerDay) {
        this.distancePerDay = distancePerDay;
    }

    public void run() {
        System.out.println("I run " + distancePerDay + " km per day");
    }
}
