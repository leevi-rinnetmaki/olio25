import java.util.LinkedList;

public class ServicePoint {
    LinkedList<Customer> queue;

    public ServicePoint() {
        this.queue = new LinkedList<>();
        System.out.println("ServicePoint created");
    }

    void addToQueue(Customer a){
        queue.add(a);
        System.out.println("customer added to queue");
    }

    Customer removeFromQueue(){
        return queue.removeLast();
    }

    void serve(){
        int customerAmount = queue.size();
        long totalServiceTime = 0;
        long serveStartedTime = System.nanoTime();

        while(!queue.isEmpty()){
            Customer customer = removeFromQueue();
            customer.setEndTime(System.nanoTime());
            long waitTime = System.nanoTime() - serveStartedTime;
            if (customer != null) {

                long serviceTime = (long) (Math.random() * 3000) + 1000;
                totalServiceTime += serviceTime;

                try {
                    Thread.sleep(serviceTime);
                } catch (InterruptedException e) {
                    System.out.println("Service interrupted for customer: " + customer.getId());
                }

                System.out.println("Customer served: " + customer.getId());
                System.out.println("Response time (waiting + service): " + ((waitTime + serviceTime)/1000) + " ms");
                System.out.println("Service time: " + serviceTime + " ms\n");
            }
        }
        System.out.println("Average service time: " + totalServiceTime/customerAmount + "ms");
    }

    public static void main(String[] args) {
        ServicePoint sp = new ServicePoint();
        sp.addToQueue(new Customer());
        sp.addToQueue(new Customer());
        sp.addToQueue(new Customer());
        sp.serve();
    }
}