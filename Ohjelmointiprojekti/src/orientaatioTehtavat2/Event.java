package orientaatioTehtavat2;

public class Event implements Comparable<Event> {

    int startTime;
    int endTime;
    int duration;
    EventType eventType;

    public int getStartTime(){return startTime;}
    public int getDuration(){return duration;}
    public int getEndTime(){return endTime;}
    public EventType getEventType(){return eventType;}

    public void setStartTime(int startTime){this.startTime = startTime;}
    public void setDuration(int duration){this.duration = duration;}
    public void setEndTime(int endTime){this.endTime = endTime;}
    public void setEventType(EventType eventType){this.eventType = eventType;}

    public Event(int startTime, int duration, EventType type) {
        this.setStartTime(startTime);
        this.setDuration(duration);
        this.setEndTime(startTime + duration);
        this.eventType = type;
    }

    public int compareTo(Event e) {
        return Integer.compare(this.getEndTime(), e.getEndTime());
    }

    enum EventType{
        arrival,
        exit
    }
}
