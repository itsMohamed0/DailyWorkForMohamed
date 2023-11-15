package testingstuff;

public class starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] subs = {"Math" ,"Eco", "Science"};
		student s;
		s = new student();
		s.setId(5);
		s.setAvg((float)74.2);
		s.setGrade(90);
		s.setName("Othamn");
		s.setSubjects(subs);
for (int i=0;i<3;i++)
{ System.out.println("The " + i + " Subject is " +s.getSubjects()[i]);}
		System.out.println("The Id i s "+ s.getId());
		System.out.println("The Name is "+ s.getName());
		System.out.println("The Grade is "+ s.getGrade());
		System.out.println("The Average is "+ s.getAvg());
	}

}
