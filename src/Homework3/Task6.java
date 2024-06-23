package Homework3;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int size = 4;
        int[] myArr = random(size);
        printArr(myArr);
        System.out.println();
        check(myArr);
    }

    private static int[] random(int arrLength) {
        Random randomizer = new Random();
        int[] randomizedArr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            randomizedArr[i] = randomizer.nextInt(10);
        }
        return randomizedArr;
    }

    private static void printArr(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void check(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                System.out.println("Массив не возрастает");
                return;
            }
        }
        System.out.println("Массив возрастает");
    }
}