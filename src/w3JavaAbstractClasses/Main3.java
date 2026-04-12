package w3JavaAbstractClasses;

public class Main3 {

	    public static void main(String[] args) {
	        // Declare double variables for initial balance, deposit amount, and withdrawal amount
	        double ibal, damt, wamt;

	        // Set initial balance for SavingsAccount
	        ibal = 1000.00;
	        // Create a new SavingsAccount object with the initial balance
	        SavingsAccount savingsAccount = new SavingsAccount("SA001", ibal);
	        // Print initial balance of SavingsAccount
	        System.out.println("Savings A/c: Initial Balace: $" + ibal);

	        // Set deposit amount
	        damt = 500.00;
	        // Deposit amount into SavingsAccount
	        savingsAccount.deposit(damt);

	        // Set first withdrawal amount
	        wamt = 250.00;
	        // Withdraw amount from SavingsAccount
	        savingsAccount.withdraw(wamt);

	        // Set second withdrawal amount
	        wamt = 1600.00;
	        // Print attempt to withdraw larger amount
	        System.out.println("\nTry to withdraw: $" + wamt);
	        // Attempt to withdraw larger amount from SavingsAccount
	        savingsAccount.withdraw(wamt);

	        // Print an empty line for separation
	        System.out.println();

	        // Set initial balance for CurrentAccount
	        ibal = 5000.00;
	        // Create a new CurrentAccount object with the initial balance
	        CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);
	        // Print initial balance of CurrentAccount
	        System.out.println("Current A/c: Initial Balace: $" + ibal);

	        // Set deposit amount for CurrentAccount
	        damt = 2500.00;
	        // Deposit amount into CurrentAccount
	        currentAccount.deposit(1000.0);

	        // Set first withdrawal amount for CurrentAccount
	        wamt = 1250.00;
	        // Withdraw amount from CurrentAccount
	        currentAccount.withdraw(3000.0);

	        // Set second withdrawal amount for CurrentAccount
	        wamt = 6000.00;
	        // Print attempt to withdraw larger amount from CurrentAccount
	        System.out.println("\nTry to withdraw: $" + wamt);
	        // Attempt to withdraw larger amount from CurrentAccount
	        savingsAccount.withdraw(wamt);
	    }

}
