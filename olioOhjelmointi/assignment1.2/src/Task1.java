import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        double fahrenheit;
        double celsius;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a fahrenheit value:");
        fahrenheit = Double.parseDouble(scanner.nextLine());
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.1f%n", celsius);
    }
}