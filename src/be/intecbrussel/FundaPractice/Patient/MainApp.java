package be.intecbrussel.FundaPractice.Patient;

import java.util.Random;

public class MainApp {

    public static void main(String[] args) {
        Patient patient1 = new Patient("John", 54, 78.5, getGender(), getBloodType());
        Patient patient2 = new Patient("Emilie", 45, 60.0, getGender(), getBloodType());
        Patient patient3 = new Patient("Candy", 65, 82.0, getGender(), getBloodType());
        Patient patient4 = new Patient("Cicilie", 89, 80.00, getGender(), getBloodType());

        PatientRegister patientRegister = new PatientRegister();
        patientRegister.addPatients(patient1);
        patientRegister.addPatients(patient2);
        patientRegister.addPatients(patient3);
        patientRegister.addPatients(patient4);

        patientRegister.printPatients();
    }

    /**
     * Randomly creates a gender and returns it
     *
     * @return
     */
    public static Gender getGender() {
        int randomNumber = new Random().nextInt(Gender.values().length);
        Gender gender = null;
        if (randomNumber == 0) {
            gender = Gender.MAN;
        } else {
            gender = Gender.WOMAN;
        }

        return gender;
    }

    public static BloodType getBloodType() {
        int randomType = new Random().nextInt(BloodType.values().length);
        BloodType bloodType = null;
        switch (randomType) {
            case 0:
                bloodType = BloodType.AB;
                break;
            case 1:
                bloodType = BloodType.B;
                break;
            case 2:
                bloodType = BloodType.O;
                break;
            case 3:
                bloodType = BloodType.A;
                break;
            case 4:
            default:
                bloodType = BloodType.UNKNOWN;
                break;

        }

        return bloodType;
    }
}
