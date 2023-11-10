package testingstuff; //this code is to demonstrate the factorial of 6, 5, and 4

public class factorial {
    public static void main(String[] args) {
int result; //set a value that can print the result of the factorial

result = 1;
for (int i = 1; i <= 6; i++) { //for loop that can calculate the factorial of 6
result *= i;
}
System.out.println("6! == " + result);
result = 1;
for (int i = 1; i <= 5; i++) { //for loop that can calculate the factorial of 5
result *= i;
}
System.out.println("5! == " + result);
result = 1;
for (int i = 1; i <= 4; i++) { //for loop that can calculate the factorial of 4
result *= i;
}
System.out.println("4! == " + result);
    }
}