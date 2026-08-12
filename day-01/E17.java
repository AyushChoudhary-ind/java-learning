import java.util.Scanner;

public class E17 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        double a = input.nextDouble();

        System.out.print("Enter Number 2: ");
        double b = input.nextDouble();

        System.out.print("Enter Number 3: ");
        double c = input.nextDouble();

        double average = (a + b + c) / 3.0;

        System.out.println("Average: " + average);
    }
}
