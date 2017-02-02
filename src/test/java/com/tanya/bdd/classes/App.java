package com.tanya.bdd.classes;

public class App {

    public static void main(String[] args) {
        String word = "yb";

        int a = 0;
        switch (word) {
            case "x":
                a = a + 5;
                break;
            case "y":
                a = a + 10;
                break;
            default:
                a = a + 20;
        }
        System.out.println(a);
    }

}