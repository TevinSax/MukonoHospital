public class LabTechnician extends MedicalStaff {
    LabTechnician(String id, String name, String dept, int hours) {
        super(id, name, dept, hours);
    }
    @Override
    public void performPatientCare() {
        System.out.println("Lab Technician " + name + " runs tests and reports results.");
    }
}

