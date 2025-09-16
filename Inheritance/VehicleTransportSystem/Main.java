package Inheritance.VehicleTransportSystem;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<VehicleParent> vehicles= new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("Choose you vehicle:\n");
            System.out.println("1. Car\n");
            System.out.println("2. Motor Cycle\n");
            System.out.println("3. Truck\n");
            System.out.println("4. Show all vehicles");
            System.out.println("5. Exit");
            int choice= sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("speed:");
                int speed= sc.nextInt();
                System.out.println("fuel type:");
                String fuel= sc.next();
                System.out.println("seats:");
                int seats= sc.nextInt();
                vehicles.add(new Car(speed, fuel, seats));
                break;

                case 2:
                System.out.print("Enter max speed: ");
                int bikeSpeed = sc.nextInt();
                System.out.print("Enter fuel type: ");
                String bikeFuel = sc.next();
                System.out.print("color: ");
                String color = sc.next();
                vehicles.add(new MotorCycle(bikeSpeed, bikeFuel, color));
                break;

                case 3:
                System.out.print("Enter max speed: ");
                int truckSpeed = sc.nextInt();
                System.out.print("Enter fuel type: ");
                String truckFuel = sc.next();
                System.out.print("Enter weight capacity: ");
                int weight = sc.nextInt();
                vehicles.add(new Truck(truckSpeed, truckFuel, weight));
                break;

                case 4:
                 System.out.println("\n--- Vehicle Details ---");
                for (VehicleParent v : vehicles) {
                    v.displayInfo();
                    System.out.println("-----------------");
                }
                break;

                case 5:
                System.out.println("----------EXITING----------");
                sc.close();
                return;

                default:
                System.out.println("invalid choice.");
            }
        }
    }
}
