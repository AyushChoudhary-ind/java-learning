public class E13 {
    static void main(String[] args) {
        double price = 499.99;
        int quantity = 3;
        double discount = 100.0;

        double Subtotal = price * quantity;
        double finalPrice = Subtotal - discount;

        System.out.println(finalPrice);
    }
}
