package problems.parking_lot;

public class Vehicle {
    private String no;
    private String color;

    public void Vehicle(String no, String color){
        this.no = no;
        this.color = color;
    }

    public String getNo(){
        return no;
    }

    public String getColor(){
        return color;
    }
}
