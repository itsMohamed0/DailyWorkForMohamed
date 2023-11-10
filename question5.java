package testingstuff;

public class question5 {
public static void main(String[] args) {
 int number = 24;  // Define the number we want to find factors of
 System.out.print("Factors of " + number + " are:"); // Print a message to indicate what we're doing
 for (int i = 1; i <= number; i++) { // for loop from 1 to the number
 if (number % i == 0) {  // If the number is divisible by i then i is a factor of the number
      System.out.print(" "+ i+ " ");
       }
    }
  }
}