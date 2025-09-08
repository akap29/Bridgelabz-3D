package ClassObjects.LEVEL1;
public class Q1 {
    // non-static variables
    String name;
    int id;
    double salary;

    // Constructor
    Q1(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Q1 emp = new Q1("Rohan", 1, 500000);
        emp.displayEmployee();
    }
}
