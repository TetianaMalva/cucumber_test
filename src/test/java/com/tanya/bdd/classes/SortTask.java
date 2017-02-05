package com.tanya.bdd.classes;


public class SortTask {
    public static void main(String[] args) {
        int[] arr ={5, 7, 2, 8, 1, 0};
        arr[1] = 0;
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
