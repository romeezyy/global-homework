package Homework4;

import java.util.Arrays;
import java.util.Random;

public class Task12 {
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i][j] % 2 != 0){
                    System.out.printf("%s  ", arr[i][j]);
                }
                else {
                    System.out.printf("%s  ", "—");
                }
            }
            System.out.println();
        }
    }
}
