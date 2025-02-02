package problems.parking_lot;

import java.util.Set;
import java.util.TreeSet;

public class NaturalNumberStrategy implements ParkingStrategy {

    TreeSet<Integer> availableId;

    NaturalNumberStrategy(){
        availableId = new TreeSet<>();
    }

    public void addId(int id){
        availableId.add(id);
    }

    public void removeId(int id){
        availableId.remove(id);
    }

    @Override
    public int getNextSlot() {
       return availableId.first();
    }
}
