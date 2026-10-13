package labsheet04;

class Pharmacy {
    public static String pharmacyName = "Care Pharmacy";
    public static String location = "Central Street";

    public void displayDetails() {
        System.out.println(pharmacyName + " - " + location);
    }
}

public class Question03Pharmacy {
    public static void main(String[] args) {
        Pharmacy first = new Pharmacy();
        Pharmacy second = new Pharmacy();

        first.displayDetails();
        Pharmacy.pharmacyName = "Community Pharmacy";
        second.displayDetails();
        first.displayDetails();
    }
}