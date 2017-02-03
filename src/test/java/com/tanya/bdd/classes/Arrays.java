package com.tanya.bdd.classes;


public class Arrays {
    public static void main(String[] args) {
        //    int [] a = new int [4];
//    int [] n = {13, 5, 6, 12, 12};

        int a = 78;
        int b = 7;
        boolean f = a > b;
        System.out.println(f);

        if (a > b) {
            System.out.println("a bigger b");
        }
        if (a < b) {
            System.out.println("b bigger a");
        } else {
            System.out.println("a equal b");
        }
    }
}