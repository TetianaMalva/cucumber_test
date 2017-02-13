package com.tanya.bdd.oop;


public class MyApp {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Horse horse = new Horse();

        cow.setName("Cow");
        cow.setFood("grass");
        cow.setNumberOfLegs(4);
        cow.setAmountOfMilk(8);

        horse.setName("Horse");
        horse.setFood("barley");
        horse.setNumberOfLegs(4);
        horse.setDistancePerDay(32);

        cow.setFriend(horse);
        horse.setFriend(cow);

        cow.sayMyName();
        cow.feed();
        cow.countLegs();
        cow.milk();
        cow.whoIsMyFriend();

        System.out.println();

        horse.sayMyName();
        horse.feed();
        horse.countLegs();
        horse.run();
        horse.whoIsMyFriend();

        int totalNumberOfLegs = horse.getNumberOfLegs() + cow.getNumberOfLegs();

        System.out.println("\nTotal number of legs is " + totalNumberOfLegs);

        System.out.println("We have " + horse.getDistancePerDay() / cow.getAmountOfMilk() +
                " km per litter");
    }

}
