package com.tanya.bdd.classes;


import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("5");
        myList.add("12");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));

        }
        if (myList.contains("12")) {
            System.out.println("Hello number twelve!");
        }

    }
}
