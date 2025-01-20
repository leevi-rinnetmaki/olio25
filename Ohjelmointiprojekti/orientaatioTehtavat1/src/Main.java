import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Customer> customers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        /*
        Customer matti = new Customer();
        Customer jarkko = new Customer();
        System.out.println(matti.getId());
        System.out.println(jarkko.getId());
        System.out.println(matti.getStartTime());
        System.out.println(jarkko.getStartTime());
         */

        while (true){
            System.out.println("Do you want to add or remove customers? (add/remove)");
            String decision = scanner.nextLine();

            if (decision.equals("add")){
                Customer customer = new Customer();
                customers.addFirst(customer);
                System.out.println("Customer added. Id: " + customers.getFirst().getId());
            }
            else if (decision.equals("remove") && !customers.isEmpty()){
                customers.getLast().setEndTime(System.nanoTime());
                System.out.println("Customer removed. Id: " + customers.getLast().getId());
                System.out.println(customers.getLast().getTimeSpend() + " ms");
                customers.removeLast();
            }
        }
    }
}