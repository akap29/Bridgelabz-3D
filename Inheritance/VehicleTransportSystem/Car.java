package Inheritance.VehicleTransportSystem;

public class Car extends VehicleParent{

    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity){
        super("Car", maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("\nNo. of seats in the car are: " + seatCapacity);
    }
}
