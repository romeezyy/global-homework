package Homework4;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int size = 5;
        int[] myArr = randomizedArr(size);
        printArr(myArr);
        System.out.println();
        System.out.println(checkForDuplicatesBruteForce(myArr));
    }
    private static int[] randomizedArr(int size){
        Random random = new Random();
        int[] randomArr = new int[size];
        for (int i = 0; i < size; i++){
            randomArr[i] =  random.nextInt(10);
        }
        return randomArr;
    }
    private static void printArr(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    private static String checkForDuplicatesBruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return "NO";
                }
            }
        }
        return "Yes";
    }
}
