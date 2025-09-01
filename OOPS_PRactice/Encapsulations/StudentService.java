package OOPS_PRactice.Encapsulations;

class StudentService {
	private Students studentOne;
	private Students studentTwo;
	private Students studentThree;
	private Students student4;
	private Students student5;
	private Students student6;
	private Students student7;
	
	
	public void setStudentDetails(){
		studentOne=new Students();
		studentOne.setstudentRollNum(1);
		studentOne.setstudentName("Aayush");
		studentOne.setstudentAge(20);
		studentOne.setstudentDepartment("CSE");
		
		studentTwo=new Students();
		studentTwo.setstudentRollNum(2);
		studentTwo.setstudentName("Akarsha");
		studentTwo.setstudentAge(20);
		studentTwo.setstudentDepartment("CSE");
		
		studentThree=new Students();
		studentThree.setstudentRollNum(3);
		studentThree.setstudentName("Barkha");
		studentThree.setstudentAge(20);
		studentThree.setstudentDepartment("CSE");
		
		student4=new Students();
		student4.setstudentRollNum(4);
		student4.setstudentName("Palak");
		student4.setstudentAge(20);
		student4.setstudentDepartment("CSE");
		
		student5=new Students();
		student5.setstudentRollNum(5);
		student5.setstudentName("ritee");
		student5.setstudentAge(20);
		student5.setstudentDepartment("CSE");
		
		student6=new Students();
		student6.setstudentRollNum(6);
		student6.setstudentName("Sanskriti");
		student6.setstudentAge(20);
		student6.setstudentDepartment("CSE");
		
		student7=new Students();
		student7.setstudentRollNum(7);
		student7.setstudentName("Yash");
		student7.setstudentAge(20);
		student7.setstudentDepartment("CSE");
	}

	public void displayStudentDetails() {
		System.out.println(studentOne);
		System.out.println(studentTwo);
		System.out.println(studentThree);
		System.out.println(student4);
		System.out.println(student5);
		System.out.println(student6);
		System.out.println(student7);
	}
}