package compare;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Matti", 23);
        Student s2 = new Student("Paavo", 24);
        Student s3 = new Student("Jessi", 20);

        PriorityQueue<Student> queue = new PriorityQueue<>();
        queue.add(s1);
        queue.add(s2);
        queue.add(s3);

        while (queue.size() > 0) {
            queue.poll();
            System.out.println(queue.poll());
        }
    }
}
