package Inheritance.EmpolyeeManagementSystem;

public class Developer extends Employee{

    String lang;

    Developer(String name, String id, double salary, String lang){
        super(name,id, salary);
        this.lang= lang;
    }
    @Override
    public void displayDetails(){
        System.out.println("\nName: " + name + "\nId: " + id + "\nSalary: " + salary + "\nMaster of: "+ lang + " in coding.");
    }

    // public void programmingLanguage(){
    //     System.out.println("Master of: "+ lang + " in coding.");
    // }
}
