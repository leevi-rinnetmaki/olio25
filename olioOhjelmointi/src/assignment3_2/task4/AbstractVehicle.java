package assignment3_2.task4;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type = "Car";
    String fuel;
    String Color;

    public AbstractVehicle(String fuel, String color) {
        this.fuel = fuel;
        this.Color = color;
    }
}
