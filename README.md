# OOPS Lab Sheet 04 - Classes, Objects, and Inheritance

This folder contains 15 separate beginner-friendly Java programs. Each program can be compiled and run independently. Most examples create an object in `main` and call an instance method; the final hospital program keeps all application work inside `run()`.

## Questions

1. `Question01StudentRecord.java` - A `Student` object displays its own name and roll number.
2. `Question02Medicine.java` - A parameterized constructor initializes medicine data.
3. `Question03Pharmacy.java` - Two objects share static pharmacy details.
4. `Question04PharmacyInventory.java` - `Inventory` owns its medicine array and display loop.
5. `Question05PatientEligibility.java` - A patient's method classifies senior-care age eligibility (60+).
6. `Question06EncapsulatedMedicine.java` - Private medicine data is displayed by its own class.
7. `Question07BankAccount.java` - A validated deposit method controls a private balance.
8. `Question08PatientBill.java` - Private fees have setters and are added by the bill object.
9. `Question09EmployeePharmacist.java` - `Pharmacist` inherits from `Employee`.
10. `Question10HierarchicalHospitalStaff.java` - `Doctor` and `HospitalPharmacist` share a parent class.
11. `Question11MultilevelHospitalStaff.java` - `Manager` inherits through `StaffEmployee` from `Person`.
12. `Question12MultipleInheritanceConcept.java` - Explains why a Java class cannot extend two classes.
13. `Question13HybridInheritanceConcept.java` - Explains hybrid inheritance without implementing multiple class inheritance.
14. `Question14ShapeHierarchy.java` - `Rectangle` and `Circle` calculate their areas through `Shape`.
15. `Question15FinalHospitalStaffSystem.java` - Combines pharmacy, staff inheritance, encapsulated medicine, and patient billing.

## Compile and Run

Open PowerShell in this folder and compile the programs into `out`:

```powershell
javac -d out *.java
```

Run a program using its package and class name:

```powershell
java -cp out labsheet04.Question01StudentRecord
java -cp out labsheet04.Question15FinalHospitalStaffSystem
```

`Question05PatientEligibility` asks for a patient name and age. The other examples use small sample values in their `main` methods so their OOP behavior is easy to see.