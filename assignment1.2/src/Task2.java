import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double cathetus1;
        double cathetus2;
        double hypotenuse;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first cathetus: ");
        cathetus1 = scanner.nextDouble();
        System.out.println("Enter the second cathetus: ");
        cathetus2 = scanner.nextDouble();

        hypotenuse = Math.pow((Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2)),0.5);
        System.out.println("The hypotenuse is " + hypotenuse);

    }
}
