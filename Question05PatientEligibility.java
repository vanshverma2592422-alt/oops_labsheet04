package labsheet04;

import java.util.Scanner;

class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayEligibility() {
        System.out.print(name + ": ");
        if (age >= 60) {
            System.out.println("eligible for senior care");
        } else {
            System.out.println("not in the senior care age group");
        }
    }
}

public class Question05PatientEligibility {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter patient name and age: ");
            String name = input.nextLine();
            int age = input.nextInt();
            if (age < 0) {
                System.out.println("Age cannot be negative.");
                return;
            }
            Patient patient = new Patient(name, age);
            patient.displayEligibility();
        }
    }
}