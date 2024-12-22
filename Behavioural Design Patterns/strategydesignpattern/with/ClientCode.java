package with;

public class ClientCode {
    public static void main(String[] args) {
    VehicleContext vehicleContext = new SportsVehicle();
        VehicleContext vehicleContext1 = new GoodsVehicle();
        vehicleContext1.driveVehicle();
    vehicleContext.driveVehicle();


    }
}
