package Bai4.FANUPDATE;

import java.util.Scanner;

public class fanMain {
    public static void main(String[] args) {
        fanLogic fan = new fanLogic();
        System.out.println("=====================\n"+fan+"\n"+"=====================");
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Status Fan ( On/Off )");
            System.out.println("2. Enter speed Fan");
            System.out.println("3. Enter radius Fan");
            System.out.println("4. Enter color Fan");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:

            }
        }while (choice != 0);
    }
}
