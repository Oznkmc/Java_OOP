class Car {
    String brand;
    String model;
    String modelYear;
    String fuelType;
    Integer km;

    public Car(String brand, String model, String modelYear, String fuelType, Integer km) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.fuelType = fuelType;
        this.km = km;
    }

    void BilgileriGoster() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Model Year: " + modelYear);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("km: " + km);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car car = new Car("Renault", "Megan", "2025", "Dizel", 5000);
        car.BilgileriGoster();
    }
}

