package com.tanya.bdd.classes;

import java.util.HashMap;

public class HashMapApp {

    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("one","один");
        myMap.put("seven","сім");

        String translationOfOne = myMap.get("one");
        System.out.println("Translation of one: " + translationOfOne);

        String translationOfSeven = myMap.get("seven");
        System.out.println("Translation of seven: " + translationOfSeven);

        String translationOfWhat = myMap.get("what");
        System.out.println("Translation of what: " + translationOfWhat);

    }
}
