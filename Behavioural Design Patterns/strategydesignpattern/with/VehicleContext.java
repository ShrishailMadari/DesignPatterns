package with;

import with.strategy.VehicleStrategy;

public class VehicleContext {
        private final VehicleStrategy vehicleStrategy;

    public VehicleContext(VehicleStrategy vehicleStrategy) {
        this.vehicleStrategy = vehicleStrategy;

    }
    public void driveVehicle(){
        vehicleStrategy.drive();
    }

}

