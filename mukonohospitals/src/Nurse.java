public class Nurse extends MedicalStaff {
    Nurse(String id, String name, String dept, int hours) {
        super(id, name, dept, hours);
    }

    @Override
    public void performPatientCare() {
        System.out.println("Nurse " + name + " monitors patients and gives medication.");
    }
}

