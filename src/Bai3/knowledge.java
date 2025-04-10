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
    /*public static void main(String[] args) {
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
    }*/
    // sap xep tang dan
    /*public static void main(String[] args) {
        int[] a = {1,9,3,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }*/
// sap xep nho dan
    /*public static void main(String[] args) {
        int[] a = {1,9,3,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] < a[j]){
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }*/

    /*public static void main(String[] args) {
        int a = (int)Math.round(12 * Math.random()) + 5;
        System.out.println(a);
    }*/
    public static void main(String[] args) {
        int[] a = {50, 100};
        m(a);
        System.out.println(a[0]);
    }

    static void m(int[] x) {
        x[0] = 200;
    }
}
