package com.tanya.bdd.classes;


public class FromScratch {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        int num = 7;
        double d = 4.5;
        d = 3.5;
        float f = 4.5f;
        char c = 'e';
        String s1 = new String("Some text");
        String s2 = "Add message here";
        String s3 = s1 + s2;
        String s = "I have " + num + " cookies";
        System.out.println(s);
        boolean b = true;
        b = false;

        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }


    }
}