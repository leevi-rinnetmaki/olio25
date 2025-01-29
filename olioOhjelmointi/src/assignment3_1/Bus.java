package assignment3_1;

public class Bus extends Car{
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private int passengers;
    public Bus(String typeName) {
        super(typeName);
    }
    public void passengerEnter(int passengers) {
        if(passengers > 0){
            this.passengers += passengers;
        }
    }
    public void passengerLeave(int passengers) {
        if(passengers > 0 && this.passengers >= passengers){
            this.passengers -= passengers;
        }
    }
}
