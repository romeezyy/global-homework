package Homework4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int size = 10;
        int[] myArr = randomizedArray(size);
        printArr(myArr);
        System.out.println();
        plus(myArr);
    }
    private static int[] randomizedArray(int size){
        int[] arr = new int[size];
        Random randomizer = new Random();
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = randomizer.nextInt(20);
        }
        return arr;
    }
    private static void printArr (int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    private static void plus (int[] arr){
        double sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if (i % 2 !=0){
               sum = sum + arr[i];
               count++;
           }
        }
        sum = sum/count;
        System.out.println(sum);
    }
}
