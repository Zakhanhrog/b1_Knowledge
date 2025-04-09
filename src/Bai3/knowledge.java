package Bai3;
import java.util.Scanner;

public class knowledge {

    //truyen 1 mang cho 1 phuong thuc
   /* public static void main(String[] args) {
        printString(new int[] {2, 5, 8, 9, 13});
    }
    public static void printString(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }*/

    // test
/*    public static void main(String[] args) {
        int[] arr = {2,3,6,7,8,9};
        int a = 3;
        pullValuesArr(a,arr);
    }
    public static void pullValuesArr(int a, int[] arr) {
        for ( int b: arr){
            System.out.print(" "+b);

        }
        System.out.println();
        System.out.println("Phan tu thu 3 la: " + arr[a]);
    }*/
    public static void main(String[] args) {
        int[] arr = {2,3,6,7,8,9};
        int a = 100;
        arr = changeValueFirst(arr,a);
        for ( int b: arr){
            System.out.print(" "+b);
        }
    }
    public static int[] changeValueFirst(int[] arr, int a){
        arr[0] = a;
        return arr;
    }
}
