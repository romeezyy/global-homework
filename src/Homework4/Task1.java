package Homework4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int size = 10;
        int[] myArr = randomizedArray(size);
        printArr(myArr);
        System.out.println();
        System.out.println(multiply(myArr));
    }
    private static int[] randomizedArray(int size){
        int[] arr = new int[size];
        Random randomizer = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomizer.nextInt(20);
        }
        return arr;
    }
    private static void printArr(int[] arr){
        for (int num: arr){
            System.out.print(num + " ");
        }
    }
    private static int multiply(int[] arr){
        int multi = 1;
        for (int j : arr) {
            if (j % 3 == 0 & j != 0) {
                multi *= j;
            }
        }
        return multi;
    }
}
