import javax.swing.JOptionPane;

/**
 * InventoryApp
 * Creates products, prints their details and inventory values to the console,
 * and shows a summary in a JOptionPane dialog box.
 */
public class InventoryApp {

    public static void main(String[] args) {

        // Create three Product objects for a small electronics store
        Product product1 = new Product("Wireless Keyboard", 49.99, 24);
        Product product2 = new Product("USB-C Hub", 34.50, 40);
        Product product3 = new Product("27-inch Monitor", 229.00, 9);

        // Store the objects in an array so they can be processed with a loop
        Product[] products = {product1, product2, product3};

        // Running total of all inventory value
        double totalValue = 0;

        // Text that will be shown in the dialog box
        StringBuilder summary = new StringBuilder("Inventory Summary\n\n");

        System.out.println("=== Store Inventory ===");

        // Loop through each product: print to console, add to dialog text and total
        for (Product product : products) {
            System.out.println(product.getDetails());

            summary.append(String.format("%s: $%.2f%n",
                    product.getName(), product.calculateInventoryValue()));

            totalValue += product.calculateInventoryValue();
        }

        System.out.println();
        System.out.printf("Total Inventory Value: $%.2f%n", totalValue);

        // Add the grand total to the dialog text
        summary.append(String.format("%nTotal Inventory Value: $%.2f", totalValue));

        // Display the graphical summary dialog
        JOptionPane.showMessageDialog(
                null,
                summary.toString(),
                "Inventory Summary",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
