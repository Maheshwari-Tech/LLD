package patterns.behavioral.strategy.vehicleExample.good;

public class SpecialDrive implements IDriveStrategy {
    @Override
    public void drive() {
        System.out.println("special drive");
    }
}
