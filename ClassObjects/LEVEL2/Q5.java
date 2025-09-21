package ClassObjects.LEVEL2;
public class Q5 {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public Q5(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Add item
    public void addItem(int quantityToAdd) {
        this.quantity += quantityToAdd;
        System.out.println("Added " + quantityToAdd + " of " + this.itemName + " to the cart.");
    }

    // Remove item
    public void removeItem(int quantityToRemove) {
        if (quantityToRemove > this.quantity) {
            System.out.println("Cannot remove " + quantityToRemove + " of " + this.itemName + " as there are only " + this.quantity + " left.");
        } else {
            this.quantity -= quantityToRemove;
            System.out.println("Removed " + quantityToRemove + " of " + this.itemName + " from the cart.");
        }
    }

    // Total cost
    public double totalCost() {
        return this.price * this.quantity;
    }

    // Display item
    public void displayItem() {
        System.out.println("Item: " + this.itemName + ", Price: $" + this.price + ", Quantity: " + this.quantity);
    }

    public static void main(String[] args) {
        Q5 item1 = new Q5("Laptop", 999.99, 1);
        item1.displayItem();

        item1.addItem(2);
        item1.removeItem(1);

        System.out.println("Total cost: $" + item1.totalCost());
    }
}
