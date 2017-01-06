import java.util.Scanner;

public class Ledger {
	private Invoice[] invoice;
	private int numInvoice;
	private Scanner sc = new Scanner(System.in);

	public Ledger() {

	}

	public Ledger(int num) {
		this.numInvoice = num;
		this.invoice = new Invoice[num];
	}

	public void getInvoiceInfo() {

		for (int i = 0; i < numInvoice; i++) {
			Invoice in = new Invoice();
			System.out.println("Enter info for invoice number " + i + " :");
			in.setName();
			in.setAmount();
			in.setDates();
			System.out.println();

			invoice[i] = in; // number of invoice info in the array
		}

	}

	public void calculateMonthBills() {
		double totalBills = 0;

		for (int i = 0; i < numInvoice; i++) {
			totalBills += invoice[i].getAmount(); // get amount in the each invoice

		}

		System.out.println("Total monthly bills: " + totalBills);
		System.out.println();
	}

	public void printInvoiceInfo() {
		System.out.println("Bill Summary: ");

		for (int i = 0; i < numInvoice; i++) {
			System.out.println(invoice[i].toString());
			System.out.println();
		}

	}

}
