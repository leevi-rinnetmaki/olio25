package assignment5_1;

public class Task2 extends Thread {
    static long[] numbers = new long[100001];
    final static int processors = Runtime.getRuntime().availableProcessors();
    final static int threads0 = numbers.length%(processors-1);
    final static int threads1 = numbers.length/(processors-1);
    static int threadCounter = 0;
    int threadNumber;
    static long sum = 0;


    public Task2(){
        this.threadNumber = threadCounter;
        threadCounter++;

        /*
        if(threadNumber == 0){
            //System.out.println("EKA " + threadNumber);
            for(int i=numbers.length-threads0; i<numbers.length; i++){
                sum += numbers[i];
            }

        }else{
            //System.out.println("TOKA " + threadNumber);
            for(int i=(threads1*threadNumber-threads1); i<threads1*threadNumber; i++){
                sum += numbers[i];
            }
        }
        System.out.println("Thread: " + threadNumber + " sum: " + sum);

         */
    }

    public void run(){
        if(threadNumber == 0){
            //System.out.println("EKA " + threadNumber);
            for(int i=numbers.length-threads0; i<numbers.length; i++){
                sum += numbers[i];
            }

        }else{
            //System.out.println("TOKA " + threadNumber);
            for(int i=(threads1*threadNumber-threads1); i<threads1*threadNumber; i++){
                sum += numbers[i];
            }
        }
        System.out.println("Thread: " + threadNumber + " sum: " + sum);
    }

    public static void main(String[] args) {

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }

        for(int i=0; i<processors; i++){
            Task2 task = new Task2();
            task.start();
        }


        /*
        for(int n=0; n<numbers.length; n++){
            numbers[n] = n;
        }
        System.out.println(processors);
*/
        for(long n: numbers){
            //System.out.println(n);
        }


        //System.out.println(sum);
        



    }
}
