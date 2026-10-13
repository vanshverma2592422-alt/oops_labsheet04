package labsheet04;

class MedicineStock {
    private String medicineName;
    private int quantity;

    public MedicineStock(String medicineName, int quantity) {
        this.medicineName = medicineName;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println(medicineName + ": " + quantity + " packs");
    }
}

class Inventory {
    private MedicineStock[] medicines;

    public Inventory() {
        medicines = new MedicineStock[] {
                new MedicineStock("Pain relief tablets", 25),
                new MedicineStock("Vitamin C", 40),
                new MedicineStock("Cough syrup", 12)
        };
    }

    public void displayInventory() {
        for (MedicineStock medicine : medicines) {
            medicine.display();
        }
    }
}

public class Question04PharmacyInventory {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.displayInventory();
    }
}