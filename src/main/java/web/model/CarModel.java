package web.model;

public class CarModel {

    private String brand;

    private String model;

    private int manufacturedYear;

    public CarModel() {
    }

    public CarModel(String brand, String model, int manufacturedYear) {
        this.brand = brand;
        this.model = model;
        this.manufacturedYear = manufacturedYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufacturedYear=" + manufacturedYear +
                '}';
    }
}
