import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double gram, luoti/*, naula, leiviskä*/;
        int naula, leiviskä;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter gram: ");
        gram = Double.parseDouble(input.nextLine());



        luoti = gram/13.28;
        //luoti = gram;
        naula = (int)luoti/32;
        leiviskä = naula/20;

        luoti %= 32;
        naula %= 20;

        //naula = Math.floor(naula);
        //leiviskä = Math.floor(leiviskä);

        System.out.print("Luoteja: ");
        System.out.printf("%.2f%n", luoti);

        System.out.print("Nauloja: ");
        System.out.println(naula);

        System.out.print("Leiviskää: ");
        System.out.println(leiviskä);
    }
}
