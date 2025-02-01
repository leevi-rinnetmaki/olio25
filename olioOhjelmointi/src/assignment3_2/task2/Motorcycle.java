package assignment3_2.task2;

public class Motorcycle extends AbstractVehicle {

    String type = "Motorcycle";
    String fuel;
    String Color;

    public Motorcycle(String fuel, String Color) {
        this.fuel = fuel;
        this.Color = Color;
    }

    @Override
    public void start(){
        System.out.println("Motorcycle is starting.");
    }

    @Override
    public void stop(){
        System.out.println("Motorcycle is stopping.");
    }

    @Override
    public String getInfo(){
        return type + " " + fuel + " " + Color;
    }
}