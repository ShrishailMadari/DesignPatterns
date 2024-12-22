package inheritance;

public class VehicleOfInheritance {
    private String brand;

    public VehicleOfInheritance(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting...");
    }

    public void stop() {
        System.out.println(brand + " vehicle is stopping...");
    }

    public String getBrand() {
        return brand;
    }
}
