package testingstuff;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N = 10; //gave a value to N which will be used as an example
int sum = 0;
int sumOfSquares = 0; //initialized the integers sum and sumofsquares as 0
for (int i = 1; i <= N; i++) { //for statement to calculate the sum of squares
sum += i;
sumOfSquares += i * i;
	        }
 int squareOfSum = sum * sum; //written a new integer called squareofsum with its own formula where sum is multiplied by sum
int difference = squareOfSum - sumOfSquares; //subtracting squareofsum by sumofsquares
System.out.println("The difference is " + difference); //code output
	}

}
