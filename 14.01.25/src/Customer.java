import java.util.LinkedList;

public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private static int idCount = 1;

    public Customer() {
        setId(idCount);
        idCount++;
    }

    public int getid(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    public void setStartTime(long startTime){
        this.startTime = startTime;
    }

    public long calculateTime(){
        return endTime - startTime;
    }

    public static void main(String[] args){
        Customer Paavo = new Customer();
        Customer Bob = new Customer();
        Paavo.setStartTime(System.currentTimeMillis());
        System.out.println(Paavo.getid());
        System.out.println(Bob.getid());

        LinkedList<Customer> queue = new LinkedList<>();
        queue.addFirst(Paavo);
        queue.addFirst(Bob);

        while (!queue.isEmpty()) {
            Customer c = queue.removeFirst();
            System.out.println("w" + c.getid());
        }
    }
}
