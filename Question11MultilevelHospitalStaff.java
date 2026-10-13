package labsheet04;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Name: " + name);
    }
}

class StaffEmployee extends Person {
    private int employeeNumber;

    public StaffEmployee(String name, int employeeNumber) {
        super(name);
        this.employeeNumber = employeeNumber;
    }

    public void describeJob() {
        introduce();
        System.out.println("Employee number: " + employeeNumber);
    }
}

class Manager extends StaffEmployee {
    private String department;

    public Manager(String name, int employeeNumber, String department) {
        super(name, employeeNumber);
        this.department = department;
    }

    public void displayDetails() {
        describeJob();
        System.out.println("Department: " + department);
    }
}

public class Question11MultilevelHospitalStaff {
    public static void main(String[] args) {
        Manager manager = new Manager("Noah", 410, "Outpatient Services");
        manager.displayDetails();
    }
}