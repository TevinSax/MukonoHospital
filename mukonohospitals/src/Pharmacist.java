public class Pharmacist extends MedicalStaff {
    Pharmacist(String id, String name, String dept, int hours) {
        super(id, name, dept, hours);
    }

    @Override
    public  void performPatientCare() {
        System.out.println("Pharmacist " + name + " dispenses medicine and explains dosage.");
    }
}
