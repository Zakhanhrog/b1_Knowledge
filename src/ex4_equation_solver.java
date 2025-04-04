import java.util.Scanner;

public class ex4_equation_solver {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 1");
        System.out.println(" a * x + b = c");

        float a, b, c;

        Scanner scannerValriable = new Scanner(System.in);
        System.out.println("Hay nhap a:");
        a = scannerValriable.nextFloat();
        System.out.println("Hay nhap b:");
        b = scannerValriable.nextFloat();
        System.out.println("Hay nhap c:");
        c = scannerValriable.nextFloat();

        if ( a != 0 ){
            float x = (c - b) / a;
            System.out.println("X = : " + x);

        }
        if ( a == 0 ){
            if ( b == c){
                System.out.println("Vo so nghiem");
            }
            if ( b != c){
                System.out.println("Vo nghiem");
            }
        }
    }
}
