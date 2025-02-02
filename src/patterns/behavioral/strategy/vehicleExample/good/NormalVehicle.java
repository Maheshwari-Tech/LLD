package patterns.behavioral.strategy.vehicleExample.good;

public class NormalVehicle extends Vehicle {
    public NormalVehicle(){
        super(new NormalDrive());
    }
}
