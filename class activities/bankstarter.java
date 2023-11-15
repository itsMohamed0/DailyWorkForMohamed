package testingstuff;

public class bankstarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount b = new BankAccount (281276, "Mohamed" , 567890);
b.Display();
b.withdraw(500);
b.Display();
b.Deposit(1000);
b.Display();

	}

}
