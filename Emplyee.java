public class Emplyee {
    int patientHealth;

    public Emplyee() {
        this.patientHealth = 10;
    }

    public int getPatientHealth() {
        return this.patientHealth;
    }

    public void setPatientHealth(int PatientHealth) {
        this.patientHealth = patientHealth;
    }

    @Override
    public String toString() {
        String employeeDetails = "The patient's health for this employee is " + patientHealth;

        return employeeDetails;
    }
}