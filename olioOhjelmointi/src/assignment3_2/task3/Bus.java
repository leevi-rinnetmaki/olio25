package assignment3_2.task3;

public class Bus extends AbstractVehicle {

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
}