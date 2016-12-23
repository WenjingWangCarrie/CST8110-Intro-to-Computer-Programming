import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Client client = new Client();

		int option;
		boolean done = false;

		while (!done) {
			System.out.print(
					"Enter 1 to create new client\n2 to display client information\n3 to deposit money\n4 to withdraw money\n5 to quit:\n");
			option = sc.nextInt();

			if (option == 1) {
				client.createAclient();

			} else if (option == 2) {
				client.display();

			} else if (option == 3) {
				client.deposit();

			} else if (option == 4) {
				client.withdraw();

			} else if (option == 5) {
				System.out.println("Quit");
				break;

			} else {
				System.out.println("Invalid option, please try gagin");
				option = sc.nextInt();
			}
		}
	}

}
