package assignment2_1;

public class Task4 {

    /* Define a class Car (convention capitalizes class names).
     * Car is public (as classes usually are, more on this later).
     */
    public static class Car {
        /* An object of class Car will have instance variables speed and gasolineLevel.
         * Both are private (they can not be accessed outside the class methods).
         * Keep instance variables private whenever possible.
         */
        private double speed;
        private double gasolineLevel;
        private String typeName;
        private CruiseControl cruiseControl = new CruiseControl();

        /* This is the method (constructor) called when a new instance of Car is created (with new).
         * Constructors may also have arguments.
         */
        public Car(String typeName) {
            speed = 0; gasolineLevel = 0;
            this.typeName = typeName;   // this refers to the object itself.
            // The reference is useful if you want to use parameter names that are
            // identical to instance variable names (and for more, later on)
        }

        /* Implementations of some methods.
         * Note that methods refer to and change instance variable values.
         */
        public void accelerate() {
            if (gasolineLevel > 0)
                speed += 10;
            else
                speed = 0;
        }
        void decelerate(int amount) {
            if (gasolineLevel > 0) {
                if (amount > 0)
                    speed = Math.max(0, speed - amount);
            } else
                speed = 0;
        }
        double getSpeed() {
            return speed;
        }
        String getTypeName() {
            return typeName;
        }
        void fillTank() {
            gasolineLevel = 100;
        }
        double getGasolineLevel() {
            return gasolineLevel;
        }

        private class CruiseControl{
            private boolean onOff = false;
            private double targetSpeed = 60;
            private double minSpeed = 12;
            private double maxSpeed = 120;

            //getters
            private boolean getOnOff(){return onOff;}
            private double getTargetSpeed(){return targetSpeed;}
            private double getMinSpeed(){return minSpeed;}
            private double getMaxSpeed(){return maxSpeed;}


            private void setOnOff(boolean onOff){
                if(!onOff){
                    this.onOff = false;
                    System.out.println("Cruise turned off");
                }
                else if(getMinSpeed() <= getTargetSpeed() && getTargetSpeed() <= getMaxSpeed()) {
                    this.onOff = true;
                    System.out.println("Cruise turned on");
                }
                while(getOnOff()){
                    if(getSpeed() < getTargetSpeed()){
                        accelerate();
                        System.out.println("Car accelerated. Speed: " + getSpeed() + "km/h");
                    }else if(getSpeed() > getTargetSpeed()){
                        if(getSpeed() > getTargetSpeed()+12){
                            decelerate(12);
                            System.out.println("Car decelerated. Speed: " + getSpeed() + "km/h");
                        }else{
                            decelerate((int)getSpeed()-(int)getTargetSpeed());
                            System.out.println("Car decelerated. Speed: " + getSpeed() + "km/h");
                        }
                    }else{
                        setOnOff(false);
                    }
                }
            }
            private void setTargetSpeed(double speed){
                if(getMinSpeed() <= speed && speed <= getMaxSpeed())targetSpeed = speed;
                else {
                    System.out.println("Cant set target speed");
                    setOnOff(false);
                }
            }
        }
    }


    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
        //System.out.println(myCar.cruiseControl);
        myCar.cruiseControl.setTargetSpeed(21);
        myCar.cruiseControl.setOnOff(true);
        myCar.cruiseControl.setTargetSpeed(97);
        myCar.cruiseControl.setOnOff(true);
        myCar.cruiseControl.setTargetSpeed(200);
        System.out.println(myCar.cruiseControl.getTargetSpeed());
    }
}
