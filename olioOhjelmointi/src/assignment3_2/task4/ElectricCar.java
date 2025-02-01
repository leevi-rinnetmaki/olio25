package assignment3_2.task4;

public class ElectricCar extends AbstractVehicle {
    int charge=0;
    int maxCharge=120;
    int efficiency=5;

    public ElectricCar(String fuel, String color) {
        super(fuel, color);
    }
    @Override
    public void start(){
        if(charge > 0){
            System.out.println("Electric car is starting.");
        }else{
            System.out.println("Electric car is not starting.");
        }

    }

    @Override
    public void stop(){
        System.out.println("Electric car is stopping.");
    }

    @Override
    public String getInfo(){
        return type + " " + fuel + " " + Color;
    }

    @Override
    public void charge(){
        charge=maxCharge;
    }

    @Override
    public void calculateFuelEfficiency(){
        System.out.println("This electric vehicles fuel efficiency is " + efficiency + " british thermal units per barleycorn.");
    }
}
