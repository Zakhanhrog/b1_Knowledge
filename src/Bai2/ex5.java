package Bai2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. In hinh chu nhat");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 7 - i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Chon sai!");

            }
        }
    }

}
