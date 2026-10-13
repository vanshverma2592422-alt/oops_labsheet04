package labsheet04;

class Employee {
    protected String name;
    protected int employeeNumber;

    public Employee(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name);
        System.out.println("Employee number: " + employeeNumber);
    }
}

class Pharmacist extends Employee {
    private String licenseNumber;

    public Pharmacist(String name, int employeeNumber, String licenseNumber) {
        super(name, employeeNumber);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("License number: " + licenseNumber);
    }
}

public class Question09EmployeePharmacist {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist("Mina", 204, "PH-4821");
        pharmacist.displayDetails();
    }
}