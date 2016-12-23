import java.util.Scanner;

public class Client {

	private String name;
	private Account savingAccount;
	private Account chequingAccount;
	private Scanner sc = new Scanner(System.in);

	public Client() {
		name = new String();
		savingAccount = new Account();
		chequingAccount = new Account();
	}

	public void createAclient() {
		System.out.println("Enter client name :");
		name = sc.nextLine();

		System.out.println("Enter saving account info:");
		savingAccount.createAccount();
		System.out.println("Enter chequing account info:");
		chequingAccount.createAccount();

	}

	public void deposit() {
		int option;
		System.out.println("Enter 1 for saving account, 2 for chequing account: ");
		option = sc.nextInt();

		if (option == 1) {
			savingAccount.deposit();
		} else if (option == 2) {
			chequingAccount.deposit();
		} else {
			System.out.println("Invalid option, please try again.");
			option = sc.nextInt();
		}
	}

	public void withdraw() {
		int option;
		System.out.println("Enter 1 for saving account, 2 for chequing account: ");
		option = sc.nextInt();

		if (option == 1) {
			savingAccount.withdraw();
		} else if (option == 2) {
			chequingAccount.withdraw();
		} else {
			System.out.println("Invalid option, please try again.");
			option = sc.nextInt();
		}
	}

	public void display() {
		System.out.println("Client: " + name);
		savingAccount.display();
		chequingAccount.display();
	}
}
