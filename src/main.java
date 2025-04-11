import java.util.Scanner;


class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    private static String storeName;
    private static int totalProduct = 0;
    private static double totalInventoryValue = 0.0;
    private static double totalPriceSum = 0.0;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        totalProduct++;
        totalInventoryValue += this.getInventoryValue();
        totalPriceSum += this.price;
    }

    @Override
    public String toString() {

        return "--------------------\n" +
                "ID: " + this.id + "\n" +
                "Tên SP: " + this.name + "\n" +
                "Giá: " + this.price + "\n" +
                "Số lượng tồn kho: " + this.quantity + "\n" +
                "Giá trị tồn kho SP này: " + this.getInventoryValue() + "\n" +
                "--------------------";
    }


    public double getInventoryValue() {
        return this.price * this.quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static double getAveragePrice() {
        if (totalProduct == 0) {
            return 0.0;
        }
        return totalPriceSum / totalProduct;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static void setStoreName(String name) {
        storeName = name;
    }

    public static int getTotalProductCount() {
        return totalProduct;
    }

    public static double getTotalInventoryValueAllProducts() {
        return totalInventoryValue;
    }
}

public class main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Product[] products = initializeProducts();
        setInitialStoreName();
        displayAllProducts(products);
        searchProductByName(products);
        displayProductsOverPriceThreshold(products, 1000000);
        displayProductWithMaxQuantity(products);
        displayInventoryStats();
        changeAndDisplayStoreName("Kho miền Nam");
        scanner.close();
    }

    private static Product[] initializeProducts() {
        Product[] products = new Product[5];
        products[0] = new Product(1, "Laptop Dell XPS", 35000000, 10);
        products[1] = new Product(2, "Bàn phím cơ Keychron", 2100000, 50);
        products[2] = new Product(3, "Màn hình LG UltraGear", 8500000, 25);
        products[3] = new Product(4, "Chuột Logitech MX Master 3", 2500000, 40);
        products[4] = new Product(5, "Ổ cứng SSD Samsung 1TB", 1800000, 100);
        return products;
    }

    private static void setInitialStoreName() {
        Product.setStoreName("Kho Tổng ABC");
        System.out.println(">>> Đã gán tên kho mặc định: " + Product.getStoreName());
    }

    private static void displayAllProducts(Product[] products) {
        System.out.println("\n=========== DANH SÁCH SẢN PHẨM TRONG KHO ===========");
        System.out.println("Kho hàng: " + Product.getStoreName());
        for (Product p : products) {
            if (p != null) {
                System.out.println(p); // Tự động gọi p.toString()
            }
        }
        System.out.println("====================================================");
    }

    private static void searchProductByName(Product[] products) {
        System.out.println("\n=========== TÌM KIẾM SẢN PHẨM THEO TÊN ===========");
        System.out.print("Nhập tên sản phẩm cần tìm chính xác: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Product p : products) {
            if (p != null && p.getName().equals(searchName)) {
                System.out.println(">>> Tìm thấy sản phẩm:");
                System.out.println(p); // Tự động gọi p.toString()
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(">>> Không tìm thấy sản phẩm với tên '" + searchName + "'");
        }
        System.out.println("=================================================");
    }

    private static void displayProductsOverPriceThreshold(Product[] products, double threshold) {
        System.out.println("\n=========== SẢN PHẨM CÓ GIÁ > " + threshold + " đ ===========");
        boolean foundPrice = false;
        for (Product p : products) {
            if (p != null && p.getPrice() > threshold) {
                System.out.println(p); // Tự động gọi p.toString()
                foundPrice = true;
            }
        }
        if (!foundPrice) {
            System.out.println(">>> Không có sản phẩm nào có giá trên " + threshold + " đ");
        }
        System.out.println("=======================================================");
    }

    private static void displayProductWithMaxQuantity(Product[] products) {
        System.out.println("\n=========== SẢN PHẨM CÓ SỐ LƯỢNG TỒN KHO LỚN NHẤT ===========");
        Product maxQuantityProduct = null;
        int maxQuantity = -1;

        for (Product p : products) {
            if (p != null) {
                if (p.getQuantity() > maxQuantity) {
                    maxQuantity = p.getQuantity();
                    maxQuantityProduct = p;
                }
            }
        }

        if (maxQuantityProduct != null) {
            System.out.println(">>> Sản phẩm có số lượng tồn kho lớn nhất là:");
            System.out.println(maxQuantityProduct); // Tự động gọi toString()
        } else {
            System.out.println(">>> Không có sản phẩm nào trong kho.");
        }
        System.out.println("=============================================================");
    }

    private static void displayInventoryStats() {
        System.out.println("\n=========== THỐNG KÊ KHO HÀNG ===========");
        System.out.println("Tổng số loại sản phẩm trong kho: " + Product.getTotalProductCount());
        System.out.println("Tổng giá trị tồn kho của tất cả sản phẩm: " + Product.getTotalInventoryValueAllProducts());
        System.out.println("Giá bán trung bình của các loại sản phẩm: " + Product.getAveragePrice());
        System.out.println("========================================");
    }

    private static void changeAndDisplayStoreName(String newStoreName) {
        System.out.println("\n=========== THAY ĐỔI TÊN KHO ===========");
        Product.setStoreName(newStoreName);
        System.out.println(">>> Đã thay đổi tên kho thành: " + Product.getStoreName());
        System.out.println("======================================");
    }
}