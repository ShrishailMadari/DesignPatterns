package inheritance;

public class MotorCycle extends VehicleOfInheritance{
    private boolean hasSidecar;


    public MotorCycle(String brand, boolean hasSidecar) {
        super(brand); // Calls the parent class constructor
        this.hasSidecar = hasSidecar;
    }

    public void popWheelie() {
        System.out.println(getBrand() + " motorcycle is popping a wheelie!");
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}
