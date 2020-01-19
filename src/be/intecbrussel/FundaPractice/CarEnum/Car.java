package be.intecbrussel.FundaPractice.CarEnum;

public class Car {
    private int horsePower;
    private BrandName brand;
    private Person owner;
    private FuelType fuel;
    private double fuelUsage;
    private double maxFuel;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public BrandName getBrand() {
        return brand;
    }

    public void setBrand(BrandName brand) {
        this.brand = brand;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public Car(int horsePower, BrandName brand, Person owner, FuelType fuel, double fuelUsage, double maxFuel) {
        this.horsePower = horsePower;
        this.brand = brand;
        this.owner = owner;
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.maxFuel = maxFuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                ", brand=" + brand +
                ", owner=" + owner +
                ", fuel=" + fuel +
                ", fuelUsage=" + fuelUsage +
                ", maxFuel=" + maxFuel +
                ", weight=" + brand.getWeight() +
                '}';
    }
}