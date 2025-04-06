package Bai1.Introduction_to_Java;

import java.util.Date;
import java.util.Scanner;

public class knowledge {

    public static void main(String[] args) {
        System.out.println("Hello World!"); // xuat du lieu

        // nhap du lieu
        Scanner number = new Scanner(System.in);    //nhap vao du lieu tu ban phim
        System.out.println("Nhap so can xuat ra man hinh: ");
        int numnber = number.nextInt();//dinh dang du lieu kieu int
        System.out.println("So ban vua nhap la: " + numnber); //xuat du lieu ra man hinh

        //toan tu
        int number_1 = 10;
        int number_2 = 20;
        int sum = number_1 + number_2;
        int sub = number_1 - number_2;
        int mul = number_1 * number_2;
        System.out.println("Tong 2 so la: " + sum );
        System.out.println("Tich 2 so la: " + mul );
        System.out.println("Hieu 2 so la; " + sub );

//        gan tang cuong

        int number_3 = 1;
        number_3 += 1;
        System.out.println("So sau la: " + number_3);
        // logic  & if- esle
        boolean checkNumber_3 = true;
        //cach 1
        if (number_3 >10){
            checkNumber_3 = false;
        }else {
           checkNumber_3 = true;
        }
        System.out.println("number_3 " + checkNumber_3);
        //cach 2
        if (number_3>10)
            checkNumber_3 = false;
        else
            checkNumber_3 = true;
        System.out.println("number_3 " + checkNumber_3);
        // switch - case voi kieu du lieu so
        Scanner day = new Scanner(System.in); //nhap vao ngay
        System.out.println("Nhap ngay: ");
        int dayInWeek = day.nextInt(); //phai tao bien moi de lay gia tri bien nhap o tren
        switch (dayInWeek){
            case 2:
                System.out.println("Hom nay la thu 2");
                break;
            case 3:
                System.out.println("Hom nay la thu 3"); //neu khong co break thi se thuc hien tat ca cau lenh duoi no
                break;
            case 4:
                System.out.println("Hom nay la thu 4");
                break;
        }
        //switch - case voi kieu du lieu string
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String inputString = input.next();
        switch (inputString){
            case "Hello":
                System.out.println("Hello World!");
            case "Java":
                System.out.println("Java is cool!");
        }
        //bieu thuc dieu kien
        //if-esle
        // giong toan tu 3 ngoi
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhap vao so: ");
        int inputNumber_1 = inputNumber.nextInt();
        int numberOut = ( inputNumber_1 > 5) ? 20 : 10; // numberOut se bang 20 neu dieu kien dung con bang 10 neu dieu kien sai
        System.out.println("So out la: " + numberOut);

        // lay thoi gian thuc
        Date now = new Date();
        System.out.println("Thoi gian bay gio la: " + now);
    }
}
