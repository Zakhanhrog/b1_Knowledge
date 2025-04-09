package Bai3;

public class ex8 {
    public static void main(String[] args) {
        int[] beforeArray = {1, 2, 3, 4, 5};
        int[] afterArray = {6, 7, 8, 9, 10};
        int[] newArray = addArray(beforeArray, afterArray);
        System.out.println("The new array is: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }
    public static int[] addArray(int[] beforeArray, int[] afterArray) {
        int newLength = beforeArray.length + afterArray.length;
        int[] newArray = new int[newLength];
        for (int i = 0; i < beforeArray.length; i++) {
            newArray[i] = beforeArray[i];
        }
        for (int i = 0; i < afterArray.length; i++) {
            newArray[i + beforeArray.length] = afterArray[i];
        }
        return newArray;

    }
}
