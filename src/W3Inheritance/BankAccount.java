package W3Inheritance;

public class BankAccount {

	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	public void withdraw(double amount) {
		if (balance >= amount) {
            // Decrease the balance by the withdrawal amount
            balance -= amount;
        } else {
            // Print a message if the balance is insufficient
            System.out.println("Insufficient balance");
        }
	}
	
	public double getBalance() {
        // Return the current balance
        return balance;
    }
} 


