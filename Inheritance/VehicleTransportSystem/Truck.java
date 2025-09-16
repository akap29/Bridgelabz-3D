package Inheritance.VehicleTransportSystem;

public class Truck extends VehicleParent{
    int weight;

    Truck(int maxSpeed, String fuelType, int weight){
        super("Truck", maxSpeed, fuelType);
        this.weight= weight;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("\nAmount of weight your truck can handle is: " + weight);
    }
}
