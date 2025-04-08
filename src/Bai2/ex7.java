package Bai2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;

        try {
            System.out.print("Nhap gioi han : ");
            numbers = scanner.nextInt();

            if (numbers <= 0) {
                System.out.println("Vui lòng nhập một số lớn hơn 0.");
                return;
            }

        } catch (InputMismatchException y) {
            System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ.");
            return;
        } finally {
            scanner.close();
        }

        int N = 2;

        while (N < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
            }
            N++;
        }

        System.out.println(); // xuong dong

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;  //kiem tra 2 dieu kien ơ tren neu ca hai deu sai thi so do chinh la so nguyen to -> true
    }
}
