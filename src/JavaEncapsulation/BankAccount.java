package JavaEncapsulation;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String owner;

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getOwner() {
		return owner;
	}

	public double deposit(double test) {
		double dp = test + balance;
		return dp;
	}

	public double withdraw(double test) {
		double wd = balance - test;
		return wd;
	}

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setBalance(1000);
		double re = ba.deposit(99);
		System.out.println(re); // 1099.0
		double we = ba.withdraw(100);
		System.out.println(we); //900

	}

}
