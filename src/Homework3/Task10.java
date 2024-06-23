package Homework3;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Введите число > 3: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] myArr = randomizedArr(size);
        int[] sort = sortedArr(myArr);
        if (size >= 3){
            printArr(myArr);
            System.out.println();
            printArr(sort);
        }
        else {
            System.out.println("Вы ввели неверное число");
        }
    }
    private static void printArr(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    private static int[] randomizedArr(int size){
        Random randomizer = new Random();
        int[] randomizedArray = new int[size];
        for (int i = 0; i < size; i++){
            randomizedArray[i] = randomizer.nextInt(size);
        }
        return randomizedArray;
    }
    private static int[] sortedArr(int[] arr){
        int count = 0;
        for (int num : arr){
            if(num % 2 == 0 && num != 0){
                count++;
            }
        }
        int[] evenArray = new int[count];
        int index = 0;
        for (int n : arr){
            if (n % 2 == 0 && n != 0){
                evenArray[index] = n;
                index++;
            }
        }
        return evenArray;
        }
}
