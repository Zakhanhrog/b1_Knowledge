package Bai3;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter i1: ");
        int i1 = input.nextInt();
        System.out.println("Enter i2: ");
        int i2 = input.nextInt();
        double[][] arr = new double[i1][i2];
        for(int i = 0; i < i1; i++){
            int j = 0;
            while ( j < i2){
                System.out.print("Enter element " + i + " " + j + ": ");
                arr[i][j] = input.nextDouble();
                j++;
            }
        }
        System.out.println("Sum of column 2-way array: " + sumColumn2WayArray(arr));
    }
    public static double sumColumn2WayArray(double[][] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i][0];
        }
        return sum;
    }
}
