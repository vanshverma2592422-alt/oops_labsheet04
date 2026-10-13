package labsheet04;

class HospitalEmployee {
    private String name;
    private int employeeNumber;

    public HospitalEmployee(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee number: " + employeeNumber);
    }
}

class Doctor extends HospitalEmployee {
    private String specialty;

    public Doctor(String name, int employeeNumber, String specialty) {
        super(name, employeeNumber);
        this.specialty = specialty;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Doctor, specialty: " + specialty);
    }
}

class HospitalPharmacist extends HospitalEmployee {
    public HospitalPharmacist(String name, int employeeNumber) {
        super(name, employeeNumber);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Pharmacist");
    }
}

public class Question10HierarchicalHospitalStaff {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Ravi", 301, "Cardiology");
        HospitalPharmacist pharmacist = new HospitalPharmacist("Leena", 302);
        doctor.displayDetails();
        System.out.println();
        pharmacist.displayDetails();
    }
}