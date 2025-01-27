package orientaatioTehtavat3;

public class Clock {
    private static Clock instance;
    private int time;

    private Clock() {
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    int getTime() {
        return time;
    }

    void setTime(int time) {
        this.time = time;
    }

    public static void main(String[] args) {
        Clock.getInstance().time=7;
        System.out.println(Clock.getInstance().time);
    }
}
