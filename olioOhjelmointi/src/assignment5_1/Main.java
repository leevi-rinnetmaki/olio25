package assignment5_1;

public class Main extends Thread{
    public int num;
    public Main(int num){
        this.num=num;
    }

    public void run(){
        while(num<=60){
            System.out.println(num);
            num+=2;
        }
    }

    public static void main(String[] args){
        Main even = new Main(0);
        Main odd = new Main(1);
        even.start();
        odd.start();
    }
}