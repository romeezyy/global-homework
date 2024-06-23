package Homework3;


public class Task2 {
    public static void main(String[] args) {
        int size = 50;
        int[] originalArray = array(size);
        int[] reversedArray = reverseArray(originalArray);
        printArray(originalArray);
        System.out.println();
        printArray(reversedArray);
    }

    private static int[] array(int size) {
        int[] oddArray = new int[size];
        int division = 1;
        for (int i = 0; i < size; i++) {
                oddArray[i] = division;
                division += 2;
        }
        return oddArray;
    }

    private static int[] reverseArray(int[] arrayForReverse) {
        int[] reversedArray = new int[arrayForReverse.length];
        for (int i = 0; i < arrayForReverse.length; i++) {
            reversedArray[i] = arrayForReverse[arrayForReverse.length - i - 1];
        }
        return reversedArray;
}
    private static void printArray(int[] arrayForPrint){
        for (int num: arrayForPrint){
            System.out.print(num + " ");
        }
    }
}