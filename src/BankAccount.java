import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BankAccount {
	private String name;
	private float balance;
	private String accountNumber;
	private BankAccount overdraftProtection;

	static int accountCounter = 1000000;
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	//	here are my getters and setters

	public float getBalance() {
		return balance;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public BankAccount getOverdraftProtection() {
		return overdraftProtection;
	}

	public void setOverdraftProtection(BankAccount overdraftProtection) {
		this.overdraftProtection = overdraftProtection;
	}

	//	here are my methods to manage my object

	/**
	 * withdraw
	 *
	 * @param howMuch float - amount of money to be transferred out of he account
	 * @return float - current balance of the account
	 */
	public float withdraw(float howMuch) {
		//	do we have enough in the account for the transfer?
		if (balance >= howMuch) {
			balance -= howMuch;                            //	remove money from account
		} else if (overdraftProtection != null) {       //	do we have an overdraft account?
			//	is there enough between the two accounts to cover the withdrawal request
			if (overdraftProtection.getBalance() + balance > howMuch) {
				howMuch -= balance;                        //	this account will cover what it can
				balance = 0;                            //	this account will be drained
				//	take the remaining amount from the overdraft account
				overdraftProtection.withdraw(howMuch);
			} else {
				System.out.println("Even with your overdraft account you do not have sufficient funds");
			}
		} else {
			System.out.println("You have insufficient funds. Account Balance is: $" + balance);
		}
		return balance;
	}

	public float deposit(float howMuch) {
		balance += howMuch;
		return balance;
	}

	//		here are my constructors
	public BankAccount(String name, float balance) {    //	here we are going to use two params
		this.name = name;
		this.balance = balance;
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		accountCounter++;                //	randomNum plus the year
		this.accountNumber = "" + accountCounter + alphabet.charAt(year % 26);
	}

	@Override
	public String toString() {
		return "Account: '" + name + "' has a Balance of: $" + balance;
	}

	public static void main(String[] args) {
		BankAccount checking = null, savings = null;
		List<BankAccount> myAccounts = new ArrayList<>();
		String accountName, accountNumber;
		int amount, option;

		do {
			option = Utils.getNumber("\nATM Options" +
					"\n 1 - Create Checking Account 	2 - Make Deposit to Checking" +
					"\n 3 - Create Savings Account		4 - Withdraw from Checking" +
					"\n 5 - Xfer Checking to Savings	6 - Get Balances" +
					"\n 7 - Xfer Savings to Checking	8 - Set Overdraft Account for Checking" +
					"\n 0 - Exit\t:\t");
			switch (option) {
				case 1:
					accountName = Utils.getInput("Account Name: ");
					amount = Utils.getNumber("Starting Balance: ");
					checking = new BankAccount(accountName, amount);
					myAccounts.add(checking);
					System.out.println(checking);
					break;

				case 2:
					if (checking != null) {
						amount = Utils.getNumber("Amount to Deposit: ");        //	ask user for amount to deposit
						checking.deposit(amount);                            //	make deposit
						System.out.println(checking);                        //	show account status
					}
					break;

				case 3:        //	TODO - create a Savings Account
					accountName = Utils.getInput("Account Name: ");
					amount = Utils.getNumber("Starting Balance: ");
					savings = new BankAccount(accountName, amount);
					myAccounts.add(savings);
					System.out.println(savings);
					break;

				case 4:    //	TODO - Withdraw from Checking
					if (checking != null) {
						amount = Utils.getNumber("Amount available to Withdraw: " + checking.getBalance() + "\nAmount to Withdraw: ");    //	ask user for amount to deposit
						checking.withdraw(amount);                            //	make deposit
						System.out.println(checking);                        //	show account status
					}
					break;

				case 5:    //	TODO - Transfer from Checking to Savings
					transferMoney(checking, savings);
					break;

				case 7:    //	TODO - Transfer from Savings to Checking
					transferMoney(savings, checking);
					break;

				case 6:    //	TODO - Get Balance for Accounts (Checking and Savings)
					if (checking != null) {
						System.out.println("Account Name " + checking.getName() + "Account Number " + checking.getAccountNumber() + " has a balance of " + checking.getBalance());
					}
					if (savings != null) {
						System.out.println("Account Name " + savings.getName() + "Account Number " + savings.getAccountNumber() + " has a balance of " + savings.getBalance());
					}

					accountNumber = Utils.getInput("Enter Account #: ");
					for (BankAccount account : myAccounts) {
						if (account.getAccountNumber().equals(accountNumber)) {
							System.out.println("Account Name " + account.getName() + "Account Number " + account.getAccountNumber() + " has a balance of " + account.getBalance());
						}
					}
					break;

				case 16:    //	TODO - Get Balance for Accounts (Checking and Savings)
					for (BankAccount account : myAccounts) {
						System.out.println("Account Name " + account.getName() + " Account # " + account.getAccountNumber() + " has a balance of " + account.getBalance());
					}
					break;

				case 8:    //	TODO - Make my Savings account the overdraft protection account for Checking
					if (checking != null && savings != null) {
						checking.setOverdraftProtection(savings);
					} else {
						System.out.println("You must have both Checking and Savings Accounts");
					}
					break;
			}
		} while (option != 0);
	}

	private static void transferMoney(BankAccount accountFrom, BankAccount accountTo) {
		int amount;

		if (accountFrom != null && accountTo != null) {
			amount = Utils.getNumber("Amount to Transfer: ");
			if (accountFrom.getBalance() >= amount) {
				accountFrom.withdraw(amount);
				accountTo.deposit(amount);
			} else {
				System.out.println("Insufficient Funds to Transfer");
			}
		} else {
			System.out.println("Either checking or savings is missing");
		}

	}
}
