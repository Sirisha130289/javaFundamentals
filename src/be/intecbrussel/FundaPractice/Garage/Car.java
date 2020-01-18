package be.intecbrussel.FundaPractice.Garage;

public class Car {
    private String brandName;
    private Garage garage;

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

    //constructors
    public Car(String brandName) {
        this.brandName = brandName;
    }

    //constructor with 2 arguments
    public Car(String brandName, Garage garage) {
        this.brandName = brandName;
        this.garage = garage;
    }
    //copy constructor

    public Car(Car car) {
        this.brandName = car.brandName;
        this.garage = car.garage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", garage=" + garage +
                '}';
    }
}
