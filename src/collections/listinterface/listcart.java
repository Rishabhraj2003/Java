package collections.listinterface;
import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}

class ShoppingCart {
    private List<Product> cart = new ArrayList<>();

    // Add product
    public void addProduct(Product p) {
        cart.add(p);
        System.out.println(p.name + " added to cart.");
    }

    // Remove product
    public void removeProduct(String name) {
        cart.removeIf(p -> p.name.equalsIgnoreCase(name));
        System.out.println(name + " removed from cart.");
    }

    // Update product (replace)
    public void updateProduct(int index, Product newProduct) {
        if(index >= 0 && index < cart.size()) {
            cart.set(index, newProduct);
            System.out.println("Product updated at index " + index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    // View cart
    public void viewCart() {
        if(cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\n🛒 Cart Items:");
        for(int i = 0; i < cart.size(); i++) {
            System.out.println(i + ": " + cart.get(i));
        }
    }

    // Total price
    public void getTotal() {
        double total = 0;
        for(Product p : cart) {
            total += p.price;
        }
        System.out.println("Total Price: ₹" + total);
    }

    // Search item
    public void searchProduct(String name) {
        boolean found = false;
        for(Product p : cart) {
            if(p.name.equalsIgnoreCase(name)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Item found!" : "Item not found!");
    }

    // Clear cart
    public void clearCart() {
        cart.clear();
        System.out.println("Cart cleared.");
    }
}

public class listcart {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Adding products
        cart.addProduct(new Product("Laptop", 50000));
        cart.addProduct(new Product("Mouse", 500));
        cart.addProduct(new Product("Keyboard", 1500));

        // View cart
        cart.viewCart();

        // Update product
        cart.updateProduct(1, new Product("Wireless Mouse", 800));

        // Search
        cart.searchProduct("Laptop");

        // Remove product
        cart.removeProduct("Keyboard");

        // View cart again
        cart.viewCart();

        // Total price
        cart.getTotal();

        // Clear cart
        cart.clearCart();

        // Final check
        cart.viewCart();
    }
}