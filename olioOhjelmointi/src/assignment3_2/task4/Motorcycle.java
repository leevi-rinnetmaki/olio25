package assignment3_2.task4;

public class Motorcycle extends AbstractVehicle {

    int efficiency=120;

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

    @Override
    public void calculateFuelEfficiency(){
        System.out.println("This motorcycles fuel efficiency is " + efficiency + " leagues per ½ of a wine barrel.");
    }
}