package com.tanya.bdd.oop;

public class Animal {
    private String name;
    private int numberOfLegs;
    private String food;
    private Animal friend;

    public void feed() {
        System.out.println("I am eating a " + food);
    }

    public void countLegs() {
        System.out.println("I have " + numberOfLegs + " legs");
    }

    public void whoIsMyFriend() {
        String friendName = (null == friend) ? name : friend.getName();
        System.out.println("My friend's name is " + friendName);
    }

    public void sayMyName(){
        System.out.println("I am a " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Animal getFriend() {
        return friend;
    }

    public void setFriend(Animal friend) {
        this.friend = friend;
    }
}
