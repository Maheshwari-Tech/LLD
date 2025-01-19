package patterns.strategy.vehicleExample.bad;

public class OffRoadVehcile extends Vehicle {

    @Override
    public void drive(){
        System.out.println("driving specially");
    }
}
