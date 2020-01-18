package be.intecbrussel.FundaPractice.Patient;

public class PatientRegister {

    private Patient[] patients = new Patient[5];

    public void addPatients(Patient patient) {

        for (int i = 0; i < patients.length; i++) {
            if (patients[i] == null) {
                patients[i] = patient;
                break;
            }

        }

    }

    public void printPatients() {
        for (int i = 0; i < patients.length; i++) {
            System.out.println("Patient " + i + " is : " + patients[i]);
        }
    }
}
