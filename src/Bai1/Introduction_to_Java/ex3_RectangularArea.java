package Bai1.Introduction_to_Java;

import java.util.Scanner;

public class ex3_RectangularArea {
    public static void main(String[] args) {
        float width, height;

        Scanner scannerValriable = new Scanner(System.in);

        System.out.println("Hay nhap chieu dai:");
        width = scannerValriable.nextFloat();
        System.out.println("Hay nhap chieu rong:");
        height = scannerValriable.nextFloat();
        float area = width * height;
        System.out.println("Chieu dai la: " + width + " Chieu rong la: " + height + " Do dai la: " + area);

    }
}
