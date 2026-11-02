# Inventory Application

A Java application for a small retail store. It stores product information, calculates the inventory value of each product and of the whole store, and shows the results in the console and in a dialog box.

## Files

- `Product.java` - class with private `name`, `price`, and `quantity`, a constructor, `calculateInventoryValue()`, getters, and `getDetails()`.
- `InventoryApp.java` - contains `main()`. Creates three `Product` objects, prints each one to the console, and shows a `JOptionPane` summary.

## Requirements

- JDK 17 or newer (check with `javac -version`)
- A desktop environment (the dialog box needs a display)

## How to Run

From the project folder:

```
javac Product.java InventoryApp.java
java InventoryApp
```

Or open the folder in VS Code and click **Run** above `main` in `InventoryApp.java`.

## Expected Output

Console:

```
=== Store Inventory ===
Wireless Keyboard - Price: $49.99, Quantity: 24, Inventory Value: $1199.76
USB-C Hub - Price: $34.50, Quantity: 40, Inventory Value: $1380.00
27-inch Monitor - Price: $229.00, Quantity: 9, Inventory Value: $2061.00

Total Inventory Value: $4640.76
```

A dialog box titled "Inventory Summary" then lists each product's name and inventory value plus the total.

## Changing the Data

Edit the `Product` objects at the top of `main` in `InventoryApp.java` (name, price, quantity) and run it again.
