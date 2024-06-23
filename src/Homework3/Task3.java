package Homework3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
    int size = 10;
    int[] randomizedArray = randomArray(size);
    int count = evenArray(randomizedArray);
    printArray(randomizedArray);
        System.out.println();
        System.out.println("Количество четных чисел в массиве: " + count);
    }
    private static int[] randomArray(int arrayLength){
        Random randomizer = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = randomizer.nextInt(100);
        }
     return array;
    }
    private static void printArray(int[] array){
        for( int num: array) {
            System.out.print(num + " ");
        }
    }
    private static int evenArray(int[] array){
        int division = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                division++;
            }
        }
        return division;
    }
}
