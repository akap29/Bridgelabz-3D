package HospitalPlus;

public class Patients {
    private String PatientId;
    private String name;
    private int age;

    Patients(String PatientId, String name, int age){
        this.PatientId= PatientId;
        this.name= name;
        this.age= age;
    }

    public String getPatientId(){
        return PatientId;
    }

    public String getName(){
        return name;
    }

    public int getage(){
        return age;
    }

}
