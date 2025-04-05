import java.util.Scanner;

public class ex9_ {
    public static void main(String[] args) {
        Scanner inputDollar = new Scanner(System.in);
        System.out.println("Nhap so tien muon doi: ");
        Float dollar = inputDollar.nextFloat();
        final float rate = 23000f;

        float VND = dollar * rate;
        System.out.printf("So tien khi ban chuyen thanh VND la %f ", VND );
    }
}
