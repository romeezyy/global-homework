package Homework4;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int size = 10;
        int[] myArr = randomizedArr(size);
        printArr(myArr);
        System.out.println();
        System.out.println("Ваше число встретилось: " + check(myArr, number) + " раз.");
    }
    private static int[] randomizedArr(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(5);
        }
        return arr;
    }
    private static void printArr(int[] arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    private static int check(int[] arr, int value){
        int num = 0;
        for (int j : arr) {
            if (value == j) {
                num++;
            }
        }
        return num;
    }
}
