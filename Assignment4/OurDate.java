import java.util.Scanner;

public class OurDate {

	private int year, month, day;
	private Scanner sc = new Scanner(System.in);

	public OurDate() {
		year = 1900;
		month = 1;
		day = 1;
	}

	public OurDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public int getYear() {
		return year;
	}

	public void setYear() {
		do {
			System.out.println("Enter year: ");
			year = sc.nextInt();
		} while (year < 1900);

	}

	public int getMonth() {
		return month;
	}

	public void setMonth() {
		do {
			System.out.println("Enter month: ");
			month = sc.nextInt();
		} while (month <= 0 || month > 12);

	}

	public int getDay() {
		return day;
	}

	public void setDay() {
		do {
			System.out.println("Enter day: ");
			day = sc.nextInt();
		} while (day < 0 || day > 30);

	}

	public String toString() {
		return day + "/" + month + "/" + year;
	}

}
