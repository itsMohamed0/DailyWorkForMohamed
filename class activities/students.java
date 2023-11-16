package testingstuff;

public class students extends Person {

	int ID;
	String Major;
	int Grade;
	
	public students(String Name, int Age, String Nationality, String dateofbirth, int iD, String major, int grade) {
		super(Name, Age, Nationality, dateofbirth);
		ID = iD;
		Major = major;
		Grade = grade;
	}
	public void study() {
		System.out.println(Name + " is studying.");
	}
	public void code() {
		System.out.println(Name + " is writing a code.");
	}
	public void project() {
		System.out.println(Name + " is doing a project.");
	}

}
