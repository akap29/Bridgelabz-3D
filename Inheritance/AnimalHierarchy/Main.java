package Inheritance.AnimalHierarchy;

public class Main {
    public static void main(String[] args){
        Animal a1= new Dog("Tommy", 3);
        Animal a2= new Bird("Perro", 5);
        Animal a3= new Cat("Coco", 4);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
