package Constructors.InstanceVsClass;
public class Q1 {
    String productName;      
    double price;            
    static int totalProducts; 

    // Constructor
    Q1(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Q1 p1 = new Q1("Laptop", 55000);
        Q1 p2 = new Q1("Mobile", 20000);
        Q1 p3 = new Q1("Headphones", 3000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Q1.displayTotalProducts();
    }
}
