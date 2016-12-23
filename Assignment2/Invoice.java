import java.text.DecimalFormat;
import java.util.Scanner;

public class Invoice {

	private double minutesPurchased, invoiceAmount, interest, tax, totalAmount;
	private OurDate todayDate, invoiceDate;

	private Scanner sc = new Scanner(System.in);

	public Invoice() {
		minutesPurchased = 0.0;
		invoiceAmount = 0.0;
		interest = 0.0;
		tax = 0.0;
		totalAmount = 0.0;
		todayDate = new OurDate();
		invoiceDate = new OurDate();
	}

	public void setMinutes() {
		do {
			System.out.println("Enter the number of minutes you wish to purchase: ");
			minutesPurchased = sc.nextDouble();

		} while (minutesPurchased < 0);

	}

	public void setDates() {
		System.out.println("Enter today date");
		todayDate.setYear();
		todayDate.setMonth();
		todayDate.setDay();

		System.out.println("Enter invoice date");
		invoiceDate.setYear();
		invoiceDate.setMonth();
		invoiceDate.setDay();

		System.out.println("Today date: ");
		todayDate.displayDate();
		System.out.println("\nInvoice date: ");
		invoiceDate.displayDate();

	}

	public void calculateInvoice() {
		invoiceAmount = 5.00 + minutesPurchased * 0.02;
		tax = 0.13 * invoiceAmount;

		int diff = todayDate.calcDays() - invoiceDate.calcDays();
		if (diff > 60)
			interest = invoiceAmount * 0.10;
		else
			interest = 0.0;

		totalAmount = tax + invoiceAmount;

		System.out.println("\nThe number of days since invoice date: " + diff);
	}

	public void display() {
		DecimalFormat form = new DecimalFormat();
		form.applyPattern("#0.00");

		System.out.println("Invoice amount : $" + form.format(invoiceAmount));
		System.out.println("Tax            : $" + form.format(tax));
		System.out.println("Interest       : $" + form.format(interest));
		System.out.println("TOTAL          : $" + form.format(totalAmount));
	}
}
