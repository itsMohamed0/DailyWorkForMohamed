package testingstuff;

public class BankAccount {
int Acc_No;
String Name;
int Balance;


public BankAccount(int acc_No, String name, int balance) {
	super();
	Acc_No = acc_No;
	Name = name;
	Balance = balance;
}

public void Display() {
	System.out.println(" The Acocunt Number " + Acc_No + " Belonging to " + Name);
	System.out.println(" Has an account Balance of " + Balance + " AED");
}
public void withdraw (int amt) {
	Balance = Balance - amt;
	System.out.println("\n The amount " + amt + " AED has been withdrawn.");
}
public void Deposit (int amt)
{
	Balance = Balance + amt;
	System.out.println("\n The amount " + amt + " AED has been deposited.");
}

}
