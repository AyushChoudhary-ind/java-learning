import java.util.Scanner;

public class E14 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Enter your city: ");
        String city = input.nextLine();

        System.out.print("Enter your height: ");
        double height = input.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Height: " + height);
    }
}
