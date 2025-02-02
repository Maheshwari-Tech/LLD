package problems.parking_lot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private int capacity;

    private Map<Integer, ParkingSpot> spots;

    ParkingLot(int capacity){
        this.capacity = capacity;
        spots = new HashMap<>();
    }
    public int getCapacity(){
        return capacity;
    }

    public void park(int slotId, Vehicle vehicle){
        if(!spots.containsKey(slotId)) {
            spots.put(slotId,new ParkingSpot(slotId));
        }
        spots.get(slotId).assignCar(vehicle);
    }

    public Vehicle unpark(int slotId){
        return spots.get(slotId).makeFree();
    }

    public Map<Integer, ParkingSpot> getSpots(){
        return spots;
    }
}
