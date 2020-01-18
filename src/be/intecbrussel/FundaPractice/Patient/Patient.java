package be.intecbrussel.FundaPractice.Patient;

public class Patient extends Person {
    private BloodType bloodType;

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public Patient(String name, int age, double weight, Gender gender) {
        super(name, age, weight, gender);
    }

    public Patient(String name, int age, double weight, Gender gender, BloodType bloodType) {
        super(name, age, weight, gender);
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "bloodType=" + bloodType + super.toString()+
                '}';
    }
}
