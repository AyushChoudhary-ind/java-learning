import java.util.Scanner;

public class E18 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Enter your course: ");
        String course = input.nextLine();

        System.out.print("Enter your percentage: ");
        double percentage = input.nextDouble();

        System.out.print("Enter your grade: ");
        char grade = input.next().charAt(0);

        System.out.println("========================\n" +
                "    STUDENT PROFILE\n" +
                "========================" +
                "\nName: " + name +
                "\nAge: " + age +
                "\nCourse: " + course +
                "\nPercentage: " + percentage +
                "\nGrade: " + grade +
                "\n========================");
    }
}