package Bai4;

class fanLogic {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public fanLogic() {
    }

    // Getter và Setter cho speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter và Setter cho trạng thái on
    public boolean isOn() {
        return status;
    }

    public void setOn(boolean on) {
        this.status = on;
    }

    // Getter và Setter cho radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter và Setter cho color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (status) {
            return "Fan is on, Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off, Color: " + color + ", Radius: " + radius;
        }

    }
}
public class fanMain {
    public static void main(String[] args) {
        fanLogic fan1 = new fanLogic();
        fan1.setSpeed(fanLogic.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Tạo đối tượng Fan 2
        fanLogic fan2 = new fanLogic();
        fan2.setSpeed(fanLogic.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Hiển thị thông tin của các đối tượng bằng toString()
        System.out.println("Fan 1: " + fan1);  // Tự động gọi fan1.toString()
        System.out.println("Fan 2: " + fan2);  // Tự động gọi fan2.toString()

    }
}
