package Homework3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size % 2 == 0) {
            int[] arr = randomArr(size);
            printArr(arr);
            System.out.println();
            example(arr);
        }
        else {
            System.out.println("Вы ввели неверное число");
        }
    }
    private static int[] randomArr(int size) {
        Random randomizer = new Random();
        int[] randomizedArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomizedArray[i] = randomizer.nextInt(15);
        }
        return randomizedArray;
    }
    private static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    private static void example(int[] arr) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                num1 = num1 + arr[i];
            } else if (i > arr.length / 2 - 1) {
                num2 = num2 + arr[i];
            }
        }
            if (num1 > num2){
                System.out.println(num1 + " > " + num2  );
            } else if (num1 < num2) {
                System.out.println(num1 + " < " + num2 );
            }
            else {
                System.out.println(num1 + " = " + num2);
            }
    }
}