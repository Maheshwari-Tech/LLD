package problems.parking_lot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ParkingLotService {
    ParkingLot parkingLot;
    ParkingStrategy parkingStrategy;

    Map<String, Integer> slotByVehicleNo;
    Map<String, List<Vehicle>>  vehicleByColor;


    public void createParkingLot(int capacity, ParkingStrategy strategy){
        parkingLot = new ParkingLot(capacity);
        parkingStrategy = new NaturalNumberStrategy();

        for(int i=1; i<=capacity; ++i){
            parkingStrategy.addId(i);
        }
    }

    public void parkVehicle(Vehicle vehicle){
        int slotId = parkingStrategy.getNextSlot();
        parkingLot.park(slotId, vehicle);
        slotByVehicleNo.put(vehicle.getNo(), slotId);

        if(!vehicleByColor.containsValue(vehicle.getColor())){
            vehicleByColor.put(vehicle.getColor(),new ArrayList<>());
        }
        vehicleByColor.get(vehicle.getColor()).add(vehicle);
    }

    public Vehicle unparkVehicle(String vehicleNo){
        int slot = slotByVehicleNo.get(vehicleNo);
        return unparkVehicle(slot);
    }

    public Vehicle unparkVehicle(int slotId){
        Vehicle vehicle =  parkingLot.unpark(slotId);
        slotByVehicleNo.remove(vehicle.getNo());
        vehicleByColor.get(vehicle.getColor()).remove(vehicle);
        return vehicle;
    }

    public void status(){
        List<ParkingSpot> spotList = new ArrayList<>();

        for(Map.Entry entry: parkingLot.getSpots().entrySet()){
            ParkingSpot spot = (ParkingSpot) entry.getValue();
            if(!spot.isOccupied()){
                spotList.add(spot);
            }
        }

    }

    public int getSlotNoByVehicleNo(Vehicle vehicle){
        return slotByVehicleNo.get(vehicle.getNo());
    }

    public List<Integer> slotsNoOfCarWithColor(String color){
        List<Integer> result = new ArrayList<>();

        for(Vehicle vehicle : vehicleByColor.getOrDefault(color, Collections.emptyList())){
            result.add(slotByVehicleNo.get(vehicle.getNo()));
        }
        return result;
    }

    public List<String> carNumbersWithColor(String color){
        List<String> result = new ArrayList<>();

        for(Vehicle vehicle : vehicleByColor.getOrDefault(color, Collections.emptyList())){
            result.add(vehicle.getNo());
        }
        return result;
    }
}
