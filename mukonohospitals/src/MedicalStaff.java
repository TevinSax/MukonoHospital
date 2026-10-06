public abstract class MedicalStaff {
    protected String employeeId;
    protected String name;
    protected String department;
    protected int workingHours;

    MedicalStaff(String employeeId, String name, String department, int workingHours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.workingHours = workingHours;
    }
    public void showDetails() {
        System.out.println(employeeId + "  " + name + "  " + department
                + "  " + workingHours + " hrs");
    }
    public  abstract void performPatientCare();
}
