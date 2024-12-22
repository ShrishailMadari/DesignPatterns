package with;

import with.strategy.NormalStrategy;
import with.strategy.SportsStrategy;
import with.strategy.VehicleStrategy;

public class OffRoadVehicle extends VehicleContext {
    public OffRoadVehicle() {
        super(new NormalStrategy());
    }
}

