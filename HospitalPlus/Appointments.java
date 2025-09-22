package HospitalPlus;

public class Appointments {
    private Patients patient;
    private Doctor doctor;
    private String date;
    private double fee;

    Appointments(Patients patient, Doctor doctor, String date, double fee){
        this.patient= patient;
        this.doctor= doctor;
        this.date= date;
        this.fee= fee;
    }

    public Patients getpatient(){
        return patient;
    }

    public Doctor getdoctor(){
        return doctor;
    }

    public String getdate(){
        return date;
    }

    public double getfee(){
        return fee;
    }

   public void showDetails(){
    System.out.println("Appointment on " + date + ": " 
        + patient.getName() + " with Dr. " 
        + doctor.getDoctorId() + " (" + doctor.getSpecialization() + ")" );
    }
}
    
