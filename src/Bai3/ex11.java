package Bai3;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentsize = scanner.nextInt();
        int[] arr = new int[studentsize];
        int i = 0;
        while (i<arr.length){
            System.out.print("Enter the score of student "+(i+1)+": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("The number of students who passed is "+countStudentPass(arr));

    }
    public static int countStudentPass(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 5){
                count++;
            }
        }
        return count;
    }
}
