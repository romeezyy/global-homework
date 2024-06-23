package Homework3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int size = 20;
        int[] newArray = randomArray(size);
        printArray(newArray);
        int[] nullArray = sortedArray(newArray);
        System.out.println();
        printArray(nullArray);

    }
    private static int[] randomArray (int arrayLength){
        Random randomizer = new Random();
        int[] randomizedArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            randomizedArray[i] = randomizer.nextInt(20);
        }
        return randomizedArray;
    }
    private static int[] sortedArray (int[] array) {
        for (int j = 0; j < array.length; j = j + 2 ){
            array[j] =0;
            }
        return array;
    }
    private static void printArray (int[] arr){
        for (int num: arr){
            System.out.print(num + " ");
        }
    }
}
