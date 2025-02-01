package assignment3_2.task2;

public class Bus extends AbstractVehicle {

    String type = "Car";
    String fuel;
    String Color;

    public Bus(String fuel, String Color) {
        this.fuel = fuel;
        this.Color = Color;
    }

    @Override
    public void start(){
        System.out.println("Bus is starting.");
    }

    @Override
    public void stop(){
        System.out.println("Bus is stopping.");
    }

    @Override
    public String getInfo(){
        return type + " " + fuel + " " + Color;
    }
}