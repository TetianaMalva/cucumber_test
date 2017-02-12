package com.tanya.bdd.classes;

public class SortTask {
    public static void main(String[] args) {

        int count = 0;
        int temp;
        int[] arr = {1, 7, 12, 9, -1};

        for (int d = 0; d < arr.length - 1; d++) {
            for (int c = 0; c < arr.length - 1 - d; c++) {
                count++;
                if (arr[c] > arr[c + 1]) {
                    temp = arr[c + 1]; // temp -> 3
                    arr[c + 1] = arr[c]; // 3 -> 5
                    arr[c] = temp; //5 -> 3
                }
            }
        }
        for (int index = 0; index < arr.length; index++) {
            System.out.println("a[" + index + "] = " + arr[index]);

        }
    }
}

