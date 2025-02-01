package assignment3_2.task2;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Gasoline", "Red");
        Bus bus = new Bus("Petrol", "Blue");
        Motorcycle motorcycle = new Motorcycle("Bensa", "Green");

        System.out.println(car.getInfo());
        System.out.println(bus.getInfo());
        System.out.println(motorcycle.getInfo());

        car.start();
        bus.start();
    }
}
