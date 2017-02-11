package com.tanya.bdd.classes;

public class SortTask {
    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 7, 12, 9, -1};

        int count = 0;
        System.out.println("BEFORE:");
        System.out.println("count=" + count);
        printArray(arr);
        int temp;

        for (int d = 0; d < arr.length - 1; d++) {
            for (int c = 0; c < arr.length - 1 - d; c++) {
                count++;
                if (arr[c] > arr[c + 1]) {
                    temp = arr[c + 1]; // temp стає 3
                    arr[c + 1] = arr[c]; // 3 стає 5
                    arr[c] = temp; //5 стає 3
                }
            }
        }
//        for (int i = 0; i < arr.length - 1; i++) { // outer cycle
//            for (int j = i + 1; j < arr.length; j++) { // inner cycle
//                count++;
//                if (arr[i] > arr[j]) {
//
//                    temp = arr[i];   //swapping
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }

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
//        for (int index = 0; index < arr.length; index++) {
//            System.out.println(arr[index]);
//        }

