package com.tanya.bdd.classes;

public class While {

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
        int y = 5;
        int rez = 1;
        while (y > 0)
            rez *= y--;
        {
            System.out.println("!7 = " + rez);
        }

        System.out.println("Next");

        char[] arr = {'a', 'b', 'c', 'd'};
        char ff = 'd';
        int res = -1;
        for (int i = 0; i < 4; i++) {
            char elem = arr[i];
            if (elem == ff) {
                res = i;
                System.out.println("\n" + (res + 1) + " element is that we looking");
            } else {
                System.out.println(elem + " is not that we looking");

            }
        }
    }
}

