package patterns.strategy.vehicleExample.good;

public class NormalDrive implements IDriveStrategy {
    @Override
    public void drive() {
        System.out.println("normal drive");
    }
}
