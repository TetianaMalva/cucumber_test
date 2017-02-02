package com.tanya.bdd.classes;


import org.apache.commons.lang3.ObjectUtils;

public class FromScratch {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        int num = 7;
//        double d = 4.5;
//        d = 3.5;
//        float f = 4.5f;
//        char c = 'e';
//        String s1 = new String("Some text");
//        String s2 = "Add message here";
//        String s3 = s1 + s2;
//        String s = "I have " + num + " cookies";
//        System.out.println(s);
//        int a = 4;
//        boolean b = a == 4;
//        if (b) {
//            System.out.println("It is true");
//        }
//        int c = 16;
//        if (c == 19)
//        {
//            System.out.println("It is 16");
//        }
//        int a;
//        int b = 7;
//        int i = 0;
//        a = i + 1;
//        if (a == b) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//    }
//        int a = 5;
//        int result = (a == 5) ? 7 : 6;
//        System.out.println(result);
////}
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

        boolean r3 = (a2 == b2);      // Ложь, так как a и b не один и тот же объект
        System.out.println(r3);

        boolean r4 = a2.equals(b2); // Истина, так как a и b логически равны
        System.out.println(r4);

//        int k;
//        k = 5;
//        if (k < 4) {
//            k++;
//        } else {
//            k--;
//        }
//        System.out.println(k);
//    }
//    int a;
//    a = 4;
//        switch (a) {
//            case 0:
//                a++;
//
//            case 1:
//                a--;
//            default:
//                a = a - 2;
//            {
//                System.out.println(a);
    }

    public static void printReference(String str) {
        System.out.println("Memory reference: " + ObjectUtils.identityToString(str).replace("java.lang.String@", ""));
    }
}