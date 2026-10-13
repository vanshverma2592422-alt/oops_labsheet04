package labsheet04;

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
    }
}

public class Question01StudentRecord {
    public static void main(String[] args) {
        Student student = new Student("Asha", 101);
        student.display();
    }
}