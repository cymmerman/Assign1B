/**
 * Product
 * Represents one item in a retail store's inventory.
 */
public class Product {

    // Private attributes (encapsulation): only accessible through this class's methods
    private String name;
    private double price;
    private int quantity;

    // Constructor: sets the starting values when a Product object is created
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculates the total value of this product's stock (price x quantity)
    public double calculateInventoryValue() {
        return price * quantity;
    }

    // Getter methods give read-only access to the private attributes
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Returns a formatted one-line description of the product for display
    public String getDetails() {
        return String.format("%s - Price: $%.2f, Quantity: %d, Inventory Value: $%.2f",
                name, price, quantity, calculateInventoryValue());
    }
}
