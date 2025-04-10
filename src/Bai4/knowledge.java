package Bai4;

class animal {
    String name;
    int age;

    animal(String name) {
        this.name = name;
        System.out.println("Created: " + name);
    }
    animal(){
        System.out.print("Created: ");
    }
    void eat() {
        System.out.print("Eating: ");
    }
    int getAge() {
        return age;
    }
    void setMainAnimal(){
        System.out.println("Main animal");
    }
}
class dog extends animal {
    String name = "Dog";
    int age = 5;
    dog() {
        super();
        System.out.println(name);
    }
    @Override
    int getAge() {
        return this.age; // Trả về age của lớp con
    }
    @Override
    void eat() {
        super.eat();
        System.out.println("Dog is eating");
    }
}
public class knowledge {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.setMainAnimal();
        obj.eat();
        System.out.printf("Age: %d", obj.getAge());
    }
}