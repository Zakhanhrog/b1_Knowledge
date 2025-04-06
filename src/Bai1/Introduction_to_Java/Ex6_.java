package Bai1.Introduction_to_Java;

import java.util.Scanner;

public class Ex6_ {
    public static void main(String[] args) {
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Nhap nam muon kiem tra:  ");
        int year = inputYear.nextInt();
//        boolean result = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            System.out.printf("Nam %d la nam nhuan",year );
        }else {
//            result = false;
            System.out.printf("Nam %d khong phai la nam nhuan", year);
        }

//        if (result = true){
//            System.out.printf("Nam %d la nam nhuan",year );
//        }else{
//            System.out.printf("Nam %d khong phai la nam nhuan", year);
//        }
    }
}
