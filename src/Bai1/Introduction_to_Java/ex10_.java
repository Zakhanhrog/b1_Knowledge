package Bai1.Introduction_to_Java;

import java.util.Scanner;

public class ex10_ {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhap so can doc : ");
        int number = inputNumber.nextInt();

        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else {
            if (number < 20) {
                int unit = number % 10;
                switch (unit) {
                    case 0:
                        System.out.println("Ten");
                        break;
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("twelve");
                        break;
                    case 3:
                        System.out.println("thirteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fifteen");
                        break;
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eighteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
                }
            } else {
                if (number < 100) {
                    int ten = number / 10;
                    int unit = number % 10;
                    String unitName = "";
                    switch (unit) {
                        case 1:
                            unitName = "one";
                            break;
                        case 2:
                            unitName = "two";
                            break;
                        case 3:
                            unitName = "three";
                            break;
                        case 4:
                            unitName = "four";
                            break;
                        case 5:
                            unitName = "five";
                            break;
                        case 6:
                            unitName = "six";
                            break;
                        case 7:
                            unitName = "seven";
                            break;
                        case 8:
                            unitName = "eight";
                            break;
                        case 9:
                            unitName = "nine";
                            break;

                    }
                    switch (ten) {
                        case 1:
                            System.out.printf("Twenty %s", unitName);
                            break;
                        case 3:
                            System.out.printf("Thirty %s", unitName);
                            break;
                        case 4:
                            System.out.printf("Forty %s", unitName);
                            break;
                        case 5:
                            System.out.printf("Fifty %s", unitName);
                            break;
                        case 6:
                            System.out.printf("Sixty %s", unitName);
                            break;
                        case 7:
                            System.out.printf("Seventy %s", unitName);
                            break;
                        case 8:
                            System.out.printf("Eighty %s", unitName);
                            break;
                        case 9:
                            System.out.printf("Ninety %s", unitName);
                            break;

                    }
                }
            }
        }

        if (number < 1000) {
            int hundred = number / 100;
            int ten = number % 100;

            String unitName = "";
            String tenName = "";

            //xu li hang don vi
            switch (ten) {
                case 0:
                    tenName = "";
                    break;
                case 1:
                    tenName = "one";
                    break;
                case 2:
                    tenName = "two";
                    break;
                case 3:
                    tenName = "three";
                    break;
                case 4:
                    tenName = "four";
                    break;
                case 5:
                    tenName = "five";
                    break;
                case 6:
                    tenName = "six";
                    break;
                case 7:
                    tenName = "seven";
                    break;
                case 8:
                    tenName = "eight";
                    break;
                case 9:
                    tenName = "nine";
                    break;

            }
            if (ten < 20) {
                switch (ten) {
                    case 0:
                        tenName = "ten";
                        break;
                    case 1:
                        tenName = "eleven";
                        break;
                    case 2:
                        tenName = "twelve";
                        break;
                    case 3:
                        tenName = "thirteen";
                        break;
                    case 4:
                        tenName = "Fourteen";
                        break;
                    case 5:
                        tenName = "Fifteen";
                        break;
                    case 6:
                        tenName = "Sixteen";
                        break;
                    case 7:
                        tenName = "Seventeen";
                        break;
                    case 8:
                        tenName = "Eighteen";
                        break;
                    case 9:
                        tenName = "Nineteen";
                        break;
                }
                if (ten < 100) {
                    switch (ten) {
                        case 1:
                            tenName = "Twenty %s" + unitName;
                            break;
                        case 3:
                            tenName = "Thirty %s" + unitName;
                            break;
                        case 4:
                            tenName = "Forty %s" + unitName;
                            break;
                        case 5:
                            tenName = "Fifty %s" + unitName;
                            break;
                        case 6:
                            tenName = "Sixty %s" + unitName;
                            break;
                        case 7:
                            tenName = "Seventy %s" + unitName;
                            break;
                        case 8:
                            tenName = "Eighty %s" + unitName;
                            break;
                        case 9:
                            tenName = "Ninety %s" + unitName;
                            break;
                    }
                }
                switch (hundred) {
                    case 1:
                        System.out.printf("One hundred %s", tenName);
                        break;
                    case 2:
                        System.out.printf("Two hundred %s", tenName);
                        break;
                    case 3:
                        System.out.printf("Three hundred %s", tenName);
                        break;
                    case 4:
                        System.out.printf("Four hundred %s", tenName);
                        break;
                    case 5:
                        System.out.printf("Five hundred %s", tenName);
                        break;
                    case 6:
                        System.out.printf("Six hundred %s", tenName);
                        break;
                    case 7:
                        System.out.printf("Seven hundred %s", tenName);
                        break;
                    case 8:
                        System.out.printf("Eight hundred %s", tenName);
                        break;
                    case 9:
                        System.out.printf("Nine hundred %s", tenName);
                        break;
                }


            }
        }
    }
}
