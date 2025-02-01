package assignment3_2.task3;

public class Motorcycle extends AbstractVehicle {

    public Motorcycle(String fuel, String Color) {
        super(fuel, Color);
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

    @Override
    public void charge(){
        System.out.println("Bus can't charge.");
    }
}