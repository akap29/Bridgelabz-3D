package Inheritance.VehicleTransportSystem;

public class MotorCycle extends VehicleParent{
    String color;

    MotorCycle(int maxSpeed, String fuelType, String color){
        super("Motor Cycle", maxSpeed, fuelType);
        this.color= color;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("\nColor of you motor cycle is: " + color);
    }
}
