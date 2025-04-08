package Bai3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int sizeArr;
        int[] Arr;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Nhap so phan tu cua mang: ");
            sizeArr = input.nextInt();
            if(sizeArr < 1){
                System.out.println("So phan tu cua mang phai lon hon 1");
            }
        }while (sizeArr < 1);
        Arr =new int[sizeArr];
        int i=0;
        while(i<sizeArr){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            Arr[i] = input.nextInt();
            i++;
        }
        System.out.print("Mang ban dau la: ");
        for ( int j = 0; j < sizeArr; j++ ) {
            System.out.print(Arr[j] + " ");
        }
        System.out.println();
        System.out.print("Mang sau khi dao nguoc phan tu la: ");
        Arr = reverseArr(sizeArr,Arr);   //goi phuong thuc
        for (int j = 0; j < sizeArr; j++) {
            System.out.print(Arr[j]+" ");
        }
    }
    public static int[] reverseArr(int i,int[] arr) {   //phuong thuc dao nguoc mang
        for( int j = 0; j < i/2; j++){
            int temp = arr[j];
            arr[j] = arr[i-1-j];
            arr[i-1-j] = temp;
        }
        return arr;
    }
}
