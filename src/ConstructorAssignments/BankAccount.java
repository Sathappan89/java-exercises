package ConstructorAssignments;

public class BankAccount {

	// Instance Variables:
	String accountNumber;
	double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public double deposit(double value) {
		double result = value + balance;
		return result;
	}

	public double withdraw(double value) {
		double result = balance-value;
		return result;
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("9442122467", 989.34);
		System.out.println(b1.deposit(11.00));
		System.out.println(b1.withdraw(89.34));

	}

}
