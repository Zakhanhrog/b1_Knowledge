package Bai4;

import java.util.Scanner;

class rectangle{
    int length;
    int width;
    int acreage;
    int perimeter;

    int getAcreage(int length,int width){
        this.length = length;
        this.width = width;
        this.acreage = length*width;
        return acreage;
    }
    int getPerimeter(int length,int width){
        this.length = length;
        this.width = width;
        this.perimeter = (length+width)*2;
        return perimeter;
    }
}

public class ex1 {
    public static void main(String[] args) {
        rectangle obj = new rectangle();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.print("Enter the length of the rectangle: \n");
        obj.length = scanner.nextInt();     //nhap gai tri cho length
        System.out.print("Enter the width of the rectangle: \n");
        obj.width = scanner.nextInt();      // nhap gai tri cho width

        do{
            System.out.println("1. Get acreage");
            System.out.println("2. Get perimeter");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("The acreage is: " + obj.getAcreage(obj.length,obj.width));
                    break;
                case 2:
                    System.out.println("The perimeter is: " + obj.getPerimeter(obj.length,obj.width));
                    break;
                case 3:
                    System.exit(0);
            }

        }while(choice != 3);

    }
}
