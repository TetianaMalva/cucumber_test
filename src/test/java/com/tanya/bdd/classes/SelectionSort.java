package com.tanya.bdd.classes;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 7, 12, 9, -1};
        int count = 0;
        System.out.println("BEFORE:");
        System.out.println("count=" + count);
        printArray(arr);
        int temp;

        for (int i = 0; i < arr.length - 1; i++) { // outer cycle
            for (int j = i + 1; j < arr.length; j++) { // inner cycle
                count++;
                if (arr[i] > arr[j]) {

                    temp = arr[i];   //swapping
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("AFTER:");
        System.out.println("count=" + count);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.println("a[" + index + "] = " + arr[index]);
        }
    }
}
