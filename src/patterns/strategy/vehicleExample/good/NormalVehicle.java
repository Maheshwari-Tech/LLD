package patterns.strategy.vehicleExample.good;

public class NormalVehicle extends Vehicle {
    public NormalVehicle(){
        super(new NormalDrive());
    }
}
