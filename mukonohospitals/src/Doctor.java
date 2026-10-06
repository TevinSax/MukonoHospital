public class Doctor extends MedicalStaff {
    Doctor(String id, String name, String dept, int hours) {
        super(id, name, dept, hours);
    }

    @Override
    public void performPatientCare() {
        System.out.println("Doctor " + name + " diagnoses patients and prescribes treatment.");
    }
}
