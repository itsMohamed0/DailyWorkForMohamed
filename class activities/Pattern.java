package testingstuff;

public class Pattern {
	String Name;
	
	public void lowerTri (int lines) {
		for (int i=0; i<lines;i++) {
			for(int j=0;j<=i; j++) {
				System.out.print(j+1);}
			System.out.println();
			}
		}
	public void revTri (int lines) {
		for (int i=0; i<lines;i++) {
			for(int j=0;j<lines-i; j++) {
				System.out.print(j+1);}
			System.out.println();
			}
		}
	
	public void CompTri (int lines) {
		for (int i=0; i<lines;i++) {
			for(int j=0;j<=i; j++) {
				System.out.print(j+1);}
			System.out.println();
			}
	
		for (int i=0; i<lines;i++) {
			for(int j=0;j<lines-i; j++) {
				System.out.print(j+1);}
			System.out.println();
			}
	
	}
	public void diamond(int lines) {
		for(int i=0; i<lines-1;i++) {//for the lines
			for (int j=0;j<lines-i;j++) {//for the first triangle
				System.out.print(" ");
			}
			for (int j=i;j>0;j--) {//for the reverse characters on each line
				System.out.print(j+1);
		}
			for (int j=0;j<=i;j++) {// for the characters of the last triangle
				System.out. print(j+1);
		}
			System.out.println();
	}
		for(int i=lines-1; i>=0;i--) {//for the lines
			for (int j=0;j<lines-i;j++) {//for the first triangle
				System.out.print(" ");
			}
			for (int j=i;j>0;j--) {//for the reverse characters on each line
				System.out.print(j+1);
		}
			for (int j=0;j<=i;j++) {// for the characters of the last triangle
				System.out. print(j+1);
		}
			System.out.println();
	}
	}
		
}

	

