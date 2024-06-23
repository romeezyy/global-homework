package Homework4;

import java.util.Arrays;
import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        int size = 5;
        int[][] myArr = randomArr(size);
        print2dArr(myArr);
        System.out.println();
        transArr(myArr);
        print2dArr(myArr);
    }
    private static int[][] randomArr(int size){
        int[][] arr2d = new int[size][];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = random.nextInt(9);
            }
            arr2d[i] = arr;
        }
        return arr2d;
    }
    private static void print2dArr(int[][] arr){
        System.out.println("———————————————");
        for(int[] num : arr){
            System.out.println(Arrays.toString(num).replace("[", "|")
                    .replace("]", "|").replace(",","|"));
            System.out.println("———————————————");
        }
    }
    private static void transArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
