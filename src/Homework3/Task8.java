package Homework3;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int size = 10;
        int[] myArr1 = randomArr(size);
        printArr(myArr1);
        System.out.println();
        int[] myArr2 = randomArr(size);
        printArr(myArr2);
        System.out.println();
        printFinalArr(finalArr(myArr1, myArr2));
    }
    private static int[] randomArr(int size){
        Random randomizer = new Random();
        int[] randomizedArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomizedArray[i] = randomizer.nextInt(9);
        }
        return randomizedArray;
    }
    private static void  printArr(int[] arr){
        for (int num: arr){
            System.out.print(num + " ");
        }
    }
    private static void  printFinalArr(double[] arr){
        for (double num: arr){
            System.out.printf("%.2f ", num);
        }
    }
    private static double[] finalArr(int[] arr1, int[] arr2){
        double[] arr0 = new double[arr1.length];
        for (int i = 0; i<arr1.length; i++) {
            if (arr2[i] == 0){
                throw new ArithmeticException("Деление на 0 недопустимо");
            }
            arr0[i] = (double) arr1[i] / arr2[i];
        }
        return arr0;
    }
}
