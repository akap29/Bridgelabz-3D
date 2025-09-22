package HospitalPlus;

public class Main {
    public static void main(String[] args) {
        // Create Patients
        Patients p1 = new Patients("P101", "Alice", 25);
        Patients p2 = new Patients("P102", "Bob", 40);

        // Create Doctors
        Doctor d1 = new Doctor("Dr. Priya", "D201", "Cardiologist");
        Doctor d2 = new Doctor("Dr. Rahul", "D202", "Neurologist");

        // Create Appointments
        Appointments a1 = new Appointments(p1, d1, "2025-09-22", 500.0);
        Appointments a2 = new Appointments(p2, d2, "2025-09-23", 700.0);

        // Show Appointment Details
        a1.showDetails();
        a2.showDetails();

        // Implement ReportGenerator using anonymous class
        ReportGenerator report = new ReportGenerator() {
            @Override
            public void generateReport() {
                System.out.println("\n--- Hospital Report ---");
                System.out.println("Total Patients: 2");
                System.out.println("Total Doctors: 2");
                System.out.println("Total Appointments: 2");
            }
        };

        report.generateReport();
    }
}
