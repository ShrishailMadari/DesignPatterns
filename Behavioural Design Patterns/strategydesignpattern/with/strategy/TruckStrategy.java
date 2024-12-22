package with.strategy;

public class TruckStrategy implements VehicleStrategy {
    @Override
    public void drive() {
        System.out.println("truck is driving with its capabilities");
    }
}
