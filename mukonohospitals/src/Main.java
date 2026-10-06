public class Main {
    public static void main(String[] args) {
        MedicalStaff doctor = new Doctor("D001", "Sarah Namukasa", "Surgery", 50);
        MedicalStaff nurse = new Nurse("N001", "Grace Nakato", "Maternity", 45);
        MedicalStaff pharmacist = new Pharmacist("P001", "John Ssemwogerere", "Pharmacy", 40);
        MedicalStaff labTech = new LabTechnician("L001", "Peter Okello", "Laboratory", 42);
        System.out.println("STAFF DETAILS");
        doctor.showDetails();
        nurse.showDetails();
        pharmacist.showDetails();
        labTech.showDetails();

        System.out.println("PATIENT CARE DUTIES");
        doctor.performPatientCare();     // each object does its own version
        nurse.performPatientCare();
        pharmacist.performPatientCare();
        labTech.performPatientCare();
    }
}



