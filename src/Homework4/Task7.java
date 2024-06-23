package Homework4;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int size = 10;
        int[] myArr = randomizedArr(size);
        printArr(myArr);
        System.out.println();
        System.out.println(maxValue(myArr));
    }
    private static int[] randomizedArr(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(2);
        }
        return arr;
    }
    private static void printArr(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    private static int maxValue(int[] arr){
        int max = 0;
        int secondMax = 0;
        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            }
        }
        return secondMax;
    }
}
