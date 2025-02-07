package assignment5_1;
class Even extends Thread {
    public void run() {
        for(int i = 0; i<=60; i+=2){
            System.out.println("Even: " + i);
        }
    }
}

class Odd extends Thread{
    public void run() {
        for(int i = 1; i<=60; i+=2){
            System.out.println("odd: " + i);
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Even even = new Even();
        Odd odd = new Odd();
        even.start();
        odd.start();
    }
}