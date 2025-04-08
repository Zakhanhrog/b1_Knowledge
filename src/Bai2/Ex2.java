package Bai2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Nhap so thang vay: ");
        int soThang = input.nextInt();

        System.out.print( "Nhap so tien cho vay: ");
        double soTienChoVay = input.nextDouble();

        System.out.print( "Nhap lai suat ( % ): " );
        double laiSuat = input.nextDouble();

        double tienLai = 0;
        for ( int i = 1; i < soThang; i++ ) {
           tienLai += soTienChoVay * (laiSuat / 100 ) / 12 * soThang;
        }
        System.out.printf("Tien lai la: %.3f", tienLai);
    }
}
