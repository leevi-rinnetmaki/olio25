package assignment2_1;
public class Task1 {

    //As practice, I made my own versions of the Television and TelevisionViewer classes.

    public static class Television {
        String model;
        boolean turnedOn = false;
        int channel;
        public String getModel() {return this.model;}
        public boolean isTurnedOn() {return this.turnedOn;}
        public int getChannel() {return this.channel;}
        public void turnOn(){this.turnedOn = true;}
        public void turnOff(){this.turnedOn = false;}
        public void changeChannel(int channel){
            if(this.turnedOn) {
                this.channel = channel;
            }
        }
        public Television(String model) {
            this.model = model;
        }
    }



    public static class TelevisionViewer{
        Television television;
        boolean sleeping = false;
        int day = 1;
        boolean bored  = false;
        public TelevisionViewer(Television television) {
            this.television = television;
        }
        public void sleep(){
            this.television.turnOff();
            this.sleeping = true;
            this.day++;
            this.sleeping = false;
        }
        public void watchTv(){
            this.television.turnOn();
            if(Math.random()>0.5){this.bored = true;}
        }
        public void changeChannel(int channel){
            this.television.changeChannel(channel);
        }
        public boolean checkIfBored(){
            return this.bored;
        }
        public void wasteLife(int days){
            this.sleeping = false;
            this.television.turnOn();
            int startDay = this.day;
            while(startDay+days>this.day){
                this.watchTv();

                if(Math.random()>0.8){
                    this.sleep();
                    System.out.println("Fell asleep.\nWoke up on day " + this.day);
                }

                if(this.checkIfBored()){
                    this.changeChannel((int)(Math.random()*12));
                    this.bored = false;
                    System.out.println("Started watching channel: " + this.television.getChannel());
                }
            }
        }
    }



    public static void main(String[] args) {
        Television television = new Television("Ford");
        TelevisionViewer Bob = new TelevisionViewer(television);
        Bob.wasteLife(7);
    }
}
