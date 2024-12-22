package with.strategy;

public class SportsStrategy implements VehicleStrategy {
    @Override
    public void drive() {
        System.out.println("sports Vehicle is running with its capabilities");
    }
}
