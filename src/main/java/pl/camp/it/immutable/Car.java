package pl.camp.it.immutable;

public class Car {
    private final String brand;
    private final String model;
    private final int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car setYear(int year) {
        return new Car(this.brand, this.model, year);
    }

    public Car setBrand(String brand) {
        return new Car(brand, this.model, this.year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
