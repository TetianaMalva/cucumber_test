package com.tanya.bdd.classes;


public class Fibo {
    public static void main(String[] args) {

        int n = 10;
        int arr []=new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i=2; i<arr.length; i++)
        {
         arr[i] = arr[i-1]+arr[i-2];
        }

        for (int index=0; index<arr.length; index++) {
            System.out.println("fibo_number[" + (index+1) + "] = " + arr[index]);

        }
    }
}
