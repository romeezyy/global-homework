package Homework4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int size = 10;
        int[] myArr = randomizedArray(size);
        printArr(myArr);
        System.out.println();
        printArr(newArr(myArr));
    }
    private static int[] randomizedArray(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }
    private static int[] newArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0){
                arr[i] = 0;
            }
        }
        return  arr;
    }
    private static void printArr(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
