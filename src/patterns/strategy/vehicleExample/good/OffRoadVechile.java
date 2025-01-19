package patterns.strategy.vehicleExample.good;

public class OffRoadVechile extends Vehicle{
    public OffRoadVechile() {
        super(new SpecialDrive());
    }
}
