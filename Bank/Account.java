import java.util.Scanner;

public class Account {

	private int accNumber;
	private float accBalance;

	private Scanner sc = new Scanner(System.in);

	public Account() {
		accNumber = 0;
		accBalance = 0.0f;
	}

	public Account(int num, float balance) {
		accNumber = num;
		accBalance = balance;
	}

	public void createAccount() {
		System.out.println("Account number: ");
		accNumber = sc.nextInt();
		if (accNumber > 100000) {
			System.out.println("Invalid account number, please try again");
			accNumber = sc.nextInt();
		}

		System.out.println("Account balance: ");
		accBalance = sc.nextFloat();
		if (accBalance < 0.0) {
			System.out.println("Invalid account balance, please try again");
			accBalance = sc.nextInt();
		}
	}

	public void deposit() {
		float deposit;
		System.out.println("Enter amount you want to deposit");
		deposit = sc.nextFloat();
		accBalance += deposit;
		System.out.println("Deposit comleted.");

	}

	public void withdraw() {
		float withdraw;
		boolean done = false;
		System.out.println("Enter amount to withdraw:");
		withdraw = sc.nextFloat();

		if (withdraw > accBalance) {
			done = false;
			System.out.println("No enough balance to withdraw, please try again");
			withdraw = sc.nextFloat();
		} else {
			done = true;
			accBalance -= withdraw;
			System.out.println("Successfully withdraw.");
		}
	}

	public void display() {
		System.out.println("Account: $" + accNumber);
		System.out.println("Balance: $" + accBalance);
	}

	public float returnBalance() {
		return accBalance;
	}
}
