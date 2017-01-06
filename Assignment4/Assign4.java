import java.util.Scanner;

public class Assign4 {

	private static Scanner sc = new Scanner(System.in);
	private static int MAXINVOICES = 10;

	public static void main(String[] args) {
		int numInvoice = getNumInvoice();
		Ledger ledger = new Ledger(numInvoice);

		ledger.getInvoiceInfo();
		ledger.calculateMonthBills();
		ledger.printInvoiceInfo();
	}

	/**
	 * Prompt the user for a number of invoices, and pass this integer as a
	 * formal parameter when instantiating the Ledger reference variable.
	 * 
	 * @return
	 */
	private static int getNumInvoice() {
		int numInvoice;

		while (true) {
			System.out.println("Enter the amount of monthly invoices: ");

			while (!sc.hasNextInt()) {
				System.out.println("That's not a number! Please try again.");
				sc.next();
			}
			
			numInvoice = sc.nextInt();

			if (numInvoice <= 0 || numInvoice > MAXINVOICES) {
				System.out.println("Invalid invoice, please try again");
			} else {
				break;
			}
		}

		return numInvoice;
	}
}
