package Inheritance.VehicleTransportSystem;

public class VehicleParent {
    String name;
    int maxSpeed;
    String fuelType;

    VehicleParent(String name, int maxSpeed, String fuelType){
        this.name= name;
        this.maxSpeed= maxSpeed;
        this.fuelType= fuelType;
    }

    public void displayInfo(){
        System.out.println("Maximum speed of your" + name + "is " + maxSpeed + " and its fuel type is: " + fuelType);
    }
}
