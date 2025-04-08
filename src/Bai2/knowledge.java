package Bai2;

import java.util.Scanner;

public class knowledge {
//    public static void main(String[] args) {
       /* for ( int i = 1; i <= 10; i++){
            int k = i + 10;
            System.out.println("Gia tri cua k la " + k );
        }*/

        /*int[] arr = {1,2,3,4,5,6,8};
        for ( int change : arr){
            System.out.println("Gia tri cua arr la " + change );
        }

        for ( int i = 0; i < arr.length; i++){
            System.out.println("Gia tri cua arr la " + arr[i] );
        }*/

       /* Scanner inputA = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        int a = inputA.nextInt();
        Scanner inputB = new Scanner(System.in);
        System.out.println("Nhap vao so thu hai: ");
        int b = inputB.nextInt();
        Scanner inputC = new Scanner(System.in);
        System.out.println("Nhap tong 2 so tren: ");
        int c = inputC.nextInt();

        while (a + b != c){
            System.out.println("Sai roi hay nhap lai tong");
            c = inputC.nextInt();
        }
        System.out.println("Chuc mung da nhap dung tong");*/

        // vong lap long nhau: Tao bang cuu chuong voi so cot hang nhap vao
        /*Scanner inputColums = new Scanner(System.in);
        System.out.println("Nhap vao so colums: ");
        int colums = inputColums.nextInt();

        Scanner inputRows = new Scanner(System.in);
        System.out.println("Nhap vao so rows: ");
        int rows = inputRows.nextInt();

        System.out.println("Bang cuu chuong cua ban nhu sau");
        System.out.print("\t"); // "\t" là kí hiệu tab
        for ( int i = 1 ; i <= colums; i++ ){
            System.out.printf("%5d" , i );
            *//*"%5d": Đây là chuỗi định dạng (format string). Nó chỉ định cách giá trị i * j sẽ được hiển thị:
%: Bắt đầu một đặc tả định dạng.
            4: Chỉ định chiều rộng tối thiểu là 4 ký tự. Nếu giá trị i * j có ít hơn 4 chữ số, nó sẽ được thêm khoảng trắng vào bên trái để đạt được chiều rộng này.
            d: Chỉ định rằng giá trị cần được định dạng là một số nguyên thập phân (decimal integer).*//*
        }
        System.out.println();
        for ( int k = 1 ; k <= colums; k++ ){
            System.out.print("------");
        }
        System.out.println();

        for ( int i = 1 ; i <= rows; i++ ){
            System.out.printf("%2d |",i);
            for (int j = 1 ; j <= colums; j++ ){
                System.out.printf("%5d", i*j );
            }
            System.out.println();
        }*/

        //tinh giai thua - su dung de quy
          /*  public static long tinhGiaiThua(int n) {
                if (n < 0) {
                    return -1;
                }
                if (n == 0) {
                    return 0;
                }
                return n * tinhGiaiThua(n - 1);
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập một số: ");
                int number = scanner.nextInt();
                scanner.close();

                long result = tinhGiaiThua(number);
                if (result == -1) {
                    System.out.println("Không tính được giai thừa cho số âm.");
                } else {
                    System.out.println("Giai thừa của " + number + " là: " + result);
                }


            }*/


 /*   public static void main(String[] args) {
        int count = 0;
        int number = 10;
        boolean isEven;
        int loopCounter = 0;

        System.out.println("5 số chẵn đầu tiên bắt đầu từ 10 la: ");


        for (loopCounter = 0; count < 5; loopCounter++) {
            isEven = false;
            if (number >= 10) {
                if (number % 2 == 0) {
                    isEven = true;
                    if (isEven) {
                        System.out.print(number + " ");
                        count++;
                    }
                }
            }
            number++;
        }

        System.out.println();
    }*/
}

