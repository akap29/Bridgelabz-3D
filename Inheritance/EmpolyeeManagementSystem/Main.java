package Inheritance.EmpolyeeManagementSystem;

public class Main {
    public static void main(String[] args){
        Employee e1= new Manager("Suryansh", "susi@123", 2500000, 30);
        Employee e2= new Developer("Sanskriti", "sans@123", 20500, "Java");
        Employee e3= new Intern("Rashmi", "rash@123", 15000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
