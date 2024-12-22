package inheritance;

public class Car extends VehicleOfInheritance{
    private int doors;
    public Car(String brand, int doors) {
        super(brand); // Calls the parent class constructor
        this.doors = doors;
    }
    public void openTrunk() {
        System.out.println(getBrand() + " car's trunk is opening...");
    }

    public int getDoors() {
        return doors;
    }
}
