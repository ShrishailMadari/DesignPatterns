package with;

import with.strategy.SportsStrategy;

public class SportsVehicle extends VehicleContext{
    public SportsVehicle() {
        super(new SportsStrategy());
    }
}
