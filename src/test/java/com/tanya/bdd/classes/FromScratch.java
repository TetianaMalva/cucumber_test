package com.tanya.bdd.classes;


import org.apache.commons.lang3.ObjectUtils;

public class FromScratch {
    public static void main(String[] args) {
        String a1 = "Wow";
        String b1 = "Wow";

        printReference(a1);
        printReference(b1);

        boolean r1 = (a1 == b1);
        System.out.println(r1);

        boolean r2 = a1.equals(b1);
        System.out.println(r2);

        String a2 = new String("Wow");
        String b2 = new String("Wow");
        printReference(a2);
        printReference(b2);

        boolean r3 = (a2 == b2);      // false. it is not the same object
        System.out.println(r3);

        boolean r4 = a2.equals(b2); // true, "a" and "b" are logically equal
        System.out.println(r4);
    }

    public static void printReference(String str) {
        System.out.println("Memory reference: " + ObjectUtils.identityToString(str).replace("java.lang.String@", ""));
    }
}