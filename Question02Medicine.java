package labsheet04;

class Medicine {
    private String name;
    private double price;

    public Medicine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Medicine: " + name);
        System.out.println("Price: " + price);
    }
}

public class Question02Medicine {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Vitamin C", 12.50);
        medicine.display();
    }
}