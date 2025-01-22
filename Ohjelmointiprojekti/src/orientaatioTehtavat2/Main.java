package orientaatioTehtavat2;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Event> eventList = new PriorityQueue<Event>();
        eventList.add(new Event(4, 60, Event.EventType.arrival));
        eventList.add(new Event(3, 6, Event.EventType.arrival));
        eventList.add(new Event(2, 2, Event.EventType.exit));
        eventList.add(new Event(8, 8, Event.EventType.arrival));
        eventList.add(new Event(1, 12, Event.EventType.exit));

        PriorityQueue<Event> eventListCopy = new PriorityQueue<>(eventList);
        while (!eventListCopy.isEmpty()) {
            Event event = eventListCopy.poll();
            System.out.println("End time: " + event.getEndTime() + " Type: " + event.getEventType());
        }
    }
}
