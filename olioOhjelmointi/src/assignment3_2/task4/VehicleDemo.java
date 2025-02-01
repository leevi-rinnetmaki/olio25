package assignment3_2.task4;

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

        ElectricCar ford = new ElectricCar("Electricity", "Can't be comprehended by mere mortals.");
        ford.start();
        ford.charge();
        ford.start();
        System.out.println();

        car.calculateFuelEfficiency();
        bus.calculateFuelEfficiency();
        motorcycle.calculateFuelEfficiency();
        ford.calculateFuelEfficiency();
    }
}
