package with;

import with.strategy.TruckStrategy;
import with.strategy.VehicleStrategy;

public class GoodsVehicle extends VehicleContext{
    public GoodsVehicle() {
        super(new TruckStrategy());
    }
}
