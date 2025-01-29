package assignment3_1;

public class SportsCar extends Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    public SportsCar(String typeName) {
        super(typeName);
    }
    @Override
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 20;
        else
            speed = 0;
    }

    //Perfection cant be improved
    @Override
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
}
