package with.strategy;

public class NormalStrategy implements VehicleStrategy {
    @Override
    public void drive() {
        System.out.println("vehicle running on Normal required capabilities");
    }
}
