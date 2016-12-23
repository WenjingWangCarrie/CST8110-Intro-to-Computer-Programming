
public class Assign2 {

	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		System.out.println("Welcome to the Crane Telecom Company Billing System");

		invoice.setMinutes();
		invoice.setDates();
		invoice.calculateInvoice();
		invoice.display();
	}

}
