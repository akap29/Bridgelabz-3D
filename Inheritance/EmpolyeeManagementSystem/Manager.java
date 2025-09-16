package Inheritance.EmpolyeeManagementSystem;

public class Manager extends Employee{
    int size;

    Manager(String name, String id, double salary, int size){
        super(name, id, salary);
        this.size= size;
    }

    // public void teamSize(){
    //     System.out.println("size of team: "+ size);
    // }
    @Override
    public void displayDetails(){
        System.out.println("\nName: " + name + "\nId: " + id + "\nSalary: " + salary + "\nsize of team: "+ size);
    }
}
