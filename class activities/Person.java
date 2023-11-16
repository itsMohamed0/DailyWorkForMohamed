package testingstuff;

public class Person {
 String Name;
 int Age;
 String Nationality;
 String dateofbirth;
 
 public Person(String Name, int Age, String Nationality, String dateofbirth) {
	 this.Name= Name;
	 this.Age= Age;
	 this.Nationality= Nationality;
	 this.dateofbirth= dateofbirth;
}
public void eat() {
	System.out.println(Name + " is eating.");
}
public void sleep() {
	System.out.println(Name + " is sleeping.");
}
public void walk() {
	System.out.println(Name + " is walking.");
}
}
