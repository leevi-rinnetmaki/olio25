package assignment3_2.task3;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type = "Car";
    String fuel;
    String Color;

    public AbstractVehicle(String fuel, String color) {
        this.fuel = fuel;
        this.Color = color;
    }
}
