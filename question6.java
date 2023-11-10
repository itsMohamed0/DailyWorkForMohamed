package testingstuff;

public class question6 {
    public static void main(String[] args) {
int num1 = 15;
int num2 = 25;         // Define the two numbers we want to find the LCM and GCD of

int gcd = num1;  // Calculate the GCD
for(int i = 1; i <= num1 && i <= num2; ++i) { // for loop to Check if i is factor of both integers
     if(num1 % i==0 && num2 % i==0)
                gcd = i;
        }
int lcm = (num1 * num2) / gcd; // Calculate the LCM by the formula
 System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
 System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd); // Print the LCM and GCD
    }
}