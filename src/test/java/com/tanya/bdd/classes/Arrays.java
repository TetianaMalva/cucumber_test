package com.tanya.bdd.classes;


public class Arrays {
    public static void main(String[] args) {

        int a = 38;
        int b = 5;
        int i = 0;
        boolean f = a > b;
        System.out.println(f);

        if (a > b) {
            System.out.println("a bigger b");
        } else if (a < b) {
            System.out.println("b bigger a");
        } else {
            System.out.println("a equal b");
        }
        do {
            System.out.println(a);
            a = a - i;
            i = i + 9;
        }
            while (a > b);
    }
}
