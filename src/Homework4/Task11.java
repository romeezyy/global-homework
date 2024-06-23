package Homework4;

import java.util.Arrays;
import java.util.Random;
//import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
//        System.out.print("Введдите размер матрицы: ");
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
        int size = 5;
        int[][] my2dArr = randomizedArr(size);
        printArr(my2dArr);
        workWithArr(my2dArr);
    }
    private static int[][] randomizedArr(int size){
        int[][] arr2d = new int[size][];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int[] arr = new int[size];
            for (int j = 0; j < size; j++){
                arr[j] = random.nextInt(9);
            }
            arr2d[i] = arr;
        }
        return arr2d;
    }
    private static void printArr (int[][] arr){
        System.out.println("———————————————");
        for (int[] num : arr) {
            System.out.println(Arrays.toString(num).replace("[", "|")
                    .replace("]", "|").replace(",", "|"));
            System.out.println("———————————————");

        }
    }
    private static void workWithArr(int[][] arr){
        int value = 0;
        for (int i = 0; i < arr.length;  i++) {
            if(arr[i][i] % 2 == 0){
                value += arr[i][i];
                }
            }
        System.out.println(value);
    }
}
