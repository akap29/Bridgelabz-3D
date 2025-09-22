package HospitalPlus;

public class Doctor {
    private String name;
    private String DoctorId;
    private String Specialization;

    Doctor(String name, String DoctorId, String Specialization){
        this.name= name;
        this.DoctorId= DoctorId;
        this.Specialization= Specialization;
    }

    public String getname(){
        return name;
    }

    public String getDoctorId(){
        return DoctorId;
    }

    public String getSpecialization(){
        return Specialization;
    }
}
