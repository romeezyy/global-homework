package Homework3;

public class Task1 {
    public static void main(String[] args) {
    int size = 10;
    int[] newArray = array(size);
    for (int num : newArray){
        System.out.print(num + " ");

    }
    System.out.println();
    for (int num: newArray) {
        System.out.println(num);
    }
}

    private static int[] array(int size) {
        int[] array = new int[size];
        int division = 2;
        for (int i = 0; i < size; i++) {
            array[i] = division;
            division += 2;
        }
        return array;
    }
}

