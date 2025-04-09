package Bai3;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int[] arr ={3, 5, 6, 8, 9, 10, 56};
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Xoa phan tu ");
            System.out.println("2. Thoat ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Nhap phan tu muon xoa: ");
                    int i = scanner.nextInt();
                    deleteValues(i, arr);
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[j] + "\t");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.exit(0);
            }

        }while (choice != 2);
    }
    public static int[] deleteValues(int i, int[] arr){
        boolean isExist = false;
        int a =0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i){
                isExist = true;
                a = j;
                break;
            }
        }
        if (isExist){
            for ( int k = a; k < arr.length-1; k++ ){
                arr[k] = arr[k+1];
                arr[k+1] = 0;
            }
        }else {
            System.out.println("Not found");
        }
        return arr;
    }

}
