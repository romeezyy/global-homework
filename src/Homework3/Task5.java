package Homework3;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int size = 5;
        int[] array1 = random(size);
        printArr(array1);
        System.out.println();
        int[] array2 = random(size);
        printArr(array2);
        System.out.println();
        double count1 = average(array1);
        System.out.println(count1);
        double count2 = average(array2);
        System.out.println(count2);
        if (count1 > count2){
            System.out.println("Первый массив больше по среднему арифметическому.");
        }
        else {
            System.out.println("Второй массив больше по среднему арифметическому.");
        }

    }
    private static int[] random (int arrLength){
        Random randomizer = new Random();
        int[] randomizedArray = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            randomizedArray[i] = randomizer.nextInt(15);
        }
        return randomizedArray;
    }
    private static void printArr (int[] array){
        for (int num : array){
            System.out.print(num + " ");
        }
    }
    private static double average (int[] arr) {
        double averageCount = 0;
        for (int j : arr) {
            averageCount = averageCount + j;
        }
        averageCount = averageCount/arr.length;
    return averageCount;
    }
}
