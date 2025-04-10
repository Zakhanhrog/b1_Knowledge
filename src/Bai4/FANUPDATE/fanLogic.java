package Bai4.FANUPDATE;

public class fanLogic {
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

    // Getter và Setter cho trạng thái status
    public boolean isOn() {
        return status;
    }

    public String setOn(boolean status) {
        this.status = status;

        if (status){
            return "On";
        }else
            return "Off";
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
