package be.intecbrussel.extraExercises4.garage;

public class Auto {
    private String brandName;
    private Garage garage = new Garage();

    public Auto(String brandName) {
        this.brandName = brandName;
    }

    public Auto(String brandName, Garage garage) {
        this.brandName = brandName;
        this.garage = garage;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Auto(Auto a) {
        this.brandName = a.brandName;
        this.garage = a.garage;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brandName='" + brandName + '\'' +
                ", garage=" + garage +
                '}';
    }


}