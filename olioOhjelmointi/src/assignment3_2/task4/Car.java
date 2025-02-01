package assignment3_2.task4;

public class Car extends AbstractVehicle {

    int efficiency=24;

    public Car(String fuel, String Color) {
        super(fuel, Color);
    }

    @Override
    public void start(){
        System.out.println("Car is starting.");
    }

    @Override
    public void stop(){
        System.out.println("Car is stopping.");
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
        System.out.println("This cars fuel efficiency is " + efficiency + " Fathoms per bushel.");
    }
}
