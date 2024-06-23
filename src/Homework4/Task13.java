package Homework4;

import java.util.Arrays;
import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int size = 5;
        int[][] myArr = randomizedArr(size);
        print2dArray(myArr);
        System.out.println();
        workWithArr(myArr);
    }
    private static int[][] randomizedArr(int size){
        Random random = new Random();
        int[][] arr2d = new int[size][];
        for (int i = 0; i < size; i++){
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = random.nextInt(9);
            }
            arr2d[i] = arr;
        }
        return arr2d;
    }
    private static void print2dArray(int[][] arr) {
        System.out.println("———————————————");
        for (int[] num : arr) {
            System.out.println(Arrays.toString(num).replace("[", "|")
                    .replace("]", "|").replace(",", "|"));
            System.out.println("———————————————");
        }
    }
    private static void workWithArr(int[][] arr){
        int diag1 = 1;
        int diag2 = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j == arr.length - i - 1){
                    if(j == i){
                        diag1 *= arr[i][j];
                    }
                    diag2 *= arr[i][j];
                } else if ((i == j)) {
                    diag1 *= arr[i][j];
                }
            }
        }
        System.out.println("Произведение элементов первой диагонали: " + diag1);
        System.out.println("Произведение элементов второй диагонали: " + diag2);
        if (diag1 < diag2){
            System.out.println("Вторая диагональ больше");
        }
        else if (diag1 == diag2) {
            System.out.println("Диагонали равны");
        }
        else {
            System.out.println("Первая диагональ больше");
        }
    }
}
