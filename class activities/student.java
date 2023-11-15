package testingstuff;

public class student {

		// TODO Auto-generated method stub
// some state and behavior
		int Id;
		float avg;
		int Grade;
		String Name;
		String [] Subjects;
		
		

		public student(int id, float avg, int grade, String name, String[] subjects) { //source, constructor using fields
			super();																//Parameterized constructor
			Id = id;
			this.avg = avg;
			Grade = grade;
			Name = name;
			Subjects = subjects;
		}
		
		public student() {} //why do we add a "default constructor"?????

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}
		
		public float getAvg() {
			return avg;
		}

		public void setAvg(float avg) {
			this.avg = avg;
		}

		public int getGrade() {
			return Grade;
		}

		public void setGrade(int grade) {
			Grade = grade;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String[] getSubjects() {
			return Subjects;
		}

		public void setSubjects(String[] subjects) {
			Subjects = subjects;
		}
		}


