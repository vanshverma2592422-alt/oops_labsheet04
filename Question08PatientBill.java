package labsheet04;

class PatientBill {
    private double consultationFee;
    private double medicineFee;

    public void setConsultationFee(double consultationFee) {
        if (consultationFee >= 0) {
            this.consultationFee = consultationFee;
        }
    }

    public void setMedicineFee(double medicineFee) {
        if (medicineFee >= 0) {
            this.medicineFee = medicineFee;
        }
    }

    public double calculateTotal() {
        return consultationFee + medicineFee;
    }

    public void displayTotal() {
        System.out.println("Total bill: " + calculateTotal());
    }
}

public class Question08PatientBill {
    public static void main(String[] args) {
        PatientBill bill = new PatientBill();
        bill.setConsultationFee(35.00);
        bill.setMedicineFee(18.50);
        bill.displayTotal();
    }
}