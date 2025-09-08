package Constructors.InstanceVsClass;
public class Q2 {
    String courseName;   
    int duration;        
    double fee;          
    static String instituteName = "Tech Institute"; 

    Q2(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("-------------------");
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Q2 c1 = new Q2("Java Full Stack", 6, 30000);
        Q2 c2 = new Q2("Python ML", 4, 25000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Q2.updateInstituteName("Global IT Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
