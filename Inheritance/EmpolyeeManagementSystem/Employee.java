package Inheritance.EmpolyeeManagementSystem;

public class Employee {

    String name;
    String id;
    double salary;

    Employee(String name, String id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void displayDetails(){
        System.out.println("\nName: " + name + "\nid: " + id + "\nsalary: " + salary);
    }
}
