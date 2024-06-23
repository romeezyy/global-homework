package Homework4;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int size = 10;
        int[] myArr = randomizedArr(size);
        printArr(myArr);
        System.out.println();
        System.out.println(minValueEven(myArr));
        printArr(newArr(myArr));
    }
    private static int[] randomizedArr(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(10);
        }
        return arr;
    }
    private static void printArr(int[] arr){
        int index = 0;
        for (int num : arr){
            System.out.print("(" + index + ")" + num + " ");
            index++;
        }
    }
    private static Integer minValueEven(int[] arr){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && minValue >= arr[i]){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    private static int[] newArr(int[] arr){
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > arr[maxValue]){
                maxValue = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[maxValue];
        arr[maxValue] = temp;
        return arr;
    }
}
