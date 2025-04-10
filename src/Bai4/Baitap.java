package Bai4;


class Student{
    private int id;
    private String fullname;
    private String email;
    private int age;
    private double grade;

    public Student(int id, String fullname, String email, int age, double grade) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

}
public class Baitap {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student(1, "khanhdzqua", "khanhdzqua@email.com", 20, 7.5);
        students[1] = new Student(2, "ç", "khanhdzthw@email.com", 22, 4.0);
        students[2] = new Student(3, "khanhpro", "khanhpro@email.com", 19, 8.0);
        students[3] = new Student(4, "khanhyeukhanh", "khanhyeukhanh@email.com", 21, 6.5);
        students[4] = new Student(5, "khanhnek", "khanhnek@email.com", 23, 9.0);

        double totalAge = 0;
        for (Student student : students) {
            totalAge += student.getAge();
        }
        double averageAge = totalAge / students.length;
        System.out.println("Average age: " + averageAge);

        int passingCount = 0;
        for (Student student : students) {
            if (student.getGrade() > 5) {
                passingCount++;
            }
        }
        System.out.println("Number of students passing: " + passingCount);

        for (Student student : students) {
            if (student.getFullname().equals("khanhdzqua")) {
                System.out.println("Email of khanhdzqua: " + student.getEmail());
                break;
            }
        }
    }
}
