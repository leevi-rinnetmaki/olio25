package assignment3_2.task4;

public class Bus extends AbstractVehicle {

    int efficiency=60;

    public Bus(String fuel, String Color) {
        super(fuel, Color);
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

    @Override
    public void charge(){
        System.out.println("Bus can't charge.");
    }

    @Override
    public void calculateFuelEfficiency(){
        System.out.println("This busses fuel efficiency is " + efficiency + " ruotsinvirstaa per leiviskä.");
    }
}