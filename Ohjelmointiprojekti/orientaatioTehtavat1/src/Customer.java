public class Customer {

    private int id = 0;
    private static int idCounter = 1;
    private long startTime;
    private long endTime;

    Customer() {
        this.id += idCounter;
        idCounter++;
        this.startTime = System.nanoTime();
    }

    public int getId() {return id;}
    public long getStartTime() {return startTime;}
    public long getEndTime() {return endTime;}
    public long getTimeSpend() {return endTime - startTime;}

    public void setId(int id) {this.id = id;}
    public void setStartTime(long startTime) {this.startTime = startTime;}
    public void setEndTime(long endTime) {this.endTime = endTime;}

    /*
    public static void main(String[] args) {
        Customer pekka = new Customer();
        Customer pavel = new Customer();
        System.out.println(pekka.getId());
        System.out.println(pavel.getId());
    }
     */
}