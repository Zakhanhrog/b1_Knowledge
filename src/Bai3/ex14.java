package Bai3;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        String str = "Xin chao ong chu Gia Khanh!";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character to search for: ");
        char textCheck = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (textCheck == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Number of occurrences of " + textCheck + " is " + count);

    }
}
