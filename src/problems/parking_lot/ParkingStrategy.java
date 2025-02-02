package problems.parking_lot;

public interface ParkingStrategy {

    void addId(int id);
    int getNextSlot();
    void removeId(int id);
}
