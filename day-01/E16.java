import java.util.Scanner;

public class E16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Product: ");
        String product = input.nextLine();

        System.out.print("Enter Price: ");
        double price = input.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        double total = price * quantity;

        System.out.println("===== BILL =====");
        System.out.println("Product: " + product);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);
    }
}
