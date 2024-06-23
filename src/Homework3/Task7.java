package Homework3;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int size = 12;
        int[] myArr = random1(size);
        printArr(myArr);
        System.out.println();
        int maxValue = maxValue(myArr);
        System.out.println("Самое большое число в массиве: " + maxValue);
        int arrIndex = maxIndex(myArr, maxValue);
        System.out.println("И оно в последний раз встретилось в массиве под индексом: " + arrIndex);
    }
    private static int[] random1 (int size){
        Random randomizer = new Random();
        int[] randomizedArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomizedArray[i] = randomizer.nextInt(15);
        }
        return randomizedArray;
    }
    private static void printArr(int[] arr){
        for (int j : arr){
            System.out.print(j + " ");
        }
    }
    private static int maxValue (int[] arr){
        int maxValue = arr[0];
        for (int num : arr){
            if (num > maxValue){
                maxValue = num;
            }
        }
        return maxValue;
    }
    private static int maxIndex (int[] arr, int max){
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == max){
                index = i;
            }
        }
        return index;
    }
}
