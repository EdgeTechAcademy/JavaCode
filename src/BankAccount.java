/**
 * Created by Edge Tech Academy on 10/17/2017.
 */
public class BankAccount {

	double	balance;
	double	interestRate;
	String	name;
	static 	double	OPENING_BALANCE = 5.0;

	public BankAccount(String name, double interestRate) {
		this(name, OPENING_BALANCE, interestRate);
	}

	public BankAccount(String name, double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate / 100.0;
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate / 100.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double makeDeposit(double amount) {
		balance += amount;
		return  balance;
	}

	public boolean makeWithdrawal (double amount) {
		if (balance > amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public void transferAmount(BankAccount toAccount, double transferAmt) {
		if (balance >= transferAmt) {
			toAccount.makeDeposit(transferAmt);
			makeWithdrawal(transferAmt);
		}
	}

	public double addMonthlyInterest() {
		double interest = balance * (interestRate / 12);
		return makeDeposit(interest);
	}

	@Override
	public String toString() {
		return "BankAccount{" +
					   "name = '" + name + '\'' +
					   ", balance = " + balance +
					   ", interestRate = " + interestRate +
					   '}';
	}

	public static void main(String[] args) {
		BankAccount savings  = new BankAccount("Savings",          5.0);
		BankAccount checking = new BankAccount("Checking", 5000.0, 2.0);
		BankAccount taxes    = new BankAccount("Taxes",    1000.0, 2.0);

		System.out.println(checking);
		System.out.println(taxes);
		checking.transferAmount(taxes, checking.getBalance()/2.0);
		System.out.println(checking);
		System.out.println(taxes);
		int		month = 0;
		double	endingBalance;
		double beginningBalance = savings.getBalance();
		do {
			endingBalance = savings.addMonthlyInterest();
			month++;
		} while ( beginningBalance * 2 > endingBalance);
		System.out.println("it took " + (int)(month/12.0) + " years " + month%12 + " months to double our balance with an interest rate of " + savings.getInterestRate()*100);
		System.out.printf("it took %d years %d months to double our balance with an interest rate of %.1f",(int)(month/12.0), month%12, savings.getInterestRate()*100);
	}
}
