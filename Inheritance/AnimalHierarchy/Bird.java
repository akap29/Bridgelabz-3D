package Inheritance.AnimalHierarchy;

public class Bird extends Animal{
    Bird(String name, int age){
        super(name, age);
    }

    public void makeSound(){
        System.out.println(name + "chirps: Chi Chi!!");
    }
}
