package assignment3_2.task1;

public class Car implements Vehicle {
    String type = "Car";
    String fuel;
    String Color;

    public Car(String fuel, String Color) {
        this.fuel = fuel;
        this.Color = Color;
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
}
