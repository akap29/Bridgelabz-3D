package Constructors.InstanceVsClass;
public class Q3 {
    String ownerName;     // Instance variable
    String vehicleType;   // Instance variable
    static double registrationFee = 5000; // Class variable (shared)

    // Constructor
    Q3(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("-------------------");
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Q3 v1 = new Q3("Arjun", "Car");
        Q3 v2 = new Q3("Neha", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Q3.updateRegistrationFee(7000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
