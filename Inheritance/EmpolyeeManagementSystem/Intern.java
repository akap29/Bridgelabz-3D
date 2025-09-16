package Inheritance.EmpolyeeManagementSystem;

public class Intern extends Employee{
    Intern(String name, String id, double salary){
        super(name,id, salary);
    }
    @Override
    public void displayDetails(){
        System.out.println("\nName: " + name + "\nId: " + id + "\nSalary: " + salary);
    }
}
