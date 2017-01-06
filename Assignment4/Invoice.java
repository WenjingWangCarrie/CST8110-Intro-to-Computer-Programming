import java.util.Scanner;

public class Invoice {

	private String name;
	private double amount;
	private OurDate dueDate;
	private Scanner sc = new Scanner(System.in);

	public Invoice() {
		name = new String();
		amount = 0;
		dueDate = new OurDate();
	}

	public void setDates() {
		System.out.println("Enter invoice due date: ");
		dueDate.setDay();
		dueDate.setMonth();
		dueDate.setYear();

	}

	public OurDate getDates() {
		return dueDate;
	}

	public void setName() {
		do {
			System.out.println("Enter Company Name: ");
			name = sc.nextLine();
		} while (name == null);
	}

	public String getName() {
		return name;
	}

	public void setAmount() {
		do {
			System.out.println("Enter bill amount: ");
			amount = sc.nextDouble();
		} while (amount <= 0);
	}

	public double getAmount() {
		return amount;
	}

	public String toString() {
		return name + "\n" + amount + "\n" + dueDate.toString();

	}
}
