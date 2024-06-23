package Homework4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int size = 10;
        int[] myArr = randomizedArray(size);
        printArr(myArr);
        System.out.println();
        System.out.println(minOdd(myArr));
    }
    private static int[] randomizedArray(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }
    private static void printArr(int[] arr){
        for (int num: arr){
            System.out.print(num + " ");
        }
    }
    private static int minOdd(int[] arr){
        int element = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j % 2 != 0 && element >= j) {
                element = j;
            }
        }
        return element;
    }
}
