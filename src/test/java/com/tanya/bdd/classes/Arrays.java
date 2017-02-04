package com.tanya.bdd.classes;

public class Arrays {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int x = 1;
        boolean l = a > b;
        System.out.println(l);
        if (a > b) {
            System.out.println("a bigger b");
        } else if (a < b) {
            System.out.println("b bigger a");
        } else {
            System.out.println("a equal b");
        }
        System.out.println("next");
        do {
            System.out.println("a = " + a);
            a = a - x;
            x = x + 3;
        }
        while (a > b);

        System.out.println("next");
        int f = 5;
        int result = 1;
        for (int i = 1; i <= f; i++)
            result = result * i;
        {
            System.out.println("!5 = " + result);
        }
        System.out.println("next");
        int y = 7;
        int rez = 1;
        while (y > 0)
            rez = rez * y--;
        {
            System.out.println("!7 = " + rez);
        }
    }
}
