import java.util.Scanner;

public class E15 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = input.nextDouble();

        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("The Area of the Rectangle: " + area);
        System.out.println("The Perimeter of the Rectangle: " + perimeter);
    }
}
