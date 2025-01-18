import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me COEFFICIENTS!");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double discriminant = Math.pow(b, 2)-4*a*c;

        if (discriminant < 0) {
            System.out.println("No");
        }

        else if(discriminant == 0) {
            System.out.println((-1*b)/2*a);
        }

        else {
            System.out.println(((-1*b)+Math.pow(discriminant, 0.5))/(2*a));
            System.out.println((((-1*b)-Math.pow(discriminant, 0.5))/(2*a)));
        }

    }
}
