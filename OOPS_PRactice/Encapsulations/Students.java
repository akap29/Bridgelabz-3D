package OOPS_PRactice.Encapsulations;

public class Students {
    private int studentRollNum;
    private String studentName;
    private int studentAge;
    private String studentDepartment;

    public int getstudentRollNum()
    {
        return studentRollNum;
    }
    public void setstudentRollNum(int studentRollNum)
    {
        this.studentRollNum= studentRollNum;
    }

    public String getstudentName()
    {
        return studentName;
    }
    public void setstudentName(String studentName)
    {
        this.studentName= studentName;
    }

    public int getstudentAge()
    {
        return studentAge;
    }
    public void setstudentAge(int studentAge)
    {
        this.studentAge= studentAge;
    }

     public String getstudentDepartment()
    {
        return studentDepartment;
    }
    public void setstudentDepartment(String studentDepartment)
    {
        this.studentDepartment= studentDepartment;
    }
    
    @Override
    public String toString() {
    	return "\n*Student RollNum:"+getstudentRollNum()+"\nStudent Name-"+getstudentName()+"\nStudent Age:"+getstudentAge()+"\nStudent Department-"+getstudentDepartment();
    	}
}