package Bai3;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Before insert: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + "\t");
        }
        System.out.println();
        System.out.print("Enter the index value: ");
        int indexValue = scanner.nextInt();
        System.out.print("Enter the value: ");
        int value = scanner.nextInt();
        arr = insertArray(arr, value, indexValue);
        System.out.println("After insert: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + "\t");
        }
        System.out.println();
    }
    public static int[] insertArray(int[] array, int value, int indexValue) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        for (int k = newArray.length-1; k > indexValue; k--){
            newArray[k] = newArray[k-1];
        }
        newArray[indexValue] = value;
        return newArray;

    }
}
