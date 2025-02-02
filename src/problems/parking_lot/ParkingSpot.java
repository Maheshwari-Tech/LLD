package problems.parking_lot;

public class ParkingSpot {
    private int no;
    private Vehicle vehicle;

    ParkingSpot(int no){
        this.no = no;
    }

    public void assignCar(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Vehicle makeFree(){
        Vehicle vehicle1 = vehicle;
        this.vehicle = null;
        return vehicle1;
    }

    public boolean isOccupied(){
        return this.vehicle == null;
    }
}
