//J77-5082-2023 Timothy mutua
import java.util.Scanner;
// Product Class (Encapsulation + Methods)
class Product {

    // Private attributes as required
    private String name;
    private double price;

    // Constructor to set both attributes
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Method to apply discount on price

    public void applyDiscount(double percentage) {
        double discountAmount = price * (percentage / 100);
        price = price - discountAmount;   // Update price after discount
    }

    // Method to return the updated price
    public double getPrice() {
        return price;
    }
}



// Main Method (User Input + Interaction)

public class MainProductApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // i. Create a Product object
        // (You can change the name and price as needed)
        Product item = new Product("Smartphone", 25000);

        // ii. Ask the user to enter a discount percentage
        System.out.print("Enter discount percentage: ");
        double discount = input.nextDouble();

        // iii. Apply the discount using the Product method
        item.applyDiscount(discount);

        // iv. Display the new price after discount
        System.out.println("New price after discount: KES " + item.getPrice());
    }
}