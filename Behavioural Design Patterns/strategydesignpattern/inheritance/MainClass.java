package inheritance;

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.start(); // Inherited from Vehicle
        car.openTrunk(); // Specific to Car
        System.out.println("Doors: " + car.getDoors());
        car.stop(); // Inherited from Vehicle

        System.out.println();

        // Create a Motorcycle object
        MotorCycle motorcycle = new MotorCycle("Harley-Davidson", true);
        motorcycle.start(); // Inherited from Vehicle
        motorcycle.popWheelie(); // Specific to Motorcycle
        System.out.println("Has sidecar: " + motorcycle.hasSidecar());
        motorcycle.stop(); // Inherited from Vehicle

    }
}
