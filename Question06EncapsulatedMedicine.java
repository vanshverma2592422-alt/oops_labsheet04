package labsheet04;

class MedicineProduct {
    private String name;
    private double price;
    private int quantity;

    public MedicineProduct(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Medicine: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class Question06EncapsulatedMedicine {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Allergy tablets", 8.75, 20);
        product.display();
    }
}