package assignment2_1;

public class Task3 {
    public static class CoffeeMaker {
        public enum CoffeeType {
            normal, expresso
        }

        //attributes
        private boolean onOff = false;
        private CoffeeType coffeeType = CoffeeType.normal;
        private int coffeeAmount = 10;

        //getters
        private boolean getOnOff(){return onOff;}
        private CoffeeType getCoffeeType(){return coffeeType;}
        private int getCoffeeAmount(){return coffeeAmount;}

        //setters
        private void setOnOff(boolean onOff){this.onOff = onOff;}
        private void setCoffeeType(CoffeeType type){
            if(getOnOff())coffeeType = type;}
        private void setCoffeeAmount(int amount){
            if(getOnOff() && 10 <= amount && amount <= 80)coffeeAmount = amount;}
    }

    public static class CoffeeMakerDriver{
        private CoffeeMaker coffeeMaker;
        public CoffeeMakerDriver(CoffeeMaker coffeeMaker){this.coffeeMaker = coffeeMaker;}

        public void printStatus(){
            System.out.println("Coffee maker activated: " + coffeeMaker.getOnOff());
            System.out.println("Coffee maker type: " + coffeeMaker.getCoffeeType());
            System.out.println("Coffee maker amount: " + coffeeMaker.getCoffeeAmount());
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        CoffeeMakerDriver ford = new CoffeeMakerDriver(new CoffeeMaker());

        ford.printStatus();
        ford.coffeeMaker.setOnOff(true);
        ford.coffeeMaker.setCoffeeType(CoffeeMaker.CoffeeType.expresso);
        ford.coffeeMaker.setCoffeeAmount(60);
        ford.coffeeMaker.setOnOff(false);
        ford.coffeeMaker.setCoffeeAmount(50);
        ford.printStatus();
    }
}
