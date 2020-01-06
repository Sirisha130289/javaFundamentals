package be.intecbrussel.Practice.Garage;

public class Auto {
    private String brandName;
    private Garage garage ;




    Auto(String brandName){
        this.brandName = brandName;
    }

    Auto(String brandName, Garage garage ){
        this.brandName = brandName;
        this.garage = garage;
    }

    Auto(Auto auto){
        this.brandName=auto.brandName;
        this.garage = auto.garage;
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

    @Override
    public String toString() {
        return "Auto{" +
                "brandName='" + brandName + '\'' +
                ", garage=" + garage +
                '}';
    }
}
