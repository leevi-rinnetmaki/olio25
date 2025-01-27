package orientaatioTehtavat3;

public class Test {
    public static void main(String[] args) {
        Clock.getInstance().setTime(7);
        System.out.println(Clock.getInstance().getTime());
    }
}
