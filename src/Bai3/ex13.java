package Bai3;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter i: ");
        int i1 = input.nextInt();
        int i2 = i1;
        double[][] arr = new double[i1][i2];
        for(int i = 0; i < i1; i++){
            int j = 0;
            while ( j < i2){
                System.out.print("Enter element " + i + " " + j + ": ");
                arr[i][j] = input.nextDouble();
                j++;
            }
        }
        System.out.println("Sum of diagonal 2-way array: " + sumDiagonal2WayArray(arr));
    }
    public static double sumDiagonal2WayArray(double[][] array){
        double sum = 0;
        int i = 0;
        int j = array[i].length;
        while (i < array.length || j > 0){
            sum = sum + array[i][j-1];
            i++;
            j--;
        }
        return sum;
    }
}
