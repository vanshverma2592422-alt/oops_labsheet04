package labsheet04;

class SystemPharmacy {
    public static String name = "City Care Pharmacy";
    public static String location = "Main Hospital";
}

class SystemMedicine {
    private String name;
    private double price;

    public SystemMedicine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Medicine: " + name + " ($" + price + ")");
    }
}

class SystemEmployee {
    private String name;
    private String role;

    public SystemEmployee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayDetails() {
        System.out.println(role + ": " + name);
    }
}

class SystemDoctor extends SystemEmployee {
    private String specialty;

    public SystemDoctor(String name, String specialty) {
        super(name, "Doctor");
        this.specialty = specialty;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
    }
}

class SystemPharmacist extends SystemEmployee {
    public SystemPharmacist(String name) {
        super(name, "Pharmacist");
    }
}

class SystemPatientBill {
    private double consultationFee;
    private double medicineFee;

    public void setFees(double consultationFee, double medicineFee) {
        if (consultationFee >= 0 && medicineFee >= 0) {
            this.consultationFee = consultationFee;
            this.medicineFee = medicineFee;
        }
    }

    public void displayTotal() {
        System.out.println("Patient total: $" + (consultationFee + medicineFee));
    }
}

public class Question15FinalHospitalStaffSystem {
    public void run() {
        System.out.println("Pharmacy: " + SystemPharmacy.name + " - " + SystemPharmacy.location);

        SystemDoctor doctor = new SystemDoctor("Aarav", "General Medicine");
        SystemPharmacist pharmacist = new SystemPharmacist("Maya");
        doctor.displayDetails();
        pharmacist.displayDetails();

        SystemMedicine medicine = new SystemMedicine("Pain relief tablets", 6.50);
        medicine.display();

        SystemPatientBill bill = new SystemPatientBill();
        bill.setFees(25.00, 6.50);
        bill.displayTotal();
    }

    public static void main(String[] args) {
        Question15FinalHospitalStaffSystem system = new Question15FinalHospitalStaffSystem();
        system.run();
    }
}